package com.javateam.jse;

public class ExceptionEx5 {

	public static void main(String[] args) throws NullPointerException,ArithmeticException{
		// throws : �޼��� ������ ����ó�� 		
		int result = 0;
		int num1 = 2;
		int num2 = 0;
		
		 Object obj = null; //��ü ����� �����ȵ� => ���� null
				
			if( obj == null) {
				throw new NullPointerException("�ν��Ͻ��� �������� �ʾҽ��ϴ�");
			}
			System.out.println("name : " + obj.getClass().getName()); // ��ü�� ����� �������� ���� ���¿��� ��� ȣ��
			
			if(num2 ==0) {
				throw new ArithmeticException("0�����̽��ϴ�. �����¼��� 1�� �����Ͽ����ϴ�.");
			}
			
				
			// ���� ���� �ۼ�
			result = num1 / num2; // �ٽ� ���
			
					
	}

}
