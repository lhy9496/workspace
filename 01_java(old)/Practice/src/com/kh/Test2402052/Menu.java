package com.kh.Test2402052;

public class Menu {
	// 필드 영역
	private String title;
	private int price;
	private String kind;
	private  boolean isHot;
	
	// 생성자 영역
	public Menu(String title, int price, String kind, boolean isHot) {
		super();
		this.title = title;
		this.price = price;
		this.kind = kind;
		this.isHot = isHot;
	}
	
	// 메소드 영역
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public boolean isHot() {
		return isHot;
	}

	public void setHot(boolean isHot) {
		this.isHot = isHot;
	}

	@Override
	public String toString() {
		return "Menu [title=" + title + ", price=" + price + ", kind=" + kind + ", isHot=" + isHot + "]";
	}
}
