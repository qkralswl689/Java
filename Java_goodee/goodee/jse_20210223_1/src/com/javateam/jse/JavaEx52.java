package com.javateam.jse;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaEx52 {

	public static void main(String[] args) {

		// @SuppressWarnings("rawtypes") // ��� �޼����� �����ϵ��� ��ġ
		
		//Set set = new HashSet();		
		//Set<String> set = new HashSet<String>(); // (O)
		Set<String> set = new HashSet<>(); // (O)

		// ��� �߰�
		set.add("�̴�");
		set.add("����");
		set.add("��Ű");
		set.add("��ȣ");
		set.add("�ٽ�");
		set.add("�׺�");
		set.add("��");
		set.add("����");
		set.add("�ڳ���");
		set.add("�ٽ�");
		set.add("��");
		
		// �ߺ��� ������� �ʴ´�
		// System.out.println("set�� ũ�� : " + set.size());
		
		
		// ��ü ���� : ����(index)�� ���� => ���� �˻� ���(�ݺ��� ����)
		
		// 1) for�� �̿�
		System.out.print("set ��ü ���  : ");
		for(String s : set) {
			System.out.print( s+" ");
		}
		
		// 2) Iterator , while �̿�
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next() + " ");
//		}
		
		System.out.println();
		// ��� ����
		set.remove("��");
		System.out.print("'��' ��� ���� �� set : ");
		set.forEach(x->System.out.print( x + " "));
		
		System.out.println();
		// ��� ���� ���� Ȯ��
		System.out.println("��� ���� ���� : " + set.contains("�ڳ���"));		
		
		// ��� ��ü ����
		set.clear();
		
		System.out.println("��� ��ü ���� �� set�� ũ�� : " + set.size());
		
		
		 //set -> �迭 ��ȯ(��ȯ)
		
		//1) Object �̿�
		//Object setArr[] = set.toArray();		
		//System.out.println(setArr[0]);
		
		//2) string �̿�
//		String setArr2[] = new String[set.size()];
//		setArr2 = set.toArray(setArr2);
//		
//		System.out.println(setArr2[0]);
	}

}
