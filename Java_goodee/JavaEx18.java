package com.javateam.jse;

public class JavaEx18 {

	public static void main(String[] args) {

		// 1~10������ ¦����(����/����)
		/** �հ� */
		int sum = 0;
			
		for (int num = 10; num >= 1; num--) { 
			
			if(num%2 == 0) { // ¦�� 1)
				sum += num;
				System.out.printf("1~%d������ ¦���� �� %d%n", num, sum); 
			}
//			if(num%2 == 1) { // Ȧ��2)
//				sum += num;
//				System.out.printf("1~%d������ Ȧ���� �� %d%n", num, sum); 
//			}
		
			
		} // for
		
		System.out.println("---------------");
		// System.out.println("1~10������ �� : " + sum);
//		System.out.println("1~10������ ¦���� �� : " + sum); 	// 1)
		System.out.println("1~10������ Ȧ���� �� : " + sum);  // 2)

		
	} //

} //