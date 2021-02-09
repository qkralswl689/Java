package com.javateam.jse;

// public class DemoClass extends Singleton { // final , private가 걸려있으면 상속이 안된다

public class DemoClass  { 

	
	 public static void main(String[] args) { // (X)
		 
		// 싱클턴 객체 생성
		// Singleton obj = new Singleton();
		Singleton obj = Singleton.getInstance(); // (O)
		
		obj.demoMethod();
	}

}
