package com.kh.employy;
import java.util.List;
import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		EmployeeMenu em = new EmployeeMenu(); // Employee에 접근하기 위한 코드
		em.EmployeeMainMenu();
		
		/*
		 * 1. 사원추가
		 * 9. 프로그램 종료
		 * 메뉴 번호를 누르세요 : (정수 하나 입력 받기)
		 */
		/*
		Scanner sc = new Scanner(System.in);
		int num = 0, empNo = 0, salary = 0;
		String name, phone, dept;
		char gender, again;
		double bonus;
		
		Employee[] list = new Employee[6];
		
		System.out.println("1. 사원추가");
		System.out.println("9. 프로그램 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		num = sc.nextInt();
		sc.nextLine();
		*/
		
		/*
		 * 사원번호, 이름, 성별, 휴대폰번호 입력 후
		 * 추가 정보를 더 입력하시겠습니까?(y/n)
		 * y일때만 부서, 연봉, 보너스율 입력 받고 해당 데이터를 활용하여 사원추가
		 */
		
		/*
		do {
		switch(num) {
		case 1:
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
				
				new Employee(empNo, name, gender, phone, dept, salary, bonus);
				
				for(int i = 0; i < list.length; i++) {
					if(list[i] == null) {
						list[i] = new Employee(empNo, name, gender, phone, dept, salary, bonus);
						break;
					}
				}
			}
			else { // 추가정보를 입력받지 않음(n을 입력했을 때)
				new Employee(empNo, name, gender, phone);
				for(int i = 0; i < list.length; i++) {
					if(list[i] == null) {
						list[i] = new Employee(empNo, name, gender, phone);
						break;
					}
				}
			}
			break;
		case 9:
			System.out.println("프로그램을 종료합니다.");
			return;
			}
		} while(num == 9);
		*/
		
		
		/*
		Scanner sc = new Scanner(System.in);
		int number = 0, sum = 0;		
		*/
		// number라는 변수에 int형 값을 하나 입력받아 출력해라		
		// 입력받은 값 number가  100보다 작은 정수이면 "100이하" 출력
		// 100이면 "100" 100이상이면 "100을 초과하였습니다. 다시 입력해주세요"를 출력
		// 100이하가 입력될 때 까지 반복한다.		
		/*
		do {
		System.out.print("정수를 입력하세요 : ");
		number = sc.nextInt();
		sc.nextLine();
		
		if(number < 100) {
			System.out.println("입력한 숫자는 : " + number + ", 100 미만입니다.");
			break;
		}
		else if(number == 100) {
			System.out.println("입력한 숫자는 : " + number + ", 100입니다.");
			break;
		}
		else {
			System.out.println("입력한 숫자는 : " + number + ", 100 초과입니다. 다시 입력해주세요.");
			}
		} while(number != 100);
		*/
		
		// 1부터 입력받은 number까지의 값을 전부 더한 값을 구해라
		// ex) number = 5 => 1 + 2 + 3 + 4 + 5 = 15 출력	
		/*
		System.out.print("정수를 입력하세요 : ");
		number = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= number; i++) {
			sum += i;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("1부터 " + num + "까지의 총합 : " + sum);
		*/
		
		// 길이가 number인 int형 1차원 배열 arr을 생성하고
		// 1 ~ number까지의 수를 순서대로 배열에 저장하고 출력해라
		/*
		System.out.print("정수를 입력하세요 : ");
		number = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[number];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		*/
		
		// Employee를 담을 수 있는 길이가 5인 객체배열을 생성하고
		// 임의에 값으로 객체 5개를 생성해 각 배열의 인덱스값을 초기화해라
		/*
		Employee[] emp = new Employee[5];
		emp[0] = new Employee(1, "홍길동", '남', "010-1234-5678");
		emp[1] = new Employee(2, "황진이", '여', "010-9876-5432");
		emp[2] = new Employee(3, "허생", '남', "010-1234-5678");
		emp[3] = new Employee(4, "장만월", '여', "010-9876-5432");
		emp[4] = new Employee(5, "구원", '남', "010-1234-5678");
		
		for(int i = 0; i < emp.length; i++) {
			System.out.println(emp[i]);
		}
		*/
	}
}
