package com.kh.api01;

public class C_Wrapper {
	/*
	 * [Wrapper 클래스] => 기본자료형을 객체로 포장해줄 수 있는 클래스가 래퍼클래스이다.
	 * 
	 *                   기본자료형 < --------- > Wrapper 클래스
	 *                   boolean			   Boolean
	 *                   char                  Character
	 *                   byte                  Byte
	 *                   short                 Short
	 *                   int                   Interger
	 *                   long                  Long
	 *                   float                 Float
	 *                   double                Double
	 *                   
	 *  => 기본자료형을 객체로 표현해야할 겅우
	 *  => 메소드의 매개변수로 기본자료형이 아닌 객체타입만 요구될 경우
	 *  => 다형성을 적용시키고 싶을때
	 */
	public void method01() {
		// [Boxing] => 기본자료형 => Wrapper 클래스 자료형
		int num1 = 10;
		int num2 = 15;
		
		// System.out.println(numl.equals(num2));
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		// 1) 객체생성구문을 통합 방법
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2)); // 두 값을 비교해서 앞쪽이 크면 1반환, 뒷쪽이 크면 -1 같
		
		
		// 2) [AutoBoxing] 객체 생성따위 하지 않고 곧바로 대입하는 방법
		Integer i3 = num1;
		System.out.println(i3);
		// 객체생성을 통해서 반드시 변환해야하는 경우 => 문자열을 Integer타입으로 변환하고 싶을때 (박싱)
		Integer i4 = new Integer("123");
		
		// [UnBoxing] => Wrapper 클래스 자료형 => 기본자료형
		
		// 1) 해당 그 Wrapper 클래스에서 제공하는 xxxValue() 메소드를 통해서 가능
		int num3 = i3.intValue(); // i3 => num3 10
		int num4 = i4.intValue();
		
		// 2) [AutoUnBoxing] => 메소드를 사용하지 않고 바로 대입하는 방법
		int num5 = i1;
		
		System.out.println("========================================");
		
		// 기본자료형 < ---- > String
		String str1 = "10";
		String str2 = "15.5";
		System.out.println(str1 + str2); // 문자열로 작업이 된다.
		
		// 1) String => 기본자료형
		//    "10"   => 10
		//    "15.5" => 15.5
		// 해당 Wrapper클래스.parsexxx() 사용
		int i = Integer.parseInt(str1);
		double d = Double.parseDouble(str2);
		System.out.println(i + d);
		
		// 2) 기본자료형 ==> String
		//    10      ==> "10"
		//    15.5    ==> "15.5"
		String strI = String.valueOf(i);
		String strD = String.valueOf(d);
	}
}
