import javax.swing.plaf.synth.SynthOptionPaneUI;

public class PrintTest {
	public static void main(String[] args) {
		
		/* 화면에 내용을 출력하기 위한 기본적인 출력문
		 * System.out.print("내용입력");
		 * System.out.println("내용입력"); = 출력문 + 개행 (아랫줄로 이동)
		 */
		System.out.print("안녕하세요\t");
		System.out.print("출력문 입니다.");
		
		System.out.println();
		
		System.out.println("안녕하세요");
		System.out.println("출력문 입니다.");
		
		 /* 출력하고자 하는 값들을 제시한 형식에 맞춰서 출력하는 출력문
		 * System.out.printf("출력하고자하는 형식", 출력하고자 하는 값, 값1, 값2);
		 */
		int n1 = 10;
		int n2 = 20;
		
		// "10 20" 을 출력 하길 원할때
		System.out.println(n1 + " " + n2);
		
		/* 포맷안에서 쓰일 수 있는 키워드
		 * %d = 정수, %c = 문자, %s = 문자, 문자열, %f = 실수
		 */
		// 첫번째 %d에 n1 값을 대입, 2번째 %d에 n2 값을 대입
		System.out.printf("n1의 값은 = %d, n2의 값은 = %d, π의 값은 = %f", n1, n2, 3.141592);
	}
}
