package com.javateam.jse;

public class JavaEx27 {

	public static void main(String[] args) {
		
		// 가로줄
//		for(int i=1; i<=5; i++) {
//			System.out.print("*");
//		}
//		
//		// 세로줄
//		for(int i=1; i<=5; i++) {
//			System.out.println("*");
//		}
		
//		// 정사각형
//		for(int i =1; i<=5; i++) { // 행의 갯수
//			
//			for(int j =1; j<=5; j++) { 
//				System.out.print("* ");
//			} // 열의 갯수
//			System.out.println();
//		}
		
		// 평행사변형
		for(int i =1; i<=5; i++) { // 행의 갯수
			
			// 공백 인쇄
//			for(int j=1; j<=2*(5-i); j++) { // 기울기 추가 적용 (2배)
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			// 별 인쇄
			for(int j =1; j<=5; j++) { 
				System.out.print("*");
			} // 열의 갯수
			System.out.println();
		}

	}

}
