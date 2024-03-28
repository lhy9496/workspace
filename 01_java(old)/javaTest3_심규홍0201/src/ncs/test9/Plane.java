package ncs.test9;

public abstract class Plane {
	private String planeName;
	private int fuelSize;
	
	public Plane() {
		super();
	}
	
	// planeName, fuelSize 필드변수를 가진 생성자 생성
	public Plane(String planeName, int fuelSize) {
		super();
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		fuelSize += fuel; 
	}	
	
	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize += fuelSize;
	}
	
	@Override
	public String toString() {
		return planeName+ "			" + fuelSize;
	}

	public abstract void flight(int distance);
}
