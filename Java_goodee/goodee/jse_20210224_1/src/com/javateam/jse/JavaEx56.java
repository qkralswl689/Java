package com.javateam.jse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class JavaEx56 {

	public static void main(String[] args) {
		
		// Map<String,String> map = new HashMap<>(); // map ��ü ���� : HashMap �̿�
		// Map<String,String> map = new TreeMap<>(); // map ��ü ���� : TreeMap�̿�
		
		// SortedMap �⺻ : Ű(key)�߽����� �������� ���� �ȴ�
		// SortedMap<String,String> map = new TreeMap<>();
		// ** SortedMap ���� NavigableMap �� �ִ�
		// NavigableMap �⺻ : Ű(key)�߽����� �������� ���� �ȴ�
		NavigableMap<String,String> map = new TreeMap<>();
		//TreeMap<String,String> map = new TreeMap<>(); // (O)
	
		// ��� �߰�
		map.put("�Ŵ�","������");
		map.put("����", "��������");
		map.put("�Ÿ�", "����");
		map.put("����","�����");
		map.put("����", "������");
		map.put("����", "����");
		map.put("����", "����");
		map.put("������", "�δ��");
		map.put("�뷮��", "ȸ");
		map.put("����", "������");
		
		// ��ü ����(�˻�)
		//map.entrySet().forEach(System.out::println);

		// ��������(descending) ����(sorting/ordering) -> NavigableMap
		
		// map.descendingKeySet() : map �� ���������� ������ ���¿��� set�� ������������ �ٲ��ִ°�
		// map.descendingKeySet().forEach(k->System.out.println(k + " = " + map.get(k)));
		
		// map.descendingMap() : map��ü�� �������� �Ǵ� ������ �ٲ��ش�
		map.descendingMap().forEach((k,v)->System.out.println(k + "=" + v));
	}

}
