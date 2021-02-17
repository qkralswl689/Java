package com.javateam.jse;

public class OuterClass2 {
	// 외부 클래스에 static 사용 안된다
// public static class OuterClass2 { // (X)

	// 생성자
	public OuterClass2() {
		System.out.println("외부 클래스 생성자");
	}
	// has-A(멤버) 관계
	// 정적 멤버 내부(중첩) 클래스
	protected static class StaticClass {
		
		// 필드
		// String name;
		static String name; // 정적 필드를 가진다면?
		
		// 생성자
		protected StaticClass() {
			System.out.println("정적 내부 클래스의 생성자");
		}
		
		// 메서드
		static void print() {
			System.out.println("정적 내부 클래스의 print");
		}
	}
}
