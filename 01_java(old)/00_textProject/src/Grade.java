import java.util.Scanner;
public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 >>> ");
		String name = sc.next();
		System.out.print("시험 점수를 정수로 입력하세요 >>> ");
		int grade = sc.nextInt();
		sc.nextLine();
		
		if(grade >= 95 && grade <= 100) {
			System.out.printf("%s님의 시험 점수는 %d점 학점은 A+ 입니다.", name, grade);
		}
		else if(grade >= 90 && grade <= 94) {
			System.out.printf("%s님의 시험 점수는 %d점 학점은 A 입니다.", name, grade);
		}
		else if(grade >= 85 && grade <= 89) {
			System.out.printf("%s님의 시험 점수는 %d점 학점은 B+ 입니다.", name, grade);
		}
		else if(grade >= 80 && grade <= 84) {
			System.out.printf("%s님의 시험 점수는 %d점 학점은 B 입니다.", name, grade);
		}
		else if(grade >= 75 && grade <= 79) {
			System.out.printf("%s님의 시험 점수는 %d점 학점은 C+ 입니다.", name, grade);
		}
		else if(grade >= 70 && grade <= 74) {
			System.out.printf("%s님의 시험 점수는 %d점 학점은 C 입니다.", name, grade);
		}
		else if(grade >= 65 && grade <= 69) {
			System.out.printf("%s님의 시험 점수는 %d점 학점은 D 입니다.", name, grade);
		}
		else {
			System.out.printf("%s님의 시험 점수는 %d점 학점은 F 입니다.", name, grade);
		}
		sc.close();
	}

}
