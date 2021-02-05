package com.javateam.jse;

import java.util.Scanner;

public class TimesTable2 {
	
static int inputNum() {
		
		int result = 0;
		Scanner sc = null;
		int input = 0;
		
		while (true) {

			sc = new Scanner(System.in);
			System.out.print("입력 : ");
			
			try {
				input = sc.nextInt();
				
				// 올바르게 입력되었으면 입력 종료
				if (input >= 2 && input <= 9) {
					result = input;
					return result;
				} else {
					System.out.println("2~9사이의 숫자를 입력하십시오.");
				}
				
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");	
			} // 
			
		} //
		
	}
	
	static int inputNum(String exit) {
		
		int result = 0;
		Scanner sc = new Scanner(System.in);
		String input = "";
		
		while (true) {

			sc = new Scanner(System.in);
			System.out.print("입력 : ");
			
			try {
				input = sc.nextLine();
				
				if (input.equals(exit)) {
					System.out.println("입력을 종료합니다.");
					result = -1; 
					return result;
				} 
				
				int num = Integer.parseInt(input); 
				
				// 올바르게 입력되었으면 입력 종료
				if (num >= 2 && num <= 9) {
					result = num;
					return result;
				} else {
					System.out.println("2~9사이의 숫자를 입력하십시오.");
				}
				
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");	
			} // 

		} //

	}
	
	public static void main(String[] args) {
		
		int num = inputNum();
		System.out.println("num : " + num);
		
	}

} // class