package com.kh.employy;

import java.util.Scanner;

public class EmployeeMenu {
	/*
	 * 화면에 출력하는 것과 사용자로부터 입력받는 것을 처리해주는 클래스
	 */
	private Scanner sc = new Scanner(System.in);
	private EmployeeController ec;
	
	public EmployeeMenu() {
		this.ec = new EmployeeController();
	}
	
	public void EmployeeMainMenu() { // 회원을 추가하기 위한 메소드
		/*
		 * 1. 사원추가
		 * 9. 프로그램 종료
		 * 메뉴 번호를 누르세요 : (정수 하나 입력 받기)
		 */
		
		int num = 0;
		
		while(true) {
			System.out.println("1. 사원추가");
			System.out.println("2. 전체 사원 출력");
			System.out.println("3. 사원 삭제");
			System.out.println("4. 사원 검색 출력");
			System.out.println("9. 프로그램 종료");
			System.out.print("메뉴 번호를 입력하세요 : ");
			num = sc.nextInt();
			sc.nextLine();
		
			/*
			 * 사원번호, 이름, 성별, 휴대폰번호 입력 후
			 * 추가 정보를 더 입력하시겠습니까?(y/n)
			 * y일때만 부서, 연봉, 보너스율 입력 받고 해당 데이터를 활용하여 사원추가
			 */
			switch(num) {
			case 1:
				this.insertEmp();
				break;
			case 2:
				ec.printList();
				break;
			case 3:
				/*
				 * 전체 사원을 출력 =>
				 * 삭제할 사원의 사원번호를 입력하세요 : 
				 * 삭제된 사원 정보 출력
				 */
				this.deleteEmp();
				break;
			case 4:
				/*
				 * 정보를 출력할 사원의 사번을 입력하세요 : 
				 * 사원정보 : 
				 */
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("잘못 입력하셨습니다. 메인 메뉴로 돌아갑니다.");
				}
			}
		}
	public void insertEmp() { // 회원을 추가하기 위한 정보를 입력하는 메소드
		int empNo = 0, salary = 0;
		String name, phone, dept;
		char gender, again;
		double bonus;
		System.out.print("사원 번호를 입력하세요 : ");
		empNo = sc.nextInt();
		sc.nextLine();
		System.out.print("이름을 입력해주세요 : ");
		name = sc.nextLine();
		System.out.print("성별을 입력해주세요 : ");
		gender = sc.next().toLowerCase().charAt(0);
		System.out.print("연락처를 입력해주세요(- 포함) : ");
		phone = sc.next();
		System.out.print("추가 정보를 입력하시겠습니까? (y/n) : ");
		boolean isContinue = sc.next().toLowerCase().charAt(0) == 'y';
		
		if(isContinue) { // 추가정보를 입력받음(y를 입력했을 때)
			System.out.print("부서를 입력하세요 : ");
			dept = sc.next();
			System.out.print("연봉을 입력하세요(만 단위) : ");
			salary = sc.nextInt();
			System.out.print("보너스율을 입력하세요 : ");
			bonus = sc.nextDouble();
			
			ec.insert(empNo, name, gender, phone, dept, salary, bonus);
		}
		else { // 추가정보를 입력받지 않음(n을 입력했을 때)
			ec.insert(empNo, name, gender, phone, "부서 없음", 0, 0.0);
		}
	}
		
		public void deleteEmp() {
			/*
			System.out.print("정말 삭제하시겠습니까? (y/n) : ");
			char ch = sc.next().toLowerCase().charAt(0);
			
			if(ch == 'y') {
				ec.deleteEmp();
			}
			*/
			
			/*
			 * 전체 사원 출력
			 * 삭제할 사원의 사원번호 입력
			 * deleteEmpByEmpNo 호출
			 */
			ec.printList();
			System.out.print("정보를 삭제할 사원의 사원번호를 입력하세요 : ");
			int n = sc.nextInt();
			sc.nextLine();
			
			ec.deleteEmpByEmpNo(n);
	}
		public void EmpInfo() {
			System.out.println("정보를 출력할 사원의 사번을 입력하세요 : ");
			int n1 = sc.nextInt();
			sc.nextLine();
			
			ec.EmpInfoByNo(n1);
		}
}
