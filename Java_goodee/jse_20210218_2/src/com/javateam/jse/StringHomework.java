package com.javateam.jse;

public class StringHomework {

	public static void main(String[] args) {
		
		String str = "Just do IT! Java Developer!";
		
		String[] arr = str.split(" "); // ���ڿ��� " " ������ �������� ���� �и��Ͽ� �迭 arr�� �Ҵ�
		for(int i=0; i<arr.length;i++) { // i��0���� �迭�� ���̸�ŭ 1�� �����ϸ鼭 �ݺ��Ѵ�
			System.out.println(arr[i]); // �迭�� ����Ѵ�
		}
		
	}

}
