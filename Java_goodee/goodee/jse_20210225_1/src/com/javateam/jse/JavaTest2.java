package com.javateam.jse;

import java.util.Scanner;

import com.javateam.jse.CheckPrime;
import com.javateam.jse.CheckPrimeImpl;
public class JavaTest2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
//		int n = sc.nextInt();
		
		// ����� ���
		int num = sc.nextInt();
		CheckPrime obj = new CheckPrimeImpl(); // ��ü����
		String msg = obj.isPrimeNum(num) == true?
				"�̴�" : "�� �ƴϴ�";
		System.out.printf("%d�� �Ҽ�%s",num,msg);
		
		sc.close();
		

	}

}
