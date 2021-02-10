package com.javateam.jse;

import java.util.Scanner;

public class TimesTable3 {
	
	static int inputNum(String exit) {
		
		int result = 0;
		Scanner sc = new Scanner(System.in);
		String input = "";
		
		while (true) {

			sc = new Scanner(System.in);
			System.out.print("�Է� : ");
			
			try {
				input = sc.nextLine();
				
				if (input.equals(exit)) {
					System.out.println("�Է��� �����մϴ�.");
					result = -1; 
					return result;
				} 
				
				int num = Integer.parseInt(input); 
				
				// �ùٸ��� �ԷµǾ����� �Է� ����
				if (num >= 2 && num <= 9) {
					result = num;
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
		
		int startNum = inputNum("exit");
		System.out.println("startNum : " + startNum);
		
		int endNum = inputNum("exit");
		System.out.println("endNum : " + endNum);
		
		if (startNum == -1 || endNum == -1) {
		
			System.out.println("�������� �����մϴ�.");
			
		} else if (startNum >= endNum) {
			
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