import java.util.Scanner;
public class Casting01 {
	public static void main(String[] args) {
		/* 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
		 * 문자를 입력하세요 >>> 
		 * 입력한 문자 : 0, unicode : 0
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자를 한 글자 입력하세요 >>> ");
		char letter = sc.next().charAt(0);
		
		int result = letter; //char(문자형)형 변수를 int(정수형)형으로 형 변환을 시킨다.
		System.out.printf("입력한 문자 : %c, unicode : %d", letter, result);
	}
}
