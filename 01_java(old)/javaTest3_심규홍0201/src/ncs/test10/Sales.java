package ncs.test10;

public class Sales extends Employee implements Bonus {

	
	public Sales() {
	}
	
	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}

	@Override
	public double tax() {
		// 월급에 10%를 세금으로 납부 부모 클래스에서 상속받은 super.getSalary() 에 13%인 0.13을 곱한 값을 반환
		return super.getSalary() * 0.13;
	}

	@Override
	public void incentive(int pay) {
		// 인센티브로 기본급 super.getSalary()에 120%를 더한 값 (int)(pay * 1.2) 반환
		/*
		int pay1 = super.getSalary() + ((int)(pay * 1.2));
		super.setSalary(pay1);
		*/
		super.setSalary(super.getSalary() + (int)(pay * 1.2));
	}
}
