package com.javateam.jse;


import java.util.*;

public class JavaEx25 {
	static int inputNum() {
		
		int result = 0;
		Scanner sc = null;
		int input = 0;
		
		while(true) {
			sc = new Scanner(System.in);
			System.out.println("�Է� : ");
			
			try {
				input = sc.nextInt();
				
				if(input >=2 && input <=9) {
					result = input;
					break;
					
				}else {
					System.out.println("2~9������ ���ڸ� �Է��Ͻʽÿ�.");
				}
			}catch(Exception e) {
				System.out.println("�߸� �Է��ϼ̽��ϴ�. �ٽ� �Է��ϼ���.");
			}
		}
		sc.close();
		return result;
		
	}
	static int inputNum(String exit) {
		int result = 0;
		Scanner sc = null;
		String input = "";
		
		while(true) { // true �̸� �ݺ��Ѵ�
			
			sc = new Scanner(System.in);
			System.out.println(" �Է� : ");
					
			try { // ���ܰ� �߻� �� �� �ִ� �ڵ�
				input = sc.nextLine();
				
				if(input.equals("exit")) { //equals : ���� �� ��
					System.out.println("�Է��� �����մϴ�");
					result = -1; // ���� -1�� ������
					break; // ��
				}
				int num = Integer.parseInt(input); // String �� int�� ��ȯ
				
				if(num >=2 && num <= 9) { // num �� 2�̻� 9���� �϶� 
					result = num; // ���� num �� ����
					return result; // ���� �����Ѵ�
				}else { // �ƴҶ�
					System.out.println("2~9 ������ ���ڸ� �Է��Ͻÿ�"); // ���
				}
			}catch(Exception e) { // ���ܰ� �߻��ϸ� ����Ǵ� �ڵ�
				System.out.println("�߸��߽��ϴ� �ٽ��Է��ϼ���");
			}
		}
		sc.close();
		return result;
		
	}

	public static void main(String[] args) {
		
		// n�� ~ m�� ���� ������
		
		int n = inputNum("exit");
		System.out.println("n : " + n);
		
		int m = inputNum("exit");
		System.out.println("m : " + m);
		
		Scanner sc = new Scanner(System.in);

//		System.out.print("���۴� �Է� : ");
//		int n = sc.nextInt();
//
//		System.out.print("���� �Է� : ");
//		int m = sc.nextInt();
		
		if(n == -1 || m == -1) {
			for(int i = n; i<=m;i++) {
				for(int j=1; j<=9; j++) {
					System.out.printf("%d X %d = %d%n",i,j,i*j);
				}System.out.println("--------------");
			}
		}else {
			System.out.println("�Է��� Ʋ�Ƚ��ϴ�");
		}
		int num = inputNum();
		System.out.println(num);
//	
		
		
	}
}
				




	



