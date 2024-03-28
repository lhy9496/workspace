import java.util.Scanner;
public class Operator04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 비교연산자 / 관계연산자 (이항연산자)
		 * 두 값을 비교하는 연산자
		 * 비교연산자는 조건을 만족하면 true(참), 만족하지 않으면 false(거짓)를 반환한다.
		 * 즉, 비교연산의 결과는 논리값이다.
		 * 
		 * 대소 비교 연산자 : <, >, <=, >= 
		 * 동등비교 연산자 : ==, !=
		 * 원시타입의 일반변수 => 동등비교를 == !=로 진행.
		 * 
		 * String(문자열)은 참조변수(객체를 담는 변수)이기 때문에 단순하게 ==로 동등비교 할 수 없다.
		 *  때문에 String(문자열)을 비교할때는 : str.equals(str1); 코드를 사용
		 *  문자열.equals(문자열); equals 메서드 사용
		 */
		int a = 10;
		int b = 25;
		
		System.out.println("a == b : " + (a == b)); // 비교연산 후 boolean형으로 변환하여 결과 출력
		System.out.println("a <= b : " + (a <= b)); // 비교연산 후 boolean형으로 변환하여 결과 출력
		
		boolean result = (a > b);
		System.out.println("result : " + result);
		
		// 산술열산 + 비교연산
		System.out.println((a * 2) > (b / 5)); // 비교연산 후 boolean형으로 변환하여 결과 출력
		
		System.out.println("a는 짝수인가?? >>> " + (a % 2 == 0)); // 비교연산 후 boolean형으로 변환하여 결과 출력
		System.out.println("b는 짝수인가?? >>> " + (a % 1 != 0)); // 비교연산 후 boolean형으로 변환하여 결과 출력
		System.out.println("b는 홀수인가?? >>> " + (a % 1 == 0)); // 비교연산 후 boolean형으로 변환하여 결과 출력
		System.out.println("a는 홀수인가?? >>> " + (a % 2 != 0)); // 비교연산 후 boolean형으로 변환하여 결과 출력
		
		// 두 수를 입력 받아 어떤 숫자가 더 큰지를 출력하는 프로그램
		// 첫 번째 정수 : ()
		// 두 번째 정수 : ()
		// 첫 번째가 두 번째보다 큽니다 : (true / false)
		// 첫 번째 정수는 짝수입니다 : (true / false)
//		System.out.println("첫 번째 정수를 입력하세요 >>> ");
//		int num1 = sc.nextInt();
//		sc.nextLine();
//		System.out.println("두 번째 정수를 입력하세요 >>> ");
//		int num2 = sc.nextInt();
//		sc.nextLine();
//		System.out.println("첫 번째 정수가 두 번째 정수보다 큽니까?? : " + (num1 > num2));
//		System.out.println("첫 번째 정수는 짝수입니까?? : " + (num1 % 2 == 0));
		
		// 특이케이스( 문자와 숫자간의 대소비교 가능!! )
//		System.out.println('A' > 60);
//		System.out.println('Z' > 70);
		// 'A' ~ 'Z'는 65 ~ 90 까지의 숫자로 연달아 나열되어있다.
		// char형과 int형은 연산도 가능
//		System.out.println((char)65); int형은 char형으로 강제 형변환 후 'A'를 출력 가능
		
		String str = new String("alice");
		String str1 = new String("alice");
		System.out.println(str == str1);
		System.out.println(str + " " + str1);
		System.out.println("alice" == "alice");
	}
}
