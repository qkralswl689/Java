package com.javateam.jse;

public class EnumMethodExample {

	public static void main(String[] args) {
		Week_thisJava today = Week_thisJava.SUNDAY;
		// Week_thisJava 라고하는 열거타입변수 today 선언후 
		// Week_thisJava.SUNDAY 열거 상수 대입
		String name = today.name();
		// String name 에는 name() 메소드를 사용해
		// Week_thisJava.SUNDAY 열거 상수가 참조하는 
		// 열거객체의 내부 문자열을 받아 String name 변수에 저장한다
		System.out.println(name); // SUNDAY 출력
		
		int ordinal = today.ordinal(); 
		System.out.println(ordinal); // 6 출력
		
		Week_thisJava day1 = Week_thisJava.MONDAY;
		// Week_thisJava 열거타입변수 day1선언 
		// Week_thisJava 열거상수 MONDAY 대입
		Week_thisJava day2 = Week_thisJava.WEDNESDAY;
		// Week_thisJava 열거타입변수 day2선언 
		// Week_thisJava 열거상수 WEDNESDAY 대입
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		// 열거상수의 순서 차이 출력
		System.out.println(result2);
		// 열거상수의 순서 차이 출력
		
		Week_thisJava weekDay = Week_thisJava.valueOf("SUNDAY");
		if(weekDay == Week_thisJava.SATURDAY || weekDay == Week_thisJava.SUNDAY) {
			System.out.println("주말이군요");
		}else {
			System.out.println("평일이군요");
		}
		
		Week_thisJava[] days = Week_thisJava.values();
		// 배열변수 Week_thisJava 선언후  Week_thisJava 타입이 가지고 있는
		// 열거상수들이 참조하는 열거객체들을 배열의 항목으로 만들어
		// 생성된 번지를 days에 대입해준다
		for(Week_thisJava day : days) {
			System.out.println(day);
		}
		
	}

}
