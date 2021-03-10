package com.javateam.jse;

public class JavaEx13 {

	public static void main(String[] args) {
		
		// 비트연산
		int num1 = 10;
		int num2 = 20;
		int result = num1 & num2;
		
		System.out.println(Integer.toBinaryString(num1)); // 2진수로 바꿔준다 : 1010 출력
		System.out.println(Integer.toBinaryString(num2)); // 2진수로 바꿔준다 :10100 출력

		System.out.println("result : " + result); // 0 출력
		
		int result2 = num1 | num2;
		System.out.println("result2 : " + result2); // 30 출력
		
		int result3 = num1 ^ num2;
		System.out.println("result3 : " + result3); // 30 출력
		
		// 비트이동 (shift)
		int result4 = num1 >> 3; // 오른쪽으로 3 bit 이동
		System.out.println("result4 : " + result4); // 1 출력
		
		int result5 = num1 << 3; // 왼쪽 으로 3 bit 이동
		System.out.println("result5 : " + result5); // 80 출력
		
	}

}
