package com.javateam.jse;

public class JavaEx29 {

	public static void main(String[] args) {
		
		// int arr[10]; // C���� ���� �迭 ����,�Ҵ�
		//int *arr = (int *)malloc(sivwof10()); // C���� �����迭(������) ����,�Ҵ�
		
		// �迭���� ���� ���
		// new : ���� ���� �Ҵ�(allocation) ������ => heap(���� �޸� ����)�� �Ҵ�
//		int arr[]; = new int[10]; // 1)
//		int [] arr = new int[10]; // 2)
		int arr[];  // 3)
		arr = new int [10];
		arr = new int [5]; // ���Ҵ�
		
		System.out.println("arr �迭 ������ ũ�� : " + arr.length); // 5���(���Ҵ� �Ʊ� ������)
		
		arr[0] = 10; // arr�迭�� �ε��� 0�ڸ��� 10 �Է�
		arr[4] = 20; // arr�迭�� �ε��� 4�ڸ��� 20 �Է�

//		// �迭 ��ü ��ҵ��� ����
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i] + " "); // 10 0 0 0 20 ���
//		}
		
		// ���� for��(enhanced for loop, foreach)
		// �ε��� ���(X), ����(next) ��� �˻� ���(iterator(�ݺ���)���� ���)
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
	}

}
