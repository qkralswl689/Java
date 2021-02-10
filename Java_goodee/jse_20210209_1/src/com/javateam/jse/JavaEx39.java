package com.javateam.jse;

public class JavaEx39 {
	
	// final String name = "java"; // 캡슐화
	
	// static final String LANG_NAME = "java"; // static 으로 선언, 대문자로 사용하는것이 좋다 (O)
	 final static String LANG_NAME = "java"; // static 으로 선언, 대문자로 사용하는것이 좋다 (O)
	
	void userFinal() {
		
		// this.name = "python"; //재대입(재할당) 불가 
		// JavaEx39.LANG_NAME = "python"; //재대입(재할당) 불가 
		
	}

	public static void main(String[] args) {
		
		System.out.println(JavaEx39.LANG_NAME);

	}

}
