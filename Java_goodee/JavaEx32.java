package com.javateam.jse;

public class JavaEx32 {

	public static void main(String[] args) {
		
		// 다차원 배열(array)
		
		// 선언
		int arr[][]; // 1)
//		int []arr[]; // 2)
//		int [][]arr; // 3)
		
		arr = new int [3][2];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[1][0] = 3;
		arr[1][1] = 4;
		arr[2][0] = 5;
		arr[2][1] = 6;
		
		System.out.println("2차원 배열의 크기(행의크기) : " + arr.length);
		System.out.println("2차원 배열의 요소의 갯수 : " + arr.length * arr[0].length);

//		// 전체 요소 나열
//		for(int i=0; i<arr.length; i++) {
//			for( int j =0; j<arr[i].length; j++) {
//				System.out.print(arr[i][j] + " ");
//			}
//			System.out.println();
//		}
//		
		// foreach
		
		for(int[] arr2 : arr) {
			for(int n : arr2) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}

}
