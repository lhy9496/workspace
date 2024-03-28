package ncs.test2;

public class StringTest {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		double data[] = new double[5];
		double sum = 0;
		int i = 0;
		// split = 문자열에서 특정 문자를 빼고 쪼개는 기능
		String[] st = str.split(",");
		
		/*
		for(i = 0; i < st.length; i++) {
			data[i] = Double.parseDouble(st[i]);
			sum += data[i];
		}
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (sum / i));
		*/
		
		int index = 0;
		for(String s : st) {
			// 문자열을 double(실수)형으로 변환 : Double.parseDouble();
			data[index] = Double.parseDouble(s);
			sum += data[index++];
		}
		System.out.printf("합계 : %.3f\n", sum);
		System.out.printf("평균 : %.3f", sum / index);
	}
}
