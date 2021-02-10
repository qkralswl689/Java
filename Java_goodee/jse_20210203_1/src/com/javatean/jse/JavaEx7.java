package com.javatean.jse;

import java.math.BigDecimal;

public class JavaEx7 {

	public static void main(String[] args) {
		
		// int num1 = 1;
		int num1 = 200;
		// byte num2 = num1; // ū �ڷᰡ ���� �ڷῡ ���� ���� �빮�� ������ ���� : Ÿ�Կ켱
		byte num2 = (byte) num1; 
		// ū �ڷ��� => ���� �ڷ��� : ����ȯ(castiong, down-casting) 
		System.out.println("num2 : " + num2);
		// ���� ������ �ʰ��ϰ� �Ǹ� ���� �ս�(���) �߻��ȴ�
		
		// num2 = 200; // short (X), int (O)
		// java������ ��� ������ Ÿ��(�ڷ���) ����޽� ��(���ͷ�)�� int ������ �����Ѵ�
		// �Ϲ����� ���� => int
		
		short num3 = 200;
			
		int num4 = num2;
		num4 = num3; // �����ڷ������� ū�ڷ������� ������ ��������
		// ���� �ڷ��� => ū �ڷ��� : ����ȯ(promoting, up-casting)
		
		num4 = 'c'; // ASCII �ڵ� : 'a' =97, 'A'=65, '0'=48
		// �ڵ� ����ȯ
		System.out.println("num4 : " + num4);
		
		num4 = (int)1L; // long -> int		
		long num5 = 1L; // L(l) �� �� ������ ����ؾ��Ѵ�
		
		System.out.println("long���� �ִ� �� : " + Long.MAX_VALUE);
		
		///////////////////////////////////////////////////////////
		
		BigDecimal big = new BigDecimal("9223372036854775808");
		System.out.println("BigDecimal �հ� : " + big.add(new BigDecimal("1")));
		// long �� ������ �Ѿ�� ���� ���� - bigDecimal, bigInteger�� �̿��� ���ڿ��� ���� �߰��Ѵ�
		
	}

}
