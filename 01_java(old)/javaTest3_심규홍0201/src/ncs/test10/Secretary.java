package ncs.test10;

public class Secretary extends Employee implements Bonus {

	
	public Secretary() {
	}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	
	@Override
	public void incentive(int pay) {
		// 인센티브로 기본급super.getSalary()에 80%를 더한 값 (int)(pay * 0.8) 반환 
		int pay1 = super.getSalary() + (int)(pay * 0.8);
		super.setSalary(pay1);
		//super.setSalary(super.getSalary() + (int)(pay * 0.8));
	}

	@Override
	public double tax() {
		// 월급에 10%를 세금으로 납부 부모 클래스에서 상속받은 super.getSalary() 에 10%인 0.1을 곱한 값을 반환
		return super.getSalary() * 0.1;
	}	
}
