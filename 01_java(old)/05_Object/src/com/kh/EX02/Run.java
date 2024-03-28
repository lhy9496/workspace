package com.kh.EX02;
import java.util.Scanner;
public class Run {
	public static void main(String[] args) {
	/*
	 * choi 생성 => 최지원, 15살, 영어 :60, 수학 : 70, 국어 : 80
	 * kim 객체 => 김도현, 17살, 영어 : 95, 수학 : 85, 국어 : 80
	 * 
	 * choi와 kim의 모든 과목 평균 구하기
	 */
	/*
	Student choi = new Student("최지원", 15, 70, 60, 80);
	Student kim = new Student("김도현", 17, 85, 95, 80);
	System.out.println(choi.getName() + "님의 평균 : " + choi.getEvg());
	System.out.println(choi.getName() + "님의 평균 : " + kim.getEvg());
	*/
		
	/* 
	 * 사용자로부터 이름, 나이, 영어점수, 수학점수, 국어점수를 입력받아
	 * 평균을 구하고 출력하는 프로그램
	 * 이름 : / 나이 : / 영어점수 : / 수학점수 : / 국어점수 :
	 * OOO님의 평균 점수는 : 
	 */
	Scanner sc = new Scanner(System.in);
	
	/*
	System.out.print("이름을 입력하세요 >>> ");
	String name = sc.next();
	System.out.print("나이를 입력하세요 >>> ");
	int age = sc.nextInt();
	sc.nextLine();
	System.out.print("영어점수를 입력하세요 >>> ");
	int eg = sc.nextInt();
	sc.nextLine();
	System.out.print("수학점수를 입력하세요 >>> ");
	int mg = sc.nextInt();
	sc.nextLine();
	System.out.print("국어점수를 입력하세요 >>> ");
	int kg = sc.nextInt();
	sc.nextLine();
	
	Student user = new Student(name, age, eg, mg, kg);
	System.out.print(user.getAge() + "세 " + user.getName() + "님의 평균 점수는 : " + user.getEvg() + "점입니다.");
	sc.close;
	*/
	
	/*
	 * KH대학교, 최저 평균 = 75, 영어최저 = 60, 국어 최저 = 60
	 * choi객체는 kh대학교에 입학이 가능한지 검사하여
	 * 가능하면 "합격" 불가능하면 "불합격" 출력
	 */
	System.out.print("이름을 입력하세요 >>> ");
	String name = sc.next();
	System.out.print("나이를 입력하세요 >>> ");
	int age = sc.nextInt();
	sc.nextLine();
	System.out.print("영어점수를 입력하세요 >>> ");
	int eg = sc.nextInt();
	sc.nextLine();
	System.out.print("수학점수를 입력하세요 >>> ");
	int mg = sc.nextInt();
	sc.nextLine();
	System.out.print("국어점수를 입력하세요 >>> ");
	int kg = sc.nextInt();
	sc.nextLine();
	
	Student user = new Student(name, age, eg, mg, kg);
	University KH = new University("KH대학교", 75, 60, 60);
	KH.isEvaluate(user);
	sc.close();
	}
}
