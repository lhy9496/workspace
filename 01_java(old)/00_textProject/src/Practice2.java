import java.util.Scanner;
public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 정수를 입력하세요 >>> ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.println("두번째 정수를 입력하세요 >>> ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.printf("입력받은 숫자는 %d, %d 입니다. 두 수의 합은 %d 입니다.\n", num, num1, num + num1);
		System.out.printf("입력받은 숫자는 %d, %d 입니다. 두 수의 차는 %d 입니다.\n", num, num1, num - num1);
		System.out.printf("입력받은 숫자는 %d, %d 입니다. 두 수의 곱은 %d 입니다.\n", num, num1, num * num1);
		System.out.printf("입력받은 숫자는 %d, %d 입니다. 두 수를 나눈 몫은 %d, 나머지는 %d 입니다.", num, num1, num / num1, num % num1);
		
		sc.close();		
	}
}
