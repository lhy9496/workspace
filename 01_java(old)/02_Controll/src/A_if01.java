import java.util.Scanner;
public class A_if01 {
	public static void main(String[] args) {
		/*
		 * 기본적으로 프로그램의 진행은 순차적으로 진행한다.
		 * 단, 이 순차적인 흐름을 바꾸고자할 때 제어문이라는 걸 이용해서 직접 제어가 가능하다.
		 * 
		 * 선택적으로 실행시키고자 한다면 => 조건문
		 * 반복적으로 실행시키고자 한다면 => 반복문
		 * 그 외의 흐름 제어 => 분기문
		 * 
		 * [조건문] : "조건식"을 통해 참 또는 거짓을 판단하여 참일경우 그에 해당하는 코드를 실행한다.
		 * 조건식의 결과는 true 또는 false이여야 한다.
		 * 보통 조건식에서는 비교연산자(대조, 동등), 논리연산자(&&, ||)를 주로 사용한다.
		 *
		 *
		 * if문만 단독으로 사용하는 경우
		 * 
		 * if(조건식) {
		 *   ...실행문
		 * }
		 * => 조건식이 true일 경우 = 중괄호 블럭 속의 실행문 코드를 실행한다.
		 * => 조건식이 false일 경우 = 중괄호 블럭안의 코드를 무시한다.
		 */
		Scanner sc = new Scanner(System.in);
		
/*		System.out.print("정수를 입력하세요 >>> ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			System.out.printf("입력한 정수는 %d이고, 양의정수 입니다.", num);
		}
	    if(num < 0) {
			System.out.printf("입력한 정수는 %d이고, 음의정수 입니다.", num);
		} */
//==============================================================================
		/*
		 * if - else 문
		 * 
		 * if(조건식) {
		 *     ...실행문
		 * }
		 * else {
		 *     ...실행문1
		 *}
		 *조건식의 결과가 참(true)일 경우 실행문 실행 후 if-else문을 빠져나감.
		 *단, 결과가 거짓(false)일 경우 무조건 실행문1를 실행한다.
		 */
/*		System.out.print("정수를 입력하세요 >>> ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			System.out.printf("입력한 정수는 %d이고, 양의정수 입니다.", num);
		}
		else if(num < 0){
			System.out.printf("입력한 정수는 %d이고, 음의정수 입니다.", num);
		}
		else {
			System.out.printf("입력한 정수는 %d이고, 음/양의 정수가 아닌 0 입니다.", num);
		}  */
//=============================================================================
		/*
		 * if - else if문
		 * 같은 비교대상으로 여러개의 조건을 제시해야될 경우 사용한다.
		 * 
		 * if(조건식) {
		 *     ...실행문
		 * }
		 * else if (조건식1) {
		 *     ...실행문1
		 * }
		 * else {
		 *     위의 조건들이 다 false일 경우 실행할 코드
		 * }
		 * 조건식을 여러개 사용하는것도 가능하며 else코드는 사용하지 않아도 된다.
		 */
		System.out.print("정수를 입력하세요 >>> ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0) {
			System.out.printf("입력한 정수는 %d이고, 양의정수 입니다.", num);
		}
		else if(num < 0){
			System.out.printf("입력한 정수는 %d이고, 음의정수 입니다.", num);
		}
		else {
			System.out.printf("입력한 정수는 %d이고, 음/양의 정수가 아닌 0 입니다.", num);
		}
		sc.close();
	}
}
