package com.javateam.jse;

public class OuterClass {
	
	InnerClass inner; // has-a 관계 선언
	// has-A(멤버) 관계
	// 내부 클래스(inner class),중첩 클래스(nested class)
	// 인스턴스 멤버 내부(중첩) 클래스
	public class InnerClass{ // 접근 제한자(protected)사용 가능
		
		String name;
		
		// 생성자
		public InnerClass(){
			System.out.println("내부 클래스의 생성자");
		}
		
		// 메소드
		void print() {
			System.out.println("내부 클래스의 print");
		}
		
	}
	
	// 외부 클래스 생성자
	public OuterClass() {
		System.out.println("외부 클래스의 생성자");
	}

}
