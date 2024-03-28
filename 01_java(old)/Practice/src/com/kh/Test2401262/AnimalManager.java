package com.kh.Test2401262;

public class AnimalManager {
	/*
	 * [추상 클래스]
	 * 1) 미완성된 클래스
	 * 2) 객체생성이 불가능하다.(단, 레퍼런스 변수(참조변수) 선언은 가능하다)
	 * 3) 일반필드 + 일반메소드 + (추상메소드) / 추상메소드는 필수 요소는 아니다.
	 *    추상메소드를 가진 클래스는 반드시 추상클래스로 명시해야한다.
	 *    
	 * 4) 추상메소드가 없어도 추상클래스를 사용할 수는 있다.
	 *    개념적 : 단지 이 클래스가 미완성된 클래스다 라는걸 알리기 위해서.
	 *    프로그래밍적 : 객체 생성이 불가 하게끔 하고자 할 때
	 *    
	 * 5) 추상메소드가 있는 추상클래스를 사용하는 이유
	 *    - 부모클래스에 추상메소드가 존재할 경우
	 *      자식클래스에서는 강제로 오버라이딩 해서 동일한 패턴의 메소드를 가지게 된다.
	 *      => 각 자식 클래스마다 실행시킬 내용은 다르지만 동일한 형태의 메소드로 구현했으면 할 때 사용.
	 */
	public static void main(String[] args) {
		/*
		Animal[] animals = new Animal[5];
		animals[0] = new Dog("진돌이", "진돗개", 12);
		animals[1] = new Cat("나비", "코리안 숏헤어", "한국", "점박이");
		animals[2] = new Dog("시바", "시바견", 10);
		animals[3] = new Cat("초코", "러시안 블루", "러시아", "블루 그레이");
		animals[4] = new Dog("인절미", "골든 리트리버", 20);
		
		for(Animal animal : animals) {
			animal.speak();
		}
		*/
		Animal[] ani = new Animal[5];
		ani[0] = new Dog("똥개", "시고르자브종", 15);
		ani[1] = new Dog("뽀삐", "말티푸", 3);
		ani[2] = new Cat("민수", "먼치킨", "미국", "노란색");
		ani[3] = new Dog("만식", "허스키", 12);
		ani[4] = new Cat("삐뽀", "스코티쉬폴드", "스코틀랜드", "회색");
		
		for(Animal animals : ani) {
			animals.speak();
		}
	}
}
