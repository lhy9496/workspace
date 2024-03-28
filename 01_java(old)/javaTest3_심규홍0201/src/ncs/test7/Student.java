package ncs.test7;

public class Student extends Human{
	private String number;
	private String major;
	
	public Student() {
		super();
	}

	public Student(String name, int age, int height, int weight, String number, String major) {
		// 부모 클래스의 생성자 호출
		super(name, age, height, weight);
		this.number = number;
		this.major = major;
	}

	@Override
	public String toString() {
		// 상속받은 부모(Human)클래스 생성자 super(name, age, height, weight)를 toString으로 출력.
		// super.toString() 뒤쪽에 Student의 생성자 number, major를 추가 입력해서.
		// Student.toString()의 리턴 값을 작성.
		return super.toString() + number + " " + major;
	}
}
