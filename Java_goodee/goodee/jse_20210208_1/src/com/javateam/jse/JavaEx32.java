package com.javateam.jse;

public class JavaEx32 {

	public static void main(String[] args) {
		
		// ������ �迭(array)
		
		// ����
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
		
		System.out.println("2���� �迭�� ũ��(����ũ��) : " + arr.length);
		System.out.println("2���� �迭�� ����� ���� : " + arr.length * arr[0].length);

//		// ��ü ��� ����
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
