package com.javateam.jse;

public class JavaEx21 {

	public static void main(String[] args) {
		
		int sum = 0; // �հ�
		int i = 1; // ī����(��� ����)
		do {
						// �հ� ����
			sum += i ;
			System.out.printf("1~%d������ �� = %d%n ", i,sum );
			i++; // ���� 
		}while (i <=10);
		System.out.println("--------------------");
		System.out.println("1~10������ ��=" + sum);

	}

}
