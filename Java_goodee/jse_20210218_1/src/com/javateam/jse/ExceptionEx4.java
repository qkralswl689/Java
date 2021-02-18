package com.javateam.jse;

public class ExceptionEx4 {

	public static void main(String[] args) {
		
		  // java.lang.ArithmeticException: / by zero : ����ó�� �޼��� => 0���� ����� �����
		  // JRE(JVM) ��ü���� ����ó�� �
		
		int result = 0;
		int num1 = 2;
		int num2 = 0;
		
		 Object obj = null; //��ü ����� �����ȵ� => ���� null
		
		// Object obj = new Object();
	
		// try - catch ���� ����ó�� 
		try {
			
			// NullPointerException �߻�
			// ���� �ۼ�
			try {
				
				if( obj == null) {
					//throw new NullPointerException();
					throw new NullPointerException("�ν��Ͻ��� �������� �ʾҽ��ϴ�");
					// throw :�ż��ϰ� ó���� �� �ִ� => ����˰�
				}
				
				System.out.println("name : " + obj.getClass().getName()); // ��ü�� ����� �������� ���� ���¿��� ��� ȣ��
				
			
			}catch(NullPointerException e) { // NullPointerException ó�� => ��Ȯ�ϰ� ����

					System.out.println("���� : " + e);
					
					//���� ����
					obj = new Object();
					System.out.println("name : " + obj.getClass().getName());
			}
			
			if(num2 ==0) {
				throw new ArithmeticException("0�����̽��ϴ�. �����¼��� 1�� �����Ͽ����ϴ�.");
			}
			
			result = num1 / num2; // ���� �߻� ����
			
			
		} catch(ArithmeticException e) { // ��ġ , e => �ַ� ���̾���.(Exception)
			// "e" ��� ����ó�� ��ü�� �ڵ����� �ȴ�
			
			////// ���� �޽�¡(messaging) /////
			
			 System.out.println("e : " + e);
			// e : java.lang.ArithmeticException: / by zero ��µȴ�
	
			 
			// ����� ���� �޼�¡
			 // System.out.println("0�����̽��ϴ�. �����¼��� 1�� �����Ͽ����ϴ�.");
			
			// ���� ���� �ۼ�
			num2 = 1; // ������ �Ǵ� num2�� ���� 1�� �־
			result = num1 / num2; // �ٽ� ���
			
					
			// ����ó�� ������
			} finally {
				// ���� �߻��� �����ϰ� ����ȴ� : ex) ������ ó�� �κ�, �ڿ��ݳ�(resource closing)
				System.out.println("����ó�� ������");						
		}
				System.out.println("result : " + result);
	}

}
