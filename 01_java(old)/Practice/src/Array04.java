import java.util.Scanner;
public class Array04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * "월"요일부터 "일"요일까지 요일에 대한 정보를 가지고 있는 배열을 하나 생성
		 * 0~6까지의 숫자를 입력 받아 해당 인덱스의 요일을 출력하고 범위에 없는 숫자를
		 * 입력시 0~6사이의 숫자를 입력하세요를 출력하고 다시 입력을 받습니다
		 */
		
		// 1. 배열 생성
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		int num;
		// 잘못된 숫자 입력시 다시 입력 받게 반복
		do {
			// 2. 0~6까지의 숫자중 하나 입력 받기
			System.out.print("0 ~ 6 사이의 정수를 하나 입력하세요 >>> ");
			num = sc.nextInt();
			sc.nextLine();
		} while(num < 0 || num > 6);
		// 3. 입력 받은 숫자에 해당하는 인덱스의 요일을 출력
		System.out.print(day[num] + "요일");
	}
}