package com.javateam.jse;

public class JavaEx11 {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 1;
		// num1 = num1 + 1;
		// num1 += 1; // ���� �İ� ��(����)
		// num1++; // ���� �İ� ��(����)
		// ++num1; // ���� �İ� ��(����)
		// ++num1++; (X)
		
		// ����
		System.out.println("num1 : " + num1++); // 1 => ���߿� ���Ѵ� : �ػ� ���� ���������� 2�� �ȴ�
		System.out.println("num1 : " + ++num2); // 2 => ���� ���Ѵ� : ���� ���������� ���� ���ȴ�
		
		System.out.println("------------------ ");

		System.out.println("num1 : " + num1++); // 2 => ���� �Ŀ��� + �߱� ������ 2�� ��µȴ�
		System.out.println("num1 : " + ++num2); // 3

	}

}
