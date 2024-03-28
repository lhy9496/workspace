package com.kh.Test240125;
public class AniBook extends Book{
	private int accessAge; // 나이 제한
	
	public AniBook() {
		super();
	}
	
	public AniBook(String title, String author, String publisher, int accessAge) {
		super(title, author, publisher);
		this.accessAge = accessAge;
	}

	public int getAccessAge() {
		return accessAge;
	}

	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}

	@Override
	public String toString() {
	       return "만화책 [제목 = " + getTitle() + ", 저자 = " + getAuthor() + ", 출판사 = " + getPublisher() + ", 나이제한 = " + accessAge + "]";
	       }
}
