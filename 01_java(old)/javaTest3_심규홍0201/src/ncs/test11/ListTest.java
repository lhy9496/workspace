package ncs.test11;

import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {
	/*
	 * [ArrayList] => java에서 제공하는 동적배열이다.
	 * 				  배열과 유사하게 요소들을 순서대로 저장하여 인덱스를 통해 접근하여 사용 가능
	 * 			      또한 제네릭을 통해서 해당 리스트에 저장하는 타입을 지정할 수 있다.
	 */
	public static void main(String[] args) {
		Random random = new Random();
		// ArrayList => 배열처럼 사용하는 것 => 제네릭을 사용 가능
		// <Integer> => 
		 List<Integer> list = new ArrayList<Integer>();
		 
		 //명시한 사용 데이터를 list 에 기록한다.
		 for(int i = 0; i < 10; i++) {
			 list.add(random.nextInt(100) + 1);
		 }
		 System.out.print("정렬 전 : ");
		 display(list);
		 System.out.println();
		 
		 // list 의 데이터를 내림차순 정렬한다.		 
		 Collections.sort(list, new Decending());
		 
		 System.out.print("정렬 후 : ");
		 display(list);
	}
	 // display() 메소드를 호출한다
	public static void display(List<Integer> list) {
		for(Integer i : list) {
			System.out.print(i + " ");
		}
		
	}
}
