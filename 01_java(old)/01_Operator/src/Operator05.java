import java.util.Scanner;
public class Operator05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 논리연산자 : 두개의 논리값을 연산해 주는 연산자
		 * 논리연산한 결과도 논리값이다.
		 * 
		 * 논리값 && 논리값 : AND연산 왼족, 오른쪽 두 논리값이 모두 true일 때 결과값이 true이다.
		 * 논리값 || 논리값 : OR연산 왼쪽, 오른쪽 값중 하나라도 true이면 결과값이 true이다.
		 * 
		 * true && true => true
		 * true && false => false
		 * false && true => false
		 * false && false => false
		 * && 연산자를 기준으로 앞의 결과가 false(거짓)일 경우 뒤의 조건을 궂이 실행하지 않아도
		 * 최종 결과는 false(거짓)이다
		 * 
		 * true || true => true
		 * true || false => true
		 * false || true => true
		 * false || false => false
		 * || 연산자를 기준으로 앞의 결과가 true(참)일 경우 뒤의 조건을 궂이 실행하지 않아도
		 * 최종 결과는 true(참)이다
		 */
		
		//사용자에게 두 수를 입력 받아 해당 숫자가 1 ~ 100 사이의 값인지 확인
//		System.out.println("정수를 입력하세요 >>> ");
//		int num1 = sc.nextInt();
//		sc.nextLine();
		// 1 <= num1 <= 100
//		boolean result = (num1 >= 1) && (num1 <= 100);
		
//		System.out.println("입력 받은 정수는 " + num1 + "입니다. 1 이상 100 이하 입니까?? >>> " + result);
		
		// 사용자에게 알파벳 하나를 입력 받아 대소문자를 확인
		// 문자 하나 입력 : 
		// 사용자가 입력한 값이 대문자 입니까?? >>> (true / false)
		// 'A' => 65, 'Z' => 90
//		System.out.println("알파벳 하나를 입력하세요 >>> ");
//		char abc = sc.next().charAt(0); // charAt(순서) 코드는 "Apple"같은 문자열도 사용 가능.
		// char abc = "Apple".charAt(0); => A가 출력
		
//		boolean result = (abc >= 65) && (abc <= 90); //	boolean result = (abc >= 'A') && (abc <= 'Z');
//		boolean result1 = (abc >= 'a') && (abc <= 'z');
//		System.out.println((!result && !result1) ? "알파벳을 하나만 입력해주세요" : ("사용자가 입력한 값이 대문자입니다 : " + result)); // result 와 result1 모두 부정이면 알파벳이 아니다.
//		System.out.println("사용자가 입력한 값이 대문자 입니까?? >>> " + result);
		
		// 사용자에게 성별을 입력받은 후 여자인지 확인
		// 성별(M / F) : 대소문자 모두 가능
		// 사용자가 여자입니까?? >>> (true, false)
//		System.out.println("성별을 입력하세요(M/F) >>> ");
//		char gender = sc.next().charAt(0);
		
//		boolean result = (gender == 70) || (gender == 102);
//		System.out.println("사용자는 여자입니까?? >>> " + result);
		
//		int num = 10;
//		boolean result = (num < 5) && (++num > 0);
//		System.out.println("result : " + result);
//		System.out.println("&&연산 후의 num : " + num);
		
//		int num1 = 10;
//		boolean result1 = true || (++num1 > 0);
//		System.out.println("||연산 후의 num1의 값 : " + num1);
		sc.close();
	}
}
