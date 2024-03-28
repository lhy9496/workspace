package ncs.test3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTest {

	public static void main(String[] args) {
		
		/*
		// 생년 월 일
		int by = 1987;
		int bm = 5;
		int bd = 27;
		int age = 0;
		int years = 0;
		
		// 오늘 날짜
		Date Today = new Date();
		SimpleDateFormat thisDay = new SimpleDateFormat("yyyy년 MM월 dd일");
		String td = thisDay.format(Today);
		years = Today.getYear() + 1900;
		
		Calendar cld = new GregorianCalendar(by, bm, bd);
		String[] day = {"일", "월", "화", "수", "목", "금", "토"};
		String date = day[cld.get(Calendar.DAY_OF_WEEK_IN_MONTH) - 1];
		String str = by + "년 " + bm + "월 " + bd + "일 " + date + "요일";
		
        System.out.println("현재 : " + str);
		System.out.println("생일 : " + td.toString());
		System.out.println("나이 : " + (years - by));
		*/
		
		// Date 메소드에 year = +1900, month = +1 이 되어있기 때문에 빼줘야한다.
		// Date 메소드 안에 매개변수를 넣지 않으면 현재 시간으로 출력된다.
		Date birth = new Date(1987 - 1900, 5 - 1, 27);
		Date today = new Date();
		int age = 0;
		
		// SimpleDateFormat 참조변수명 / 참조변수.format(); = Date메소드의 출력 방식을 포맷시켜준다.
		SimpleDateFormat f1 = new SimpleDateFormat("생일 : yyyy년 MM월 dd일 E요일");
		SimpleDateFormat f2 = new SimpleDateFormat("현재 : yyyy년 MM월 dd일");
		String birthFormat = f1.format(birth);
		String todayFormat = f2.format(today);
		
		if(birth.getMonth() >= today.getMonth()) {
			age = today.getYear() - birth.getYear();
		}
		else {
			age = (today.getYear() - birth.getYear() - 1);
		}
		
		System.out.println(birthFormat);
		System.out.println(todayFormat);
		System.out.println("나이 : " + age);
	}
}
