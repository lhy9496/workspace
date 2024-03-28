package ncs.test4;
import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total;
		
		System.out.print("상품명 : ");
		String name = sc.nextLine();
		System.out.print("가격 : ");
		int price = sc.nextInt();
		sc.nextLine();
		System.out.print("수량 : ");
		int quantity = sc.nextInt();
		sc.nextLine();
		
		// 입력 받은 값들을 호출한 클래스의 생성자 매개변수에 넣어준다
		Product pd = new Product(name, price, quantity);
		
		// getter 메소드를 이용해 입력받은 가격 * 수량을 연산하고 총합을 구한다.
		total = pd.getPrice() * pd.getQuantity();
		
		System.out.println(pd.information());
		System.out.println("총 구매 가격 : " + total + " 원");
	}
}
