package com.javateam.jse;

public class JavaEx21 {

	public static void main(String[] args) {
		
		int sum = 0; // 합계
		int i = 1; // 카운터(계수 변수)
		do {
						// 합계 연산
			sum += i ;
			System.out.printf("1~%d까지의 합 = %d%n ", i,sum );
			i++; // 증감 
		}while (i <=10);
		System.out.println("--------------------");
		System.out.println("1~10까지의 합=" + sum);

	}

}
