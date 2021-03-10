package com.javateam.jse;

public class OuterClass {
	
	InnerClass inner; // has-a ���� ����
	// has-A(���) ����
	// ���� Ŭ����(inner class),��ø Ŭ����(nested class)
	// �ν��Ͻ� ��� ����(��ø) Ŭ����
	public class InnerClass{ // ���� ������(protected)��� ����
		
		String name;
		
		// ������
		public InnerClass(){
			System.out.println("���� Ŭ������ ������");
		}
		
		// �޼ҵ�
		void print() {
			System.out.println("���� Ŭ������ print");
		}
		
	}
	
	// �ܺ� Ŭ���� ������
	public OuterClass() {
		System.out.println("�ܺ� Ŭ������ ������");
	}

}
