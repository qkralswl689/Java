package com.javateam.jse.test;

public class EqualsTest {

	public static void main(String[] args) {
		
		Object obj1 = new Object();// ��ü ����
		
		// Object obj2 = new Object(); // �ּ� �� ���ϸ� false�� ���
		 Object obj2 = obj1; // obj1�� obj2 �� �Ҵ� => �ּ� �� ���ϸ� true�� ���
		
		// ��ü�� �ּ�(����)�� ��
		System.out.println(obj1 == obj2);
		System.out.println(obj1.equals(obj2));

	}

}
