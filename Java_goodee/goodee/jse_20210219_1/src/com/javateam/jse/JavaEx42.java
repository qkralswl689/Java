package com.javateam.jse;

public class JavaEx42 {

	public static void main(String[] args) {

		// ���ڿ�(���� ���� ����) -> ������ ����ȯ
		// ���� ������ �ƴ� ���ڿ� => ������ ����Ȱ �� ��� -> ���� �߻� : NumberFormatException
		String str = "123";
		int num ;
		
		// Integer : Wrapper Class
		num = Integer.parseInt(str); // (O) // String -> int (��ȯ ����) => ��ȣ�ϴ� ��� 
		// num = new Integer(str); // (O) // String -> Integer -> int (��ȯ ����) : auto-unboxing
		// num = Integer.valueOf(str); //(O) // String -> Integer -> int (��ȯ ����) : auto-unboxing
		
		System.out.println("num : " + (num +1)); // 124 ��� => ����ȯ Ȯ���� ���� 1�� ���غ��� 

	}

}
