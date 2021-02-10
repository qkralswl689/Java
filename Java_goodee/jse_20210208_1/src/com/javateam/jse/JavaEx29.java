package com.javateam.jse;

public class JavaEx29 {

	public static void main(String[] args) {
		
		// int arr[10]; // C언어식 고정 배열 선언,할당
		//int *arr = (int *)malloc(sivwof10()); // C언어식 가변배열(포인터) 선언,할당
		
		// 배열변수 선언 방법
		// new : 동적 변수 할당(allocation) 연산자 => heap(자유 메모리 공간)에 할당
//		int arr[]; = new int[10]; // 1)
//		int [] arr = new int[10]; // 2)
		int arr[];  // 3)
		arr = new int [10];
		arr = new int [5]; // 재할당
		
		System.out.println("arr 배열 변수의 크기 : " + arr.length); // 5출력(재할당 됐기 때문에)
		
		arr[0] = 10; // arr배열의 인덱스 0자리에 10 입력
		arr[4] = 20; // arr배열의 인덱스 4자리에 20 입력

//		// 배열 전체 요소들을 나열
//		for(int i=0; i<arr.length; i++) {
//			System.out.print(arr[i] + " "); // 10 0 0 0 20 출력
//		}
		
		// 향상된 for문(enhanced for loop, foreach)
		// 인덱스 사용(X), 다음(next) 요소 검색 방식(iterator(반복자)패턴 방식)
		for(int n : arr) {
			System.out.print(n + " ");
		}
		
	}

}
