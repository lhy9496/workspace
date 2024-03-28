package test.controller;

public class Test3 {

	public static void main(String[] args) {
		int i = 0, total = 0;
		double average = 0;
		
		for(i = 1; i <= 100; i++) {
			total += i;
		}
		average = total / i;
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + average);
	}
}
