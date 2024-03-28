
public class OperatorTest {
	public static void main(String[] args) {
		int num1 = 7;
		int num2 = 3;
//		System.out.println("num1 / num2 = " + (num1 / num2));
//		System.out.println("num1 / num2 = " + (7.0 / 3.0));
		
//		num1 += num2; // num1 = num1 + num2, num1 = 7 + 3 = 10
		num1 %= num2; // num1 = num1 % num2, num1 = 7 % 3 = 1
		System.out.println(num1);
		System.out.println(num2);
		
		// ++num 전위연산 일 경우 먼저 연산을 진행한 후 코드를 실행
		// num++ 후위연산 일 경우 코드를 먼저 실행한 후 연산을 진행 
		int num3 = 0;
		System.out.println(num3++);
		System.out.println(++num3);
		System.out.println(num3--);
		System.out.println(--num3);
		
	}
}
