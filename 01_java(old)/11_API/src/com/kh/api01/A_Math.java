package com.kh.api01;

public class A_Math {
	
	public void method01() {
		/* 
		 * Math 클래스는 (java.lang.) 패키지에 포함되어 있다
		 */
		
		// 상수 필드
		System.out.println("파이 : " + Math.PI);
		
		// 절대값을 알고자 할 때 => abs 메소드 사용
		int num1 = -10;
		System.out.println("절대값 : " + Math.abs(num1));
		
		// 올림 => ceil 메소드 사용
		double num2 = 16.649;
		System.out.println("올림 : " + Math.ceil(num2));
		
		// 반올림 => round 메소드 사용
		System.out.println("반올림 : " + Math.round(num2));
		
		// 버림 => floor 메소드 사용
		System.out.println("버림 : " + Math.floor(num2));
		
		// 가장 가까운 정수값을 알아낸 후 실수형으로 반환 => rint 메소드 사용
		System.out.println("가장 가까운 정수값 : " + Math.rint(num2));
		
		// 제곱근(루트) 구하기 => sqrt 메소드 사용
		System.out.println("16의 제곱근 : " + Math.sqrt(num2));
		
		// 제곱을 구하기 => pow
		System.out.println("2의 10제곱 : " + Math.pow(2, 10));
		/* 
		 * Math m = new Math();
		 * [Math 클래스의 특징]
		 * 1) 모든 필드가 상수필드이다, 모든 메소드가 static 메소드이다
		 * 2) 생성자는 private 접근제한자로 생성되있어서 따로 생성이 불가능하다.
		 * 
		 * [싱글론 패턴] => 한번만 메모리 영역에 올려놓고 재사용하는 개념
		 */
	}
}
