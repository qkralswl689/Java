package com.javateam.jse;

public class JavaEx20 {

	public static void main(String[] args) {
		
		int sum = 0; // �հ�
		int i = 10; // ī����(��� ����)
		while(i>=1) {
			
			// �հ� ����
			sum += i ;
			System.out.printf("1~%d������ �� = %d%n ", i,sum );
			i--; // ���� 
		}
		System.out.println("--------------------");
		System.out.println("1~10������ ��=" + sum);

	}

}
