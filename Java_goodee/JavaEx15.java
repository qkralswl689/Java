package com.javateam.jse;

public class JavaEx15 {

	public static void main(String[] args) {

		// 1~10������ ��(����/����)
		/** �հ� */
		int sum = 0;
		// int num = 1; // ����(�ݺ�) ���� : ī����(counter), ������� // 1,2,3,4)
		
		// for (int num = 1; num <= 10; num++) {
		// for (int num = 1; num <= 10; num = num + 2) { // 5)	
		for (int num = 1; num <= 10; num += 2) { // 5-1)
		// for (int num = 1; num <= 10; num = num + 1) {
		// for (int num = 1; num < 11; num += 1) {
		// for (; num <= 10; num++) { // 1)
		// for (; ; num++) { // 2)
		// for (;;) { // 3,4)
		
			// �հ� ����
			// sum = sum + num;
			sum += num; // �Ϲ� ���, 5)
			
			// 2)
//			if (num <= 10) {
//				sum += num;
//				System.out.printf("1~%d������ �� %d%n", num, sum);
//			} else {
//				break;
//			}
			
			// 2-1)
//			if (num > 10) 
//				break;
//			else {
//				sum += num;
//				System.out.printf("1~%d������ �� %d%n", num, sum);
//			}

			// 3)
//			if (num <= 10) {
//				sum += num;
//				System.out.printf("1~%d������ �� %d%n", num, sum);
//				num++;
//			} else {
//				break;
//			}
			
			// 4)
//			if (num <= 10) {
//				sum += num++;
//				System.out.printf("1~%d������ �� %d%n", num-1, sum);
//				// num++;
//			} else {
//				break;
//			}
			
			// System.out.printf("1~%d������ �� %d%n", num, sum); // �Ϲ� ���
			System.out.printf("1~%d������ Ȧ���� �� %d%n", num, sum); // 5)
		} // for
		
		System.out.println("---------------");
		// System.out.println("1~10������ �� : " + sum);
		System.out.println("1~10������ Ȧ���� �� : " + sum); // 5)
		
	} //

} //