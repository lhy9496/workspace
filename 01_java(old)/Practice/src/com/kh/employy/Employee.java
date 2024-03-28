package com.kh.employy;

public class Employee {
	// Employee클래스를 작성하라
	// empNo(int) name(String) gender(char) phone(String)
	// getter/setter 및 toString 작성
	private int empNo; // 사원번호
	private String name; // 이름
	private char gender; // 성별
	private String phone; // 연락처
	private String dept; // 부서
	private int salary; // 연봉
	private double bonus; // 보너스
	
	public Employee(int empNo, String name, char gender, String phone, String dept,
			        int salary, double bonus) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.gender = gender;
		this.phone = phone;
		this.dept = dept;
		this.salary = salary;
		this.bonus = bonus;
	}
		
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "사원 번호 = " + empNo + ", 이름 = " + name + ", 성별 = " + gender + ", 연락처 = " + phone
				+ ", 부서 = " + dept + ", 연봉 = " + salary + ", 보너스 = " + bonus;
	}
}
