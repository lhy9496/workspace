import java.util.Scanner;
public class Operator06 {
	public static void main(String[] args) {
		/* 삼항연산자 : 항목 3개를 가지고 연산해주는 연산자
		 * [표현법] : 조건식 ? 조건식이 참일경우 돌려줄 결과값 : 조건식이 거짓일 경우 들어올 결과값
		 * 이떄, 조건식은 반드지 true 또는 false가 나오도록 해야한다.
		 * 주로 비교, 논리연산자를 통해 작성한다.
		 */
		
		//입력 받은 정수값이 양수인지 아닌지 판별 후 출력한다.
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수를 입력하세요 >>> ");
//		int num = sc.nextInt();
//		sc.nextLine();
		
//		String result = num > 0 ? ("양수 입니다.") : ("음수 입니다.");
//		System.out.printf("입력한 정수는 %d이며, %d은(는) %s", num, num, result);
//		System.out.println(num + "은(는) " num > 0 ? "양수 입니다." : "음수 입니다.");
		
		// 정수 하나를 입력 받아 짝수인지 홀수인지 판별 후 출력
		// 정수를 입력하세요 >>>
		// 입력 받은 정수는 num입니다. num은(는) 짝/홀수 입니다.
		
//		System.out.print("정수를 입력하세요 >>> ");
//		int num = sc.nextInt();
//		sc.nextLine();
		
//		String result = num % 2 == 0 ? ("짝수 입니다.") : ("홀수 입니다.");
//		System.out.printf("입력한 정수의 값은 %d이고 , %d은(는) %s", num, num, result);
		
		//사용자에게 두개의 정수값을 입력 받으세요.
		// +또는 -를 입력받아 그에 맞는 연산결과를 출력해 주세요.
		// 단, + 또는 - 이외에 다른 문자를 입력했을 경우 "잘못 입력했습니다" 출력
		// 첫번째 정수 :
		// 두번째 정수 :
		// 연산자 입력(+ 또는 -) :
		// 결과 : xxx / 잘못 입력했습니다.	
		System.out.print("첫번째 정수를 입력하세요 >>> ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수를 입력하세요 >>> ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자를 입력하세요 ( + 또는 -만 가능 ) >>> ");
		char op = sc.next().charAt(0);
		String result = (op == '+' ? (num + num1) : (op == '-' ? (num - num1) : "잘못 입력했습니다.")) + "";
		
		System.out.printf("입력한 첫번째 정수는 %d, 두번째 정수는 %d이고 연산자는 %s입니다. 연산 결과는 %d입니다.", num, num1, op, result);
		
		sc.close();
	}
}
