package com.javateam.jse;

public class Star9 {

	public static void main(String[] args) {

		for(int i=0; i<5;i++) { // i�� 0���� 5���� 1�� �����ϸ鼭 �ݺ��Ѵ� -> �ݺ�Ƚ��
			for(int j=8;j>i*2; j--) { // j�� 8���� i*2�� �� ���� 1�� �����ϸ鼭 �ݺ��Ѵ�
				System.out.print(" ");
			}
			for(int k = 0; k<=i*4; k++) { // k�� 0���� i*4�� �� ���� 1�� �����ϸ鼭 �ݺ��Ѵ�
				System.out.print("*");
			}System.out.println();
			
		}
		for(int i=1;i<5;i++) { // i�� 1���� 5���� 1�� �����ϸ鼭 �ݺ��Ѵ� -> �ݺ�Ƚ��
			for(int j=i*4; j>i*2; j--) { //j�� i*4���� i*2�� �� ���� 1�� �����ϸ鼭 �ݺ��Ѵ�
				System.out.print(" ");
			}//System.out.println();
			for(int k = 16; k>=i*4;k--) { // k�� 16���� i*4�� ������ 1�� �����ϸ鼭 �ݺ��Ѵ�
				System.out.print("*");
			}System.out.println();
		}
		
		// ����� ���

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
