package test.controller;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수를 입력하세요(1 ~ 9) : ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수를 입력하세요(1 ~ 9) : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if((num1 > 0 && num1 < 10) && (num2 > 0 && num2 < 10)) {
			int sum = num1 * num2;
			if(sum >= 10) {
				System.out.println("두자리 수 입니다.");
			}
			else if(sum > 0 && sum < 10) {
				System.out.println("한자리 수 입니다.");
			}
		}
	}
}
