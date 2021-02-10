package com.javateam.jse;

public class DemoClass {
	
	// 멤버 = 멤버 필드  + 멤버 메서드
	// 멤버 필드(변수) : member field(variable)
	String name;
	
	// 멤버 메소드(객체 함수) : member method(objective function)
	
	// 생성자(구축자:constructor) : 클래스와 동명의 메서드 => 특수 목적 메서드(모성의 역할)
	DemoClass(){
		System.out.println("생성자");
	}
	
	// 인스턴스 멤버 메서드(instance member method)
	void print() {
		
	}
	
	// 정적 멤버 메서드(static member method)
//	static void staticMethod() {
//		
//	}
	
	// 인스턴스 블럭(instance block) : 인스턴스(객체) 생성시에만 호출
	{
		System.out.println("인스턴스 블럭");
	}
	
	// 정적 블럭(static block) : 가장 우선적으로 호출
	static {
		System.out.println("정적 블럭");
	}	
	
	// main 메서드(정적메서드) : 특수 목적(테스트/실행용)
	public static void main(String[] args) {
		
		System.out.println("main 메서드");
		// obj : (협의의:좁은 의미의)객체(인스턴스:instance)
		DemoClass obj = new DemoClass();
		System.out.println(obj.name); 
	
	}

}
