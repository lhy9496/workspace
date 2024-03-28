import java.util.Scanner;
import java.lang.Math;
public class C_do_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * [do-while]
		 * do{
		 *     반복적으로 실행할 코드(구문)
		 * } while(조건식);
		 * 
		 * 처음에 무조건 실행코드 실행
		 * -> 조건식 검사 -> true일 경우 실행코드 실행 -> 조건식 검사
		 * -> true일 경우 실행코드 실행 -> 조건식 검사
		 * -> false일 경우 실행코드 중지 후 탈출
		 * 
		 * 기존의 for/while문과의 차이점
		 * for/while문 같은 경우 처음 수행될 때 조건을 검사 후 true일 경우 반복 코드 실행
		 * do-while일 경우 첫 실행은 조건 검사를 하지 않고 무조건 실행한다.
		 */
		
		// 1부터 사용자가 입력한 n까지의 총 합계
		
		System.out.print("정수를 입력하세요 >>> ");
		int n = sc.nextInt();
		sc.nextLine();
		int sum = 0;
		
		int i = 1;
		/*
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.print("1부터 " + n + "까지의 합은 : " + sum);
		*/
		
		do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.print("1부터 " + n + "까지의 합은 : " + sum);
	}
}
