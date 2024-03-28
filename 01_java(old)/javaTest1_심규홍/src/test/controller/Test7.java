package test.controller;

public class Test7 {

	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7,8,9,10}; 
		int i = 0;
		double sum = 0;
		for(i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				continue;
			}
			else {
				sum += array[i];
				System.out.println(array[i]);
			}
		}
		System.out.println("합계 : " + sum);
	}
}
