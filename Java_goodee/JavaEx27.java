package com.javateam.jse;

public class JavaEx27 {

	public static void main(String[] args) {
		
		// ������
//		for(int i=1; i<=5; i++) {
//			System.out.print("*");
//		}
//		
//		// ������
//		for(int i=1; i<=5; i++) {
//			System.out.println("*");
//		}
		
//		// ���簢��
//		for(int i =1; i<=5; i++) { // ���� ����
//			
//			for(int j =1; j<=5; j++) { 
//				System.out.print("* ");
//			} // ���� ����
//			System.out.println();
//		}
		
		// ����纯��
		for(int i =1; i<=5; i++) { // ���� ����
			
			// ���� �μ�
//			for(int j=1; j<=2*(5-i); j++) { // ���� �߰� ���� (2��)
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			// �� �μ�
			for(int j =1; j<=5; j++) { 
				System.out.print("*");
			} // ���� ����
			System.out.println();
		}

	}

}
