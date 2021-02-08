package com.javateam.jse;

import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		
//		Week_thisJava today = Week_thisJava.FRIDAY;
		
		Week_thisJava today = null; // 초기화
		// 열거타입 변수 Week_thisJava 에 지정가능한 것은 열거 상수값만 지정가능하다
		
		Calendar cal = Calendar.getInstance(); 
		// getInstance : 내 컴퓨터에 현재 날짜를 Calendar객체로 만들어서 돌려준다
		
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// Calendar의 참조변수 cal을 통해서 get메소드를 사용해 Calendar.DAY_OF_WEEK 으로 지정해주면 get은 오늘의 요일을 돌려준다
		
		System.out.println(week); // 2출력 => 일요일  :1, 월요일 : 2, 화요일 : 3 ...
		
		switch(week) {
		case 1:
			today = Week_thisJava.SUNDAY;
			break;
		case 2:
			today = Week_thisJava.MONDAY;
			break;
		case 3:
			today = Week_thisJava.TUESDAY;
			break;
		case 4: 
			today = Week_thisJava.WEDNESDAY;
			break;
		case 5:
			today = Week_thisJava.THURSDAY;
			break;
		case 6:
			today = Week_thisJava.FRIDAY;
			break;
		case 7:
			today = Week_thisJava.SATURDAY;
			break;
			
		}
		System.out.println("오늘 요일 : " + today); // 오늘 요일 : MONDAY 출력
		// 열거타입 변수 today를 출력 시키면 열거타입 변수가 참조하는 열거 객체의 문자열이 출력된다
		// 열거 객체의 문자열은 열거상수의 이름과 같은 문자열을 가지고 있다
		
		if(today == Week_thisJava.SUNDAY) { 
		// 열거타입 변수가 참조하는 열거 객체와 열거상수가 참조하는 열거객체가 동일한지 비교
			System.out.println("일요일에는 축구를 합니다");
		}else {
			System.out.println("열심히 자바 공부합니다");
		}

	}

}
