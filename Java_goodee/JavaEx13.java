package com.javateam.jse;

public class JavaEx13 {

	public static void main(String[] args) {
		
		// ��Ʈ����
		int num1 = 10;
		int num2 = 20;
		int result = num1 & num2;
		
		System.out.println(Integer.toBinaryString(num1)); // 2������ �ٲ��ش� : 1010 ���
		System.out.println(Integer.toBinaryString(num2)); // 2������ �ٲ��ش� :10100 ���

		System.out.println("result : " + result); // 0 ���
		
		int result2 = num1 | num2;
		System.out.println("result2 : " + result2); // 30 ���
		
		int result3 = num1 ^ num2;
		System.out.println("result3 : " + result3); // 30 ���
		
		// ��Ʈ�̵� (shift)
		int result4 = num1 >> 3; // ���������� 3 bit �̵�
		System.out.println("result4 : " + result4); // 1 ���
		
		int result5 = num1 << 3; // ���� ���� 3 bit �̵�
		System.out.println("result5 : " + result5); // 80 ���
		
	}

}
