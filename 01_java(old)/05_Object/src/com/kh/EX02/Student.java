package com.kh.EX02;

public class Student {
	/*
	 * 이름 나이 수학점수 영어점수 국어점수를 데이터로 가지고있는 객체를 만들기위한
	 * 클래스를 작성해라
	 * 데이터는 직접 접근을 허용하지않고 모두 간접적으로 set/get 해줄 수 있도록 작성해라
	 * 모든 데이터를 매개변수로 받아 초기화하면서 객체를 생성할 수 있는 생성자를 작성
	 */
	
	// 필드영역
	private String name;
	private int age;
	private int mg, eg, kg; // mg = 수학, eg = 영어, kg = 국어
	
	// 생성자역역
	public Student(String name, int age, int mg, int eg, int kg) {
		this.name = name;
		this.age = age;
		this.mg = mg;
		this.eg = eg;
		this.kg = kg;
	}
	
	// 메소드영역
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public int getMg() {
		return this.mg;
	}
	public int getEg() {
		return this.eg;
	}
	public int getKg() {
		return this.kg;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age > 0 ? age : 1;
	}
	public void setMg(int mg) {
		this.mg = mg;
	}
	public void setEg(int eg) {
		this.eg = eg;
	}
	public void setKg(int kg) {
		this.kg = kg;
	}
	public int getEvg() {
		int evg = (this.mg + this.eg + this.kg) / 3;
		return evg;
	}
}
