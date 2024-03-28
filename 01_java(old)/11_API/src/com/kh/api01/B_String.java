package com.kh.api01;

import java.util.StringTokenizer;

public class B_String {
	
	public void method01() {

		
		/*
		 * [String 클래스] => 불변 클래스(변하지 않는 클래스)
		 * 1) 변경이 가능하지만 수정되는 개념이 아니라 새로 생성하여 교체하는 개념
		 * 2) 변경하는 순간 기존의 문자열 자리에서 변경되는게 아닌 새로운 곳을 참조하도록 됨
		 *    (새로운 주소값을 부여받음 == 주소값 변경)
		 */
		
		// 1) 생성자를 통한 문자열 생성
		String str1 = new String("hello!");
		String str2 = new String("hello!!");
		
		// String 클래스에 toString()메소드가 실제 담긴 문자열을 반환하도록 이미 오버라이딩 되어있음.
		System.out.println(str1.toString());
		System.out.println(str2);
		
		// false(거짓)인 이유는 주소값이 다르기에(주소값 비교)
		System.out.println(str1 == str2);
		
		// String 클래스에 equals() 메소드는 이미 오버라이딩 되어있음(주소값이 아닌 실제값인 담긴 문자열을 비교) false
		System.out.println(str1.equals(str2));
		
		// String 클래스에 hashCode() 메소드도 이미 주소값이 아니고 문자열을 가지고 만들도록 오버라이딩 되어있다
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		// 주소값에 대한 해시코드가 알고 싶다면 identityHashCode() 메소드를 이용해야한다
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		System.out.println("========================= 줄 나누기 =========================");
		
		// 2) 문자열을 리터럴값으로 생성
		String str3 = "hello";
		String str4 = "hello";
		/*
		 * 리터럴 제시시 상수풀(String Pool)영역에 올라감
		 * [String Pool의 특징] => 동일한 문자열을 가질 수 없다
		 */
		
		System.out.println(str3);
		System.out.println(str4);
		
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());
		
		System.out.println(str3 == str4);
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		
		str4 = "hi";
		System.out.println(System.identityHashCode(str4));
		str3 = "bye";
		System.out.println(System.identityHashCode(str3));
		
