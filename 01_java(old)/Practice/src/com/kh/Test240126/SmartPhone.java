package com.kh.Test240126;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	private String maker;
	
	public SmartPhone(String maker) {
		super();
		this.maker = maker;
	}
	
	abstract String printInformation();

	public String getMaker() {
		return maker;
	}

	public void setMaker(String maker) {
		this.maker = maker;
	}
}
