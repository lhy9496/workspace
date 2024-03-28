import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class B_switch01 {
	public static void main(String[] args) {
		/*
		 * switch문도 if문과 동일하게 조건문이다.
		 * 다만, if문과의 "차이점"이라면 if문은 조건식을 자유롭게 기술할 수 있지만
		 * switch문은 동등비교로만 수행이 가능하다.
		 * > 실행할 구문만 실행하고 자동으로 빠져나오지 못한다.(직접 break; 문을 작성해서 빠져나와야 한다.)
		 * 
		 * [표현법]
		 * switch(비교대상(정수, 문자, 문자열)) {
		 * case 값1:
		 * 실행코드1;
		 * break;
		 * case 값2:
		 * 실행코드2;
		 * break;
		 * ...
		 * default:    <= 디폴트는 굳이 쓰지 않아도 괜찮다. (위의 값들이 모두 일치하지 않았을때만 사용)
		 */
		Scanner sc = new Scanner(System.in);
		/*
		 * 정수를 입력받아 1일경우 "빨간색입니다." 2일경우 "파란색입니다." 3일경우 "초록색입니다."
		 * 나머지의 경우에서는 잘못 입력했습니다. 출력
		 */
		
		/*
		System.out.print("정수를 입력하세요 >>> ");
		int num = sc.nextInt();
		sc.nextLine();
		
		switch (num) {
		case 1:
			System.out.print("빨간색입니다.");
			break;
		case 2:
			System.out.print("파란색입니다.");
			break;
		case 3:
			System.out.print("초록색입니다.");
			break;
		default:
			System.out.print("잘못 입력했습니다.");
			break;
		}
		*/
//==============================================================================
		// 위의 코드를 if문으로 만들면
		
		/*
		System.out.print("정수를 입력하세요 >>> ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num == 1) {
			System.out.println("빨간색입니다.");
		}
		else if(num == 2) {
			System.out.println("파란색입니다.");
		}
		else if(num == 3) {
			System.out.println("초록색입니다.");
		}
		else {
			System.out.print("잘못 입력했습니다.");
		}
		*/
//===============================================================================
		// 과일을 구매하는 프로그램 작성
		// 과일을 입력하면 그에 맞는 가격이 출력되는 프로그램
		// 과일을 입력하세요 (사과, 바나나, 딸기) >>> 
		// 00의 가격은 000원 입니다. 또는 잘못 입력했습니다. 출력
		// 사과 1000 바나나 2000 딸기 3000
		/*
		System.out.print("과일을 입력하세요 (사과, 바나나, 딸기) >>> ");
		String name = sc.nextLine();
		
		
		switch(name) {
			case "사과":
				System.out.print("입력한 과일의 이름은 사과, 가격은 1000원 입니다.");
				break;
			case "바나나":
				System.out.print("입력한 과일의 이름은 바나나, 가격은 2000원 입니다.");
				break;
			case "딸기":
				System.out.print("입력한 과일의 이름은 딸기, 가격은 3000원 입니다.");
				break;
			default:
				System.out.print("잘못 입력했습니다.");
				break;
		}
		*/
		// 위 코드를 if문으로 작성
		/*
		if(name.equals("사과")) {
			System.out.printf("%s의 가격은 1000원 입니다.", name);
		}
		else if(name.equals("바나나")) {
			System.out.printf("%s의 가격은 2000원 입니다.", name);
		}
		else if(name.equals("딸기")) {
			System.out.printf("%s의 가격은 3000원 입니다.", name);
		}
		else {
			System.out.print("잘못 입력했습니다.");
		}
		*/
//====================================================================
		// 월을 입력하면 해당 월이 몇일까지 있는지를 출력
		int mon, day;
		System.out.print("월(month)을 입력하세요 >>> ");
		mon = sc.nextInt();
		sc.nextLine();
		
		/*
		switch(mon) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
				break;
			case 2:
				day = 28;
				break;
			default:
				day = 0;
				System.out.print("1~12월까지만 입력이 가능합니다.");
				return;
		}
		System.out.printf("%d월은 %d일까지 있습니다.", mon, day);
		*/
		
		//위 소스를 if문으로 변환
		if(mon==1||mon==3||mon==5||mon==7||mon==8||mon==10||mon==12) {
			day = 31;
		}
		else if(mon==4||mon==6||mon==9||mon==11) {
			day = 30;
		}
		else if(mon==2) {
			day = 28;
		}
		else {
			day = 0;
			System.out.print("1~12월까지만 입력이 가능합니다.");
			return;
		}
		System.out.printf("%d월은 %d일까지 있습니다.", mon, day);
		sc.close();
	}
}
