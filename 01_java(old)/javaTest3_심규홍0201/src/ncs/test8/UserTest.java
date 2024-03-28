package ncs.test8;

import java.util.Arrays;

public class UserTest {

	public static void main(String[] args) {
		
		// User 클래스를 호출해 us라는 참조변수 생성
		User us = new User();
		// User 클래스를 참조하는 크기가 3인 객체배열 users를 생성
		User[] users = new User[3];
		
		// 객체배열의 각 인덱스마다 값(정보)을 입력
		users[0] = new User("user01", "pass01", "김철수", 32, 'M', "010-1234-5678");
		users[1] = new User("user02", "pass02", "이영희", 25, 'F', "010-5555-7777");
		users[2] = new User("user03", "pass03", "황진이", 20, 'F', "010-9876-5632");
		
		int i = 0, j = 0;
		
		System.out.println("users list ------------------------------------------");
		// users 배열의 크기만큼 반복하여 users배열의 i인덱스 값을 출력.
		for(i = 0; i < users.length; i++) {
			System.out.println(users[i].toString());
		}
		
		// User 클래스를 참조하는 copyUsers 배열을 생성하고 크기는 users 배열의 크기와 같게 한다.
		User[] copyUsers = new User[users.length];
		
		System.out.println("copyUsers ------------------------------------------");
		// 카피배열을 원본배열의 크기만큼 반복해서 복사한다.
		for(i = 0; i < users.length; i++) {
			// 만약 원본배열의 i번째 인덱스가 null이 아니고 값이 있을시
			if(users[i] != null) {
			// 카피배열 i번째 인덱스에 User형의 users배열의 i번째 인덱스를 복사한다. (자료형) 배열명[인덱스].clone(); 메소드 이용
			copyUsers[i] = (User) users[i].clone();
			}
		}
		// 카피배열을 User의 참조변수 user에 대입하고 크기만큼 반복
		for(User user : copyUsers) {
			// 만약 user의 값이 null이 아닐시
			if(user != null) {
				// user의 값을 toString(); 메소드를 사용해 출력한다. 이때 출력되는 부분은(User의 toString 부분이다)
				System.out.println(user.toString());
			}
		}
		
		// User 클래스에서 생성한 비교 메소드인 equals 메소드를 사용하여 배열 내의 값들을 비교하고 결과값을
		// boolean형으로 출력해주고 users배열의 크기만큼 반복한다.
		for(i = 0; i < users.length; i++) {
			// 배열을 비교하기 때문에 Arrays.비교메소드명(배열1, 배열2); 코드를 사용
			// import java.util.Arrays; 코드로 Arrays 클래스를 불러와야 Arrays. 메소드를 사용 가능하다.
			System.out.println(Arrays.equals(users, copyUsers));
		}
	}
}
