package com.kh.Test240122;
public class Book {
	// 필드 영역
	private String genre;
	private String title;
	private String writer;
	private int number;
	
	// 생정자 영역
	public Book(String genre, String title, String writer, int number) {
		this.genre = genre;
		this.title = title;
		this.writer = writer;
		this.number = number;
	}
	
	// 메소드 영역
	public String getGenre() {
		return this.genre;
	}
	public String getTitle() {
		return this.title;
	}
	public String getWriter() {
		return this.writer;
	}
	public int getNumber() {
		return this.number;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "[장르 = " + genre + ", 제목 = " + title + ", 글쓴이 = " + writer + ", 책 번호 = " + number + "]";
	}
}
