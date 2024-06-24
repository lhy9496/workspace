package com.kh.spring.member.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {
		"file:src/main/webapp/WEB-INF/spring/root-context.xml",
		"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
		"file:src/main/resources/applicationContext.xml"})

public class UserControllerTest {

	private static final Logger logger = LoggerFactory.getLogger(UserControllerTest.class);
	
	@Autowired
	private WebApplicationContext wac;
	
	private MockMvc mockMvc;
	
	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
		logger.info("----------------------------------------------------- 테스트 준비 완료");
	}
	
	@Test
	public void loginTest() {
		logger.info("----------------------------------------------------- 로그인 테스트 시작");
	
	try {
	
		mockMvc.perform(post("/login.do")
				.param("userId", "je_lee")
				.param("userPw", "1234"))
		.andDo(print())
		.andExpect(status().isOk());
		
		logger.info("----------------------------------------------------- 테스트 수행 성공");
		} catch (Exception e) {
		logger.error("----------------------------------------------------- 테스트 수행 실패");
		logger.error(e.getMessage());
		}
	
	}

}