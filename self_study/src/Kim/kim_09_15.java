package Kim;

import java.util.*;
public class kim_09_15 {
	
	public static void main(String[] args) {
		
		/*1. ���� ���α׷��� ������� ������ ���ÿ�.
				class OpEx01 {			
				public static void main (String []args) {			
				System.out.println (6 ^ 3); 			
			}			
		}*/
		System.out.println("1�� �� : " + (6^3)); // 5 => ^ : �� ���� �� �ڸ����� �ٸ� ��� 1�� ��ȯ�Ѵ�. => ������ ���
												 // 6 : 0000 0110
												 // 3 : 0000 0011
												 //	= : 0000 0101 => 10������ ��ȯ�ϸ� 5 
	
		/*2. ���� ���α׷��� ������� ������ ���ÿ�.
				class OpEx02 {			
				public static void main (String []args) {			
				System.out.println (3/2); 			
				System.out.println (3<2); 			
				System.out.println (3*4); 			
				System.out.println (3<<2);			
				System.out.println (3*2^2); 
			}			
		} */
		System.out.println ("2���� 1�� : " + 3/2); 	// 1		
		System.out.println ("2���� 2�� : " + (3<2)); 	// false		
		System.out.println ("2���� 3�� : " + 3*4); 	// 12		
		System.out.println ("2���� 4�� : " + (3<<2));	// 12 => << : �������� ���ڸ��� �������� Nĭ �а� ���� ù°�ڸ��� 0���� ä���ִ� ����	
		System.out.println ("2���� 5�� : " + (3*2^2)); // 4 
		
		/*3. �Ʒ� ���α׷��� ���� ����� ����Ͻÿ�. 
			class OpEx03{				
			public static void main(String args[]) {				
				int a=10,b=20;				
				int c;		
				// ++ OR -- �� �տ������� ���������� �� �������� �ڿ������� ��� �� ��������		
				c=++a + ++b;				
				System.out.println("1.a="+a+"\tb="+b+"\tc="+c);	// 11,21,32
							
				c=a++ + b++;				
				System.out.println("2.a="+a+"\tb="+b+"\tc="+c);	// 10,20,30
						
				c=a++ + ++b;				
				System.out.println("3.a="+a+"\tb="+b+"\tc="+c);	// 10,21,31	
						
				c=++a + b++;				
				System.out.println("4.a="+a+"\tb="+b+"\tc="+c); // 11,20,31
				
				c = --a + --b;				
				System.out.println("5.a="+a+"\tb="+b+"\tc="+c);	// 9,19,28
							
				c = a-- + b--;				
				System.out.println("6.a="+a+"\tb="+b+"\tc="+c);	// 10,20,28
							
				c = a-- + --b;				
				System.out.println("7.a="+a+"\tb="+b+"\tc="+c);	// 10,19,29
							
				c = --a + b--;
				System.out.println("8.a="+a+"\tb="+b+"\tc="+c); // 9,20,29
				
			}
			
		}*/
		int a=10,b=20;				
		int c;		
		//  ++ OR -- �� �տ������� ���������� �� �������� �ڿ������� ��� �� ��������		
		c=++a + ++b;				
		System.out.println("3����1.a="+a+"\tb="+b+"\tc="+c);	// 11,21,32
					
		c=a++ + b++;				
		System.out.println("3����2.a="+a+"\tb="+b+"\tc="+c);	// 12,22,32
				
		c=a++ + ++b;				
		System.out.println("3����3.a="+a+"\tb="+b+"\tc="+c);	// 13,23,35	
				
		c=++a + b++;				
		System.out.println("3����4.a="+a+"\tb="+b+"\tc="+c); // 14,24,37
		
		c = --a + --b;				
		System.out.println("3����5.a="+a+"\tb="+b+"\tc="+c);	// 13,23,36
					
		c = a-- + b--;				
		System.out.println("3����6.a="+a+"\tb="+b+"\tc="+c);	// 12,22,36
					
		c = a-- + --b;				
		System.out.println("3����7.a="+a+"\tb="+b+"\tc="+c);	// 11,21,33
					
		c = --a + b--;
		System.out.println("3����8.a="+a+"\tb="+b+"\tc="+c); // 10,20,31
		
		/*4. �غ��� ���̸� �Է¹޾� �ﰢ���� ���̸� ���Ͻÿ�  OpEx04.java
			[���]			
			�غ��� ���� : 7			
			������ ���� : 5			
			���� : 17.5*/
		Scanner sc = new Scanner(System.in);
		// �ﰢ���� ���� : �غ� * ���� /2
		System.out.print("�غ��� �Է��� �ּ��� : ");
		float bottom = sc.nextFloat();
		System.out.print("���̸� �Է��� �ּ��� : ");
		float height = sc.nextFloat();
		
		System.out.println("4�� �ﰢ���� ���� : "+bottom*height/2);
		
		/*5. �������� �Է¹޾� ���� �ѷ��� ������ ���Ͻÿ� OpEx5.java
			   ������ = 3.141592  �Դϴ�.			
			[���]		
			������ : 5			
			 ���� : 78.5398			
			 �ѷ� : 31.41592 */
		// ���� ���� : ������ * ������ * ������(3.141592)
		// ���� �ѷ� : ������ * 2 * ������(3.141592)
		System.out.print("�������� �Է��� �ּ��� : ");
		float harf = sc.nextFloat();
		System.out.printf("���� ���� : %f",harf*harf*3.141592);
		System.out.printf("���ǵѷ� : %f",harf*2*3.141592);		
	}

}
