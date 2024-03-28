import java.util.Scanner;
public class LoopTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.println("반복(for)문 시작");
		
		//for(초기식; 조건식; 증감식) {
		for(int i = 0; i < 5; i++) {
			System.out.println("반복문 실행 : " + i);
		}
		System.out.println("반복문 종료");
		*/
//=======================================================
		/*
		System.out.println("반복(while)문 시작");
		
		int i = 0;
		while(i < 20) {
			System.out.println("반복문 실행 : " + i);
			i++;
		}
		*/
//=========================================================
		/*
		int num = 0;
		
		while(num != 7) {
		System.out.println("메뉴 목록 : 1.입력, 2.수정, 3.조회, 4.삭제, 7.종료");
		System.out.print("이용하실 메뉴의 번호를 정수로 입력하세요 >>> ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		
		if(menu == 1) {
			System.out.println("입력 메뉴입니다.");
		}
		else if(menu == 2) {
			System.out.println("수정 메뉴입니다.");
		}
		else if(menu == 3) {
			System.out.println("조회 메뉴입니다.");
		}
		else if(menu == 4) {
			System.out.println("삭제 메뉴입니다");
		}
		else if(menu == 7) {
			System.out.println("프로그램을 종료합니다.");
			break;
			}
		else {
			System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			break;
			}
			*/
//==========================================================
		// while문을 do while문으로 작성
		int num = 0;
		
		do {
		System.out.println("메뉴 목록 : 1.입력, 2.수정, 3.조회, 4.삭제, 7.종료");
		System.out.print("이용하실 메뉴의 번호를 정수로 입력하세요 >>> ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		
		if(menu == 1) {
			System.out.println("입력 메뉴입니다.");
		}
		else if(menu == 2) {
			System.out.println("수정 메뉴입니다.");
		}
		else if(menu == 3) {
			System.out.println("조회 메뉴입니다.");
		}
		else if(menu == 4) {
			System.out.println("삭제 메뉴입니다");
		}
		else if(menu == 7) {
			System.out.println("프로그램을 종료합니다.");
			break;
			}
		else {
			System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			break;
			}
		}	while(num != 7);	
	}
}
