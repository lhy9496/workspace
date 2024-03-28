import java.util.Scanner;
public class Age {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 >>> ");
		String name = sc.next();
		System.out.print("성별을 입력하세요 (남/여) >>> ");
		String gender = sc.next();
		System.out.println("나이를 입력하세요 >>> ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("키를 입력하세요 (cm) >>> ");
		float height = sc.nextFloat();
		//위 코드들은 scanner 클래스를 이용해 정보를 입력 받아 변수에 대입하는 코드
		
		if(age > 10 && age < 20) {
			System.out.printf("키가 %.1fcm인 %s님의 나이는 %d살이고 성별은 %s성이며 청소년입니다.", height, name, age, gender);
		} // 입력 받은 age(나이) 변수의 값에 11~19의 값이 대입되면 청소년이라는 결과를 출력
		else if(age > 0 && age < 11) {
			System.out.printf("키가 %.1fcm인 %s님의 나이는 %d살이고 성별은 %s성이며 유아입니다.", height, name, age, gender);
		} // 입력 받은 age(나이) 변수의 값에 1~10의 값이 대입되면 유아라는 결과를 출력 
		else if(age > 19) {
			System.out.printf("키가 %.1fcm인 %s님의 나이는 %d살이고 성별은 %s성이며 성인입니다.", height, name, age, gender);
		} // 입력 받은 age(나이) 변수의 값에 20이상의 값이 대입되면 성인이라는 결과를 출력
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		sc.close();
	}
}
