package com.kh.Test2402062;

import java.util.Comparator;

public class SortedLottery implements Comparator<Lottery> {
	
	@Override
	public int compare(Lottery o1, Lottery o2) {
		/*
		 * 0보다 작은 값(음수) : o1이 o2보다 작을 때
		 * 0 : o1이 o2와 같을 때
		 * 0보다 큰값(양수) o1이 o2보다 크다.
		 * 오름차순 정렬 (내림차순은 음수 양수를 바꿔주면 된다)
		 */
		int num =  o1.getName().compareTo(o2.getName());
		
		if(num == 0) {
			return o1.getPhone().compareTo(o2.getPhone());
		}
		return num;
	}
}
