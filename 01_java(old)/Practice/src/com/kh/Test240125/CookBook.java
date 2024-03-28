package com.kh.Test240125;
public class CookBook extends Book{
	private boolean coupon;
	
	public CookBook() {
		super();
	}
	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}
	
	public boolean isCoupon() {
		return coupon;
	}
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
		
	}
	
	@Override
	public String toString() {
        return "요리책 [제목 = " + getTitle() + ", 저자 = " + getAuthor() + ", 출판사 = " + getPublisher() + ", 쿠폰 = " + coupon + "]";
	}
}
