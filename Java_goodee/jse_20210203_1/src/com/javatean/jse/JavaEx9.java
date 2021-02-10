package com.javatean.jse;

import java.util.Calendar;

public class JavaEx9 {

	public static void main(String[] args) {
		
		// formatter : �ٹٲ� ����� ���� => \n OR %n ���
		System.out.printf("�ڹٸ� ������ ���� %d�� %d�� �Դϴ�.\n",2,1); // %d : ���� ������ ����
		System.out.printf("�ڹٸ� ������ ���� %s�� %c�� �Դϴ�.\n","2",'1'); // %s : ���ڿ�,%c : ����
		System.out.printf("�ڹٸ� ������ ���� %1$s�� %2$c�� �Դϴ�\n","2",'1'); // %1$s : ��������
		System.out.printf("�ڹٸ� ������ ���� %2$s�� %1c�� �Դϴ�.%n",'1',"2"); // %1c : ��������
		System.out.printf("�ڹٸ� ������ ���� %f�� %f�� �Դϴ�.%n",2.0,1.0); // %f :  �Ǽ� ������ ����
		System.out.printf("�ڹٸ� ������ ���� %d�� %d�� �Դϴ�.%n",(int)2.0,(int)1.0); // �Ǽ� ��=>������ ��ȯ
		System.out.printf("�ڹٸ� ������ ���� %.2f�� %.1f�� �Դϴ�.\n",2.0,1.0); 
		System.out.printf("�ڹٸ� ������ ���� %e�� %g�� �Դϴ�.%n",2.0,1.0); 
		
		Calendar cal = Calendar.getInstance();
		String str = String.format("������ %1$tY�� %1$tb %1$te���Դϴ�%n", cal);
		System.out.println(str);

	}

}
