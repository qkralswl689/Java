package com.javateam.jse;

public class JavaEx30 {

	public static void main(String[] args) {
		
		// �迭�� ���� �ʱ�ȭ
		int arr[] = {1,2,3,4,5}; // (O)
//		int arr[5] = {1,2,3,4,5}; // (X)
//		int arr[] = new int[] {1,2,3,4,5}; // (O)
//		int arr[] = new int[5] {1,2,3,4,5}; // (X)
		
		arr[0] = 10;
		for(int n : arr) {
			System.out.print(n + " ");
		}


	}

}
