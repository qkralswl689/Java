package com.javateam.jse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class JavaEx58 {

	public static void main(String[] args) {

		// NavigableMap �⺻ : Ű(key)�߽����� �������� ���� �ȴ�
		NavigableMap<String,String> map = new TreeMap<>();

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
		
		// .keySet() : key�鸸 ���
		//map.keySet().forEach(System.out::println);
		
		// .values() : value�鸸 ���
		//map.values().forEach(System.out::println);
		
		// .containsKey() : key ���� ���� Ȯ�� -> true,false�� ���
		//System.out.println(map.containsKey("�뷮��"));
		
		// .containsValue : value ���� ���� Ȯ�� -> true,false�� ���
		//System.out.println(map.containsValue("����"));
		
		// ù/������ ��� Ű ���
		//System.out.println(map.firstKey());
		//System.out.println(map.lastKey());
		
		// .remove() : key ����
		//map.remove("�뷮��");
		//map.forEach((k,v)->System.out.println(k + " = " + v));
		
		
		// ���� ��� ����
		// putAll : map�� �ٸ� map�� �ִ°�
		Map<String,String> map2 = new TreeMap<>();
		map2.put("����","���");
		map2.put("�츮��","����");
		
		map.putAll(map2); // map �� map2�� �ִ´�
		map.forEach((k,v)->System.out.println(k + " = " + v));

	}

}
