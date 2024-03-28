import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;
public class A_if02 { // A_if02라는 이름 가진 클래스
	public static void main(String[] args) { // main이라는 이름을 가진 메서드
		Scanner sc = new Scanner(System.in);
		// 나이를 입력하세요 >>>
		// 13세 이하 = 어린이
		// 14세 이상 19세 이하 = 청소년
		// 20세 이상 = 성인
		// 00세는 000에 속합니다.
		
		/*
		int age;
		String type;
		
		System.out.print("나이를 입력하세요 (정수만) >>> ");
		age = sc.nextInt();
		sc.nextLine();
		*/
		
		/*
		if(age <= 13) {
			type = "어린이";
		}
		else if(age >= 14 && age <= 19) {
			type = "청소년";
		}
		else {
			type = "성인";
		}
		System.out.printf("%d세는 %s 입니다.", age, type);
		*/
//=============================================================
		/*
		if(age <= 13) {
			type = "어린이";
			System.out.printf("%d세는 %s 입니다.", age, type);
		}
		if(age >= 14 && age <= 19) {
			type = "청소년";
			System.out.printf("%d세는 %s 입니다.", age, type);
		}
		if(age >= 20) {
			type = "성인";
			System.out.printf("%d세는 %s 입니다.", age, type);
		}
		*/
//============================================================
		/*
		type = ""; // 문자열인 type 변수를 초기화 하지 않으면 출력 부분에서 if문을 이탈했을때
		// 공백이 출력되기 때문에 type = ""; 코드를 추가해 초기화(값을 넣어주고) 해주고 if문의 결과값을 대입(덧씌우기)한다.
		if(age <= 13) {
			type = "어린이";
		}
		if(age >= 14 && age <= 19) {
			type = "청소년";
		}
		if(age >= 20) {
			type = "성인";
		}
		System.out.printf("%d세는 %s 입니다.", age, type);
		*/
//===========================================================
		// 성별을 (M / F) 입력받아 남학생인지 여학생인지 출력하는 프로그램 작성
		// 성별을 입력하세요 (M / F 대소문자 구분X) >>>
		// 여학생 입니다. / 남학생 입니다. / 잘못 입력했습니다. 출력
		/*
		String result = "";
		
		System.out.print("성별을 입력하세요 (M/F 대소문자 구분X, 남/여) >>> ");
		char gender = sc.next().charAt(0);
		
		if(gender == 'M' || gender == 'm') {			
			result = "남학생";
		}
		else if(gender == 'F' || gender == 'f') {
			result = "여학생";
		}
		else {
			System.out.print("잘못 입력했습니다.");
			return; // 해당 메소드 자체를 빠져 나가는 구문 (해당 코드를 빠져 나간다) [종료]
		}
		System.out.printf("입력한 성별은 %c이고, %s 입니다.", gender, result);
		*/
//===========================================================
		//위의 문제를 다른 방식으로 표현
		/*
		System.out.print("성별을 입력하세요 (M/F 대소문자 구분X, 남/여) >>> ");
		char gender = sc.next().charAt(0);
		if(gender == 'M' || gender == 'm') {			
			System.out.print("남학생 입니다.");
		}
		else if(gender == 'F' || gender == 'f') {
			System.out.print("여학생 입니다.");
		}
		else {
			System.out.print("잘못 입력했습니다.");
		}
		*/
//===========================================================
		//정수(양수)를 입력받아 짝수인지 홀수인지 출력하는 프로그램 작성
		//정수(양수)를 입력하세요 >>> 
		//짝수다 / 홀수다 / 양수가 아닙니다. 출력
		
		System.out.print("정수(양수)를 입력하세요 >>> ");
		int num = sc.nextInt();
		sc.nextLine();
		
		if(num > 0 && num % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else if(num > 0 && num % 2 != 0) {
			System.out.println("홀수입니다.");
		}
		else if(num < 0 && num % 2 == 0){
			System.out.println("음의 짝수입니다.");
		}
		else if(num == 0) {
			System.out.println("입력한 숫자는 0입니다.");
		}
		else {
			System.out.println("음의 홀수입니다.");
		}
		sc.close();
	}
}
