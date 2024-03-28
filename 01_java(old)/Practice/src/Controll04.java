import java.util.Scanner;
public class Controll04 {
	public static void main(String[] args) {
		/*
		 * 사용자에게 관리자, 회원, 비회원 중 하나를 입력받아 각 등급이 행할 수 있는 권한을 출력
		 * 단, 관리자는 회원관리, 게시글관리, 게시글 작성, 게시글 조회, 댓글 작성이 가능하고
		 * 회원은 게시글 작성, 게시글 조회, 댓글 작성이 가능하며
		 * 비회원은 게시글 조회만 가능합니다.
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용자의 등급을 입력해주세요 (admin, user, unknown / 관리자, 회원, 비회원) >>> ");
		String cls = sc.nextLine();
		
		/*
		if(cls.equals("admin") || cls.equals("관리자")) {
			System.out.printf("당신의 등급은 %s이고, 권한 목록입니다.\n", cls);
			System.out.println("회원 관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
		}
		else if(cls.equals("user") || cls.equals("회원")) {
			System.out.printf("당신의 등급은 %s이고, 권한 목록입니다.\n", cls);
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
		}
		else if(cls.equals("unknown") || cls.equals("비회원")) {
			System.out.printf("당신의 등급은 %s이고, 권한 목록입니다.\n", cls);
			System.out.println("게시글 조회");
		}
		else {
			System.out.println("잘못 입력했습니다.");
		}
		*/
//================================================================================
		String power = "";
		switch(cls) {
			case "관리자":
			case "admin":
				power += "회원 관리, 게시글 관리";
			case "회원":
			case "user":
				power += ((power.equals("") ? "" : ", ") + "게시글 작성, 댓글 작성");
			case "비회원":
			case "unknown":
				power += ((power.equals("") ? "" : ", ") + "게시글 조회");
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				break;
		}
		System.out.println(power);
		sc.close();
	}
}
