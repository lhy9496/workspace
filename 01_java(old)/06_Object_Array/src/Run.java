public class Run {
	public static void main(String[] args) {
		/*
		 * [객체 배열] => 객체를 저장하는 배열로 일반적인 배열과 다르게 배열의 각 요소가 참조변수로 이루어져있다.
		 *  			사용을 위해서는 각 요소마다 객체 생성이 필요하다.
		 *  
		 * [표현법]
		 * 클래스명[] 배열명 = new 클래스명[크기]; => 크기가 n개인 참조변수 배열 생성
		 * 배열명[index] = new 클래스명(); => 각 인덱스 객체 생성
		 */
		Human[] humanArr = new Human[3]; // [o, o, o]
		humanArr[0] = new Human("홍길동", 21, 'I');
		humanArr[1] = new Human("허생", 32, 'G');
		humanArr[2] = new Human("김선달", 19, 'H');
		for(int i = 0; i < humanArr.length; i++) {
			humanArr[i].print();
		}
		
		Human[] humanArr2 = {new Human("전소민", 29, 'A'),
							 new Human("이수민", 22, 'B'),
							 new Human("박지민", 15, 'C')};
	}
}
