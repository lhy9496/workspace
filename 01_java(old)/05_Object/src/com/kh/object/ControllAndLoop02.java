package com.kh.object;
import java.util.Scanner;
public class ControllAndLoop02 {
	public static void main(String[] args) {
		/*
		 * 사용자의 이름을 입력하고 컴퓨터와 가위바위보를 하세요. 컴퓨터가 가위인지 보인지 주먹인지는
		 * 랜덤한 수를 통해서 결정하도록 하고, 사용자에게는 직접 가위바위보를 받으세요.
		 * 사용자가 "exit"를 입력하기 전까지 가위바위보를 계속 진행하고 "exit"가 들어가면 반복을 멈추고
		 * 몇 번의 승부에서 몇 번 이기고 몇 번 비기고 몇 번 졌는지 출력하세요.
		 */
		
		int win = 0, draw = 0, lose = 0;
		Scanner sc = new Scanner(System.in);
	    String name, userChoice, comChoice;
		String[] arr = {"가위", "바위", "보"};
		
		System.out.print("당신의 이름을 입력하세요 : ");
		name = sc.next();
		
		while(true) {
			System.out.print("가위 바위 보를 입력하세요(exit 종료) : ");
			userChoice = sc.next();
			if(userChoice.equals("exit")) {
				break;
			}
			if(!(userChoice.equals("가위") || userChoice.equals("바위") || userChoice.equals("보"))) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			comChoice = arr[(int)(Math.random() * 3)];
			
			System.out.println("사용자 입력 : " + userChoice);
			System.out.println("컴퓨터 입력 : " + comChoice);
			
			if(userChoice.equals(comChoice)) {
				System.out.println("비겼습니다.");
				draw++;
			}
			else if((userChoice.equals("가위") && comChoice.equals("보")) ||
					(userChoice.equals("바위") && comChoice.equals("가위")) ||
					(userChoice.equals("보") && comChoice.equals("바위"))) {
				System.out.println("이겼습니다.");
				win++;
			}
			else {
				System.out.println("졌습니다.");
				lose++;
			}
			System.out.println();
		}
		System.out.println((win + lose + draw) + "전 " + win + "승 " + draw + "무 " + lose + "패");
	}
}