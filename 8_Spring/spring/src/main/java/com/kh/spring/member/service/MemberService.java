package com.kh.spring.member.service;

import com.kh.spring.member.model.vo.Member;

public interface MemberService {

	//로그인 서비스
	Member loginMember(Member m);
	
	//아이디 중복 확인
	int idCheck(String checkId);
	
	//회원 가입
	int insertMember(Member m);
	
	//회원 수정
	int updateMember(Member m);
	
	//회원 탈퇴
	int deleteMember(String userId);
}
