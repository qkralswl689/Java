package com.javateam.jse;

public class JavaEx19 {

	public static void main(String[] args) {
		
		// while(false) { // unreachable code(dead code)
		// while(true) { // ���� �ݺ���(infinite loop)
		//for (;;) { // ���� �ݺ���(infinite loop)
		
		int sum = 0; // �հ�
		int i = 1; // ī����(��� ����)
		while(i<=10) {
			
			// �հ� ����
			sum += i ;
			System.out.printf("1~%d������ �� = %d%n ", i,sum );
			i++; // ���� 
		}
		System.out.println("--------------------");
		System.out.println("1~10������ ��=" + sum);

	}

}
