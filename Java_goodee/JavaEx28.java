package com.javateam.jse;

public class JavaEx28 {

	public static void main(String[] args) {
		
//		int []arr = null;
//		int [] arr = new int[2];
//		arr[0] = 10;
//		System.out.println("arr[0] : " + arr[0]);
////////////////////////////////////////////////////
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
//		String str4 = new String("java"); // 1)
		String str4 = str3; // 2)
		
		// 값으로 비교
		System.out.println("str1 == str2 : " + (str1 == str2));
		// true
		
		// 주소값으로 비교
		System.out.println("str3 == str4 : " + (str3 == str4));
		// 1) false
		// 2) true
		
		// 주소값으로 비교
		System.out.println("str1 == str3 : " + (str1 == str3)); 
		// false
		
		// 언제나 값으로 비교
		System.out.println("str1.equals(str2) : " + str1.equals(str2));
		System.out.println("str1.equals(str3) : " + str1.equals(str3));
		System.out.println("str3.equals(str4) : " + str3.equals(str4));

		
		
//		System.out.println("str1 : " + str1);
//		System.out.println("str3 : " + str3);
//		
	}

}
