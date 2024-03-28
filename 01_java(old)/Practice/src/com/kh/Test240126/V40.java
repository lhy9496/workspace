package com.kh.Test240126;

public class V40 extends SmartPhone implements NotePen{
	
	public V40(String maker) {
		super(maker);
	}

	@Override
	public String charge() {
		return "고속충전, 고속 무선 충전";
	}

	@Override
	public String makeCall() {
		return "번호를 누르고 통화 버튼을 누름";
	}

	@Override
	public String takeCall() {
		return "전화받기 버튼을 누름";
	}

	@Override
	public String picture() {
		return "1200, 1600만 화소 트리플 카메라";
	}

	@Override
	public String touch() {
		return "정전식";
	}

	@Override
	public boolean bluetoothPen() {
		return false;
	}

	@Override
	String printInformation() {
		return "V40은 LG에서 만들어졌고 제원은 다음과 같다.";
	}
}
