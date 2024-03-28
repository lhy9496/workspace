import java.util.Scanner;
import java.lang.Math;
public class Test240117 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 1번
		 * 사용자로부터 정수형 변수 num1과 num2를 입력받아 큰 값에서 작은 값을 뺀
		 * 결과를 출력하시오.
		 * 
		 * 2번
		 * 85에서 10까지 수를 1씩 줄여가며 모든 사이에 숫자를 출력하세요
		 * 
		 * 3번
		 * 임의의 숫자 하나(1~5)를 생성하고 이를 맞추는 프로그램 작성
		 * 몇번만에 맞췄는지를 출력하세요.
		 * 
		 * 4번
		 * 길이가 10인 배열을 생성하고 반복문을 이용하여 1~10까지 순서대로 값을 대입하고 출력하세요
		 * 
		 * 5번
		 * 로또 추첨 번호를 예상하는 프로그램 작성
		 * 임의의 숫자를 1~45까지 총 6개 추첨하여 당첨번호를 구합니다.
		 * 중복된 숫자는 있으면 안된다.
		 */
		
		/* 1번 문제
		int sum = 0;
		System.out.print("첫번째 정수를 입력하세요 >>> ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수를 입력하세요 >>> ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(num1 >= num2) {
			sum = num1 - num2;
		}
		else {
			sum = num2 - num1;
		}
		System.out.printf("입력한 수(%d, %d) 큰수 - 작은수 = %d", num1, num2, sum);
		sc.close();
		*/
		
		/* 2번 문제
		System.out.println("2번 문제 85부터 10까지 숫자를 하나씩 줄여가며 출력하기.");
		for(int i = 85; i >= 10; i--) {
			System.out.print(i + " ");
		}
		*/
		
		/* 3번 문제
		int count = 0;
		int num1 = (int)(Math.random() * 5 + 1);
		int num2;
		
		do {
		System.out.print("컴퓨터가 생성한 랜덤수를 맞춰보시오(1~5사이의 정수) >>> ");
		num2 = sc.nextInt();
		sc.nextLine();
		
			count++;
			if(num1 == num2) {
				System.out.printf("생성된 랜덤숫자 %d, 입력한 숫자 %d => 정답입니다.(시도 횟수 : %d).", num1, num2, count);
			}
			else {
				System.out.printf("입력한 숫자 %d => 틀렸습니다.(시도 횟수 : %d)\n", num1, num2, count);
			}
		} while(num1 != num2);
		sc.close();
		*/
		
		/* 4번 문제
		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		*/
		
		/* 5번 문제
		int[] arr = new int[6]; // 6개의 값을 저장하기 위한 배열 생성
		
		for(int i = 0; i < arr.length; i++) { // 0 ~ 5까지 반복하며 1씩 증가
			arr[i] = (int)(Math.random() * 45 + 1); // 1 ~ 45까지의 랜덤값을 배열에 저장
			// 중복 검사
			if(i > 0) {
			for(int j = 0; j < i; j++) { // 배열을 전부 확인
				if(arr[i] == arr[j]) { // 중복이 존재할때
					i--; // 배열 원소 대입 값인 i의 값을 1 줄여서 다시 값을 받고 중복값 위에 덮어쓴다.
					break;
					}
				}
			}
		}
			System.out.printf("로또 번호를 추첨합니다!! \n이번주 로또 번호 = > %d %d %d %d %d %d", arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
			*/
	}
}
