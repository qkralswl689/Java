package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JavaEx48 {

	public static void main(String[] args) {
		
		// �迭 �ʱ�ȭ
		String home[] = { "��", "����", "����", "�׺�", "��", "����", "�ڳ���", "������", "������", "��Ű"};
		List<String> list = new ArrayList<>(); // (O)		
		
		list.addAll(Arrays.asList(home)); // (O)
		
		// ��� ���� ���� Ȯ�� contains => ���� �����ؾ��Ѵ� -> trim() ���
		//System.out.println("��� ���� ���� :" + list.contains("����".trim()));
		
		// ��Ұ� ��ġ�ϰ��ִ� �ε��� ��ȣ ��� : indexOf => �ߺ��� ��Ұ� ������� �տ� ��ġ�� ����ǹ�ȣ ��µȴ�
		//System.out.println("Ư�� ����� index : " + list.indexOf("����"));
		//System.out.println("�ߺ��� ����� index : " + list.indexOf("������"));
		
		
		// ����Ʈ�� ��� ���� ���� Ȯ�� : isEmpty() => true or false �� ��ȯ
		//list.clear();		
		//System.out.println("����Ʈ ��� ���� ���� : " + list.isEmpty());
		
		// �ߺ��� ����� ������ �ε��� ��ȯ : lastIndexOf
		//System.out.println("(�ߺ�)Ư�� ����� ������ ����� index :  " + list.lastIndexOf("������"));
		
		// listIterator() : ����Ʈ ��� ���� ,���� X
		// list.listIterator();
		
		// ����Ʈ ��� ���� ����,���� X
//		ListIterator<String> lit = list.listIterator(list.size());
//		while(lit.hasPrevious()) {
//			System.out.print(lit.previous()+ " ");
//		}
		
		// subList : ��� �Ϻκ� ���� -> ������ �ε��� ��Ҵ� ���� �ϰ� ��µȴ�
		// ����) toIndex =>������(�⺻��)
		//list.subList(0, 3).forEach(x->System.out.print(x + " "));
		
		// ����Ʈ(List) => �迭�� ġȯ
		// ��� 1) object�迭 ���� �Ͽ� ġȯ
//		Object  otherHome[] = new Object[list.size()];
//		otherHome = list.toArray();
//		System.out.println("otherHome ù��° ��� : " + otherHome[0]);
//		for(Object s : otherHome) {
//			System.out.print( s + " ");
//		}
		
		// ��� 2) String�迭 ���� �Ͽ� ġȯ
		String otherHome[] = new String[list.size()];
		otherHome = list.toArray(otherHome);
		for(String s : otherHome) {
			System.out.print(s + " ");
		}
	}

}
