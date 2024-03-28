package com.kh.Test240122;
import java.util.Scanner;
public class Run {
	public static void main(String[] args) {
		/*
		 * 1번 문제. 정수 n(2~9)을 입력 받아 2부터 n까지 중 짝수의 구구단을 출력하는 함수를 작성하세요
		 *         만약 2~9사이의 값을 입력하지 않았다면 다시입력하세요를 반복합니다.
		 * 
		 * 2번 문제. 정수 num을 입력 받아 크기가 num인 정수형 배열을 만들고 1~100사이의 랜덤 값으로 모든 배열의 값을 대입합니다.
		 *         이후 모든 배열의 홀수인덱스의 값을 더한 값을 구하세요.
		 * 
		 * 3번문제. 다음과 같은 코드를 실행했을 때 예시와 같은 결과가 출력되도록 TV클래스를 작성하세요
		 * 		  TV myTV = new TV("삼성", 2020, 65);\
		 * 		  myTV.show();
		 * 		  => 삼성에서 만든 2020년형 65인치 TV입니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		/* 1번 문제
		int n, sum;
		
		do {
		System.out.print("2~9 사이의 정수를 입력하세요 : ");
		n = sc.nextInt();
		sc.nextLine();
		
		if(n > 9 || n < 2) {
			System.out.println("다시입력하세요!!");
		}
		for(int i = 2; i <= n; i++) {
			for(int j = 0; j < 9; j++) {
				if(i % 2 == 0 && i <= n && i >= 2 && n <= 9) {
				sum = i * (j + 1);
				System.out.println(i + " * " + (j + 1) + " = " + sum);
				}
			}
			System.out.println();
		}
		} while(n < 2 || n > 9);
		*/
		/* 1번 강사님 풀이
		do { System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		if(n < 2 || n > 9) {
			continue;
		}
		for(int i = 2; i <= n; i++) {
			if(i % 2 != 0) {
				continue;
			}
			for(int j = 1; j <= 9; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i * j);
			}
			System.out.println();
		}
		break;
		} while(true);
		*/
		
		/* 2번 문제
		int sum = 0;
		int i = 0;
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		sc.nextLine();
		
		int[] arr = new int[num];
		for(i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 100 + 1);
			System.out.print(arr[i] + " ");
			if(arr[i] % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.print("\n배열 내 홀수의 총합 : " + sum);
		*/
		
		/* 3번 문제
		TV myTV = new TV("삼성", 2020, 65, 100000);
		myTV.show();
		TV myTV2 = new TV("LG", 2024, 85, 200000);
		myTV2.show();
		Human one = new Human("홍길동", 150000);
		one.buy(myTV);
		one.buy(myTV2);
		*/
		
		/*
		System.out.println(Human.count);
		Human choi = new Human("최지만", 15000);
		System.out.println(Human.count);
		Human kim = new Human("김민재", 15000);
		System.out.println(Human.count);
		*/
		
//============================================================
		/*
		 * 우리는 도서관에서 책을 관리하는 프로그램을 만든다고 가정한다.
		 * 해당 클래스는 도서관에 책을 등록할 때 사용하는 book 객체를 생성할 Book 클래스이다.
		 * 필요하다고 생각하는 데이터와 기능을 구현해보자.
		 * Book book1 = new Book(초기화변수);
		 * 
		 * 사용자로부터 제목, 장르, 저자, 책번호를 입력받아
		 * book객체를 생성하고 생성된 객체의 toString메소드를 호출하여 정보를 확인해주세요.
		 */
		Book[] bookArr = new Book[100];
		int count = 0;
		int menu = 0;
		
		do {
		System.out.println("========== 도서 관리 프로그램 ===========");
		System.out.println("1. 도서 등록");
		System.out.println("2. 도서 목록 출력");
		System.out.println("3. 도서 검색");
		System.out.println("9. 종료");
		System.out.print("메뉴 선택 : ");
		menu = sc.nextInt();
		sc.nextLine();
		
		switch(menu) {
		case 1: {
			String genre, title, writer;
			int number;
			System.out.print("책의 장르를 입력하세요 : ");
			genre = sc.nextLine();
			System.out.print("책의 제목을 입력하세요 : ");
			title = sc.nextLine();
			System.out.print("책의 저자를 입력하세요 : ");
			writer = sc.nextLine();
			System.out.print("책 번호를 입력하세요 : ");
			number = sc.nextInt();
			sc.nextLine();
			
			Book book1 = new Book(genre, title, writer, number);
			System.out.println(book1.toString());
			
			System.out.println("도서등록 완료 : " + bookArr[count++].toString());
			break;
		}
		case 2: {
			/*
			 * 배열 bookArr에 등록된 모든 도서정보 출력
			 * ============ 등록된 도서정보 ============
			 * Book [장르 = 판타지, 제목 = 해리포터, 글쓴이 = 롤링, 책 번호 = 1]
			 */
			System.out.println("=============== 등록된 도서 정보 ===============");
			if (bookArr[0] == null) {
				System.out.println("등록된 도서가 없습니다.");
			}
			for(int i = 0; i < bookArr.length && bookArr[i] != null; i++) {
				if(bookArr[i] == null)
					break;
					System.out.println(bookArr[i].toString());
			}
			break;
		}
		case 3: {
			System.out.println("========== 도서 검색 ==========");
			System.out.println("검색할 도서 제목 : ");
			String title = sc.next();
			Book target = null;
			for(int i = 0; i < bookArr.length && bookArr[i] != null; i++) {
				if(bookArr[i] == null) {
					break;
			}
			else if(bookArr[i].getTitle().equals(title)) {	
				target = bookArr[i];
				break;
				}
			}
			if(target == null) {
				System.out.println("동일한 제목의 도서가 없습니다.");
			}
			else {
				System.out.println("검색 도서 정보 : " + target.toString());
			}
		}
		case 9:
			System.out.println("프로그램을 종료합니다.");
			break;
		}
		/*
		System.out.print("책의 장르를 입력하세요 : ");
		String genre = sc.nextLine();
		System.out.print("책의 제목을 입력하세요 : ");
		String title = sc.nextLine();
		System.out.print("책의 저자를 입력하세요 : ");
		String writer = sc.nextLine();
		System.out.print("책 번호를 입력하세요 : ");
		int number = sc.nextInt();
		sc.nextLine();
		
		Book book1 = new Book(genre, title, writer, number);
		System.out.println(book1.toString());
		
		bookArr[count] = new Book(genre, title, writer, number);
		System.out.println("도서등록 완료 : " + bookArr[count++].toString());
		*/
		
		/*
		System.out.println("계속 등록하시겠습니까?(y/n) : ");
		// 문자열.toLowerCase() => 모든 문자를 소문자로 변경
		// 문자열.toUpperCase() => 모든 문자를 대문자로 변경
		again = sc.next().toLowerCase().charAt(0) == 'y' ? true : false;
		}
		*/
		} while(menu != 9);
	}
}
		
