/* 2024 - 01 - 10 */
public class Variable {
	/* 변수의 선언
	 * 값을 기록하기 위한 변수를 메모리 공간에 확보, 할당한다.
	 * 즉, 값을 보관하기 위한 공간을 만든다고 생각하면 된다.
	 * 
	 * [표현법] 자료형 변수이름 ; ex) int a; float b; char c;
	 * 
	 * 자료형 : 변수의 크기 및 모양을 지정해주는 부분
	 * 변수이름 : 변수의 이름을 붙여주는 부분(변수에 접근하기 위해서 의미를 부여한다.)
	 * 
	 * 변수 선언 시 주의할점
	 * 
	 */
	public static void main(String[] args) {
		// int(정수형) 라는 자로형으로 num 이라는 이름의 변수를 선언
		int num;
		// boolean(논리형 참과 거짓) 이라는 자료형으로 isTrue, isFalse 라는 변수를 선언
		boolean isTrue;
		boolean isFalse;
		// float(실수형) 이라는 자료형으로 fnum 라는 이름의 변수를 선언
		float fnum;
		// 변수 선언과 동시에 값을 대입해서 초기화 시킴
		int num1 = 10;
		int num2 = 20;
		// num에 7 fnum에 14라는 값을 할당
		num = 7;
		fnum = 14.7f;
		isTrue = true;
		isFalse = false;
		
		System.out.println(6 + 3);
		System.out.println(num + fnum);
		System.out.println(num / fnum);
		System.out.println(num1 + num2);
		System.out.println(num1 * num2);
		// 논리연산자 > 를 실행
		System.out.println(num > num1);
		// 논리연산자 and(그리고 ||)를 실행
		System.out.println(num2 > num1 || fnum > num1);
		
		/* 정수 자료형 = byte(1) short(2) int(4) long(8)
		 * 모두 정수를 저장하는 자료형이지만 각 자료형마다 표현 할 수 있는 수의 범위가 다르다.
		 */
		byte by = 100;
		short sh = 10000;
		int in = 1000000000;
		long lo = 2000000000;
		
		System.out.println("정수 자료형");
		System.out.println(by + ", " + sh + ", " + in + ", " + lo);
		
		/* 실수 자료형 = float(4) double(8)
		 * 모두 실수를 저장하는 자로형이지만 float보다 double이 더 정확한 수를 표현 가능.
		 */
		float fl = 4.24f;
		double dou = 24.4;
		
		System.out.println("실수 자료");
		System.out.println(fl + ", " + dou);
		
		/* 문자 자료형 = char(2)
		 * 문자 하나를 담을 수 있는 자로형 자바는 2바이트의 유니코드로 표현.
		 */
		char ch1 = '심';
		char ch2 = '규';
		char ch3 = '홍';
		
		System.out.println("문자 자료형");
		// 유니코드가 아닌 문자 값을 출력
		System.out.print(ch1);
		System.out.print(ch2);
		System.out.println(ch3);
		// 유니코드의 숫자 값이 불러와져서 숫자로 출력
		System.out.println(ch1 + ch2 + ch3);
		
		/* 논리 자료형 = boolean(1)
		 * true(참)과 false(거짓)을 저장하는 자로형
		 */
		boolean b1 = fl < dou; // true
		boolean b2 = fl == dou; // false
		
		System.out.println("논리 자료형");
		System.out.println(b1);
		System.out.println(b2);
		
		/* 문자열 = String(객체이므로 첫 스펠링이 대문자)
		 * 문자열 같은 경우 할당해야 할 메모리 크기가 너무 가변적이므로 원시타입이 아닌
		 * 객체로 변수를 만들어 준다.
		 */
		String str = "병아리";
		String str1 = new String("삐약삐약");
		String str2 = "오리" + "는 ";
		String str3 = new String("꽥" + "꽥");
		// 다른 자료형 + 문자열 = 문자열로 변환
		String str4 = 98 + "년생 " + 27 + "살";
		
		System.out.println(str + "는 " + str1 + ", " + str2 + str3);
		System.out.println(str4);
		
		/* 이스케이프 시퀀스 = 문자열 내에서 백스페이스, 턉, 백슬래시, 작은따옴표 등등
		 * 코드로 사용되는 특수문자를 표현할때 사용하는 방식.
		 * 백스페이스 = \b, 탭 = \t, 백슬래시 = \\, 작은따옴표 = \'
		 * 큰따옴표 = \", 개 행 문자 = \n
		 * 캐리지리턴(다음 글자가 찍힐 위치를 그 줄의 왼쪽 끝으로 함)
		 */
		System.out.println("저는 이렇게 말했습니다. \"저는 배고파요!\"");
		System.out.println("저는 지금 배가 고파요.. \n먹을걸 주세요!");
		
		/* 상수 = 변하지 않고 정해진 값, 프로그램에서는 한 번만 값을 할당 할 수 있는 메모리
		 * [표현법] final 자료형 변수이름; (final 이라는 키워드를 넣으면 상수처리)
		 * 상수는 변수의 이름을 전부 대문자로 표현.
		 * 변수의 이름이 둘 이상의 단어로 이루어질 경우 언더바( _ )로 연결한다. ex)MY_AGE
		 */
		final int AGE = 90;
		// AGE = 10; 상수로 한번 값을 초기화해서 변경이 불가능.
		System.out.println(AGE);
	}
}
