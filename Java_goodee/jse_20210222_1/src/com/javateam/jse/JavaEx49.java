package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JavaEx49 {

	public static void main(String[] args) {
		
		// �迭 �ʱ�ȭ
		String home[] = { "��", "����", "����", "�׺�", "��", "����", "�ڳ���", "������", "������", "��Ű"};
		List<String> list = new ArrayList<>(); // (O)		
		list.addAll(Arrays.asList(home)); // (O)
		
		
		// shuffle() : ��� �Ҷ� ���� �迭�� ��Ҹ� �������� ȥ���Ѵ� 
		Collections.shuffle(list);		
		list.forEach(x->System.out.print(x+ " "));			
	}
}
