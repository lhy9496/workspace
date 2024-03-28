import java.util.Scanner;
public class Practice1 {
	public static void main(String[] args) {
		/* 이름, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
		 * Scanner를 사용하시면 됩니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 >>> ");
		String name = sc.next();
		
		System.out.print("성별을 입력하세요 (남/여) >>> ");
		String gender = sc.next();
		/*char gender = sc.next().charAt(0);
		 * 문자열 .charAt(index) = 문자열에서 내가 원하는 index의 글자를 가져온다.
		 * index = 몇번째냐.
		 */
		
		System.out.print("나이를 입력하세요 >>> ");
		int age = sc.nextInt();
		sc.nextLine();
		
		System.out.print("키를 입력하세요 (cm) >>> ");
		float height = sc.nextFloat();
		
		System.out.printf("키가 %.1fcm인 %d살 %s자 %s님 반갑습니다. ^^ ", height, age, gender, name);
		
		sc.close();
	}
}
