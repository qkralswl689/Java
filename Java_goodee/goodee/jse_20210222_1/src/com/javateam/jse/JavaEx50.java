package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JavaEx50 {

	public static void main(String[] args) {
		
		// �迭 �ʱ�ȭ
		String home[] = { "��", "����", "����", "�׺�", "��", "����", "�ڳ���", "������", "������", "��Ű"};
		List<String> list = new ArrayList<>(); // (O)		
		list.addAll(Arrays.asList(home)); // (O)
		
		
		// list -> stream ġȯ(~ȭ)
		// distinct() : �ߺ� ����
		//list.stream().distinct().forEach(x->System.out.print(x + " "));
		
		// filter() : Ư�� ���� �˻�
		//list.stream().distinct().filter(x->x.contains("��")).forEach(x->System.out.print(x + " "));
		
		// sorted(Comparator.reverseOrder()) : ���� ����
		list.stream().distinct().sorted(Comparator.reverseOrder())
							.forEach(x->System.out.print(x + " "));

	}

}
