package com.javateam.jse;

public class StringHomework {

	public static void main(String[] args) {
		
		String str = "Just do IT! Java Developer!";
		
		String[] arr = str.split(" "); // 문자열을 " " 공백을 기준으로 각각 분리하여 배열 arr에 할당
		for(int i=0; i<arr.length;i++) { // i는0부터 배열의 길이만큼 1씩 증가하면서 반복한다
			System.out.println(arr[i]); // 배열을 출력한다
		}
		
	}

}
