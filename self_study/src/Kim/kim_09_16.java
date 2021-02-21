package Kim;

import java.util.*;


public class kim_09_16 {

	public static void main(String[] args) {
		/*1. ȭ�鿡�� �Ѱ��� ���ڸ� �Է¹޾�
	     �빮���� ���� �ҹ��ڷ�,�ҹ����� ���� �빮�ڷ� ,
	     ������ ���� 20�� ���� ����   ����ϱ�, �׿��� ���ڴ� ��Ÿ ���� �� ����ϼ���*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.���ڸ� �Է��� �ּ��� : ");
		char ch = sc.next().charAt(0); // charAt(0) : �Է¹��� ���ڿ� ���ڷ� ����ȯ
		
		if(Character.isUpperCase(ch)) { // Character.isUpperCase(ch) : ���࿡ ch�� �빮�� ���
			System.out.println(Character.toLowerCase(ch)); // Character.toLowerCase(ch) :ch�ҹ��ڷ� ��ȯ�� ���
		}else if(Character.isLowerCase(ch)) { // Character.isLowerCase(ch) : ���࿡ ch�� �ҹ��� ���
			System.out.println(Character.toUpperCase(ch)); // Character.toUpperCase(ch) : ch�� ���ڷ� ��ȯ�� ���
		}else if(ch>='0' && ch<='9') { // ch>='0' && ch<='9' : ���࿡ ch �� ���� ��� 
			// ���� + 20 (0�� �ƽ�Ű�ڵ�� 48�̹Ƿ� 48�� ���� 20�� ������), ���������� -28
			System.out.println(ch-28); // ch-28 : ���ڷ� ��ȯ�� 20�� ���ؼ� ���
			
		}else { // �׿��� ���ڶ�� 
			System.out.println("��Ÿ����");
		}
		
		/*2. �ý��۰� ����(1), ����(2), ��(3)�� �ϱ�
    	�ý����� 1,2,3 ���� �Ѱ��� ���ڸ� �����ϰ�, 
    	�Ѱ��� ���ڸ� �Է¹޾� ���������� �����ϱ�*/
		
		System.out.print("2.���ڸ� �Է��� �ּ���(1:����,2:����,3:��) : ");
		int system = (int)(Math.random()*3)+1 ; // Math.random()*3)+1 : 3���� �������� �Է¹ޱ� => ���ڰ� 0���� ���� �ϱ� ������ +1�� ���ش�
		int num = sc.nextInt();
		System.out.println("�ý��� ���� : " + system);
		System.out.println("����� ���� : " + num);
		
		if(system == 1) {
			if(num ==1 ) {
				System.out.println("�����ϴ�");
			} else if( num ==2) {
				System.out.println("����ڰ� �̰���ϴ�");
			} else if (num ==3) {
				System.out.println("�ý����� �̰���ϴ�");
			}
		}
		if(system == 2) {
			if(num ==2 ) {
				System.out.println("�����ϴ�");
			} else if( num ==3) {
				System.out.println("����ڰ� �̰���ϴ�");
			} else if (num ==1) {
				System.out.println("�ý����� �̰���ϴ�");
			}
		}
		if(system == 3) {
			if(num ==3 ) {
				System.out.println("�����ϴ�");
			} else if( num ==1) {
				System.out.println("����ڰ� �̰���ϴ�");
			} else if (num ==2) {
				System.out.println("�ý����� �̰���ϴ�");
			}
		}
		
		/* 3. �ý��۰� �ֻ��� ������ �ý����� �ֻ����� ���� ���� ���� �����ϰ�,
		        ������� �ֻ����� ���� ���°��� �ý����� ���� ���Ͽ�, �ý����� �ֻ��� ���� ũ�� �ý��� �¸�
    		������� �ֻ��� ���� ũ�� ����� �¸�  �ý��۰� ������� �ֻ������� ������ �����Դϴ�. ����ϱ�.
	     */
		System.out.println("3.�ֻ����� �����ϴ�");
		int system2 = (int)(Math.random()*6)+1; // (Math.random()*6)+1 : 1~6������ �������� �Է¹ޱ�
		int user = (int)(Math.random()*6)+1; // 1~6������ �������� �Է¹ޱ�
		
		System.out.println("�ý��� �ֻ��� �� : " + system2);
		System.out.println("����� �ֻ��� �� : " + user);
		if(system2>user) {
			System.out.println("�ý��� �¸�");
		}else if(system2 == user) {
			System.out.println("����");
		}else if(system2 < user) {
			System.out.println("����� �¸�");
		}
		
		/*4. ������ �Է¹޾� 
    	  95�� �̻��� ��� A+ ,90 ~ 94 : A0 
          89 ~ 85�� �̻��� ��� B+ ,80 ~ 84 : B0 
          79 ~ 75�� �̻��� ��� C+, 70 ~ 74 : C0
    	  69 ~ 65�� �̻��� ��� D+, 60 ~ 64 : D0
    	   �׿ܴ� F �� ����ϱ�.
                   ��ø �ݺ����� �̿��Ͽ� �����ϱ�*/
		System.out.print("4.������ �Է��� �ּ��� : ");
		int score = sc.nextInt();
		if(score >=95 ) {
			System.out.println("A+");
		}else if(score >=90) {
			System.out.println("A0");
		}else if(score >=85) {
			System.out.println("B+");
		}else if(score >=80) {
			System.out.println("B0");
		}else if(score >=75) {
			System.out.println("C+");
		}else if(score >=70) {
			System.out.println("B0");
		}else if(score >=65) {
			System.out.println("D+");
		}else if(score >=60) {
			System.out.println("D0");
		}else {
			System.out.println("F");
		}		

	}

}
