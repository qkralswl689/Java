package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

public class JavaEx51 {

	public static void main(String[] args) {
		
		// �迭 �ʱ�ȭ
		String home[] = { "��", "����", "����", "�׺�", "��", "����", "�ڳ���", "������", "������", "��Ű"};
		
		Queue<String> qu = new LinkedList<>();
		qu.addAll(Arrays.asList(home));
		
		// Queue : FIFO(First In First Out)
		// ����Ʈ�� �� �� �������� �ڷᰡ ���Եǰ� �ٸ� �� �ʿ����� �ڷᰡ �����Ǵ� ����
		//qu.forEach(x->System.out.print(x+ " "));
		
		System.out.println("--------------------");
		
		// Stack : LIFO(Last In First Out)
		// �ڷ��� ���԰� ������ ���� �������� �Ͼ�� ����
		Stack<String> st = new Stack<>();
		// st.addAll(Arrays.asList(home));
		
		// ��Ҹ� 0�� �ε��� �ڸ���  �߰�
		st.push("�ȳ�");
		st.push("�ݰ���");
		
		 System.out.println("ũ�� : " + st.size());
		 while (!st.isEmpty()) {
			 System.out.print(st.pop() + " ");
		 }			
	}
}
