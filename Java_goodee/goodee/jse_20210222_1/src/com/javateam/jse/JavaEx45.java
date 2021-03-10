package com.javateam.jse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaEx45 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>(); // (O)
	
		list.add("��");
		list.add("����");
		list.add("����");
		list.add("�׺�");
		list.add("��");
		list.add("����");
		list.add("�ڳ���");
		list.add("������"); 
		list.add("������"); 
		list.add("��Ű");
		
		// ����Ʈ ��� ��ü ���� 1) 
		// for �� �̿�
//		for(int i=0; i<list.size(); i++) {
//			System.out.print(list.get(i) + ", ");
//		}
		
		// ����Ʈ ��� ��ü ���� 2) 
		// iterator(�ݺ���) ���� ��� : ���� ��� �˻� ���
		// for-each�� ���
//		for(String s : list) {
//			System.out.print(s + ", ");
//		}
		
		// ����Ʈ ��� ��ü ���� 3) 
		// iterator(�ݺ���) ���� ��� : ���� ��� �˻� ���  (��������)
//		Iterator<String> it = list.iterator();
		
		// while�� �̿�
//		while(it.hasNext()) {
//			System.out.print(it.next() + ", ");
//		}
		
		// for�� �̿� => ; �� ������ �Ѵ� 
//		for(;it.hasNext();) {
//			System.out.print(it.next() + ", ");
//		}
		
		// ����Ʈ ��� ��ü ���� 4) 
		// forEach => �Լ���  ���α׷���(����(lambda)��� ���α׷��� ���)
//		list.forEach(x->System.out.print(x + ", ")); // (O)
		
		list.forEach(System.out::print); // (O) ������ �����ϰ� but ���� ���Ѵ� => �⺻���ڸ� ��밡��
		list.forEach(System.out::println); // (O)
		// list.forEach(System.out::println("A")); // (X) (�߰��Ǵ�)���� ���� �ȵȴ�
		


	}

}
