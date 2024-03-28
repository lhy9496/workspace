public class Conversion {
	public static void main(String[] args) {
		/* 형변 환 = 자료형을 다른 자료형으로 변환해주는 것.
		 * 
		 * 형 변환 원칙 = 1. 대입 연산 시 같은 자료형만 대입이 가능하다.
		 * 일반 연산 시 같은 종류의 자로형으로만 연산이 가능하다.
		 * 두 가지 이상의 자로형을 연산 시 결과는 한 가지 자료형우로 수렴한다.
		 * 
		 * 자동 형 변환 = 두개 이상의 자료형을 연산할 때 하나의 자로형으로
		 * 일치시켜야 연산이 가능하다, 하여 데이터 손실이 적은 방향으로
		 * 컴파일러가 직접 형 변환을 해주는 것.
		 * 
		 * 강제 형 변환 = 값의 범위가 큰 자료형을 값의 범위가 작은 자료형으로 변환하는 것.
		 * 자동으로 컴파일러가 해주지 않기 때문에 프로그래머가 명시적으로 진행한다.
		 * -> 데이터의 손실을 감수하고 강제로 변환한다.
		 */
	   double pi = 3.1415;
	   int wholeNumber = (int)pi;
	   System.out.println(wholeNumber);
	   
	   long num1 = 3000000007L;
	   int num2 = (int)num1;
	   System.out.println(num1);
	   System.out.println(num2);
	   
	   short num10 = 1;
	   short num11 = 2;
	   short num12 = (short)(num1 + num2);
	   System.out.println(num12);
	}
}
