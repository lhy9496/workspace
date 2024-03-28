package test.controller;
import java.util.Scanner;
public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = 0;
		
		System.out.print("정수를 입력하세요 : ");
		data = sc.nextInt();
		sc.nextLine();
		
		if(data % 2 == 0) {
			System.out.println("2의 배수입니다.");
		}
		else {
			System.out.println("2의 배수가 아닙니다.");
		}
	}

}
