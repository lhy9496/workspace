package ncs.test7;

public class StudentTest {

	public static void main(String[] args) {
		// Student 객체를 호출하여 크기가 3인 student라는 객체 배열 생성
		Student[] student = new Student[3];
		
		// 배열에 정보(값)를 대입
		student[0] = new Student("홍길순", 25, 171, 81, "201401", "영어영문학");
		student[1] = new Student("한사랑", 23, 183, 72, "201402", "건축학");
		student[2] = new Student("임꺽정", 26, 175, 65, "201403", "체육학");
		
		int i = 0;
		
		// toString();메소드를 이용하여 student[] 배열에 담긴 i번째 인덱스들을 배열의 크기만큼 반복해서 출력
		// 이때, 출력되는 student[i]는 오버라이딩 된 student[i]을 출력한다. (동적 바인딩)
		for(i = 0; i < student.length; i++) {
			System.out.println(student[i].toString());
		}
	}
}
