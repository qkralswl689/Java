package com.javateam.jse;

public class JavaEx12 {

	public static void main(String[] args) {
		
		// int result = 1 + 2 * 3; // 7 : *가 + 보다 우선순위가 높다
		int result = (1+2)*3; // 9 : ()를 이용해 우선순위 지정
		// int result = -(1+2)*3; // -9
		// int result = --(1+2)*3; // (X)

		System.out.println("result : " + result);
		
		// 문자열 : "" 써야한다, '' 안됨 ,
		String str = "java"; 
		String str1 = "java"; 
		// String str2 = new String("java");
		
		// + : 부호(양수), 덧셈, 연결, 덧셈(단항)
		str = str + 1; // 덧셈(X), 연결(병합)연산 : concatnation
		System.out.println("str : " + str); // java1 출력
		
		str = str.concat("python"); // 연결 (메서드 활용)
		System.out.println("str : " + str); // java1python 출력
		
		str1 = 1 + 2 + "java" + 3 + 4; // 덧셈 연산 후 문자열을 만나 연결 연산 
		System.out.println("str1 : " + str1); // 3java34 출력
		
		// ----------------------------------------
		
		// * 3항 연산자
		// <기존 계산>
		int num1 = 2;
		int num2 = 4;
		int result2 = 0;
		
		if(num1 > num2) { // (true OR false) 조건을 넣어야한다
			result2 = 1;
		} else {
			result2 =0;
		}
		System.out.println("result2 : " + result2); // 0 출력
		
		// <3항 연산자 : 조건문을 간단하게 해준다>
		int result3 = num1 > num2 ? 1 : 0; // 조건이 맞으면 1(true),아니면 0(false)
		// 좌측에 대입할 변수가 존재 해야한다 => num1 > num2 ? 1 : 0; (X) 
		System.out.println("result3 : " + result3); // 0출력
		
	}

}
