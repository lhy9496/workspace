import java.util.Scanner;
import java.lang.Math;
public class A_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * <반복문> : 프로그램 흐름을 제어하는 제어문 중 하나, 어떤 실행코드를 반복적으로 수행한다.
		 * 
		 * 크게 두 종류로 나뉜다(for문 / while문(do-while문)
		 * 
		 * [for문] 표현법 : for(초기식; 조건식; 증감식) { // 반복 횟수를 지정하기 위해 제시하는 것들.
		 *                     반복적으로 실행시키고자 하는 구문(코드)
		 *                     }
		 * 초기식 : 반복문이 수행될 때 "처음에 단 한번만 실행하는 구문(코드)"
		 *        (보통 반복문 안에서 사용될 변수를 선언 및 초기화하는 구문)
		 * 조건식 : "반복문이 수행될 조건"을 작성하는 구문
		 *        조건식이 true일 경우 해당 구문을 실행, 조건식이 false가 되는 순간 반복을 중지하고 빠져나온다.
		 *        (보통 초기식에 제시된 변수를 가지고 조건식을 정한다)
		 * 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
		 *        (보통 초기식에 제시된 변수를 가지고 증감연산자를 사용함)
		 *        
		 * for문을 만나는 순간 초기식 -> 조건식 검사 -> true일 경우 실행구문 실행 -> 증감식 적용
		 *                 조건식 검사 -> true일 경우 실행구문 실행 -> 증감식 적용 ... 반복
		 *                 조건시기 false일 경우 종료.
		 * tip) for문 안에 초기식, 조건식, 증감식 각각 생략이 가능하긴하다(단 ;은 반드시 입력)
		 */

		//"안녕하세요를 5번 출력하세요
		/*
		for(int i = 0; i < 5; i++) {
			System.out.println("안녕하세요!!");
		}
		for(int i = 11; i < 16; i++ ) {
			System.out.println("안녕하세요!!");
		}
		for(int i = 1; i <= 9; i += 2) {
			System.out.println("안녕하세요!!");
		}
		*/
		
		// 1~5까지 순차적으로 출력하세요 ex) 1 2 3 4 5
		/*
		for(int i = 1; i < 6; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 5~1까지 순차적으로 출력
	    for(int i = 5; i > 0; i--) {
	    	System.out.print(i + " ");
	    }
	    */
		
		// 정수 n을 입력받아 1부터 n까지 1씩 증가시키면서 출력해라
		/*
		System.out.print("정수를 입력하세요 >>> ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i + " ");
		}
		*/
		
		// 1부터 10까지의 홀수만 출력
		/*
		for(int i = 1; i <= 10; i++) {
			if(i % 2 == 1) {
			System.out.print(i + " ");
			}
		}
		*/
		
		// 1에서부터 10까지 총 합계를 구해라
		// 방법 1. 1+2+3+4+5+6...100
		// 방법 2. int sum = 0; -> sum += 1, sum += 2, sum +=3 ...
		// 규칙을 찾아서 sum 변수에 누적해서 합산하는 것 반복적으로 진행
		// 단, 누적해서 더하고자하는 값이 1에서부터 10까지 1씩 증가한다.
		/*
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
				sum += i;
				}
				System.out.print(sum + " ");
		}
		*/
		
		// 정수 n을 입력받아 1부터 n까지의 1씩 증가하며 모든 수를 더해라
		/*
		int sum = 0;
		System.out.print("정수를 입력하세요 >>> ");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
			System.out.print(sum + " ");
			*/
		
		/*
		 * java.lang.Math 클래스에서 제공하는 random메소드를 호출해서 매번 다른 랜덤값을 얻어낼 수 있다.
		 * [사용법] : import java.lang.Math; 코드로 클래스를 불러온다.
		 * 그 후, Math.random() 호출시 -> 0.0 ~ 0.99999999사이의 랜덤값을 반환한다.
		 * int random = Math.random(); 이 코드는 랜덤이 더블형이라 불가능
		 * int random = Math.random() * 10; 이 코드도 불가능하다
		 * int random = (int)(Math.random() * 10 + 1); => 1 ~ 10 사이의 정수 출력
		 */
