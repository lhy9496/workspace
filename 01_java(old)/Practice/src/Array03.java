import java.util.Scanner;
public class Array03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇개 들어가 있는지
		 * 개수와 몇번째 인덱스에 위치하는지 인덱스를 출력하세요
		 */
		
		int count = 0;
		// 1. 문자열 입력 받기
		System.out.print("문자열을 입력하세요 >>> ");
		String word = sc.nextLine();
		// 2. 배열을 만들어서 문자열 => 문자로 형 변환 후 배열에 넣는다
		char[] arr = new char[word.length()]; // 입력 받은 문자와 같은 길이의 배열 생성
		// 3. 문자열 => 문자로 바꿔서 배열에 넣는다
		for(int i = 0; i < arr.length; i++) {
			arr[i] = word.charAt(i); // 0부터 시작하는 인덱스에 입력한 문자열의 첫 문자부터 순서대로 대입 
		}
		// 4. 검색할 문자 입력 받기
		System.out.print("검색할 문자를 입력하세요 >>> ");
		char letter = sc.next().charAt(0);
		// 5. 검색할 문자가 문자열에 몇개 들어가 있는지와 몇번째 인덱스에 위치하는지를 검색
		for(int i = 0; i < arr.length; i++) { // 배열 내의 인덱스에 입력 받은 문자와 같은 문자가 있는지 검사
			if(letter == arr[i]) {
				count++; // 동일한 문자 발견시 횟수 기록하기
				System.out.print(i + "번째 "); // 인덱스 출력
			}
		}
		System.out.println("\n" + letter + "개수 : " + count + "개");
	}
}
