import java.util.Scanner;
public class Switch_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월(month)를 입력하세요 1~12 >>> ");
		String mon = sc.nextLine();
		
		String mon1;
		switch(mon) {
		
		case "1":
			mon1 = "January";
			break;
		case "2":
			mon1 = "February";
			break;
		case "3":
			mon1 = "March";
			break;
		case "4":
			mon1 = "April";
			break;
		case "5":
			mon1 = "May";
			break;
		case "6":
			mon1 = "June";
			break;
		case "7":
			mon1 = "July";
			break;
		case "8":
			mon1 = "August";
			break;
		case "9":
			mon1 = "September";
			break;
		case "10":
			mon1 = "October";
			break;
		case "11":
			mon1 = "November";
			break;
		case "12":
			mon1 = "December";
			break;
		default:
			System.out.print("잘못 입력했습니다.");
			return;
		}
		System.out.printf("입력한 월은 %s월, 영어로는 %s 입니다. ", mon, mon1);
		sc.close();
	}
}
