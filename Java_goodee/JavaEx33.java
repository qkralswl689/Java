package com.javateam.jse;

public class JavaEx33 {

	public static void main(String[] args) {
		
		// 2���� �迭�� �ʱ�ȭ		
//		int [][]arr = {{1,2},{3,4},{5,6}}; // (O)
//		int [][]arr = new int{{1,2},{3,4},{5,6}}; // (O)
//		int [][]arr; // (X)
//		arr = {{1,2},{3,4},{5,6}}; // (X)
//		int [][]arr = new int[3][2]{{1,2},{3,4},{5,6}}; // (X)

		// 2���� �迭�� ���� �Ҵ�
		int [][]arr = new int[3][]; // (O)
//		int [][]arr = new int[][]; // (X)
//		int [][]arr = new int[][3]; // (X)
		
		arr[0] = new int[5];
//		arr[1] = {1,2,3}; // (X)
		arr[1] = new int[3];
		arr[2] = new int[7];
		
		for(int[] arr2 : arr) {
			for(int n : arr2) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}

}
