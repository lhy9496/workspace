import java.util.Scanner;
public class Test240118 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 1번 문제 : 실수 num1과 num2를 사용자로부터 입력받아 + % / 3가지의 연산 결과를 출력해라
		 * 
		 * 2번 문제 : 정수형 변수 num3을 입력 받아 100보다 작으면 100이하
		 *          100보다 크고 200보다 작으면 200이하
		 *          200보다 크고 300보다 작으면 300이하를 출력하고
		 *          그것도 아니면 300초과를 출력해라
		 *          
		 * 3번 문제 : 수학, 영어, 국어 성적을 입력받아 평균이 60이상이면 합격입니다.
		 *          60 미만이면 불합격입니다. 출력
		 *          
		 * 4번 문제 : 국어성적을 입력받아 50점이하는 f학점 50점 초과 60점 이하는 d학점
		 *          60점 초과 70점 이하는 c학점 70점 초과 80점 이하는 b학점
		 *          80점 초과는 a학점을 출력하는 프로그램 작성
		 *          
		 * 5번 문제 : 크기가 9인 1차원 배열 arr1을 작성하고 구구단 2단을 인덱스에 대입하고 출력해라
		 * ex) arr1[0] = "2 * 1 = 2";
		 * 
		 * 6번 문제 : 크기가 9인 1차원 배열 arr2을 작성하고 구구단 3단을 인덱스에 대입하고 출력해라
		 * ex) arr2[0] = "3 * 1 = 3";
		 * 
		 * 7번 문제 : 크기가 [8][9]인 2차원 배열 arr3을 작성하고 구구닥 2~9단을 각 인덱스에 대입하고 출력해라
		 * ex) arr2[0][0] = "2 * 1 = 2";
		 */
		
		/* 1번 문제
		System.out.print("실수를 입력하세요 >>> ");
		float num1 = sc.nextFloat();
		sc.nextLine();
		System.out.print("실수를 입력하세요 >>> ");
		float num2 = sc.nextFloat();
		sc.nextLine();
		System.out.println(num1 + num2);
		System.out.println(num1 % num2);
		System.out.print(num1 / num2);
		sc.close();
		*/
		
		/* 2번 문제
		System.out.print("정수를 입력하세요 >>> ");
		int num3 = sc.nextInt();
		sc.nextLine();
		if(num3 <= 100) {
			System.out.printf("입력한 정수는 %d이고, 100 이하입니다.", num3);
		}
		else if(num3 > 100 && num3 <= 200) {
			System.out.printf("입력한 정수는 %d이고, 200 이하입니다.", num3);
		}
		else if(num3 > 200 && num3 <= 300) {
			System.out.printf("입력한 정수는 %d이고, 300 이하입니다.", num3);
		}
		else {
			System.out.printf("입력한 정수는 %d이고, 300 초과입니다.", num3);
		}
		sc.close();
		*/
		
		/* 3번 문제
		System.out.print("수학 성적을 입력하세요 >>> ");
		int mg = sc.nextInt();
		sc.nextLine();
		System.out.print("영어 성적을 입력하세요 >>> ");
		int eg = sc.nextInt();
		sc.nextLine();
		System.out.print("국어 성적을 입력하세요 >>> ");
		int lg = sc.nextInt();
		sc.nextLine();
		
		int average = (mg + eg + lg) / 3;
		if(average >= 60) {
			System.out.printf("수학 : %d, 영어 : %d, 국어 : %d / 평균 : %d 합격입니다.", mg, eg, lg, average);
		}
		else {
			System.out.printf("수학 : %d, 영어 : %d, 국어 : %d / 평균 : %d 불합격입니다.", mg, eg, lg, average);
		}
		sc.close;
		*/
		
		/* 4번 문제
		System.out.print("국어 성적을 입력하세요 >>> ");
		int lg = sc.nextInt();
		sc.nextLine();
		
		if(lg <= 50) {
			System.out.printf("국어 성적 : %d, F학점 입니다.", lg);
		}
		else if(lg > 50 && lg <= 60) {
			System.out.printf("국어 성적 : %d, D학점 입니다.", lg);
		}
		else if(lg > 60 && lg <= 70) {
			System.out.printf("국어 성적 : %d, C학점 입니다.", lg);
		}
		else if(lg > 70 && lg <= 80) {
			System.out.printf("국어 성적 : %d, B학점 입니다.", lg);
		}
		else {
			System.out.printf("국어 성적 : %d, A학점 입니다.", lg);
		}
		sc.close();
		*/
		
		/* 5번 문제
		int[] arr1 = new int[9];
        for (int i = 1; i <= arr1.length; i++) {
            arr1[i-1] = 2 * i; // 배열의 인덱스는 0부터 시작하므로 i-1을 사용
            System.out.print(arr1[i-1] + " ");
		}
		*/
		/*
		String[] arr1 = new String[9]; // 문자열 배열 생성
		for(int i = 0; i < arr1.length; i++) {
			int su = i + 1; // 곱의 수를 i = 0이기에 +1로 1 ~ 9까지로 변경
			arr1[i] = "2 * " + su + " = " + (2 * su); // 인덱스마다 단(i) * 수(su) = 결과 라는 문자열을 대입
		}
		for(int i = 0; i < arr1.length; i++) { // 0부터 1씩 증가하며 8까지 9번 반복하며 결과값 출력
			System.out.println(arr1[i]);
		}
		*/
		
		/* 6번 문제
		int[] arr2 = new int[9];
        for (int i = 1; i <= arr2.length; i++) { // 1 ~ 8 까지 자리의 인덱스를 반복
            arr2[i-1] = 3 * i; // 인덱스는 0부터 시작하므로 i - 1을 사용해 arr2[0] = 3 * 1을 대입 ... arr[8] = 3 * 9
            System.out.print(arr2[i-1] + " ");
		}
		*/
		/*
		String[] arr2 = new String[9]; // 문자열 배열 생성
		for(int i = 0; i < arr2.length; i++) {
			int su = i + 1; // 곱의 수를 i = 0이기에 +1로 1 ~ 9까지로 변경
			arr2[i] = "3 * " + su + " = " + (3 * su); // 인덱스마다 단(i) * 수(su) = 결과 라는 문자열을 대입
		}
		for(int i = 0; i < arr2.length; i++) { // 0부터 1씩 증가하며 8까지 9번 반복하며 결과값 출력
			System.out.println(arr2[i]);
		}
		*/
		
		/* 7번 문제
		int[][] arr3 = new int[8][9]; // 크기가[8][9]인 2차원 배열 생성
		for(int i = 2; i <= 9; i++) { // 단을 반복시킬 반복문 생성
			for(int j = 1; j <= 9; j++) { // 곱을 실행할 1 ~ 9까지의 수를 반복시킬 반복문 생성
				arr3[i-2][j-1] = i * j; // 배열 인덱스는 0부터 시작하므로 i-2, j-1 사용, i = 단, j = 1 ~ 9
			}
		}
		// 출력 부분
		for(int i = 0; i < 8; i++) { // 0 ~ 7까지 자리의 인덱스 8개를 반복(행)
			for(int j = 0; j < 9; j++) { 0 ~ 8까지 자리의 인덱스 9개를 반복(열)
				System.out.print(arr3[i][j] + " "); // 결과 출력
			}
			System.out.println(); // 개행문
		}
		*/
		// dan = 2~9의 단, su = 1~9의 곱수
		String[][] arr3 = new String[8][9];
		for(int d = 0; d < arr3.length; d++) { // 0 1 2 3 4 5 6 7
			for(int s = 0; s < arr3[d].length; s++) { // 0 1 2 3 4 5 6 7 8
				int dan1 = d + 2; // 단의 임시변수 d가 0부터 시작하기에 2를 더해서 2~9로 변경
				int su1 = s + 1; // 곱수의 임시변수 s가 0부터 시작하기에 1을 더해서 1~9로 변경
				arr3[d][s] = dan1 + " * " + su1 + " = " + (d * s);
			}
		}
		// 출력부분 / 구구단의 한 단을 배열에 저장하는 반복문
		for(int s = 0; s < arr3.length; s++) { // 곱수의 임시변수 s를 단 출력 부분에서 단의 변수로 변경
			System.out.println("===" + (s + 2) + "단===");
			for(int d = 0; d < arr3[s].length; d++) { // 단의 임시변수 d를 출력 부분에서 곱수의 변수로 변경
				System.out.println(arr3[s][d]);
			}
		}
	}
}
