package com.javateam.jse;

import java.util.Scanner;

public class TimesTable4 {
	
	static int inputNum() {
		
		int result = 0;
		Scanner sc = null;
		int input = 0;
		
		while (true) {

			sc = new Scanner(System.in);
			System.out.print("�Է� : ");
			
			try {
				input = sc.nextInt();
				
				// �ùٸ��� �ԷµǾ����� �Է� ����
				if (input >= 2 && input <= 9) {
					result = input;
					return result;
				} else {
					System.out.println("2~9������ ���ڸ� �Է��Ͻʽÿ�.");
				}
				
			} catch (Exception e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");	
			} // 
			
		} //
		
	}
	
	public static void main(String[] args) {
		
		int startNum = inputNum();
		System.out.println("startNum : " + startNum);
		
		int endNum = inputNum();
		System.out.println("endNum : " + endNum);
		
		if (startNum >= endNum) {
			
			System.out.println("���۴��� ���ܺ��� ����� �˴ϴ�.");
			
		} else { // ����
			
			System.out.printf("%d~%d�� ���%n", startNum, endNum);
			
			// ������ ����/���
			for (int j = startNum; j <= endNum; j++) {
				
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d x %d = %d%n", 
									j, i, j * i);
				} // i
	
				System.out.println("----------");
			} // j
			
		} // ���۴��� ���ܺ��� ������ ����
		
	}

} // class