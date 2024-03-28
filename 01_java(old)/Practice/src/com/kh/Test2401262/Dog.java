package com.kh.Test2401262;

public class Dog extends Animal{
	public static final String PLACE = "애견카페";
	private int weight;
	
	public Dog() {
		super();
	}
	
	public Dog(String name, String kinds, int weight) {
		super(name, kinds);
		this.weight = weight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public static String getPlace() {
		return PLACE;
	}

	@Override
	public void speak() {
		/*
		String anispeak = super.toString();
		String dogspeak = anispeak + " 몸무게는 " + weight + "kg 입니다.";
        System.out.println(dogspeak);
        */
		System.out.println(super.toString() + " 몸무게는 " + this.getWeight() + "kg입니다.");
	}
}
