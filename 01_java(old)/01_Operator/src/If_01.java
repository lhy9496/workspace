import java.util.Scanner;
public class If_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 정수값 입력 >>> ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수값 입력 >>> ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자 입력 >>> ");
		char op = sc.next().charAt(0);
		
		if(op == '+') {
			int result = num + num1;
			System.out.printf("결과 >>> %d", result);
		}
		else if(op == '-') {
			int result = num - num1;
			System.out.printf("결과 >>> %d", result);
		}
		else if(op == '*') {
			int result = num * num1;
			System.out.printf("결과 >>> %d", result);
		}
		else if(op == '/') {
			int result = num / num1;
			System.out.printf("결과 >>> %d", result);
		}
		else if(op == '%') {
			int result = num % num1;
			System.out.printf("결과 >>> %d", result);
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		sc.close();
	}
}
