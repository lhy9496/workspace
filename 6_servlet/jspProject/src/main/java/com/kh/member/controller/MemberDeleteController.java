package com.kh.member.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.kh.member.service.MemberService;

/**
 * Servlet implementation class MemberDeleteController
 */
@WebServlet("/delete.me")
public class MemberDeleteController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MemberDeleteController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//인코딩
		request.setCharacterEncoding("UTF-8");
				
		//데이터 추출
		String userId = request.getParameter("userId");
		String userPwd = request.getParameter("userPwd");
		
		//서비스 -> deleteMember();
		int result = new MemberService().deleteMember(userId, userPwd);
		
		//성공시 -> session에 login정보 삭제 후 -> 메인페이지
		//실패 시-> alert
		if(result > 0) {
			HttpSession session = request.getSession();
			session.invalidate();
			response.sendRedirect(request.getContextPath());
		} else {
			request.setAttribute("alertMsg", "회원정보가 일치하지 않습니다.");
			
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