//		System.out.print((int)(Math.random() * 10 + 1));
		
		//random 숫자(범위 1 ~ 10 정수만) n을 생성해서 1부터 n까지 모두 더한 값을 출력하세요
		// random 수 : 5
		// 1 ~ 5 까지의 함 : 15
		/*
		int sum = 0;
		int n = (int)(Math.random() * 10 + 1);
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println("생성된 랜덤 숫자 = : " + n);
		System.out.print("1부터 " + n + "까지 정수의 합 : " + sum + " ");
		*/
		
		// random(5 ~ 50)한 숫자 n을 생성해서 1부터 n까지의 숫자중 짝수만 출력
		/*
		int n = (int)(Math.random() * 46 + 5);
		System.out.printf("생성된 랜덤 숫자는 %d입니다.\n", n);
		for(int i = 1; i <= n; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		*/
		
		/*
		 * 각 인덱스(0부터의 순서)별 문자 뽑아서 출력
		 * H => str.charAt(0) 코드로 출력
		 * o => str.charAt(4) 코드로 출력
		 * 
		 * 0번 인덱스부터 4번 인덱스(마지막 인덱스)까지 매번 1씩 증가하면서 반복 수행
		 * 
		 * 문자열.length() : 문자열의 길이를 구할 수 있다.
		 */
		/*
		String str = "HelloWorld";
		for(int i =  0; i < str.length(); i++) {
			System.out.print(str.charAt(i));
		}
		*/
		
		// 사용자에게 문자열을 입력받아 해당 문자열의 짝수자리 글자만 출력
		// 문자열 입력 >>> ㅇㅇㅇㅇㅇㅇ
		// ㅇㅇㅇ
		/*
		System.out.print("문자열을 입력하세요 >>> ");
		String word = sc.nextLine();
		
		for(int i = 0; i < word.length(); i++) {
			if(i % 2 == 1) { // 문자열 출력은 0부터 시작이기 때문에 짝수 자리 문자를 출력하려면
				// 홀수를 구하는 조건식을 사용해야한다. (짝수 글자 출력 = 홀수 인덱스 출력)
				System.out.print(word.charAt(i));
			}
		}
		*/
		
		// 구구단 2단을 출력해보자
		/*
		int sum = 2;
		for(int i = 1; i < 10; i++) {
			sum = i * 2;
			System.out.printf("2 * %d = %d\n", i, sum);
		}
		*/
		
		// 사용자가 입력한 단을 출력
		/*
		int sum = 0;
		System.out.print("구구단을 출력한 단의 숫자를 입력하세요 >>> ");
		int num = sc.nextInt();
		sc.nextLine();
		
		for(int i = 1; i < 10; i++) {
			if(num <= 9 && num >= 1) {
				sum = num * i;
				System.out.printf("%d * %d = %d\n", num, i, sum);
			}
		}
		*/
		
		/*
		System.out.println("1 2 3 4 5");
		System.out.println("1 2 3 4 5");
		System.out.println("1 2 3 4 5");
		
		for(int i = 0; i < 3; i++) {
			System.out.println("1 2 3 4 5");
		}
		System.out.println("===================");
		for(int j = 1; j < 6; j++) {
			System.out.print(j + " ");
		}
		*/
		
		/*
		for(int i = 0; i < 3; i++) {
			for(int j = 1; j < 6; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		*/
		
		/*
		 *  구구단 2~9단 모두 출력
		int sum = 0;
		for(int j = 2; j <= 9; j++) {
			for(int i = 1; i <= 9; i++) {
				if(j >= 2 && j <= 9) {
					sum = j * i;
					System.out.printf("%d * %d = %d\n", j, i, sum);
				}
			}
			System.out.println("");
		}
		*/
	}
}
