package com.javateam.jse;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class After100Days_practice2 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		// 1) 위의 cal 인스턴스를 활용하여 년월일 성분을 구하고 각각 year, month, date 라는 정수형 변수에 대입합니다.
		
		int year = cal.get(cal.YEAR);
		int month = cal.get(cal.MONTH) + 1; // 0부터 시작하기 때문에 +1 해준다
		int date = cal.get(cal.DATE);
		
		// printf 메서드를 활용하여 " 2021년 2월 18일 " 와 같은 형식으로 화면에 출력합니다.
		
		System.out.printf("1번 답 : %d년 %d월 %d일",year,month,date);
		System.out.println();
		
		// 2) 금일 날짜로부터 100일후에 해당되는 연산을 수행합니다 Calendar 클래스의 set, add 멤버 메서드를 활용
		cal.set(year, month-1, date);
		cal.add(Calendar.DATE,100);
		
		// 3) 위에서 구한 날짜를 Date Formatter 클래스를 활용하여 2021년 O월 O일 같은 형식으로 화면에 출력 => SimpleDateFormat 클래스를 활용
		
		SimpleDateFormat df = new SimpleDateFormat("yyyy년 M월 d일");
		
		String result = df.format(cal.getTime());
		
		System.out.println("2번 답 : " + result);
		
		// 4) DateTimeFormatter를 활용하여 2021년 O월 OO일 같이 출력될 수 있도록 날짜 포맷을 설정합니다.
		
		DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy년 M월 d일");
		
		// 5) LocalDateTime의 멤버 메서드(now)를 활용하여 금일 날짜를 구하여
		// format 멤버 메서드와 위에서 작성한 날짜 포맷 객체를 메서드 인자로 활용하여 금일 날짜를 인쇄합니다.
		
		LocalDateTime dt2 = LocalDateTime.now();
		
		System.out.println("3번 답 : " + dt.format(dt2));
		
		// 6) 금일로부터 100일이후의 날짜를 LocalDateTime 멤버 메서드(plusDays)를 활용하여
		// 구한후 위와 동일하게 포맷터의 메서드(format)를 활용하여 포맷 객체를 인자로 입력하여 구한 날짜를 인쇄합니다.
		
		System.out.println("4번 답 : " + dt2.plusDays(100).format(dt));
            

		
	}
}
