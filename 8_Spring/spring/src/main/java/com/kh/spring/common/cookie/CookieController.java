package com.kh.spring.common.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;

public class CookieController {
	/*
	 * cookie
	 * 브라우저에 저장되는 데이터 조각, 주로 사용자를 식별하고 상태정보를 기억하는데 사용된다.
	 * 쿠키는 클라이언트(브라우저)의 로컬 저장소에 저장된다.
	 * 저장된 쿠키정보는 서버에 http 요청시 헤더에 담겨 함께 전송이 된다.
	 * 
	 * 쿠키는 보안성이 낮고 개인정보 유출에 취약할 수 있다. 따라서 중요한 정보를 저장할 때는 보안적인 조치가 필요하다.
	 */
	
	@RequestMapping("create")
	public String create(HttpServletResponse response) {
		
		Cookie ck = new Cookie("test", "iam");
		ck.setMaxAge(60 * 60 * 24); //하루 뒤에 만료
		response.addCookie(ck);
		
		Cookie ck2 = new Cookie("test2", "your");
		response.addCookie(ck);
		
		Cookie ck3 = new Cookie("id", "father");
		response.addCookie(ck);
		
		return "cookie/create";
	}
	
	@RequestMapping("delete")
	public String delete(HttpServletResponse response) {
		//쿠키는 삭제 명령어가 따로 없음
		//0초로 만료시간을 지정 후 덮어쓰기를 진행하는 식
		
		Cookie ck = new Cookie("test", "iam");
		ck.setMaxAge(0);
		response.addCookie(ck);
		
		return "cookie/delete";
	}
}
