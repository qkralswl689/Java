package com.javateam.jse;

public class JavaEx42 {

	public static void main(String[] args) {

		// 문자열(정수 성분 내용) -> 정수로 형변환
		// 정수 성분이 아닌 문자열 => 정수로 형변활 할 경우 -> 예외 발생 : NumberFormatException
		String str = "123";
		int num ;
		
		// Integer : Wrapper Class
		num = Integer.parseInt(str); // (O) // String -> int (변환 순서) => 선호하는 방법 
		// num = new Integer(str); // (O) // String -> Integer -> int (변환 순서) : auto-unboxing
		// num = Integer.valueOf(str); //(O) // String -> Integer -> int (변환 순서) : auto-unboxing
		
		System.out.println("num : " + (num +1)); // 124 출력 => 형변환 확인을 위해 1을 더해봤음 

	}

}
