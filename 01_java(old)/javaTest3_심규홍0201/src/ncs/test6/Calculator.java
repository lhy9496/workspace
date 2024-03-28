package ncs.test6;

public class Calculator {
	
	public double getSum(int data) throws InvalidException {
		// 입력 값이 2 ~ 5 일때 1 ~ 입력값 까지의 모든 수를 더하고 실수형으로 반환
		double sum = 0;
		if(data > 1 && data < 6) {
			for(int i = 1; i <= data; i++) {
				sum += i;
			}
		}
		// 만약 입력 값이 2 ~ 5 사이의 값이 아닐때 예외를 발생 시키고
		// InvalidException 클래스로 해결을 넘긴다.( 괄호 안의 메세지가 상속된다) 
		else {
			throw new InvalidException("입력 값에 오류가 있습니다.");
		}
		return sum;
	}
}
