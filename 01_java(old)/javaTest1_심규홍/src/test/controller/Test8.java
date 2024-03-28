package test.controller;

public class Test8 {

	public static void main(String[] args) {
		int [][] array = {{12, 41, 36, 56}, {82, 10, 12, 61},
				{14, 16, 18, 78}, {45, 26, 72, 23}};
		double total = 0, average = 0;
		int i = 0, j = 0;
		
		for(i = 0; i < array.length; i++) {
			for(j = 0; j < array[i].length; j++) {
			total += (double)(array[i][j]);
			}
		}
		average = total / (i * j);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + average);
	}
}
