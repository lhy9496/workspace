package Loop;

public class Exam03 {

	public static void main(String[] args) {
		/*
		중첩 for문을 이용하여 방정식 4x + 5y = 60의 모든 해를 구해서 (x, y) 형태로 출력하시오.
		단, x와 y는 10이하의 자연수입니다.
		*/
		int x = 0, y = 0;
		
		for(x = 1; x <= 10; x++) {
			for(y = 1; y <= 10; y++) {
				int sum = (4 * x) + (5 * y);
				if(sum == 60) {
				System.out.printf(x + " " + y);
				System.out.println();
				}
			}
		}
	}

}
