package ncs.test10;

public class Company {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		
		employees[0] = new Secretary("Hilery", 1, "secretary", 800);
		employees[1] = new Secretary("Clinten", 2, "sales", 1200);
		
		System.out.printf("%-10s %-10s %-10s\n", "name", "department", "salary");
		System.out.println("------------------------------------");
		
		for(int i = 0; i < employees.length; i++) {
			Employee e = employees[i];
			System.out.printf("%-10s %-10s %-10d\n", e.getName(), e.getDepartment(), e.getSalary());
		}
		
		System.out.println();
		
		System.out.println("인센티브 100 지급\n");
		for(Employee e : employees) {
			if(e instanceof Secretary) {
				((Secretary)e).incentive(100);
			}
			else if(e instanceof Sales) {
				((Sales)e).incentive(100);
			}
		}
		
		System.out.printf("%-10s %-10s %-10s %-10s\n", "name", "department", "salary", "tax");
		System.out.println("------------------------------------");
		for(int i = 0; i < employees.length; i++) {
			Employee e = employees[i];
			System.out.printf("%-10s %-10s %-10d %.1f\n", e.getName(), e.getDepartment(), e.getSalary(), e.tax());
		}
	}
}
