package com.javateam.jse;

public class JavaEx12 {

	public static void main(String[] args) {
		
		// int result = 1 + 2 * 3; // 7 : *�� + ���� �켱������ ����
		int result = (1+2)*3; // 9 : ()�� �̿��� �켱���� ����
		// int result = -(1+2)*3; // -9
		// int result = --(1+2)*3; // (X)

		System.out.println("result : " + result);
		
		// ���ڿ� : "" ����Ѵ�, '' �ȵ� ,
		String str = "java"; 
		String str1 = "java"; 
		// String str2 = new String("java");
		
		// + : ��ȣ(���), ����, ����, ����(����)
		str = str + 1; // ����(X), ����(����)���� : concatnation
		System.out.println("str : " + str); // java1 ���
		
		str = str.concat("python"); // ���� (�޼��� Ȱ��)
		System.out.println("str : " + str); // java1python ���
		
		str1 = 1 + 2 + "java" + 3 + 4; // ���� ���� �� ���ڿ��� ���� ���� ���� 
		System.out.println("str1 : " + str1); // 3java34 ���
		
		// ----------------------------------------
		
		// * 3�� ������
		// <���� ���>
		int num1 = 2;
		int num2 = 4;
		int result2 = 0;
		
		if(num1 > num2) { // (true OR false) ������ �־���Ѵ�
			result2 = 1;
		} else {
			result2 =0;
		}
		System.out.println("result2 : " + result2); // 0 ���
		
		// <3�� ������ : ���ǹ��� �����ϰ� ���ش�>
		int result3 = num1 > num2 ? 1 : 0; // ������ ������ 1(true),�ƴϸ� 0(false)
		// ������ ������ ������ ���� �ؾ��Ѵ� => num1 > num2 ? 1 : 0; (X) 
		System.out.println("result3 : " + result3); // 0���
		
	}

}
