package com.javateam.jse;

import java.util.*;

public class JavaEx22 {

	public static void main(String[] args) {
		
		// ������ (times table, multiplication table)
		
		// �� �Է�
		System.out.println("�� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(num + "�� ���");
		
		// ����
		for(int i=1; i<=9; i++) {
			
			System.out.printf("%d X  %d = %d%n",num, i,num*i);
		
		}
		
		sc.close();

	}

}
