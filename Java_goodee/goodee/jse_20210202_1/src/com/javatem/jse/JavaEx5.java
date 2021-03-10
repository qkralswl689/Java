package com.javatem.jse;

public class JavaEx5 {

	public static void main(String[] args) {
		// 4byte 실수영(유리수형/부동소수형) : 대/소문자 구별 안한다
		float f1 = 0.12E-2F; // 0.12의 10의 -2승
		float f2 = 0.12E-2f; // 0.12의 10의 -2승
		float f3 = 0.12e-2f; // 0.12의 10의 -2승
		float f4 = 12e-4f; // 12의 10의 -4승
		
		System.out.println("f1 : " + f1);
		System.out.println("f2 : " + f2);
		System.out.println("f3 : " + f3);
		System.out.println("f4 : " + f4);
		System.out.println("-----------------------");
		double d1 = 0.12E-2;
		double d2 = 0.12E-2d;
		double d3 = 0.12E-2D;
		double d4 = 0.12E-2f; // float -> double 자동 치환(형변환)
		
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		System.out.println("d3 : " + d3);
		System.out.println("d4 : " + d4); 
		// 1~3) 0.0012
		// 4,5) 0.0012000000569969416 (주의) 부동소수점 연산의 모순!

	}

}
