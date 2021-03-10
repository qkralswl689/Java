package com.javateam.jse;

import java.util.Scanner;

public class Excersise_25 {

	public static void main(String[] args) {
		// n~m단까지 구구단 출력
		// n<m, 2~9 사이 입력되도록 조치 
		Scanner sc = new Scanner(System.in);

		System.out.print("시작단 입력 : ");
		int n = sc.nextInt();

		System.out.print("끝단 입력 : ");
		int m = sc.nextInt();
		
		if(n<m && n >=2 && n <=9 && m >=2 && m <=9) {
			for(int i = n; i<=m;i++) {
				for(int j=1; j<=9; j++) {
					System.out.printf("%d X %d = %d%n",i,j,i*j);
				}System.out.println("--------------");
			}
		}else {
			System.out.println("입력이 틀렸습니다");
		}
			
			
		}
	}


