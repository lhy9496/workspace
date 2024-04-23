package com.kh.spring.board.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.Gson;
import com.kh.spring.board.model.vo.Board;
import com.kh.spring.board.model.vo.Reply;
import com.kh.spring.board.service.BoardService;
import com.kh.spring.common.model.vo.PageInfo;
import com.kh.spring.common.template.Pagination;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("list.bo")
	public String selectList(@RequestParam(value="cpage", defaultValue="1") int currnetPage, Model model) {
		int boardCount = boardService.selectListCount();
		
		PageInfo pi = Pagination.getPageInfo(boardCount, currentPage, 10, 5);
		ArrayList<Board> list = boardService.selectList(pi);

		model.addAttribute("list", list);
		model.addAttribute("pi", pi);
		
		return "board/boardListView";
	}
	
	@RequestMapping(value = "detail.bo")
	public String selectBoard(int bno, Model model) {
		
		int result = boardService.increaseCount(bno);
		
		if (result > 0) {
			Board b = boardService.selectBoard(bno);
			model.addAttribute("b", b);
			
			return "board/boardDetailView";

		} else {
			model.addAttribute("errorMsg", "게시글 조회 실패");
			return "common/errorPage";
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "rlist.bo", produces="application/json; charset-UTF-8")
	public String ajaxSelectReplyList(int bno) {
		ArrayList<Reply> list = boardService.selectReply(bno);
		
		return new Gson().toJson(list);
	}
	
	@RequestMapping("enrollForm.bo")
	public String enrollForm() {
		return "board/boardEnrollForm";
	}
	
	@RequestMapping("insert.bo")
	public String insertBoard(Board b, MultipartFile upfile, HttpSession session, Model model) {
		System.out.println(b);
		System.out.println(upfile);
		
		//전달된 파일이 있을 경우 => 파일 이름 변경 => 서버 저장 => 원본명, 서버 업로드된 경로를 b 객체에 담기
		if(!upfile.getOriginalFilename().equals("")) {
			String changeName = saveFile(upfile, session);
			
			b.setOriginName(upfile.getOriginalFilename());
			b.setChangeName("resources/uploadFiles/" + changeName);
		}
	}
	
	public String saveFile(MultipartFile upfile, HttpSession session) {
		//파일명 수정 후 서버에 업로드하기("imgFile.jpg => 202404231004305488.jpg")
		String originName = upfile.getOriginalFilename();
		
		
	}
	
	@RequestMapping("updateFrom.bo")
	public String updateForm(int bno, Model model) {
		
		model.addAttribute("b", boardService.selectBoard(bno));
		return "board/boardUpdateForm";
	}
	
	@RequestMapping("update.bo")//@ModelAttribute
	public String updateBoard(Board b, MultipartFile reupfile, HttpSession session, Model model) {
		
		//새로운 첨부파일이 넘어온 경우
		if(!reupfile.getOriginalFilename().equals("")) {
			// 기존의 첨부파일이 있을 경우 삭제
			if(b.getOriginName() != null) {
				new File(session.getServletContext().getRealPath(b.getChangeName())).delete();
			}
			
			//새로 넘어온 첨부파일을 서버에 업로드
			String changeName = saveFile(reupfile, session);
			
			b.setOriginName(reupfile.getOriginalFilename());
			b.setChangeName("resources/uploadFiles/" + changeName);
		}
		
		/*
		 * b에 boardTitle, boardContent
		 * 
		 * 1. 새로운 첨부파일 x, 기존 첨부파일 x
		 * 	=> originName : null, changeName : null
		 * 
		 * 2. 새로운 첨부파일 x, 기존 첨부파일 o
		 * 	=> originName : 기존 첨부파일 이름, changeName : 기존 첨부파일 경로
		 * 
		 * 3. 새로운 첨부파일 o, 기존 첨부파일 o
		 * 	=> originName : 새로운 첨부파일 이름, changeName : 새로운 첨부파일 경로
		 * 
		 * 4. 새로운 첨부파일 o, 기존 첨부파일 x
		 * 	=> originName : 새로운 첨부파일 이름, changeName : 새로운 첨부파일 경로
		 */
		
		int result = boardService.updateBoard(b);
		
		if (result > 0 ) { //성공
			session.setAttribute("alertMsg", "게시글 수정 성공");
			return "redirect:detail.bo?bno=" + b.getBoardNo();
		} else { //실패
			model.addAttribute("errorMsg", "게시글 수정 실패");
			return "common/errorPage";
		}
	}
}
