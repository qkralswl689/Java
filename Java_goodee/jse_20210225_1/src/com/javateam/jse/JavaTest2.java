package com.javateam.jse;

import java.util.Scanner;

import com.javateam.jse.CheckPrime;
import com.javateam.jse.CheckPrimeImpl;
public class JavaTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
//		int n = sc.nextInt();
		
		// 강사님 답안
		int num = sc.nextInt();
		CheckPrime obj = new CheckPrimeImpl(); // 객체생성
		String msg = obj.isPrimeNum(num) == true?
				"이다" : "가 아니다";
		System.out.printf("%d는 소수%s",num,msg);
		
		sc.close();
		

	}

}
