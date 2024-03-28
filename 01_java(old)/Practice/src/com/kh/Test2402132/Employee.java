package com.kh.Test2402132;

public abstract class Employee {
	private String name;
	private int number;
	private String dpm;
	private int salary;
	
	public Employee() {
		super();
	}

	public Employee(String name, int number, String dpm, int salary) {
		super();
		this.name = name;
		this.number = number;
		this.dpm = dpm;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDpm() {
		return dpm;
	}

	public void setDpm(String dpm) {
		this.dpm = dpm;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public abstract double tax();
}
