package com.javateam.jse;

public class OuterClass2 {
	// �ܺ� Ŭ������ static ��� �ȵȴ�
// public static class OuterClass2 { // (X)

	// ������
	public OuterClass2() {
		System.out.println("�ܺ� Ŭ���� ������");
	}
	// has-A(���) ����
	// ���� ��� ����(��ø) Ŭ����
	protected static class StaticClass {
		
		// �ʵ�
		// String name;
		static String name; // ���� �ʵ带 �����ٸ�?
		
		// ������
		protected StaticClass() {
			System.out.println("���� ���� Ŭ������ ������");
		}
		
		// �޼���
		static void print() {
			System.out.println("���� ���� Ŭ������ print");
		}
	}
}
