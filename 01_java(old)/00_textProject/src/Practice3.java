import java.util.Scanner;
public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("사각형의 가로 길이를 입력하세요(cm) >>> ");
		float width = sc.nextFloat();
		System.out.println("사각형의 세로 길이를 입력하세요(cm) >>> ");
		float height = sc.nextFloat();
		
		System.out.printf("가로 길이가 %.1fcm이고 세로 길이가 %.1fcm인 사각형의 면적은 %.2fcm 입니다.\n", width, height, width * height);
		System.out.printf("가로 길이가 %.1fcm이고 세로 길이가 %.1fcm인 사각형의 둘레는 %.2fcm 입니다.\n", width, height, (width + height) * 2);
	}

}
