package com.javateam.jse;

public class JavaEx18 {

	public static void main(String[] args) {

		// 1~10까지의 짝수합(순열/수열)
		/** 합계 */
		int sum = 0;
			
		for (int num = 10; num >= 1; num--) { 
			
			if(num%2 == 0) { // 짝수 1)
				sum += num;
				System.out.printf("1~%d까지의 짝수의 합 %d%n", num, sum); 
			}
//			if(num%2 == 1) { // 홀수2)
//				sum += num;
//				System.out.printf("1~%d까지의 홀수의 합 %d%n", num, sum); 
//			}
		
			
		} // for
		
		System.out.println("---------------");
		// System.out.println("1~10까지의 합 : " + sum);
//		System.out.println("1~10까지의 짝수의 합 : " + sum); 	// 1)
		System.out.println("1~10까지의 홀수의 합 : " + sum);  // 2)

		
	} //

} //