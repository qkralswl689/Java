package com.javateam.jse;

public class JavaEx19 {

	public static void main(String[] args) {
		
		// while(false) { // unreachable code(dead code)
		// while(true) { // 무한 반복문(infinite loop)
		//for (;;) { // 무한 반복문(infinite loop)
		
		int sum = 0; // 합계
		int i = 1; // 카운터(계수 변수)
		while(i<=10) {
			
			// 합계 연산
			sum += i ;
			System.out.printf("1~%d까지의 합 = %d%n ", i,sum );
			i++; // 증감 
		}
		System.out.println("--------------------");
		System.out.println("1~10까지의 합=" + sum);

	}

}
