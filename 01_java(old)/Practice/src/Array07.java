import java.util.Scanner;
public class Array07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 사용자가 입력한 값이 배열에 있는지 검색하여
		 * 있으면 "ㅇㅇㅇ치킨 배달 가능", 없으면 "ㅇㅇㅇ 치킨은 없는 메뉴입니다"를 출력하세요
		 * 단, 치킨 메뉴가 들어가있는 배열은 본인 스스로 정하세요
		 */
		
		/*
		boolean isTrue = false;
		String[] menu = {"양념", "불닭", "후라이드", "훈제", "통닭", "스파이시", "간장"};
		System.out.print("치킨 메뉴를 입력하세요 >>> ");
		String word = sc.next();
		
		for(int i = 0; i < menu.length; i++) {
			if(menu[i].equals(word)) {
				isTrue = true;
				break;
			}
		}
			if(isTrue) {
				System.out.print(word + "치킨 배달 가능");
			}
			else {
				System.out.print(word + "치킨은 없는 메뉴입니다.");
			}
			*/
		
		boolean isTrue = false; // 거짓
		String[] menu = {"믹스", "라떼", "마끼아또", "에스프레소", "밀크", "루왁"}; // 메뉴 배열 생성
		System.out.print("커피 메뉴를 입력하세요 >>> ");
		String word = sc.next(); // 사용자로부터 메뉴를 입력 받음
		
		for(int i = 0; i < menu.length; i++) { // 배열의 크기 만큼 반복
			if(menu[i].equals(word)) { // 사용자가 입력한 값을 메뉴 배열에서 발견
				isTrue = true; // isTrue 변수를 true로 변경
				break;
			}		
		}
		if(isTrue) { // isTrue => true로 변환 사용자가 입력한 값을 메뉴 배열에서 발견 했을 때
			System.out.print(word + "커피 메뉴를 주문 받았습니다.");
		} // 사용자가 입력한 값이 메뉴 배열에 없을때
		else {
			System.out.print(word + "커피는 없는 메뉴입니다.");
		}
	}
}
