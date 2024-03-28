package ncs.test6;
import java.util.Scanner;
public class ExceptionTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Calculator 객체를 호출하여 clc라는 참조변수에 대입.
		Calculator clc = new Calculator();
		
		System.out.print("정수를 입력하세요(2 ~ 5) : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		// 정상적으로 2 ~ 5 사이의 값이 입력되면 결과 값을 출력
		try {
			System.out.println("결과 값 : " + clc.getSum(num));
		} 
		// 만약 2 ~ 5 사이의 값이 아닌 다른 값이 입력 되었다면 InvalidException를 사용해 예외를 처리
		catch (InvalidException e) {
			// 넘겨 받은 InvalidException 클래스 안의 InvalidException메소드 실행(상속 받은 메세지 출력)
			System.out.println(e.getMessage());
		}
	}
}
