public class Operator02 {
	public static void main(String[] args) {
		
		/* 증감 연산자
		 * ++ : 변수에 담긴 값을 1 증가시켜주는 연산자
		 * -- : 변수에 감긴 값을 1 감소시켜주는 연산자
		 * 전위, 후위연산
		 * 전위 연산 (++a, --a) => "연산을 먼저 진행한 후 코드를 실행"(선증감)
		 * 후위연산 (a++, a--) => "코드를 먼저 실행한 후 연산을 진행"(후증감)
		 */
		int num1 = 0;
		
//		System.out.println(++num1); // 1
		
//		System.out.println(num1--); // 0 (다음 출력에서 num1 = -1)
//		System.out.println(num1--); // -1 (다음 출력에서 num1 = -2)
//		System.out.println(++num1); // -1 (다음 출력에서 num1 = -1)
//		System.out.println(num1++); // -1  (다음 출력에서 num1 = 0)
//		System.out.println(--num1); // -1 (다음 출력에서 num1 = -1)
//		System.out.println(++num1); // 0 (다음 출력에서 num1 = 0)
//		System.out.println(++num1); // 1 (다음 출력에서 num1 = 1)
//		System.out.println(num1++); // 1 (다음 출력에서 num1 = 2)
		
		System.out.println(num1++); // 0 (다음 출력에서 num1 = 1)
		System.out.println(++num1); // 2 (다음 출력에서 num1 = 2)
		System.out.println(--num1); // 1 (다음 출력에서 num1 = 1)
		System.out.println(--num1); // 0 (다음 출력에서 num1 = 0)
	}
}
