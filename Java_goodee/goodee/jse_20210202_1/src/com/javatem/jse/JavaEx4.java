package com.javatem.jse;

public class JavaEx4 {

	public static void main(String[] args) {
		
		char ch1 = 'a'; // (O)'' �궗�슜�빐�빞�븳�떎, "" �궗�슜遺덇�
		// char ch1 = "a".charAt(0); // �삎蹂��솚(casting) (O)
		// char ch1 = "a"; // (X) '' �궗�슜�빐�빞�븳�떎, "" �궗�슜遺덇�
		
		// ���엯�릺�뒗 媛�/�긽�닔(value, literal)
		System.out.println("ch1 : " + ch1);
		
		char ch2 =97; // �젙�닔 -> 臾몄옄 �옄�룞 移섑솚(�삎蹂��솚)
		// => ASCII 肄붾뱶 
		System.out.println(ch2);
		
		int num1 = 'a'; // 臾몄옄 -> �젙�닔 �옄�룞移섑솚(�삎蹂��솚)
		int num2 = '한';
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num2 : " + Integer.toHexString(num2)); 
		// 16吏꾩닔 : 0xd55c => �쑀�땲肄붾뱶 : https://www.unicode.org/charts/PDF/UAC00.pdf
		char num3 = '\ud55c';
		System.out.println("num3 : " + num3);
		String str = "\ud55c\uae00"; // �쑀�땲肄붾뱶(unicode) -> 臾몄옄 
		System.out.println("str : " + str);;

		
		

		
		
		


	}

}
