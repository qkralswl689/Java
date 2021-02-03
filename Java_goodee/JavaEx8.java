package com.javatean.jse;

public class JavaEx8 {

	public static void main(String[] args) {
		
		float num1 = 3.14F; // float 는 값 뒤에 F(f)를 기입해야한다 => 기입X : double타입
		int num2 = (int)num1; // float -> int 형변환
		
		System.out.println("num2 : " + num2);
		// 소숫점 뒤의 값은 생략된다 : 정수 부분만 나온다
		
		num1 = num2; // int -> float
		System.out.println("num1 : " + num1); // 실수 표시가 된다
		
// --------------------------------------------------------------------
		
		String str = "123";
		
		// String str = "abcd" 
		// => (X) java.lang.NumberFormatException 예외(exception) 발생
		
		// int num3 = (int)str; (X) 형변환이 되지 않는다
		
		// * 형변환(casting) 메서드(함수)
		// String(정수 성분의 문자열에 국한(한정)한다) => 정수(int)로 변환
		int num3 = Integer.parseInt(str) + 1;
		// String => int (변환과정) - 가장 많이 사용한다 (변환과정이 짧다)
		System.out.println("num3 : " + num3);
		
		int num4 = Integer.valueOf(str) + 1; 
		// String => Integer => int (변환과정)
		System.out.println("num4 : " + num4);
		
		int num5 = new Integer(str) + 1; 
		// String => Integer => int (변환과정)
		System.out.println("num5 : " + num5);
		
		// int <=> Integer : 가본 자료형과 기본 자료형의 랩퍼 클래스간에는 자동 형병환이 된다
		// 오토-박싱(aut-boxing) : 기본 자료형 => 기본 자료형의 랩퍼 클래스로 변환 되는것
		// 언박싱(unboxing) : 기본 자료형의 랩퍼 클래스  => 기본 자료형 으로 변한 되는것
		// box => 클래스(class) 상징한다
		
// ---------------------------------
		int num6 = 4 / 3; // 정수(몫)
		System.out.println("num6 : " + num6);

		float num7 = 4 / 3; // 정수 부분만 있는 실수(몫)
		System.out.println("num7 : " + num7);

		float num8 = (float)4 / 3; // 정수  + 소수부 => 실수(몫)
		System.out.println("num8 : " + num8);

		float num9 = (float)4 / (float)3;// 정수  + 소수부 => 실수(몫)
		System.out.println("num9 : " + num9);

	}

}
