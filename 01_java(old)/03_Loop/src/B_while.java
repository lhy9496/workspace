import java.util.Scanner;
import java.lang.Math;
public class B_while {
	public static void main(String[] args) {		
		Scanner sc = new Scanner(System.in);
		/*
		 * while문
		 * [초기식;]
		 * while(조건식) {
		 *     반복적으로 실행한 코드(구문);
		 *     [증감식;]
		 *     }
		 * 조건식의 결과가 true일 경우 해당 코드를 실행한다.
		 * 
		 * 조건식 검사 -> true일 경우 실행코드 실행
		 * 조건식 검사 -> true일 경우 실행코드 실행
		 * .... 반복
		 * 조건식 검사 -> false일 경우 실행코드를 실행하지 않고 반복문 탈출
		 */
		
		/*
		for(int i = 0; i < 5; i++)
		System.out.println("안녕하세요.");
		*/
		
		/*
		int i = 0;
		while(i < 5) {
			System.out.println("안녕하세요.");
			i++;
		}
		*/
		
		// 1에서부터 10000까지 홀수만 출력
		/*
		int i = 1;
		while(i <= 10000) {
			i++;
			if(i % 2 != 0) {
			System.out.print(i + " ");
			}
		}
		System.out.println("");
	    i = 1;
		while(i <= 10000) {
			i += 2;
			System.out.print(i + " ");
		}
		*/
		
		// 1부터 랜덤값(1 ~ 100) 까지의 총 합계를 출력
		// 1부터 n까지의 총 합계는 : ㅇㅇㅇ
		/*
		int n = (int)(Math.random() * 100 + 1);
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("1에서부터 " + n + "까지의 총 합은 : " + sum + " ");
		*/
		
		/*
		int n = (int)(Math.random() * 100 + 1);
		int sum = 0;
		int i = 1;
		while(i <= n) {
			sum += i;
			i++;
		}
		System.out.println("1에서부터 " + n + "까지의 총 합은 : " + sum + " ");
		*/
		
		// 사용자에게 문자열을 입력받아 해당 문자열의 짝수자리 글자만 출력
		// 문자열 입력 >>> ㅇㅇㅇㅇㅇㅇ
		// ㅇㅇㅇ
		System.out.print("문자열을 입력하세요 >>> ");
		String word = sc.nextLine();
		int i = 0;
		while(i < word.length()) {
			if(i % 2 == 1) {
				System.out.print(word.charAt(i));
			}
			i++;
		}
	}
}
