import java.util.Scanner;
public class Switch_01 {
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
		
		switch(op) {
		case '+':
			System.out.printf("%d + %d 연산을 시작합니다.\n", num, num1);
			int result = num + num1;
			System.out.printf("결과 >>> %d", result);
			break;
		case '-':
			System.out.printf("%d - %d 연산을 시작합니다.\n", num, num1);
			int result1 = num - num1;
			System.out.printf("결과 >>> %d", result1);
			break;
		case '*':
			System.out.printf("%d * %d 연산을 시작합니다.\n", num, num1);
			int result2 = num * num1;
			System.out.printf("결과 >>> %d", result2);
			break;
		case '/':
			System.out.printf("%d / %d 연산을 시작합니다.\n", num, num1);
			int result3 = num / num1;
			System.out.printf("결과 >>> %d", result3);
			break;
		case '%':
			System.out.printf("%d % %d 연산을 시작합니다.\n", num, num1);
			int result4 = num % num1;
			System.out.printf("결과 >>> %d", result4);
			break;
		default:
			System.out.printf("잘못 입력했습니다.");
			break;
		}
		sc.close();
	}
}
