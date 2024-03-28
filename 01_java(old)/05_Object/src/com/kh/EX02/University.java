package com.kh.EX02;

public class University {
	/*
	 * 대학 이름, 평균 합격 컷, 국어 최저점수, 영어 최저점수
	 * 모든 데이터를 매개변수로 받아 초기화하는 생성자 정의
	 */
	
	// 필드영역
	private String name;
	private int evgCut, koCut, enCut;
	
	// 생성자영역
	public University(String name, int evgCut, int koCut, int enCut) {
		this.name = name;
		this.evgCut = evgCut;
		this.koCut = koCut;
		this.enCut = enCut;
	}
	
	// 메소드영역
	
	// getter
	public String getName() {
		return this.name;
	}
	public int getEvgCut() {
		return this.evgCut;
	}
	public int getKoCut() {
		return this.koCut;
	}
	public int getEnCut() {
		return this.enCut;
	}
	
	// setter
	public void setName(String name) {
		this.name = name;
	}
	public void setEvgCut(int evgCut) {
		this.evgCut = evgCut;
	}
	public void setKoCut(int koCut) {
		this.koCut = koCut;
	}
	public void setEnCut(int enCut) {
		this.enCut = enCut;
	}
	
	// 합격이면 true 불합격이면 false값 리턴
	public void isEvaluate(Student user) {
		if(user.getEvg() >= this.getEvgCut() && user.getEg() >= this.getEnCut() && user.getKg() >= this.getKoCut()) {
			System.out.println(user.getName() + "님 축하드립니다 합격입니다.");
		}
		else {
			System.out.println(user.getName() + "님 아쉽지만 불합격입니다.");
			}
	}
}
