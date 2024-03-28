package com.kh.Test240211;

public class StudentMenu {
	StudentController ssm = new StudentController();

	public StudentMenu() {
		System.out.println("========== 학생 정보 출력 ==========");
		ssm.printStudent();
		System.out.println("========== 학생 성적 출력 ==========");
		ssm.avgScore();
		System.out.println("========== 성적 결과 출력 ==========");
		int i = 0, j = 0;
		int csArr[] = new int[5];
		for(i = 0; i < ssm.sArr.length; i++) {
			csArr[i] = ssm.sArr[i].getScore();
		}
		for(j = 0; j < csArr.length; j++) {
			if(csArr[j] >= ssm.CUT_LINE) {
				if(csArr[j] == 0 && ssm.sArr[j] == null) {
					break;
				}
				System.out.println(ssm.sArr[j].getName() + "학생은 통과입니다.");
			}
			else {
				System.out.println(ssm.sArr[j].getName() + "학생은 재시험 대상입니다.");
			}
		}
	}	
}
