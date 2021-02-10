package com.javateam.jse;

import java.util.*;

public class JavaEx22 {

	public static void main(String[] args) {
		
		// 구구단 (times table, multiplication table)
		
		// 단 입력
		System.out.println("단 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(num + "단 출력");
		
		// 연산
		for(int i=1; i<=9; i++) {
			
			System.out.printf("%d X  %d = %d%n",num, i,num*i);
		
		}
		
		sc.close();

	}

}
