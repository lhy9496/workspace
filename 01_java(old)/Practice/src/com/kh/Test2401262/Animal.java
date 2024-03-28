package com.kh.Test2401262;

public abstract class Animal {
	private String name;
	private String kinds;
	
	protected Animal() {
		super();
	}
	protected Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	@Override
	public String toString() {
		return "저의 이름은 " + name + ", 종류는 " + kinds;
	}	
	public abstract void speak();
}