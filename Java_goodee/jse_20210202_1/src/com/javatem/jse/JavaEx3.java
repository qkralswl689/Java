package com.javatem.jse;

public class JavaEx3 {

	public static void main(String[] args) {
		
		System.out.println("int의 범위 : " 
		+ Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE );
		// int의 최소값 ~ 최대값
		
		int num1 = 0x80000000; //16진수
		System.out.println("num1 : " + num1);
		// 10진수로 출력
		/* 4진수 : 표현하기에 너무 적어 빼버렸다
		   8진수 : 070
		   16진수 : 0X70
		   32진수 : 너무 복잡해서 빼버렸다 */
		
		String num2 = Integer.toBinaryString(num1);
		// 16진수를 2진수 문자열로 바꿔 출력
		System.out.println("num2 : " + num2);

		String num3 = Integer.toOctalString(num1);
		// 16진수를 8진수 문자열로 바꿔 출력
		System.out.println("num3 : " + num3);
		
		String num4 = Integer.toHexString(num1);
		// 16진수를 16진수 "문자열로" 바꿔 출력
		System.out.println("num4 : " + num4);
		
		/////////////////////////////////////////
		
		int num5 = 10;
		System.out.println("num5(5진수) : " + Integer.toBinaryString(num5));
		
		// int num6 = 0b1010; // B(b) = binary(2진수)
		int num6 = 0b1010; // 2진수
		System.out.println("num6(10진수) : " + num6);
		
		System.out.println("num7(8진수) : " + Integer.toOctalString(num5));
		int num7 = 012; // 8진수
		System.out.println("num7(10진수) : " + num7);
		
		System.out.println("num8(16진수) : " + Integer.toHexString(num5));
		int num8 = 0xa; // 16진수
		System.out.println("num8(16진수) : " + num8);

		
	}

}
