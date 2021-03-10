package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class JavaEx47 {

	public static void main(String[] args) {
		
		// �迭 �ʱ�ȭ
		String home[] = { "��", "����", "����", "�׺�", "��", "����", "�ڳ���", "������", "������", "��Ű"};
		List<String> list = new ArrayList<>(); // (O)		
		
		list.addAll(Arrays.asList(home)); // (O)
		list.add("�ѿ�");
		list.set(2, "�׻�"); // set : ������ �ε����� ��� ����
		
		// ����(sorting,ordering) 
		
		// list.sort(Comparator.naturalOrder()); // since java 1.8
		// �ڿ� ����(��������(ascending)����) : �ڵ��(ex.UTF-8)���� ����
		
		// list.sort(Comparator.reverseOrder()); // since java 1.8
		// ��������(desending) ���� : �ڵ� ���� ����
		
		// ���� ��� : Collections ��� => ȣȯ���� ����
		// Collections.sort(list); // �������� ����
		
		// �͸�Ŭ���� compareTo ���		
//		Collections.sort(list, new Comparator<String>() { 
//
//			@Override
//			public int compare(String o1, String o2) {
//				// return o1.compareTo(o2); // ��������
//				return o2.compareTo(o1); // ��������
//			}			
//		});
				
		// list.forEach(e->System.out.print(e + " ")); // (O)
		
		// ����Ʈ -> ��Ʈ������ ġȯ : ���̻� ����Ʈ�� �ƴϴ�
		//list.stream().sorted().forEach(e->System.out.print(e + " ")); // ��������
		// list.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e + " "));
		// ��������
		
		
		// compareTo : ������ �͸� Ŭ���� but ���ٷ� �ۼ�
		//list.sort((x1,x2)->x1.compareTo(x2)); // ��������
		list.sort((x1,x2)->x2.compareTo(x1)); // ��������
		list.forEach(x->System.out.print(x + " ")); 
		
	
		
	}

}
