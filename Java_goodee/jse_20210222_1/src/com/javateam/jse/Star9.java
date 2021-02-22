package com.javateam.jse;

public class Star9 {

	public static void main(String[] args) {

		for(int i=0; i<5;i++) { // i는 0부터 5까지 1씩 증가하면서 반복한다 -> 반복횟수
			for(int j=8;j>i*2; j--) { // j는 8부터 i*2의 값 까지 1씩 감소하면서 반복한다
				System.out.print(" ");
			}
			for(int k = 0; k<=i*4; k++) { // k는 0부터 i*4의 값 까지 1씩 증가하면서 반복한다
				System.out.print("*");
			}System.out.println();
			
		}
		for(int i=1;i<5;i++) { // i는 1부터 5까지 1씩 증가하면서 반복한다 -> 반복횟수
			for(int j=i*4; j>i*2; j--) { //j는 i*4부터 i*2의 값 까지 1씩 감소하면서 반복한다
				System.out.print(" ");
			}//System.out.println();
			for(int k = 16; k>=i*4;k--) { // k는 16부터 i*4의 값까지 1씩 감소하면서 반복한다
				System.out.print("*");
			}System.out.println();
		}
		
		// 강사님 답안

// public class Star9 {
//	
//	public static void drawTriangle(int i) {
//        System.out.print(String.format("%" + (9-2*i) + "s", "-").replace("-", ""));
//        System.out.print(String.format("%" + (4*i+1) + "c%n", '*').replace(" ", "*"));
//    }
//		for (int i=0; i<=4; i++) {
//			 
//            // for (int j=0; j<(5-i)*2-2; j++)
//            // for (int j=0; j<8-2*i; j++)
//            for (int j=0; j<=7-2*i; j++)
//                System.out.print(' ');
// 
//            // for (int j=0; j<((i+1)*4)-3; j++)
//            // for (int j=0; j<4*i+1; j++)
//            for (int j=0; j<=4*i; j++)
//                System.out.print('*');
// 
//            System.out.println();
//        } //
// 
//        for (int i=3; i>=0; i--) {
// 
//            // for (int j=(5-i)*2-2; j>0; j--)
//            for (int j=8-2*i; j>0; j--)
//                System.out.print(' ');
// 
//            // for (int j=((i+1)*4)-3; j>0; j--)
//            for (int j=((i+1)*4)-3; j>0; j--)
//                System.out.print('*');
// 
//            System.out.println();
//        } //
//        
//        ///////////////////////////////////////////
//        
//        for (int i=0; i<=3; i++) {
//            System.out.print(String.format("%" + (9-2*i) + "s", "-").replace("-", ""));
//            System.out.print(String.format("%" + (4*i+1) + "c%n", '*').replace(" ", "*"));
//        } //
// 
//        for (int i=4; i>=0; i--) {
//            System.out.print(String.format("%" + (9-2*i) + "s", "-").replace("-", ""));
//            System.out.print(String.format("%" + (4*i+1) + "c%n", '*').replace(" ", "*"));
//        } //
//        
//        ///////////////////////////////////////////
//        
//        for (int i=0; i<=3; i++)
//            drawTriangle(i);
//        
//        for (int i=4; i>=0; i--)
//            drawTriangle(i);
//        
//        ///////////////////////////////////////////
//        
//        for (int i=0; i<=3; i++) drawTriangle(i);
//        for (int i=4; i>=0; i--) drawTriangle(i);
        
		
	}

}
