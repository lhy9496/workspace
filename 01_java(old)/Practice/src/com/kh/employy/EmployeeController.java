package com.kh.employy;
public class EmployeeController {
	/*
	 * 실제 정보를 넘겨 받아서 사원에대한 정보를 저장하거나 반환해주는 역할.
	 */
	private Employee[] list = new Employee[100];
	
	public EmployeeController() {
		System.out.println("생성");
		this.list[0] = new Employee(1, "홍길동", 'm', "010-1234-5678", "홍보부", 2800, 5.0);
		this.list[1] = new Employee(2, "황진이", 'w', "010-5585-1952", "경리부", 2500, 3.0);
		this.list[2] = new Employee(3, "김신", 'm', "010-1234-5678", "기획부", 4000, 1.0);
	}
	// insert => 사원을 배열에 추가해주는 메소드
	public void insert(int empNo, String name, char gender, String phone, String dept,
	        		   int salary, double bonus) {
		for(int i = 0; i < list.length; i++) {
			if(list[i] == null) {
				list[i] = new Employee(empNo, name, gender, phone, dept, salary, bonus);
				break;
			}
		}
	}
	
	public void printList() {
		System.out.println("======== 사원 목록 =========");
		for(int i = 0; i < list.length; i++) {
			if(list[i] == null) {
				break;
			}
			System.out.println(list[i].toString());
		}
	}
	
	public void deleteEmp() {
		int i = 0;
		if(list[0] == null) {
			System.out.println("삭제할 정보가 없습니다.");
			return;
		}
		for(i = 0; i < list.length; i++) {
			if(list[i] == null) { // i번째 인덱스가 비어있다면
				System.out.println(list[i - 1].toString() + "의 정보를 삭제합니다.");
				list[i - 1] = null; // 바로 전 인덱스 값을 지워줘라
				break;
			}
			else if(i == (list.length - 1)) { // 마지막까지 가득차있다면
				System.out.println(list[i].toString() + "의 정보를 삭제합니다.");
				list[i] = null; // 마지막 값을 지워줘라
			}
		}
	}
	
	public void deleteEmpByEmpNo(int n) {
		int i = 0;
		for(i = 0; i < list.length; i++) {
			if(list[i] == null) { // 인덱스에 데이터가 없을시 반복 종료
				System.out.println(n + "번 근로자의 정보를 찾을 수 없습니다.");
				break;
			}
			else if(n == list[i].getEmpNo()) { // 근로자 목록에서 empNo이 n과 같은 데이터를 찾음
				list[i] = null;				
				for(int j = i; j < list.length; j++) {
					if((j + 1) == list.length) {
						list[j] = null;
						break;
					}
					list[j] = list[j + 1];
				}
				System.out.println(n + "번 근로자의 정보가 삭제되었습니다.");
				break;
			}
		}
	}
	
	public void EmpInfoByNo(int n1) {
		for (Employee e : list) {
			if (e == null) {
				break;
			}
			else if (e.getEmpNo() == n1) {
				System.out.println(e.toString());
				break;
			}
		}
	}
}
