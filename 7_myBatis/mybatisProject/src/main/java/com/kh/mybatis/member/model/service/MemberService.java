package com.kh.mybatis.member.model.service;

import com.kh.mybatis.member.model.vo.Member;

public interface MemberService {
	public abstract int insertMember(Member m);
	
	public abstract Member loginMember(Member m);
}
