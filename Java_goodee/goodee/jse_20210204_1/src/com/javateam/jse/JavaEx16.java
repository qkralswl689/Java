package com.javateam.jse;

public class JavaEx16 {

	public static void main(String[] args) {

		// 1~10까지의 짝수합(순열/수열)
		/** 합계 */
		int sum = 0;
			
		for (int num = 2; num <= 10; num += 2) { // 5-1)
			
			sum += num;
		
			System.out.printf("1~%d까지의 짝수의 합 %d%n", num, sum); // 5)
		} // for
		
		System.out.println("---------------");
		// System.out.println("1~10까지의 합 : " + sum);
		System.out.println("1~10까지의 짝수의 합 : " + sum); // 5)
		
	} //

} //