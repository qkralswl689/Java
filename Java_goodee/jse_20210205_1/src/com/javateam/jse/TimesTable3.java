package com.javateam.jse;

import java.util.Scanner;

public class TimesTable3 {
	
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
		
		int startNum = inputNum("exit");
		System.out.println("startNum : " + startNum);
		
		int endNum = inputNum("exit");
		System.out.println("endNum : " + endNum);
		
		if (startNum == -1 || endNum == -1) {
		
			System.out.println("구구단을 종료합니다.");
			
		} else if (startNum >= endNum) {
			
			System.out.println("시작단이 끝단보다 적어야 됩니다.");
			
		} else { // 정상
			
			System.out.printf("%d~%d단 출력%n", startNum, endNum);
			
			// 구구단 연산/출력
			for (int j = startNum; j <= endNum; j++) {
				
				for (int i = 1; i <= 9; i++) {
					System.out.printf("%d x %d = %d%n", 
									j, i, j * i);
				} // i
	
				System.out.println("----------");
			} // j
			
		} // 시작단이 끝단보다 적은지 점검
		
	}

} // class