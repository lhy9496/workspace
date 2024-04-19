package com.kh.mybatis.common.template;

import com.kh.mybatis.common.template.vo.PageInfo;

public class Pagination {
	/*
	 * private int listCount; // 현재 총 게시글 수
	private int currentPage; // 현재 페이지
	private int pageLimit; // 페이지 하단에 보여질 페이징 바의 개수
	private int boardLimit; // 한 페이지 내에 보여질 게시글 최대 갯수
	//위 4개의 값을 기준으로 아래 3개의 값을 구해야 함
	
	private int maxPage; // 가장 마지막페이지(총 페이지의 수)
	private int startPage; // 페이징 바의 시작수
	private int endPage; // 페이징 바의 마지막수
	 */
	public static PageInfo getPageInfo(int listCount, int currentPage, int pageLimit, int boardLimit) {
		int maxPage = (int)Math.ceil((double)listCount / boardLimit);
		int startPage = (currentPage -1 ) / pageLimit * pageLimit + 1;
		int endPage = startPage + pageLimit - 1;
		
		endPage = endPage > maxPage ? maxPage : endPage;
		PageInfo pi = new PageInfo(listCount, currentPage, pageLimit, boardLimit, maxPage, startPage, endPage);
		return pi;
	}
	
}
