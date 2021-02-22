package com.javateam.jse;

import java.util.ArrayList;
import java.util.List;

public class JavaEx44 {

	public static void main(String[] args) {
		
		//List list = new ArrayList(); // ����Ʈ ��ü ����(����) , ����Ʈ : �������̽� 
		
		// ���׸���(Generics) : Ÿ��(���� �ڷ���) ����
		// <E> : Element(���) => String
		// ex) String arr[] = new String[10];
		// List<String> list = new ArrayList<String>(); // (O)
		List<String> list = new ArrayList<>(); // (O)
		//List<? extends String> list = new ArrayList<>(); // ��쿡 �°� ����(O)
		//List<?> list = new ArrayList<>(); // ��쿡 �°� ����(O)
		// List<> list = new ArrayList<>(); // (X)
		// List<> list = new ArrayList<String>(); // (X)


		// ���(element) �߰�
		// list.add(1); // (X) ��� => String �̹Ƿ� 
		// list.add(1.0); // (X) ��� => String �̹Ƿ� 
		// list.add(1+""); // (O) ��� => String ��ȯ(casting)
		// ����� �ߺ��� ����Ѵ�
		// ���� �迭
		list.add("��");
		list.add("����");
		list.add("����");
		list.add("�׺�");
		list.add("��");
		list.add("����");
		list.add("�ڳ���");
		list.add("������"); // �ߺ�
		list.add("������"); // �ߺ�
		list.add("��Ű");
		
		System.out.print("����Ʈ ��ü ��� : ");
		for(String s : list) {
		System.out.print(s + ", ");
		}System.out.println();
		System.out.println("����Ʈ�� ũ�� (����) : " + list.size()); 		
		System.out.println("����Ʈ�� ù��° ��� : "+ list.get(0));	
		System.out.println("����Ʈ�� �ι�° ��� : "+ list.get(1));		
		System.out.println("����Ʈ�� ������ ��� : "+list.get(list.size()-1));
		
		// ����� ����	
		list.remove(1); // �ε����� ����
		
		System.out.println("��� ���� �� ����Ʈ�� ũ�� (����) : " + list.size());
		System.out.println("��� ���� �� ����Ʈ�� �ι�° ��� : "+ list.get(1));
		
		list.remove("������"); // �ߺ��� ��� ������ 1���� ������	
		System.out.println("��� '������'���� �� ����Ʈ�� ũ�� (����) : " + list.size());

		// List�� ��� ��ü ���� => ����Ʈ ��ü ������ �ƴ϶� "���" ���� => add�� �ٽ� ��� ������ �ִ�
		list.clear();
		System.out.println("��� ��ü ���� �� ����Ʈ�� ũ��(����) : " + list.size());
		
		list.add("������");
		System.out.println("��� '������' �߰� �� ����Ʈ�� ũ��(����) : " + list.size());
		
	}

}
