package com.javateam.jse;

public class JavaEx16 {

	public static void main(String[] args) {

		// 1~10������ ¦����(����/����)
		/** �հ� */
		int sum = 0;
			
		for (int num = 2; num <= 10; num += 2) { // 5-1)
			
			sum += num;
		
			System.out.printf("1~%d������ ¦���� �� %d%n", num, sum); // 5)
		} // for
		
		System.out.println("---------------");
		// System.out.println("1~10������ �� : " + sum);
		System.out.println("1~10������ ¦���� �� : " + sum); // 5)
		
	} //

} //