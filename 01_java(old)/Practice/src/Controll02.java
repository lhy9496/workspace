import java.util.Scanner;
public class Controll02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 실수형으로 국어, 영어, 수학 세 목의 점수를 입력받아 총점과 평균을 계산하고
		// 합격인지 불합격인지 출력하시오. 합격 : 세과목 점수가 각각 40점 이상 평균이 60점 이상일때
		// 이때 총점과 평균은 정수형으로 처리하세요.
		
		System.out.print("국어 시험의 점수를 입력하세요 >>> ");
		float grade = sc.nextFloat();
		sc.nextLine();
		System.out.print("영어 시험의 점수를 입력하세요 >>> ");
		float grade1 = sc.nextFloat();
		sc.nextLine();
		System.out.print("수학 시험의 점수를 입력하세요 >>> ");
		float grade2 = sc.nextFloat();
		sc.nextLine();
		
//		float result = grade + grade1 + grade2;
//		float result1 = (grade + grade1 + grade2) / 3;
//		System.out.printf("국어 : %.1f, 영어 : %.1f, 수학 : %.1f => 총점 : %.0f, 평균 : %.0f", grade, grade1, grade2, result, result1);
		String finaly = "";
		int result, result1;
		result = (int)(grade + grade1 + grade2);
		
		if(grade >= 40 && grade1 >= 40 && grade2 >= 40 && (result / 3 >= 60)) {
			finaly = "축하합니다, 합격입니다!!";
		}
		else {
			finaly = "아쉽지만 불합격입니다.";
		}
		System.out.printf("국어 : %.1f, 영어 : %.1f, 수학 : %.1f => 총점 : %d, 평균 : %.1f\n", grade, grade1, grade2, result, result / 3);
		System.out.printf("%s", finaly);
	}
}
