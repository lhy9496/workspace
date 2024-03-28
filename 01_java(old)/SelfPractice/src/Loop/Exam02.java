package Loop;
import java.util.Scanner;
public class Exam02 {

	public static void main(String[] args) {
		/*
		while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈을 (눈1, 눈2) 형태로 출력하고,
		눈의 합이 5가 아니면 계속 주사위를 던지고, 눈의 합이 5이면 실행을 멈추는 코드를 작성하시오.
		*/
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		while(true) {
			int num1, num2;
			num1 = (int)(Math.random() * 6) + 1;
			num2 = (int)(Math.random() * 6) + 1;
			sum = num1 + num2;
			System.out.print("주사위를 굴리시겠습니까? (y/n) : ");
			char play = sc.next().toLowerCase().charAt(0);
			if(play == 'y') {			
				if(sum == 5) {
					System.out.println("주사위 합 : " + sum + ", 합이 " + sum + "입니다. 프로그램을 종료합니다.");
					break;
				}
				else {
					System.out.println("주사위 합 : " + sum + ", 합이 " + "5가 아닙니다.");
				}
			}
			else if(play == 'n') {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println("잘못 입력하셨습니다 다시 입력하세요.");
			}
		}
	}

}
