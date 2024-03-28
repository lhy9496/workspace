package ncs.test9;

public class Airplane extends Plane {
	
	public Airplane() {
	}
	
	// 부모클래스 Plane에서 생성된 생성자에서 상속받은 planeName, fuelSize 변수를 가진 생성자를 생성 
	public Airplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight(int distance) {	
		// 일정 거리 만큼 욲항, 연료 감소 10 욲항시 연료 50 감소
		// 상속받은 생성자 super.setFuelSize()에 (super.getFuelSize() - (distance * 3))
		// 입력 받은 기름의 양 - 운행거리 * 3의 기름양을 대입
		super.setFuelSize((super.getFuelSize() - (distance * 3)));
	}
}
