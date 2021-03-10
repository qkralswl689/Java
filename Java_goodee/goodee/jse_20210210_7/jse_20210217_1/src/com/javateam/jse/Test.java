package com.javateam.jse;

// import com.javateam.jse.OuterClass.InnerClass; // 1)
// import com.javateam.jse.OuterClass.*; // 2)
// import com.javateam.jse.OuterClass; // 3)
import com.javateam.jse.*; //4)


public class Test {

	public static void main(String[] args) {
		
		// InnerClass 호출		
		
		// InnerClass inner = new InnerClass(); // (X)
		// InnerClass inner = new OuterClass().new InnerClass(); //import 1,2) (O), 3,4) (X)
		 OuterClass.InnerClass inner = new OuterClass().new InnerClass(); // import 1,2,3,4) (O)
		 
		// InnerClass.OuterClass inner = new InnerClass().new OuterClass(); // (X)
		 
		 inner.name = "자바";
		 inner.print();
		
	}

}
