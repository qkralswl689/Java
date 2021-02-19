package com.javateam.jse;

public class JavaEx40 {

	public static void main(String[] args) {
		
		String str = "java";
		// 자바 : 문자열 + 다른 자료형의 리터럴(값) => 문자열
		
		// str = str + 1.0 +1 +'c';
		
		str = str +String.valueOf(1.0)+String.valueOf(1) +String.valueOf('c');
		// 

			
		str = 1 + "";
		System.out.println(str);
	}

}
