import java.util.Scanner;
public class Casting03 {
	public static void main(String[] args) {
		// 선언 및 초기화된 5개의 변수를 가지고 알맞은 사칙연산(+, -, *, /)과 형 변환을 이용하여
		// 다음과 같은 값이 나오도록 코드를 작성하세요.
		int iNum = 10;
		int iNum1 = 4;
		float fNum = 3.0f;
		double dNum = 2.5;
		char ch = 'A';
		
		System.out.println(iNum % iNum1);
		System.out.println(iNum - (int)(dNum) * iNum1);
		
		System.out.println((float)iNum);
		System.out.println(dNum * iNum1);
		
		System.out.println((float)(iNum) / (float)(iNum1));
		System.out.println((float)(iNum - dNum * 3));
		
		System.out.println(iNum - (int)(iNum1 + fNum));
		System.out.println((int)(iNum * fNum) / iNum);
		
		System.out.println(iNum / fNum);
		System.out.println((double)((dNum * iNum1) / fNum));
		
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(ch + iNum);
		System.out.println((char)(ch + iNum));
	}
}
