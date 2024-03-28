package com.kh.Test2402132;

public class Secretary extends Employee implements Bonus {
	public Secretary() {
		super();
	}
	
	public Secretary(String name, int number, String dpm, int salary) {
		super(name, number, dpm, salary);
	}
	@Override
	public double tax() {
		return 0;
	}
	
	public void incentive(int pay) {
		
	}
}
