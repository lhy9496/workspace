import java.util.Scanner;
public class Array01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 사용자에게 입력받은 양의 정수만큼 배열의 크기를 할당하고
		// 1부터 입력받은 값까지 배열에 초기화한 후 출력하세요
		
		System.out.print("양의 정수를 입력하세요 >>> ");
		int num = sc.nextInt(); // 배열의 크기를 입력 받을 변수 생성 및 값 대입
		sc.nextLine();
		int[] arr = new int[num]; // 배열 생성
		for(int i = 0; i < arr.length; i++) { // 배열 전체 탐색 (인덱스 = 0 ~ 4)
			arr[i] = i + 1; // 1부터 출력하기 위해서 인덱스의 값에 1을 더해준다 ex)arr[0] = 0 + 1
			System.out.print(arr[i] + " "); // 1부터 num까지의 값을 순서대로 대입한 배열 출력
		}
	}
}
