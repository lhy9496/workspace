package com.kh.board.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.servlet.ServletFileUpload;

import com.kh.board.model.vo.Attachment;
import com.kh.board.model.vo.Board;
import com.kh.board.service.BoardService;
import com.kh.common.MyFileRenamePolicy;
import com.oreilly.servlet.MultipartRequest;

/**
 * Servlet implementation class BoardUpdateController
 */
@WebServlet("/update.bo")
public class BoardUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		if(ServletFileUpload.isMultipartContent(request)) {
			
			//1) 용량제한
			int maxSize = 10 * 1024 * 1024;
			
			//2) 물리적 저장경로
			String savePath = request.getSession().getServletContext().getRealPath("/resources/board_upfile/");
			
			//3) 전달된 파일명 수정작업 후 서버에 업로드
			MultipartRequest multiRequest = new MultipartRequest(request, savePath, maxSize, "UTF-8", new MyFileRenamePolicy());
			
			//4) sql문 실행에 필요한 값 추출해서 vo에 저장
			int boardNo = Integer.parseInt(multiRequest.getParameter("bno"));
			String category = multiRequest.getParameter("category");
			String boardTitle = multiRequest.getParameter("title");
			String boardContent = multiRequest.getParameter("content");
			
			Board b = new Board();
			b.setBoardNo(boardNo);
			b.setBoardTitle(boardTitle);
			b.setBoardContent(boardContent);	
			b.setCategory(category);
			
			Attachment at = null;
			if(multiRequest.getOriginalFileName("upfile") != null) {
				//새로 넘어온 첨부파일이 있을 떄
				at = new Attachment();
				at.setOriginName(multiRequest.getOriginalFileName("upfile"));
				at.setChangeName(multiRequest.getFilesystemName("upfile"));
				at.setFilePath("resources/board_upfile/");
				
				//기존 첨부파일 있을 때 => update Attachment
				if(multiRequest.getParameter("originFileNo") != null) {
					at.setFileNo(Integer.parseInt(multiRequest.getParameter("originFileNo")));
				} else {
					at.setRefBoardNo(boardNo);
				}
			} //새로운 첨부파일이 없다면 at = null
			
			int result = new BoardService().updateBoard(at, b);
				if (result > 0) {
					//성공 => /kh/detail.bo?bno=게시글번호
					request.getSession().setAttribute("alertMsg", "게시글 수정 완료");
					response.sendRedirect(request.getContextPath() + "/detail.bo?bno=" + b.getBoardNo());
				} else {
					//실패 => error페이지
					request.setAttribute("errorPage", "게시글 수정 실패");
					request.getRequestDispatcher("views/common/errorPage.jsp").forward(request, response);
				}
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
