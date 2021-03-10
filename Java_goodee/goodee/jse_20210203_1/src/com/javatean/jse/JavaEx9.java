package com.javatean.jse;

import java.util.Calendar;

public class JavaEx9 {

	public static void main(String[] args) {
		
		// formatter : 줄바꿈 기능이 없다 => \n OR %n 사용
		System.out.printf("자바를 시작한 날은 %d월 %d일 입니다.\n",2,1); // %d : 정수 형태의 숫자
		System.out.printf("자바를 시작한 날은 %s월 %c일 입니다.\n","2",'1'); // %s : 문자열,%c : 문자
		System.out.printf("자바를 시작한 날은 %1$s월 %2$c일 입니다\n","2",'1'); // %1$s : 순서지정
		System.out.printf("자바를 시작한 날은 %2$s월 %1c일 입니다.%n",'1',"2"); // %1c : 순서지정
		System.out.printf("자바를 시작한 날은 %f월 %f일 입니다.%n",2.0,1.0); // %f :  실수 형태의 숫자
		System.out.printf("자바를 시작한 날은 %d월 %d일 입니다.%n",(int)2.0,(int)1.0); // 실수 값=>정수값 변환
		System.out.printf("자바를 시작한 날은 %.2f월 %.1f일 입니다.\n",2.0,1.0); 
		System.out.printf("자바를 시작한 날은 %e월 %g일 입니다.%n",2.0,1.0); 
		
		Calendar cal = Calendar.getInstance();
		String str = String.format("오늘은 %1$tY년 %1$tb %1$te일입니다%n", cal);
		System.out.println(str);

	}

}
