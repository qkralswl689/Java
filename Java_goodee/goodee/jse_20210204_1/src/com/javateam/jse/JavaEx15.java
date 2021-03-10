package com.javateam.jse;

public class JavaEx15 {

	public static void main(String[] args) {

		// 1~10까지의 합(순열/수열)
		/** 합계 */
		int sum = 0;
		// int num = 1; // 증감(반복) 변수 : 카운터(counter), 계수변수 // 1,2,3,4)
		
		// for (int num = 1; num <= 10; num++) {
		// for (int num = 1; num <= 10; num = num + 2) { // 5)	
		for (int num = 1; num <= 10; num += 2) { // 5-1)
		// for (int num = 1; num <= 10; num = num + 1) {
		// for (int num = 1; num < 11; num += 1) {
		// for (; num <= 10; num++) { // 1)
		// for (; ; num++) { // 2)
		// for (;;) { // 3,4)
		
			// 합계 연산
			// sum = sum + num;
			sum += num; // 일반 경우, 5)
			
			// 2)
//			if (num <= 10) {
//				sum += num;
//				System.out.printf("1~%d까지의 합 %d%n", num, sum);
//			} else {
//				break;
//			}
			
			// 2-1)
//			if (num > 10) 
//				break;
//			else {
//				sum += num;
//				System.out.printf("1~%d까지의 합 %d%n", num, sum);
//			}

			// 3)
//			if (num <= 10) {
//				sum += num;
//				System.out.printf("1~%d까지의 합 %d%n", num, sum);
//				num++;
//			} else {
//				break;
//			}
			
			// 4)
//			if (num <= 10) {
//				sum += num++;
//				System.out.printf("1~%d까지의 합 %d%n", num-1, sum);
//				// num++;
//			} else {
//				break;
//			}
			
			// System.out.printf("1~%d까지의 합 %d%n", num, sum); // 일반 경우
			System.out.printf("1~%d까지의 홀수의 합 %d%n", num, sum); // 5)
		} // for
		
		System.out.println("---------------");
		// System.out.println("1~10까지의 합 : " + sum);
		System.out.println("1~10까지의 홀수의 합 : " + sum); // 5)
		
	} //

} //