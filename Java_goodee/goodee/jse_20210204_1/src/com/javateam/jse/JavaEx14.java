package com.javateam.jse;

import java.util.Scanner;

public class JavaEx14 {

	public static void main(String[] args) {
		
		// �Էº�
		System.out.print("�� �Է� : "); // ���� �Է¹޴´� 
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt(); // money��� ������ ������ �Է¹޴´�
		
		//System.out.println("�Էµ� �ݾ� : " + money);
		//System.out.printf("�Էµ� �ݾ� : %d��%n",money); // formatter �̿�
		
		String result = "";
		
		// ���Ǻ�
		
		//1)
//		if(money >= 1000) {
//			result = "�ﰢ����";			
//		}else {
//			result = "���̾�Ʈ";
//		}
		
		// 2)
//		if(money >= 1000 && money < 2000 ) {
//			result = "�ﰢ���  + �Ŷ��(��)";		
//		}else if (money >= 2000 && money < 3000 ) {
//			result = "�ٱ�� + �̶��(��)";
//		}else if(money >= 3000 && money < 4000) {
//			result = "�ٱ�� + �Ŷ��(��)";
//		}else if (money >=  4000){
//			result = "���� ���� ���";
//		}else {
//			result = "���̾�Ʈ";
//		}
//		
		// 3) ���� if ��
//		if ( money >= 1000 ) { 
//			
//			if(money >= 1000 && money < 2000 ) { 
//				result = "�ﰢ���  + �Ŷ��(��)";		
//			}else if (money >= 2000 && money < 3000 ) {
//				result = "�ٱ�� + �̶��(��)";
//			}else if(money >= 3000 && money < 4000) {
//				result = "�ٱ�� + �Ŷ��(��)";
//			}else if (money >=  4000){
//				result = "���� ���� ���";
//			} else {
//				result = "���̾�Ʈ";
//			}
//			
		// 4)
//		switch (money/1000) { // case�� ���� ���ڸ��� ����� ���� ����
//			case 1 : result = "�ﰢ���  + �Ŷ��(��)";
//			break;
//			case 2 : result = "�ٱ�� + �̶��(��)";
//			break;
//			case 3 : result = "�ٱ�� + �Ŷ��(��)";
//			break;
//			case 4 : case 5 : case 6 : // �Ѳ����� ������ �� �� �ִ�
//				result = "���� ���� ���"; 
//				break;
//			default : result = "���̾�Ʈ"; break;
//			
//		}
		
		// 5) ���׿�����
		result = (money >= 1000 && money < 2000) ? "�ﰢ���  + �Ŷ��(��)":
				 (money >= 2000 && money < 3000) ? "�ٱ�� + �̶��(��)":
				 (money >= 3000 && money < 4000) ? "�ٱ�� + �Ŷ��(��)" :
				 (money >=  4000)? "���� ���� ���" :
				 "���̾�Ʈ";
				
		// ��º�
		System.out.println("result : " + result);
		
		// �ڿ� �ݳ�
		sc.close(); // ã�ƺ���

	}

  }

