import java.util.Scanner;
public class Array06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/* 
		 * 3이상인 홀수 자연수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		 * 중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		 * 단, 입력한 정수가 홀수가 아니거나 3미만일 경우 "다시 입력하세요"를 출력하고 다시 정수를 입력 받으세요.
		 * 
		 * 3이상의 홀수인 자연수 입력 받기
		 * 해당크기의 배열을 생성
		 * 배열 중간까지는 1부터 1씩 증가하여 값을 대입
		 * 중간이후는 1씩 감소하면서 값을 대입
		 */
		
		/*
		// 1. 3 이상의 홀수 입력 받기
		System.out.print("3 이상의 홀수인 자연수를 입력하세요 >>> ");
		int num = sc.nextInt();
		sc.nextLine();
		// 2. 배열을 생성하고 중간값 변수 만들기
		
		while(num % 2 == 0 || num < 3) {
			System.out.println("다시 입력하세요.");
			System.out.print("3 이상의 홀수인 자연수를 입력하세요 >>> ");
			sc.nextLine();
		}
		
		int[] arr = new int[num];
		int mid = num / 2;
		// 0번째 원소를 1로 지정
		arr[0] = 1;
		// 3. 1 ~ 중간값(mid)까지 1씩 증가
		for(int i = 1; i <= mid; i++) {
			// 반복시 i - 1 자리의 인덱스 (i가 3일때는 1번째 자리 인덱스의 값) + 1을 한다 *인덱스의 자리는 0부터 시작
			arr[i] = arr[i - 1] + 1;
		}
		// 4. 중간(mid)을 지난 후 num까지 1씩 감소
		for(int i = mid + 1; i < arr.length; i++) {
			// 반복시 i - 1 자리의 인덱스의 값에 -1을 한다.
			arr[i] = arr[i - 1] - 1;
		}
		// 5. 결과 값 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
		
		/*
		System.out.print("3 이상의 홀수인 자연수를 입력하세요 >>> ");
		int num = sc.nextInt();
		sc.nextLine();
		int[] arr = new int[num];	
		int mid = num / 2;
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(i <= mid) {
				arr[i] = ++count;
			}
			else {
				arr[i] = --count;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		*/
		
	}
}
