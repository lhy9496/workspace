package com.kh.Test240206;

import java.util.Objects;

public class Book {
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {
		super();
	}

	public Book(String title, String author, String category, int price) {
		super();
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "\t(" + title + " / " + author + " / " + category + " / " + price + ")";
	}
	
	// 해시코트를 리턴하는 메소드
	public int hashCode() {
		return Objects.hash(title, author, category, price);
	}
	
	// 객체가 같은지 여부를 리턴하는 메소드
	public boolean equals(Object obj) {
		boolean isEquals = false;
		if(obj instanceof Book) {
			Book tmp = (Book)obj;
			if(this.getTitle().equals(tmp.getTitle()) &&
					this.getAuthor().equals(tmp.getAuthor()) &&
					this.getCategory().equals(tmp.getCategory()) &&
					this.getPrice() == tmp.getPrice()) {
				isEquals = true;
			}
		}
		return isEquals;
	}
	
	// 정렬 기준을 가지고 있는 메소드
	public int compareTo(Object o) {
		return 0;
	}
}
