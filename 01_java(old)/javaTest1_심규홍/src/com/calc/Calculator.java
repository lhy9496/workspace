package com.calc;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요(1 ~ 9) : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수를 입력하세요(1 ~ 9) : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		System.out.println("합 : " + (num1 + num2));
		System.out.println("차 : " + (num1 - num2));
		System.out.println("곱 : " + (num1 * num2));
		System.out.println("나누기 : " + (num1 / num2));
	}
}
