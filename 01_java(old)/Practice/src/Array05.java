import java.util.Scanner;
public class Array05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		 * 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		 * (사용자가 배열의 길이를 직접 입력 / 입력한 값만큼 정수형 배열 선언)
		 * 그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		 * 
		 * 정수를 입력하세요 >>> 5
		 * 배열 0번째 인덱스에 넣을 값 : 4
		 * 배열 1번째 인덱스에 넣을 값 : -4
		 * 배열 2번째 인덱스에 넣을 값 : 3
		 * 배열 3번째 인덱스에 넣을 값 : -4
		 * 배열 4번째 인덱스에 넣을 값 : 2
		 * 4 -4 3 -3 2
		 * 총합 : 2
		 */
		
		// 1. 배열의 길이 입력 받기
		System.out.print("배열의 길이는 입력하세요 >>> ");
		int size = sc.nextInt(); // 임의의 값 3
		sc.nextLine();
		int sum = 0;
		// 2. 배열 생성
		int[] arr = new int[size]; // 크기가 3인 정수형 배열 생성
		// 3. for문을 사용해서 배열의 처음부터 마지막까지 한번씩 반복한다
		for(int i = 0; i < arr.length; i++) { // 0부터 2까지 3번 반복
			System.out.print(i + "번째 인덱스에 넣을 값을 입력하세요 >>> ");
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
			sum += arr[i];
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
}
