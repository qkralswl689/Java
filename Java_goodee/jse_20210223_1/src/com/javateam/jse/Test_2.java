package com.javateam.jse;

import java.util.Scanner;

public class Test_2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		char credit = 'F';
		
		credit = (score/10 == 9 ||score/10 == 10 ) ? 'A' :
				 (score/10 == 8) ? 'B' :
				 (score/10 == 7) ? 'C' :
				 (score/10 == 6) ? 'D' :
					 'F';
		System.out.println(score + "은(는) " + credit + "학점입니다.");
		sc.close();

	}

}
