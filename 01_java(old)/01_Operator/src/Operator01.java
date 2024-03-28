
public class Operator01 {
	public static void main(String[] args) {
		/* ! = 논리부정 연산자 (단항 연산자 == 하나의 값을 가지고 연산)
		 * 논리값(true / false)을 반대로 바꾸는 연산자
		 * => 결과 마저도 논리값이다.
		 */
		System.out.println("true의 부정 = " + !true); // true의 부정값은 false
		System.out.println("false의 부정 = " + !false); // false의 부정값은 true
		
		boolean b1 = true;
		System.out.println("b1의 부정 = " + !!b1); // 부정 연산자 2개를 쓰면 false로 갔다가 다시 true로 돌아옴.
		
		boolean b2 = !b1; // true의 부정연산 값인 false
		boolean b3 = !(5 > 3); // true의 부정연산 값인 false
		System.out.println("b2 = " + b2 + ", b3 = " + b3);
		
		boolean isOpen = true;
		// 문이 열렸을때
		{
			isOpen = !isOpen;
		}
	}
}
