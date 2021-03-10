package com.javateam.jse;

/*
* ���ڿ�(String) ó�� ���� ����
*/
public class JavaString {

	public static void main(String[] args) {
		String str1 = "Java �ڹ� "; // �������� ���鹮�� ������ ������ ��!
		String str2 = "Java ������"; // String str2 = new String("Java ������"); �� ������ ����
		String str3;
		/* ���ڿ� ��(1) 
		* ���ǻ���) ������ ���� ��ҹ��� ������
		* equals
		*/
		System.out.println("���ڿ� ��(1) : " + (str1.equals(str2)));
		System.out.println("���ڿ� ��(1) : " + ("Hello".equals("hello")));
		/* ���ڿ� ��(2) 
		* ���ǻ���) ������ ���� ��ҹ��� ������
		* == ������
		*/
		System.out.println("���ڿ� ��(2) : " + (str1 == str2));
		System.out.println("���ڿ� ��(2) : " + ("Hello" == "hello") );
		/* ���ڿ� ��(������ ��� �������� ����)
		* equalsIgnoreCase
		*/
		System.out.println("���� ���ڿ� ��ҹ��� ���о��� �� : "+ "Hello".equalsIgnoreCase("hello"));
		// ����� == �����ڴ� ������ �����ϴ� "�޸� �ּ�"�� ���ϰ�
		// equals�� ����� ����"��"���� �����Ѵ�.
		/* ���ڿ��� constant pool�� ����Ѵ�.
		* �̹� ���Ǯ(constant pool)�� ���� ������ ���ڿ��� ���� ���
		* �� ���ڿ��� �޸� �ּҰ��� ��ȯ. 
		* intern()
		*/
		String s1 = new String("abcd");
		String s2 = new String("abcd");
		System.out.println(" == ������ : " + (s1==s2)); // ���� �ƴ� "�ּҰ�"���� ���Ѵ�.
		System.out.println(" equals �޼ҵ� : "+ s1.equals(s2)); // "��"���� ���Ѵ�.
		System.out.println(" intern �޼ҵ� : "+ (s1.intern() == s2.intern())); // �� �ڵ忡���� "�޸� �ּҰ�"���� ���Ѵ�.
		
		// ���ڿ� ����(1)
		str3 = str1+str2;
		System.out.println(str3);
		/* ���ڿ� ����(2)
		* concat
		*/
		str3=str1.concat(str2);
		System.out.println(str3);
		/* ���ڿ��� ���̸� ��ȯ�Ѵ�.
		* ���ǻ���) ����(" ")�� ���ڿ��� ���̿� ���Ե�.
		* length
		*/
		System.out.println("���ڿ��� ���� : " + str3.length());
		// ** lenght => �迭�� ���� , lenght() => ���ڿ��� ����
		/* ������ ���ڿ��� �������� ���� ��ȯ
		* endsWith
		*/
		System.out.println("�����ڷ� �������� ���� : " + str3.endsWith("������"));
		/* Ư�� ��ġ�� �ִ� ���� ��ȯ
		* ���ǻ���) ����(index)�� �迭ó�� 0���� ������
		* charAt
		*/
		System.out.println("3��° �ִ� ���� : " + str3.charAt(3));
		/* Ư�� ���ڿ� ��� ��ü(����)
		* ������ ���յ� str3���� ����(" ")�� ","�� ����
		* replaceAll 
		*/
		str3 = str3.replaceAll(" ", ", ");
		System.out.println(str3);
		/* ���ڿ��� ","�� �������� ���� �и��Ͽ� �迭�� �Ҵ�(�Է�) 
		* split
		*/
		String[] arr = str3.split(",");
		for (int i=0; i<arr.length;i++) {
		System.out.println("�и��� ���ڿ�: " + arr[i]);
		}
		/* Ư�� ���ڿ��� �����ϴ� �� �˻�
		* startWith
		*/
		boolean b = str3.startsWith("��");
		System.out.println(b);
		/* Ư�� ��ġ�� �ִ� ���ڿ� ����(subtract) 
		* ���ǻ���) ����(index)�� �迭ó�� 0���� �����Ѵ�.
		* �׸��� end(��) ������ �������� �ʴ´�.
		* substring
		*/
		System.out.println("3~9��° ������ ���ڿ� : " + str3.substring(3,10));
		/* Ư�� ����/���ڿ� �˻� 
		* ã�� ���ϸ� -1 ����� ��ȯ
		* indexOf
		*/
		System.out.println("ã�� ���ڿ� : ������ : " 
		+ ((str3.lastIndexOf("������") == -1) ? "��ã����" : "ã����"));
		System.out.println("ã�� ���ڿ� : �� : " 
		+ ((str3.lastIndexOf("��") == -1) ? "��ã����" : "ã����"));
		/* �¿� ���� ����
		* ���ǻ���) �߰� ������ ���� �� ����. �ٸ� ���ڿ� ó���� ���� ������ ���ش�.
		* trim
		*/
		str3 = " �ڹ� ������ ";
		System.out.println("�¿� ������ ���� ���ڿ� : "+str3.trim());
		/* ��ҹ��� ��ȣ ��ȯ
		* toLowerCase / toUpperCase
		*/
		s1 ="abcde";
		s2 = "ABCDE";
		System.out.println("�ҹ��ڸ� �빮�ڷ� ��ȯ : " + s1.toUpperCase());
		System.out.println("�빮�ڸ� �ҹ��ڷ� ��ȯ : " + s2.toLowerCase());
	}
} // end of class
