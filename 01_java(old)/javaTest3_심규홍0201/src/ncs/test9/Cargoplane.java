package ncs.test9;

public class Cargoplane extends Plane {
	
	public Cargoplane() {
	}
	
	// 부모 클래스로부터 받은 매개변수로 생성자 생성
	public Cargoplane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}
	
	public void flight(int distance) {
		// 일정 거리 만큼 욲항, 연료 감소 10 욲항시 연료 50 감소
		// 상속받은 생성자 super.setFuelSize()에 (super.getFuelSize() - (distance * 5))
		// 입력 받은 기름의 양 - 운행거리 * 5의 기름양을 대입
		super.setFuelSize((super.getFuelSize() - (distance * 5)));
	}
}
