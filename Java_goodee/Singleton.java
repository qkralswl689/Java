package com.javateam.jse;

// 싱글턴(독신자) 디자인 패턴: 생성 패턴의 일종 : GoF 디자인 패턴
final public class Singleton { // 상속 금지 클래스(보안)
	
	private static Singleton instance = null;
	
	// Singleton obj = new Singleton(); // 싱클턴 패턴 적용 (X)
	
	// 생성자 => private (캡슐화)
	private Singleton() {
		
	}
	
	// 대체 생성자 메서드 => 간접 인스턴스 생성
	public static final Singleton getInstance() { 
		
		if(instance == null) {
			instance = new Singleton();
		}
				
		return instance;
		
	}
	
	void demoMethod() {
		
	}

}
