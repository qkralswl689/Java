package com.javatean.jse;

import java.util.Scanner;

public class JavaEx10 {

	public static void main(String[] args) throws Exception{
		
		//throws Exception :����ó��  => ���ܰ� �ֿܼ� ����Ѵ�
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("KeyCode : " + keyCode);
		
		System.out.println("�Է� : ");
		int num1 = System.in.read();
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println("num : " + num);
		sc.close();

	}

}
