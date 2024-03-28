package com.kh.Test2402132;

public class Sales extends Employee implements Bonus {
	public Sales() {
		super();
	}
	
	public Sales(String name, int number, String dpm, int salary) {
		super(name, number, dpm, salary);
	}
	
	@Override
	public void incentive(int pay) {		
	}

	@Override
	public double tax() {
		return 0;
	}	
}
