package com.javateam.jse;

import java.util.Scanner;

public class Excersise_25 {

	public static void main(String[] args) {
		// n~m�ܱ��� ������ ���
		// n<m, 2~9 ���� �Էµǵ��� ��ġ 
		Scanner sc = new Scanner(System.in);

		System.out.print("���۴� �Է� : ");
		int n = sc.nextInt();

		System.out.print("���� �Է� : ");
		int m = sc.nextInt();
		
		if(n<m && n >=2 && n <=9 && m >=2 && m <=9) {
			for(int i = n; i<=m;i++) {
				for(int j=1; j<=9; j++) {
					System.out.printf("%d X %d = %d%n",i,j,i*j);
				}System.out.println("--------------");
			}
		}else {
			System.out.println("�Է��� Ʋ�Ƚ��ϴ�");
		}
			
			
		}
	}


