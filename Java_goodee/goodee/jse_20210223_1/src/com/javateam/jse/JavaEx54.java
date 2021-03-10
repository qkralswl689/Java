package com.javateam.jse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaEx54 {

	public static void main(String[] args) {

		
		// Set<String> set = new HashSet<>(); // (O)
		
		// TreeSet : �⺻������ �������� ���� ����
		// Set<String> set = new TreeSet<>(); 
		// TreeSet<String> set = new TreeSet<>();
		
		// SortedSet : �⺻������ �������� ���� ����
		// SortedSet<String> set = new TreeSet<>(); 
		
		// NavigableSet : �⺻������ �������� ���� ����
		NavigableSet<String> set = new TreeSet<>(); 

		// ��� �߰�
		String sosa[] = {"�̴�","����","��Ű","��ȣ","�ٽ�","�׺�","��","����","�ڳ���","�ٽ�","��"};
		
			
		// �迭 ��� �Ѳ����� �߰� : �迭 => ����Ʈ(List) => ��(set) : ���� ġȯ
		set.addAll(Arrays.asList(sosa));
		
		// ��������(descending) ����(sotrint/ordering)
		
		// 1) .descendingSet() : ��(Set) ��ü�� ��������ȭ �Ѵ�
		// set = set.descendingSet();
		//set.forEach(x->System.out.print(x + " "));
		
		// 2) Iterator : ���������� �����Ǵ� �ݺ��� ���� Ȱ�� 
//		Iterator<String> it = set.descendingIterator();
//		while(it.hasNext()) {
//			System.out.print(it.next() + " ");
//		}
		
		// stream ġȯ => ����  
		// ��������
		//set.stream().sorted(Comparator.naturalOrder()).forEach(x->System.out.print(x + " ")); 
		// ��������
		//set.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.print(x + " "));
		
			
		// �Ϻκ� ����
		// subSet : ������ ����� �տ��ִ� ��� ��� -> true �߰��� ������ ��ҵ� �Բ� ��µȴ�
		// set.subSet("�ٽ�",true,"��",true).forEach(x->System.out.print(x + " "));
		//set.subSet("�ٺ�",true,"�ȴ�",true).forEach(x->System.out.print(x + " "));

		//set.headSet("����",true).forEach(x->System.out.print(x + " "));
		
		//set.tailSet("����",false).forEach(x->System.out.print(x + " "));
		
		// ù��°/������ ��� ����
		System.out.println("ù ��� : " + set.first());
		System.out.println("������ ��� : " + set.last());
	}

}
