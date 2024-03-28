import java.util.Scanner;
public class Test240119 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1번 문제 => 정수형 변수 age를 입력 받아 7세 이하면 어린이, 19세 이하면 청소면, 20세 이상이면 성인을 출력
		 * 
		 * 2번 문제 => 정수 num1, num2를 입력 받아 두 수 사이에 있는 3의 배수의 모든 합을 구하세요.
		 * 
		 * 3번 문제 => 정수 num1, num2를 입력 받아 두 수 사이에 있는 모든 홀수의 합과 짝수의 합을 각각 구하세요.
		 * 
		 * 4번 문제 => 첫째줄에 데이터의 개수 n개를 입력받고 사용자로부터 n개의 정수를 입력받아
		 *           입력받은 반대로 출력하세요.
		 *           ex) 정수를 입력하세요 >>> 5
		 *               숫자를 입력하세요 >>> 1 7 5 9 4
		 *               반대로 출력 >>> 4 9 5 7 1
		 */
		
		/* 1번 문제
		System.out.print("나이를 입력하세요 >>> ");
		int age = sc.nextInt();
		sc.nextLine();
		
		if(age <= 7) {
			System.out.printf("당신의 나이는 %d세이며 어린이입니다.", age);
		}
		else if(age <= 19) {
			System.out.printf("당신의 나이는 %d세이며 청소년입니다.", age);
		}
		else {
			System.out.printf("당신의 나이는 %d세이며 성인입니다.", age);
		}
		sc.close;
		*/
		
		/* 2번 문제
		int result = 0;
		System.out.print("첫번째 정수를 입력하세요 >>> ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수를 입력하세요 >>> ");
		int num2 = sc.nextInt();
		sc.nextLine();
		if(num1 > num2) {
			for(int i = 0; i <= (num1 - num2); i++) {
				int sum = num2 + i;
				if(sum % 3 == 0) {
					result += sum;
				}
			}
			System.out.print("결과 값 : " + result);
		}
		else if(num2 > num1){
			for(int i = 0; i <= (num2 - num1); i++) {
				int sum = num1 + i;
				if(sum % 3 == 0) {
					result += sum;
				}
			}
			System.out.print("결과 값 : " + result);
		}
		sc.close;
		*/
		/*
		int num1, num2, min, max, sum = 0;
		System.out.println("정수 두개 입력 : ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		min = num1 < num2 ? num1 : num2; // num1이 더 작으면 num1 더 클때는 num2
		max = num1 > num2 ? num1 : num2; // num1이 더 크면 num1 더 작으면 num2
		
		for(int i = min; i <= max; i++) { // i = 작은수; i <= 큰수
			if(i % 3 == 0) {
				sum += i; // 3의 배수 누적
			}
		}
		System.out.printf("%d 와%d사이의 3의 배수의 총 합 : %d", min, max, sum);
		*/
		
		/* 3번 문제
		int result1 = 0;
		int result2 = 0;
		System.out.print("첫번째 정수를 입력하세요 >>> ");
		int num1 = sc.nextInt();
		sc.nextLine();
		System.out.print("두번째 정수를 입력하세요 >>> ");
		int num2 = sc.nextInt();
		sc.nextLine();
		
		if(num1 > num2) {
			for(int i = 0; i <= (num1 - num2); i++) {
				int sum = num2 + i;
				if(sum % 2 == 0) {
					result1 += sum;
				}
				else if(sum % 1 == 0) {
					result2 += sum;
				}
			}
			System.out.print("짝수의 합 : " + result1 + ", 홀수의 합 : " + result2);
		}
		else if(num2 > num1){
			for(int i = 0; i <= (num2 - num1); i++) {
				int sum = num1 + i;
				if(sum % 2 == 0) {
					result1 += sum;
				}
				else if(sum % 1 == 0) {
					result2 += sum;
				}
			}
			System.out.print("짝수의 합 : " + result1 + ", 홀수의 합 : " + result2);
		}
		sc.close;
		*/
		/*
		int num1, num2, sum1 = 0, sum2 = 0;
		System.out.print("정수 두 개 입력 >>> ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		
		for(int i = (num1 < num2 ? num1 : num2); i <= (num1 > num2 ? num1 : num2); i++) {
			if(i % 2 == 1) { // 홀수
				sum1 += i; // 홀수를 누적해서 더함
			}
			else { // 짝수
				sum2 += i; // 짝수를 누적해서 더함
			}
		}
		System.out.print("홀수의 합 : " + sum1);
		System.out.print("짝수의 합 : " + sum2);
		*/
		
		/* 4번 문제
		System.out.print("데이터의 갯수를 입력하세요 >>> ");
		int size = sc.nextInt();
		sc.nextLine();
		int[] arr = new int [size]; // 사이즈에 입력받은 숫자의 크기만큼 배열의 크기를 정한다.
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print((i+1) + "번째 정수 입력 : ");
			arr[i] = sc.nextInt();		
		}
		// 출력 부분 / 배열의 크기 -1 번째 인덱스부터 0번째 인덱스까지의 길이를 반복
		for(int i = (arr.length - 1); i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
		*/
		
		/*
		 * 사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
		 * 문자형 가변 배열을 선언 및 할당하세요.
		 * 그리고 각 인덱스에 'a'부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요
		 */
		
		int hang, yeol;
		System.out.print("행의 크기를 입력하세요 >>> ");
		hang = sc.nextInt();
		sc.nextLine();
		char[][] arr = new char[hang][]; // 문자형 배열 생성, 행값에 입력받은 hang 대입
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i + "행의 열 크기를 입력하세요 >>> ");
			yeol = sc.nextInt();
			arr[i] = new char[yeol];
		}
		char abc = 'a';
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = abc++;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