		str4 = "hello";
		System.out.println(System.identityHashCode(str4));
	}

	public void method02() {

		// 메소드명(매개변수) => 반환형
		
		String str1 = "Hello World";
		
		// 1) 문자열.charAt(int index) => char 
		//    문자열에서 전달받은 index위치의 문자만을 추출해서 리턴한다.
		char ch = str1.charAt(8);
		System.out.println(ch);
		
		// 2) 문자열.concat(String str) => String
		//    문자열과 전달된 또 다른 문자열을 하나로 합쳐서 새로운 문자열로 리턴
		String str2 = str1.concat("!!!");
		System.out.println("str2 : " + str2);
		
		String str3 = str1 + "!!!";
		System.out.println("str3 : " + str3);
		
		// str2와 str3는 담긴 문자열은 일치하나 담겨있는 주소값은 다르다
		System.out.println("str2와 st3는 일치하는가? : " + (str2 == str3));
		
		// 3) 문자열.equals(Object obj) => 결과값 boolean형
		//    문자열과 전달된 또 다른 문자열을 가지고 주소값 비교가 아닌 실제 문자열 값을 가지고 동등 비교
		System.out.println("str2와 st3는 일치하는가? : " + (str2.equals(str3)));
		
		// 4) 문자열.contains(CharSequence s) => 결과값 boolean형
		System.out.println("str1에 Hello라는 문자열이 포함되어 있습니까? : " + str1.contains("Hello"));
		System.out.println("str1에 Bye라는 문자열이 포함되어 있습니까? : " + str1.contains("Bye"));
		
		// 5) 문자열.length() => 결과값 int형
		//    문자열의 길이를 반환하는 메소드
		System.out.println("str1의 길이 : " + str1.length());
		
		// 6) 문자열.substring(int beginIndex) => 문자열의 beginIndex 위치에서부터 끝까지 문자열을 추출하고 리턴
		//    결과값 String형 사용자가 지정하는 시작 인덱스부터 끝까지 추출 리턴
		//    문자열.substring(int beginIndex, endIndex) => 문자열의 beginIndex 위치부터 endIndex -1의
		//    위치까지 추출해서 리턴
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0, 5));
		
		// 7) 문자열.replace(char oldChar, char newChar) => 결과값 String형
		//    문자열에서의 oldChar 문자룰 newChar 문자로 변환한 새 문자열 리턴
		//    특정 문자를 다른 문자로 바꿀때 사용(새 문자열에 사용, 기본 문자열은 변화가 없다)
		String str4 = str1.replace('l', 'c');
		System.out.println("str4 : " + str4);
		
		// 8) 문자열.toUpperCase() => 결과값 String형 문자열을 다 대문자로 변경한 새 문자열 리턴
		//    문자열.toLowerCase() => 결과값 String형 문자열을 다 소문자로 변경한 새 문자열 리턴
		String str5 = str1.toUpperCase();
		System.out.println("str5 : " + str5);
		System.out.println("Lower : " + str1.toLowerCase());
		
		/*
		System.out.println("계속 하시겠습니까? (y/n) : ");
		char ch1 = new java.util.Scanner(System.in).next().toUpperCase().charAt(0); // 대문자 Y, N
		*/
		
		// 9. 문자열.trim() => 결과값(리턴) String형
		//    문자열의 앞 뒤 공백을 제거시킨 새 문자열을 리턴
		String str6 = "    JA    VA    ";
		System.out.println(str6.trim());
		
		// 10) 문자열.toCharArray() => char[] 결과값(리턴) 문자형 배열
		//     
		char[] arr = str1.toCharArray();
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.println(i + "번째 인덱스 : " + arr[i]);
		}
		*/		
		/*
		for(char ch2 : arr) {
			System.out.print(ch2);
		}
		System.out.println();
		*/
		
		// 11) static valueOf(char[] data) => 결과값(리턴값) String형
		System.out.println(String.valueOf(arr));
	}

	public void method03() {
		String str = "Java, Oracle, JDBC, HTML, CSS, Spring";
		
		// 구분자를 기준으로해서 문자열을 분리시키는 방법
		
		// 1) 분리된 문자열들을 String[] 배열에 차곡차곡 담고자 할때
		//    String 클래스에서 제공하는 split 메소드를 이용
		//    문자열.split(구분자) => 결과값 String[]
		String[] arr = str.split(",");
		System.out.println("배열의 길이 : " + arr.length);
		/*
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		*/
		for(String st : arr) {
			System.out.print(st);
		}
		System.out.println();
		
		// 2) 분리된 문자열들을 각각 토큰으로써 관리하고자 할때
		//    java.util.StringTokenizer 클래스를 이용하는 방법
		StringTokenizer stn = new StringTokenizer(str, ",");
		
		System.out.println("남은 토큰 : " + stn.countTokens());
		
		System.out.print(stn.nextToken());
		System.out.print(stn.nextToken());
		System.out.print(stn.nextToken());
		System.out.print(stn.nextToken());
		System.out.print(stn.nextToken());
		System.out.print(stn.nextToken());
		System.out.println();
		System.out.println("남은 토큰 : " + stn.countTokens());
		System.out.print(stn.nextToken()); // NoSuchElementException발생(더이상 요소가 없습니다)
		/*
		 * 반복하여 처음부터 끝까지 출력하는 방법
		 */
		/* 1번
		int count = stn.countTokens();
		for(int i = 0; i < count; i++) {
			System.out.println(stn.nextToken());
		}
		*/
		
		/* 2번
		while(stn.hasMoreTokens()) {
			System.out.println(stn.nextToken());
		}
		*/
	}
}
