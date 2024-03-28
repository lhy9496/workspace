import java.util.Scanner;
public class Days {
	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in); //스캐너 클래스 추가
		
		while(true) {
		
		System.out.println("=================================================");
		System.out.print("요일을 입력하세요 (월~일, 종료/exit 입력시 종료) >>> ");
		String day = sc.nextLine(); // 문자열 변수 day에 입력 받은 문자열 값 대입
		
		if(day.equals("종료") || day.equals("exit")) {
			System.out.printf("%s를 입력하여 프로그램을 종료합니다.", day);
			System.out.println("=================================================");
			break; // 입력 받은 문자열이 종료, exit 일때 프로그램을 종료하는 코드 (while문 종료)
		}
		
		if(day.equals("일요일") || day.equals("토요일") || day.equals("일") || day.equals("토")) {
			System.out.printf("입력하신 요일은 %s요일이며, 주말 입니다.\n", day);
		}
		else if(day.equals("월요일") || day.equals("화요일") || day.equals("수요일") || day.equals("목요일") || day.equals("금요일")) {
			System.out.printf("입력하신 요일은 %s요일이며, 평일 입니다.\n", day);
		}
		else if(day.equals("월") || day.equals("화") || day.equals("수") || day.equals("목") || day.equals("금")) {
			System.out.printf("입력하신 요일은 %s요일이며, 평일 입니다.\n", day);
		}
		else {
			System.out.printf("요일이 아닌 다른 단어 %s를 입력하셨습니다. 다시 입력해 주세요!\n", day);
			}
		}
		sc.close();
	}
}
