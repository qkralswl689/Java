package com.javateam.jse;

public class star_5 {

	public static void main(String[] args) {
		
		for(int i=1; i<=5; i++) {
			for(int j=1;j<i; j++) {
				System.out.print(" ");
			}
			
			for(int j=(2*i)-1; j<=9; j++) {
				System.out.print("*");
			}System.out.println();
		}
	
		
		// 강사님 답

//		for (int i=0; i<=4; i++) {
//
//			// 한줄 시작
//			// 공백 인쇄
//			for (int j=0; j<i; j++) {
//				System.out.print(' ');
//			} //
//
//			// 별 인쇄
//			for (int j=2*(4-i); j>=0; j--) {
//				System.out.print('*');
//			} //
//
//			System.out.println();
//			// 한줄 끝
		}
	}


