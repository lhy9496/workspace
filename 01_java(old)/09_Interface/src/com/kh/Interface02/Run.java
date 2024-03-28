package com.kh.Interface02;
public class Run {
	
	public static void main(String[] args) {
		/*
		 * [인터페이스]
		 * 1) 추상메소드 + 상수필드로만 이루어진 클래스
		 * 2) 추상메소드로 이루어져있기 때문에 객체를 직접 생성할 수 없다.
		 * 3) 참조변수로 사용은 가능하다.
		 * 
		 * [추상메소드]
		 * 1) 미완성된 메소드로 몸통부( { } )가 구현되어 있지 않은 메소드
		 * 2) 무조건 오버라이딩 후 호출(사용)이 가능하다.
		 */
		Shape[] shapes = new Shape[2];
		shapes[0] = new Circle(5);
		shapes[1] = new Rectangle(3, 4);
		/*
		 * 배열 또는 컬렉션에서 사용
		 * 처음부터 끝까지 무조건 모두 탐색
		 * 해당배열에 인덱스값이 하나씩 왼쪽에있는 값에 대입되어 반복문 진행
		 */
		
		for(Shape shape : shapes) {
			System.out.println("도형의 넓이 : " + shape.calculateArea());
		}
		/*
		 * for(int i = 0; i < shapes.length; i++);
		 * Shape shape = shapes[i] // 얕은 복사
		 * System.out.println("도형의 넓이 : " + shape.calculateArea());
		 */
	}
}
