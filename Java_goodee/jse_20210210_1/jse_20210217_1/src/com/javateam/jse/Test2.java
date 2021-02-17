package com.javateam.jse;

 import com.javateam.jse.OuterClass2.StaticClass; // 1)
// import com.javateam.jse.OuterClass2.*; // 2)
// import com.javateam.jse.*; // 3)


public class Test2 {

	public static void main(String[] args) {
		
		//StaticClass sClass = new StaticClass(); // import 1,2) (O)
		// OuterClass2.StaticClass sClass = new OuterClass2().new StaticClass(); // import 3) (X)
		OuterClass2.StaticClass sClass = new StaticClass(); // import 1,2) (O) , 3) (X)
		// 정적 멤버 중첩 클래스는 new StaticClass() 만 입력해도 된다
		
		// sClass.name = "자바"; // 1,2,3) (O)
		OuterClass2.StaticClass.name = "자바"; //정적 필드를 가진다면 호출하는 방법, import 1,2,3) (O)
		// StaticClass.name = "자바"; // 정적 필드를 가진다면 호출하는 방법, import 1,2) (O), 3) (X)
		// sClass.print(); // 외부 클래스는 호출되지 않는다
		OuterClass2.StaticClass.print();
	}

}
