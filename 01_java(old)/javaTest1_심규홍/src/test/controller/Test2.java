package test.controller;

public class Test2 {

	public static void main(String[] args) {
		
		int i = 0, j = 0, sum = 0;
		
		for(i = 2; i <= 5; i++) {
			for(j = 1; j <= 9; j ++) {
				if(i % 2 != 0) {
					sum = (i * j);
					System.out.println(i + " * " + j + " = " + sum);
				}
			}
		}
	}
}
