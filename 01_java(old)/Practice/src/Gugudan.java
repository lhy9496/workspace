import java.util.Scanner;
public class Gugudan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int result;
		System.out.print("출력할 구구단의 단을 입력하세요 (1~9) >>> ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i < 10; i++) {
			if(num >= 1 && num <= 9) {
				result = num * i;
				System.out.printf("%d * %d = %d\n", num, i, result);
			}
		}
	}
}
