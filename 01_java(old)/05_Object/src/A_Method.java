public class A_Method { // 클래스 이름
	public static void main(String[] args) { // 값의 반환이 없는 void형의 main이라는 이름의 함수이며 args라는 String형 매개변수를 가지고있음
		/*
		double myHeight = 175.9;
		hiEveryone(12, 12.5); // 1.hiEveryone 이라는 메소드에 매개변수 2개를 대입하고 호출
		hiEveryone(13, myHeight); // 2.hiEveryone 이라는 메소드에 매개변수 2개를 대입하고 호출
		byEveryone(); // 3.byEveryone 이라는 메소드를 호출 매개변수 대입은 없다
	}
	
public static void hiEveryone(int age, double height) { // 매개변수가 둘인 메소드의 정의
	System.out.println("제 나이는 " + age + "세 입니다."); // 1, 2번 코드의 첫번째 매개변수를 현재 메소드의 int age에 대입, 출력문이 ⑴코드로 호출
	System.out.println("저의 키는 " + height + "cm입니다."); // 1, 2번 코드의 두번째 매개변수를 현재 메소드의 double height에 대입, 출력문이 ⑵코드로 호출
	}
public static void byEveryone() { // 매개변수가 없는 메소드의 정의
	System.out.println("다음에 뵙겠습니다."); // 매개변수가 필요없는 메소드이기에 3번 코드에 출력 부분만 호출당한다.
	}
}
	*/
		
		int result;
		result = adder(4, 5); // 1.adder메소드에 매개변수 4, 5를 대입하고 adder의 결과값을 result에 반환받음
		System.out.println("4 + 5 = " + result); // 2.adder의 결과값을 반환받은 result를 출력
		System.out.println("3.5 * 3.5 = " + square(3.5)); // 3.square에 매개변수 3.5를 대입하고 square메소드에서 반환받은 결과값을 출력
	}
	public static int adder(int num1, int num2) {
	int addResult = num1 + num2; // 1번 코드의 두 매개변수 4, 5를 num1 = 4, num2 = 5로 대입하고 연산
	return addResult; // 연산된 결과 값을 addResult 변수에 저장하고 adder 메소드에 반환한다.
	} // return OOOO 값의 반환을 명령, 메소드의 종료를 의미
	public static double square(double num) {
		return num * num; // 3번 코드에서 받은 매개변수 3.5를 num에 대입하고 연산, 결과값을 square 메소드에 저장후 반환
	}
}
