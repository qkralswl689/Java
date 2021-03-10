package com.javateam.jse;

import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class After100Days_practice {
	public static void main(String[] args) {
		
		// 기존 날짜 클래스들 활용하는법
		Calendar cal = Calendar.getInstance(); // Calendar 인스턴스 객체 생성
		
		// 1) Cal의 인스턴스를 활용하여 년 월일 성분 을 구한후 변수 대입
		
		// int year,month,date 변수 생성 후 cal 인스턴스 이용하여 년,월,일 성분 각 변수에 대입 
		int year = cal.get(cal.YEAR);
		int  month = cal.get(cal.MONTH) + 1;
		int date = cal.get(cal.DATE);
		
		
		//  printf 메서드 사용하여 2021년 2월 18일 형식으로 출력
		System.out.printf("1번 답 : %d년 %d월 %d일",year,month,date);
		System.out.println();
		// 2) 금일부터 100일 후에 해당되는 연산 수행
		
		// ** 빼먹은것 set
		cal.set(year, month-1, date); // 월 입력시 -1을 빼고 입력한
		cal.add(Calendar.DATE,100 );
		
		// 3) Date Formatter 클래스 사용하여 날짜 출력
		SimpleDateFormat dt = new SimpleDateFormat("yyyy년 M월 d일");
		String str = dt.format(cal.getTime());
		System.out.println("2번 답 : " + str);
		
		// 4) DateTimeFormatter 클래스 사용하여 날짜 2021년 O월 OO일 형식으로 출력
		// LocalDateTime dt2 = LocalDateTime.now(); // 5번답 
		DateTimeFormatter today = DateTimeFormatter.ofPattern("yyyy년 M월 d일");
		// System.out.println(dt2.format(today)); // 5번 답

		// 5) LocalDateTime의 멤버 메서드(now)를 활용하여 금일 날짜를 구하여 
		//    format 멤버 메서드와 위에서 작성한 날짜 포맷 객체를 메서드 인자로 활용하여 금일 날짜를 인쇄합니다.
		LocalDateTime dt3 = LocalDateTime.now();
		// DateTimeFormatter dateTime = DateTimeFormatter.ofPattern("yyyy년 M월 d일"); // 위에서 사용했기때문에 선언 안해도 됨
		System.out.println("3번 답 :" + dt3.format(today));
		
		// 6) 금일로부터 100일이후의 날짜를 LocalDateTime 멤버 메서드(plusDays)를 활용하여
		//	구한후 위와 동일하게 포맷터의 메서드(format)를 활용하여 포맷 객체를 인자로 입력하여 구한 날짜를 인쇄합니다.
		 LocalDateTime dt4 = LocalDateTime.now(); // 위에서 선언했기 떄문에 선언 안하고 위에꺼 사용해도 된다
		
		//System.out.println("4번 답 : " + dt4.plusDays(100)); // 시,분, 초 까지 출력
		 System.out.println("4번 답 : " +dt4.plusDays(100).format(today));  // 시,분, 초 제외하고 출력


	}
	

}
