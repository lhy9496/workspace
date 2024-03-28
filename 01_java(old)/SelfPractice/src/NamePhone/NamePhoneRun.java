package NamePhone;
import java.util.Scanner;
public class NamePhoneRun {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0, count = 0;
		NamePhone[] arr = new NamePhone[50];
		
		do {
			System.out.println("========== 고객 정보 관리 시스템 ==========");
			System.out.println("1. 고객 정보 등록");
			System.out.println("2. 고객 정보 목록 출력");
			System.out.println("3. 고객 정보 검색");
			System.out.println("4. 시스템 종료");
			System.out.print("사용하실 메뉴의 번호를 입력하세요 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: {
				String name, area, agency, number;
				
				System.out.print("고객님의 이름을 입력하세요 : ");
				name = sc.next();
				System.out.print("고객님의 거주지역을 입력하세요 : ");
				area = sc.next();
				System.out.print("고객님의 통신사를 입력하세요 : ");
				agency = sc.next();
				System.out.print("고객님의 핸드폰 번호를 입력하세요 : ");
				number = sc.next();
				
				arr[count] = new NamePhone(name, area, agency, number);
				System.out.println("고객 정보 등록 완료 : " + arr[count++].toString());
				break;
			}
			case 2: {
				System.out.println("========== 고객 정보 목록 ==========");
				if(arr[0] == null) {
					System.out.println("등록된 정보가 없습니다.");
				}
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] == null) 
						break;
						System.out.println(arr[i].toString());
				}
				break;
			}
			case 3: {
				System.out.println("========== 고객 정보 검색 ==========");
				System.out.print("고객님의 이름을 입력해주세요 : ");
				String name = sc.next();
				NamePhone target = null;
				for(int i = 0; i < arr.length; i++) {
					if(arr[i] == null) {
						break;
					}
					else if(arr[i].getName().equals(name)) {
						target = arr[i];
						break;
					}
				}
				if(target == null) {
					System.out.println(name + "님의 정보가 없습니다.");
				}
				else {
					System.out.println(name + "님의 정보입니다 : " + target.toString());
				}
			}
			case 4:
				System.out.print("시스템을 종료합니다.");
				break;
			}
		} while(menu != 4);
	}
}
