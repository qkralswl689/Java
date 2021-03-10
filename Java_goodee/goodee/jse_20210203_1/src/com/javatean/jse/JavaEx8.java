package com.javatean.jse;

public class JavaEx8 {

	public static void main(String[] args) {
		
		float num1 = 3.14F; // float �� �� �ڿ� F(f)�� �����ؾ��Ѵ� => ����X : doubleŸ��
		int num2 = (int)num1; // float -> int ����ȯ
		
		System.out.println("num2 : " + num2);
		// �Ҽ��� ���� ���� �����ȴ� : ���� �κи� ���´�
		
		num1 = num2; // int -> float
		System.out.println("num1 : " + num1); // �Ǽ� ǥ�ð� �ȴ�
		
// --------------------------------------------------------------------
		
		String str = "123";
		
		// String str = "abcd" 
		// => (X) java.lang.NumberFormatException ����(exception) �߻�
		
		// int num3 = (int)str; (X) ����ȯ�� ���� �ʴ´�
		
		// * ����ȯ(casting) �޼���(�Լ�)
		// String(���� ������ ���ڿ��� ����(����)�Ѵ�) => ����(int)�� ��ȯ
		int num3 = Integer.parseInt(str) + 1;
		// String => int (��ȯ����) - ���� ���� ����Ѵ� (��ȯ������ ª��)
		System.out.println("num3 : " + num3);
		
		int num4 = Integer.valueOf(str) + 1; 
		// String => Integer => int (��ȯ����)
		System.out.println("num4 : " + num4);
		
		int num5 = new Integer(str) + 1; 
		// String => Integer => int (��ȯ����)
		System.out.println("num5 : " + num5);
		
		// int <=> Integer : ���� �ڷ����� �⺻ �ڷ����� ���� Ŭ���������� �ڵ� ����ȯ�� �ȴ�
		// ����-�ڽ�(aut-boxing) : �⺻ �ڷ��� => �⺻ �ڷ����� ���� Ŭ������ ��ȯ �Ǵ°�
		// ��ڽ�(unboxing) : �⺻ �ڷ����� ���� Ŭ����  => �⺻ �ڷ��� ���� ���� �Ǵ°�
		// box => Ŭ����(class) ��¡�Ѵ�
		
// ---------------------------------
		int num6 = 4 / 3; // ����(��)
		System.out.println("num6 : " + num6);

		float num7 = 4 / 3; // ���� �κи� �ִ� �Ǽ�(��)
		System.out.println("num7 : " + num7);

		float num8 = (float)4 / 3; // ����  + �Ҽ��� => �Ǽ�(��)
		System.out.println("num8 : " + num8);

		float num9 = (float)4 / (float)3;// ����  + �Ҽ��� => �Ǽ�(��)
		System.out.println("num9 : " + num9);

	}

}
