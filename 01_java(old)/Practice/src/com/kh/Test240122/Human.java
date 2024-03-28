package com.kh.Test240122;
public class Human {
	// 필드 영역
	
	String name;
	int money;
	static int count = 0;
	
	// 생성자 영역
	public Human(String name, int money) {
		this.name = name;
		this.money = money;
		this.count++;
	}
	// 메소드 영역
	public void buy(TV tv) {
		if(tv.getPrice() > this.money) {
			System.out.println("예산 초과입니다.");
		}
		else {
			System.out.println("구매가 가능합니다.");
		}
	}
}
