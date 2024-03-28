package Loop;
import java.util.Scanner;
public class Exam01 {

	public static void main(String[] args) {
		// for문을 이용해서 1부터 입력받은 정수 n까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성하시오.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			if(i % 3 == 0) {
				sum += i;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("1 ~ " + n + " 사이 3의 배수의 총합 : " + sum);
	}
}
