package com.javatean.jse;

import java.util.Scanner;

public class JavaEx10 {

	public static void main(String[] args) throws Exception{
		
		//throws Exception :예외처리  => 예외가 콘솔에 출력한다
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("KeyCode : " + keyCode);
		
		System.out.println("입력 : ");
		int num1 = System.in.read();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("num : " + num);
		sc.close();

	}

}
