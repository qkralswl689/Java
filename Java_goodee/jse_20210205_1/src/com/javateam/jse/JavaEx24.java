package com.javateam.jse;

import java.util.*;

public class JavaEx24 {

	public static void main(String[] args) {
		
		// while �� 2������ �̿��Ͽ� �������� �����Ͻÿ�
		int i = 1;
		int j = 1;
		while(i<=9) {
			
			while(j<=9) {				
				System.out.printf("%d X %d = %d%n", i,j,i*j);
				j++;
			
			}	
			j = 1; // j�� �ʱ�ȭ ����� �Ѵ� 
			// * 2�ܸ� ��� ���� => ���ǻ��� ) ī���� ��� ���� �ʱ�ȭ !
			System.out.println("----------");
			i++;
		}

	}
}
