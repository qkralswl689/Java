package kasan;

// ���� ���ü�(access visibility) : ���� �����ڷ�  ����
// ĸ��ȭ(encapsulation) : ����
import guro.Test1;

public class Test2 extends Test1{ // extends => ���
	
	Test1 test1;
	
	 // String name = new Test1().name; // protected �� ��� (X)
	  // String name = super.name; // protected �� ��� (O)
	  //String name1 = name; // ���ƻ� super.name�� ������ �ǹ� �̴�
	  String name1 = super.name; // ��(name1)�� ���� �ǹ��̴�.
	  // protected : ��� ���谡 ���� ��� �ٸ� ��Ű������ ���� ���� �ϴ�
	  // ����) this : �ڱ� �ڽ��� ��ü Ű����
	  // this() : �ڱ� �ڽ���(�⺻) ������
	  // super : �θ� Ŭ������ ��ü Ű����
	  // super() : �θ� Ŭ������ (�⺻) ������
}
