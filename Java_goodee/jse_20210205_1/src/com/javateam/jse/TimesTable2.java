package com.javateam.jse;

import java.util.Scanner;

public class TimesTable2 {
	
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
		
		int num = inputNum();
		System.out.println("num : " + num);
		
	}

} // class