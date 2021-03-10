package com.javateam.jse;

import java.io.UnsupportedEncodingException;

public class JavaEx41 {

	public static void main(String[] args) 
			throws UnsupportedEncodingException { 

		char chArr[] = {'a','b','c','d'};
		
		// 문자의 배열 -> 문자열 로 치환
		String str = new String(chArr);
		//System.out.println(str);
		
		// 문자열 -> 문자의 배열로 치환
//		char chArr2[] = str.toCharArray();
//		for(char c : chArr2) { // for-each 문으로 문자열 나누기
//			System.out.println(c);
//		}
		
		//  byte 형변환
		// byte chArr3[] = str.getBytes();
		// byte chArr3[] = str.getBytes("UTF-8"); // throws 처리 
		
		byte chArr3[] = "한글입니다".getBytes("UTF-8"); 
		// 한글 : 2byte ->getByte : 1byte로 분해 => 글자 깨져서 출력된다 
		// ** toCharArray(); 사용하면 잘 출력된다
//		for (byte b : chArr3) {
//			System.out.print((char)b + " ");
//		}
		
		// String 으로 변환해서 출력 
		//String str2 = new String(chArr3,"UTF-8");
		
		String str2 = new String(chArr3,"EUC-KR"); // 한글 깨져서 출력 => 인코딩(encoding) 방식의 미스매치

		System.out.println(str2);
	}

}
