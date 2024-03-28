package ncs.test1;

public class ArrayTest {

	public static void main(String[] args) {
		int[][] array = { { 12, 41, 36, 56, 21 }, { 82, 10, 12, 61, 45 }, 
				{ 14, 16, 18, 78, 65 }, { 45, 26, 72, 23, 34 } };
		
		int i = 0, j = 0;
		double total = 0.0, average = 0.0;
		
		for(i = 0; i < array.length; i++) {
			for(j = 0; j < array[i].length; j++) {
				total += array[i][j];
			}
		}
		System.out.printf("합계 : %.2f\n", total);
		average = total / (i * j);
		System.out.printf("평균 : %.2f", average);
	}
}
