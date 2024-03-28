import java.util.Scanner;
import java.lang.Math;
public class D_break {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * break;  :  반복문 안에서 사용되는 분기문으로 break; 코드가 실행되는 순간
		 *            현재 속해있는 반복문을 강제로 빠져나간다(탈출한다).
		 * 유의사항 : switch문 안의 break;는 단지 switch문 만을 빠져나가는 구문이다.
		 */
		
		// 랜덤값(1 ~ 100)을 발생시키고 그 랜덤값을 출력하라(이 과정을 계속 반복)
		// 단, 발생된 랜덤값이 3의 배수일 경우 (3으로 나누면 나머지가 0일시) 반복문을 종료한다(탈출).
		
		/*
		while(true) {
			int n = (int)(Math.random() * 100 + 1);
			System.out.println(n);
			if(n % 3 == 0) {
				break;
			}
		}
		*/
		
		// 사용자에게 문자열을 입력받아 해당 문자열의 길이를 출력(이 과정을 반복)
		// 단, 사용자가 입력한 문자열이 "exit"일 경우 반복문을 탈출
		
		while(true) {
			System.out.print("문자열을 입력하세요 (exit/종료 입력시 중지) >>> ");
			String word = sc.nextLine();
			
			if(word.equals("exit") || word.equals("종료")) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			/*
			else {
				System.out.println("입력한 문자 : " + word + ", 문자열 길이는 : " + i);
			}
			*/
			int i = word.length();
			System.out.println("입력한 문자 : " + word + ", 문자열 길이는 : " + i);
		}
		sc.close();
	}
}
