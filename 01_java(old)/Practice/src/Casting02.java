import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;
public class Casting02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 실수형으로 국어, 영어, 수학 세 목의 점수를 입력받아 총점과 평균을 출력하세요.
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
		int result, result1;
		result = (int)(grade + grade1 + grade2);
		System.out.printf("국어 : %.1f, 영어 : %.1f, 수학 : %.1f => 총점 : %d, 평균 : %d", grade, grade1, grade2, result, result / 3);
	}
}
