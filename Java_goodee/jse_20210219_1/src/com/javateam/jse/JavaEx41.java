package com.javateam.jse;

import java.io.UnsupportedEncodingException;

public class JavaEx41 {

	public static void main(String[] args) 
			throws UnsupportedEncodingException { 

		char chArr[] = {'a','b','c','d'};
		
		// ������ �迭 -> ���ڿ� �� ġȯ
		String str = new String(chArr);
		//System.out.println(str);
		
		// ���ڿ� -> ������ �迭�� ġȯ
//		char chArr2[] = str.toCharArray();
//		for(char c : chArr2) { // for-each ������ ���ڿ� ������
//			System.out.println(c);
//		}
		
		//  byte ����ȯ
		// byte chArr3[] = str.getBytes();
		// byte chArr3[] = str.getBytes("UTF-8"); // throws ó�� 
		
		byte chArr3[] = "�ѱ��Դϴ�".getBytes("UTF-8"); 
		// �ѱ� : 2byte ->getByte : 1byte�� ���� => ���� ������ ��µȴ� 
		// ** toCharArray(); ����ϸ� �� ��µȴ�
//		for (byte b : chArr3) {
//			System.out.print((char)b + " ");
//		}
		
		// String ���� ��ȯ�ؼ� ��� 
		//String str2 = new String(chArr3,"UTF-8");
		
		String str2 = new String(chArr3,"EUC-KR"); // �ѱ� ������ ��� => ���ڵ�(encoding) ����� �̽���ġ

		System.out.println(str2);
	}

}
