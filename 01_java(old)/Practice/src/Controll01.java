import java.util.Scanner;
public class Controll01 {
	public static void main(String[] args) {
		/*
		 * 아래 예시와 같이 메뉴를 출력하고 메뉴 번호를 입력하면 "ㅇㅇ메뉴입니다"를
		 * 출력 종료 번호를 누르면 "프로그램이 종료됩니다"를 출력하세요
		 * 
		 * ex) 1.입력 2.수정 3.조회 4.삭제 7.종료
		 * 메뉴번호를 입력하세요 >>> 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 목록 : 1.입력, 2.수정, 3.조회, 4.삭제, 7.종료");
		System.out.print("이용하실 메뉴의 번호를 정수로 입력하세요 >>> ");
		int menu = sc.nextInt();
		sc.nextLine();
		
		/*
		if(menu == 1) {
			System.out.print("입력 메뉴입니다.");
		}
		else if(menu == 2) {
			System.out.print("수정 메뉴입니다.");
		}
		else if(menu == 3) {
			System.out.print("조회 메뉴입니다.");
		}
		else if(menu == 4) {
			System.out.print("삭제 메뉴입니다");
		}
		else if(menu == 7) {
			System.out.print("프로그램을 종료합니다.");
		}
		else {
			System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		*/
//=====================================================================
		// 위 코드를 스위치문으로 작성
		switch(menu) {
			case 1:
				System.out.print("입력 메뉴입니다.");
				break;
			case 2:
				System.out.print("수정 메뉴입니다.");
				break;
			case 3:
				System.out.print("조회 메뉴입니다.");
				break;
			case 4:
				System.out.print("삭제 메뉴입니다.");
				break;
			case 7:
				System.out.print("프로그램을 종료합니다.");
				break;
			default:
				System.out.print("잘못 입력하셨습니다. 프로그램을 종료합니다.");
				return;
		}
		sc.close();
	}
}
