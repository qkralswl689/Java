package com.javateam.jse;

 import com.javateam.jse.OuterClass2.StaticClass; // 1)
// import com.javateam.jse.OuterClass2.*; // 2)
// import com.javateam.jse.*; // 3)


public class Test2 {

	public static void main(String[] args) {
		
		//StaticClass sClass = new StaticClass(); // import 1,2) (O)
		// OuterClass2.StaticClass sClass = new OuterClass2().new StaticClass(); // import 3) (X)
		OuterClass2.StaticClass sClass = new StaticClass(); // import 1,2) (O) , 3) (X)
		// ���� ��� ��ø Ŭ������ new StaticClass() �� �Է��ص� �ȴ�
		
		// sClass.name = "�ڹ�"; // 1,2,3) (O)
		OuterClass2.StaticClass.name = "�ڹ�"; //���� �ʵ带 �����ٸ� ȣ���ϴ� ���, import 1,2,3) (O)
		// StaticClass.name = "�ڹ�"; // ���� �ʵ带 �����ٸ� ȣ���ϴ� ���, import 1,2) (O), 3) (X)
		// sClass.print(); // �ܺ� Ŭ������ ȣ����� �ʴ´�
		OuterClass2.StaticClass.print();
	}

}
