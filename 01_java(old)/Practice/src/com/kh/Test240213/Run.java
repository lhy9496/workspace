package com.kh.Test240213;
import java.util.Scanner;
public class Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 홀수 짝수 출력하기
		/*
		int[] arr = new int[100];
		int i = 0;
		for(i = 0; i < arr.length; i++) {
			arr[i] = i;
			if (arr[i] > 1 && arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		*/
		
		// 랜덤으로 숫자 5개를 입력받아 출력하기
		/*
		int i = 0, sum = 0;
		int[] arr = new int[5];
		
		for(i = 0; i < 5; i++) {
			sum = (int)(Math.random()*10 + 1);
			arr[i] = sum;
			System.out.print(arr[i] + " ");
		}
		*/
		
		// 랜덤으로 숫자 10개를 입력받아 짝수만 출력하기
		/*
		int[] arr = new int[10];
		int i = 0, sum = 0;
		for(i = 0; i < arr.length; i++) {
			sum = (int)(Math.random()*10 + 1);
			arr[i] = sum;
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		*/
		
		// 문자열을 입력받아 문자열을 한글자씩 출력하기
		/*
		int i = 0;
		char c;
		System.out.print("문자열을 입력하세요 : ");
		String word = sc.nextLine();
		
		char[]arr = new char[word.length()];
		for(i = 0; i < word.length(); i++) {
			c = word.charAt(i);
			arr[i] = c;
			System.out.print(arr[i] + " ");
		}
		*/
		
		// 문자열(영단어)을 입력받아 문자열의 첫글자를 대문자로 변경하기
		/*
        System.out.print("영단어를 입력하세요: ");
        String word = sc.nextLine();
        
        // 첫 번째 글자를 대문자로 변경
        String result = word.substring(0, 1).toUpperCase() + word.substring(1);
        
        System.out.println("결과: " + result);
        */
		
		// 오버라이딩, 오버로딩에 대한 문제
		// 상속 관계에 있는 클래스 2개를 제공해주고 오버라이딩된 메소드 출력시 어떤 결과가 출력되냐?

		// 클래스 하나가 주어진 상태에서 해당 클래스를 상속받는 새로운 클래스를 만들고 다음과 같은 결과가 되도록
		// 오버라이딩을 해라
		
		// 똑같은 이름의 메소드를 한 10개 정도 제공해주고 에러가 발생하는 이유를 기술해라
		
		// void sample(int n); -> sample(3); sample(5, 7.0);
		// 해당 코드가 문제가 되지 않도록 코드를 수정해라
		
		// 배열 -> 길이가 정해져있는 것 -> 배열의 범위를 초과하는 코드 조심
		// 배열을 제공하고 모든 객체를 출력해라
		
		// 다형성 -> 다운캐스팅 조심
		
		// Human을 담을 수 있는 ArrayList 1개를 생성하고 임의로 Human객체 5개를 생성해서 담아라
		// 단, 해당 List에는 Human객체만 담을 수 있게 구성해라
		
		// ArrayList<Human> arr = new ArrayList<>();
		// arr.add(new Human("최지원"));
		// arr.add("김수민");
		
		// 파일에 내용 작성하기, 파일로부터 내용 불러오기
		// 파일에 객체정보 저장하기(직렬화), 파일로부터 객체정보 가져오기(역직렬화)
		
		// udp또는 tcp에서 클라이언트, 서버 구성하기
	}
}
