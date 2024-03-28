package com.kh.Test240211;

public class StudentController {
	Student[] sArr = new Student[5];
	int CUT_LINE = 60;	
			
	public StudentController() {
		sArr[0] = new Student("김길동", "자바", 100);
		sArr[1] = new Student("박길동", "디비", 50);
		sArr[2] = new Student("이길동", "화면", 85);
		sArr[3] = new Student("정길동", "서버", 60);
		sArr[4] = new Student("홍길동", "자바", 20);
	}
	
	public Student[] printStudent() {
		int i = 0;
		
		for(i = 0; i < sArr.length; i++) {
			if(sArr[i] == null) {
				break;
			}
			System.out.println(sArr[i].inform());
		}
		return sArr;
	}
	
	public int sumScore() {
		int i = 0, sum = 0;
		
		for(i = 0; i < sArr.length; i++) {
			if(sArr[i] == null) {
				break;
			}
			sum += sArr[i].getScore();
		}
		return sum;
	}
	
	public double[] avgScore() {
		double[] avg = new double[2];
		int i = 0, sum = 0;
		double average = 0;
		for(i = 0; i < sArr.length; i++) {
			if(sArr[i] == null) {
				break;
			}
			sum += sArr[i].getScore();
		}
		average = sum / i;
		avg[0] = sum; avg[1] = average;
		
		System.out.println("총합 : " + (int)avg[0]);
		System.out.println("평균 : " + avg[1]);
		return avg;
	}
}
