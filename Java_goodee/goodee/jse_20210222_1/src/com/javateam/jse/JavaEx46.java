package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaEx46 {

	public static void main(String[] args) {
		
		// �迭 �ʱ�ȭ
		String home[] = { "��", "����", "����", "�׺�", "��", "����", "�ڳ���", "������", "������", "��Ű"};
		List<String> list = new ArrayList<>(); // (O)		
		// List<String> list = new LinkedList<>(); // ����/������ ���� ����Ʈ ���� �� 
		
	
//		// �迭 => ����Ʈ(List)�� ġȯ
//		list = Arrays.asList(home);		
		
		// �迭�� ����Ʈ�� ġȯ���� �� �ٷ� ��� �߰� �� ��� ���ܰ� �߻��Ѵ�
		// java.lang.UnsupportedOperationException ���� �߻�
		// list.add("�׻�"); 
		
		// �迭�� ����Ʈ�� ġȯ���� �� ��� �߰���� 
		// list.addAll(home); // (X) �÷����� �ƴϱ� ������ ����
		list.addAll(Arrays.asList(home)); // (O)
		list.add("�ѿ�");
		list.set(2, "�׻�"); // set : ������ �ε����� ��� ����
		
		// ����) ArrayList�� (�߰�)����(������)/�����ÿ��� ������
		// LinkedList�� ���� �������� => ����/���� ����� ����Ʈ(ex: ���Ǽ���,��ȭ���� ��) 
		// => LinkedList ���� (����/������ ���� ����Ʈ�� ����ȭ(����ȭ))	
		
		list.forEach(e->System.out.print(e + " ")); // (O)
		
	}

}
