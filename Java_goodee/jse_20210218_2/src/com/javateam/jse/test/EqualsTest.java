package com.javateam.jse.test;

public class EqualsTest {

	public static void main(String[] args) {
		
		Object obj1 = new Object();// 객체 생성
		
		// Object obj2 = new Object(); // 주소 값 비교하면 false로 출력
		 Object obj2 = obj1; // obj1을 obj2 에 할당 => 주소 값 비교하면 true로 출력
		
		// 객체의 주소(고유)값 비교
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));

	}

}
