package com.javateam.jse;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		  // java.lang.ArithmeticException: / by zero : ����ó�� �޼��� => 0���� ����� �����
		  // JRE(JVM) ��ü���� ����ó�� �
		
		int result = 0;
		int num1 = 2;
		int num2 = 0;
		
		Object obj = null; //��ü ����� �����ȵ� => ���� null
	
		// try - catch ���� ����ó�� 
		try {
			
			// NullPointerException �߻�
			// ���� �ۼ�
			try {System.out.println("name : " + obj.getClass().getName()); // ��ü�� ����� �������� ���� ���¿��� ��� ȣ��
			
			}catch(NullPointerException e) { // NullPointerException ó�� => ��Ȯ�ϰ� ����

					System.out.println("���� : " + e);
					
					//���� ����
					obj = new Object();
					System.out.println("name : " + obj.getClass().getName());
			}
			
			result = num1 / num2; // ���� �߻� ����
			
			
		} catch(ArithmeticException e) { // ��ġ , e => �ַ� ���̾���.(Exception)
			// "e" ��� ����ó�� ��ü�� �ڵ����� �ȴ�
			
			////// ���� �޽�¡(messaging) /////
			// e.printStackTrace(); // ���� �ڼ��� �����α�(error log) ��µȴ�
			
			// System.out.println("e : " + e);
			// e : java.lang.ArithmeticException: / by zero ��µȴ�
			
			// System.out.println("e : " + e.toString());
			
			// System.out.println("e.getMessage() : " + e.getMessage());
			//e.getMessage() : / by zero ��� => ���� �޼����� ���
			
			 // System.err.println("e : " + e.toString());
			// ����(red)���� �α�(log) ��� 
			 
			// ����� ���� �޼�¡
			 System.out.println("0�����̽��ϴ�. �����¼��� 1�� �����Ͽ����ϴ�.");
			
			// ���� ���� �ۼ�
			num2 = 1; // ������ �Ǵ� num2�� ���� 1�� �־
			result = num1 / num2; // �ٽ� ���
			
			// ���
			// e : java.lang.ArithmeticException: / by zero
			// 0�����̽��ϴ�. �����¼��� 1�� �����Ͽ����ϴ�.
			// result : 2 
		
			// catch 2�� ó�� : ArithmeticException �� ó�����Ѱ� ó�����ش�
			//} catch(Exception e) { // NullPointerException ó�� 
					
			// ����ó�� ������
			} finally {
				// ���� �߻��� �����ϰ� ����ȴ� : ex) ������ ó�� �κ�, �ڿ��ݳ�(resource closing)
				System.out.println("����ó�� ������");						
		}
				System.out.println("result : " + result);
	}

}
