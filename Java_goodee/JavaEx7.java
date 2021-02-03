package com.javatean.jse;

import java.math.BigDecimal;

public class JavaEx7 {

	public static void main(String[] args) {
		
		// int num1 = 1;
		int num1 = 200;
		// byte num2 = num1; // 큰 자료가 작은 자료에 들어갈수 없기 대문에 오류가 난다 : 타입우선
		byte num2 = (byte) num1; 
		// 큰 자료형 => 작은 자료형 : 형변환(castiong, down-casting) 
		System.out.println("num2 : " + num2);
		// 값의 범위를 초과하게 되면 값의 손실(결손) 발생된다
		
		// num2 = 200; // short (X), int (O)
		// java에서는 모든 정수는 타입(자료형) 무언급시 값(리터럴)은 int 형으로 간주한다
		// 일반적인 정수 => int
		
		short num3 = 200;
			
		int num4 = num2;
		num4 = num3; // 작은자료형에서 큰자료형으로 들어갈때는 문제없다
		// 작은 자료형 => 큰 자료형 : 형변환(promoting, up-casting)
		
		num4 = 'c'; // ASCII 코드 : 'a' =97, 'A'=65, '0'=48
		// 자동 형변환
		System.out.println("num4 : " + num4);
		
		num4 = (int)1L; // long -> int		
		long num5 = 1L; // L(l) 을 꼭 붙혀서 사용해야한다
		
		System.out.println("long형의 최대 값 : " + Long.MAX_VALUE);
		
		///////////////////////////////////////////////////////////
		
		BigDecimal big = new BigDecimal("9223372036854775808");
		System.out.println("BigDecimal 합계 : " + big.add(new BigDecimal("1")));
		// long 형 범위를 넘어가는 정수 연산 - bigDecimal, bigInteger를 이용해 문자열로 값을 추가한다
		
	}

}
