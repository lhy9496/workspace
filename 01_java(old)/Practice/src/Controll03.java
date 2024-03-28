import java.util.Scanner;
public class Controll03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		 * 아이디와 비밀번호를 입력받아 지정해둔 아이디와 비밀번호와 비교해서
		 * 아이디와 비밀번호가 같다면 로그인 성공
		 * 아이디가 틀렸을 시 "아이디가 틀렸습니다." 출력
		 * 비밀번호가 틀렸을 시 "비밀번호가 틀렸습니다." 출력
		 */
		String id = "myId";
		String pwd = "myPassword";
		
		System.out.print("아이디를 입력하세요 >>> ");
		String id1 = sc.nextLine();
		System.out.print("비밀번호를 입력하세요 >>> ");
		String pwd1 = sc.nextLine();
		
		if(id.equals(id1)) {
			if(pwd.equals(pwd1)) {
				System.out.println("로그인 성공!!");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		else {
			System.out.println("아이디가 틀렸습니다.");
		}
		sc.close();
	}
}
