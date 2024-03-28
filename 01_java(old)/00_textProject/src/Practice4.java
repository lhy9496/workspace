import java.util.Scanner;
public class Practice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("영어 문자열을 입력하세요 >>> ");
		String word = sc.next();
		
		System.out.println("입력한 문자열은 : " + word);
		System.out.println("첫 번째 문자 : " + word.charAt(0));
		System.out.println("두 번째 문자 : " + word.charAt(1));
		System.out.println("세 번째 문자 : " + word.charAt(2));
		
		sc.close();
	}

}
