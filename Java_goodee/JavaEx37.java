package com.javateam.jse;

// import java.lang.*; // 묵시적 선언이 가능하다 : java.lang(기본 패키지)

public class JavaEx37 { //  존재 하지만 코드에는 안나온다 => 투명인간
	
//public class JavaEx37 extends object{ // 묵시적 상속 : 모든 클래스의 조장 클래스는 object 클래스
	// 클래스 작성시 "extends object" 라는 표기를 한 것으로 간주된다
	
	String id;
	String name;
	StringBuilder address;
	int age;
	
	JavaEx37(){ //기본 생성자 : 인자가 없는 생성자 
		// 기본생성자는 기본 생성자 단독으로 존재할 경우 묵시적 정의가 가능하지만 
		// 다른생성자(오버로딩된 생성자)가 등장할 경우 사용시 명시적으로 정의 해야한다
		System.out.println("기본 생성자");
	}
	
	JavaEx37(String name){ // (인자가)오버로딩(over-loading)된 생성자
		//System.out.println("오버로딩된 생성자-1"); // (X) 
		// 생성자 호출시 생성자 앞에 다른 문장이 오면 안된다.
		// new JavaEx37(); // (X) 생성자 자체 호출 X => 익명 인스턴스 생성
		// JavaEx37(); (X)
		this(); // 기본생성자 호출 => 생성자 호출시 생성자 앞에 다른 문장이 오면 안된다.
		System.out.println("오버로딩된 생성자-1");
		this.name = name;
	}
	
	// 오버로딩(over-load-ing)
	// 메서드(생성자) 오버로딩 : 다형성
	// 인자부(매개변수부,인수부)에 변수(인자)의 자료형/갯수/순서에 변화를 주어
	// 같은 이름의 함수(메서드)를 다양하게 정의하는 방법
	
	JavaEx37(StringBuilder address){ // 자료형을 바꿔주는 오버로딩
		System.out.println("오버로딩된 생성자-2");
		this.address = address;
	}
	JavaEx37(StringBuilder address, String name){ // 순서를 바꿔 오버로딩
		this(name);
		System.out.println("오버로딩된 생성자-3");
		this.name = name;
		this.address = address;
	}
	
	JavaEx37(String name, StringBuilder address){ // 자료형의 갯수가 다른 오버로딩
		System.out.println("오버로딩된 생성자-4");
//		this.name = name;
		this.address = address;
	}
	
	public static void main(String[] args) {
		
//		JavaEx37 obj = new JavaEx37(); // 생성자
		
//		JavaEx37 obj2 = new JavaEx37("java");
//		JavaEx37 obj3 = new JavaEx37(new StringBuilder("금천구 가산"));
//		JavaEx37 obj4 = new JavaEx37("goodee",new StringBuilder("금천구 가산")); 
//		JavaEx37 obj5 = new JavaEx37(new StringBuilder("금천구 가산"),"java"); 
		
//		JavaEx37 obj = new JavaEx37("java");
//		obj = new JavaEx37("java");
//		obj = new JavaEx37(new StringBuilder("금천구 가산"));
//		obj = new JavaEx37("goodee",new StringBuilder("금천구 가산")); 
//		obj = new JavaEx37(new StringBuilder("금천구 가산"),"java"); 
		JavaEx37 obj = new JavaEx37(new StringBuilder("금천구 가산"),"java"); 

		System.out.println(obj.name);
//		System.out.println(obj2.name);
		System.out.println(obj.address);

//		System.out.println(obj); // 객체의 고유값 출력
		

	}

}
