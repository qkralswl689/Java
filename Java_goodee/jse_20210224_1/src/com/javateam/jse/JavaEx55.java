package com.javateam.jse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaEx55 {

	public static void main(String[] args) {
		
		// Map map = new HashMap(); // (O) -> @SuppressWarnings("unused")
		Map<String,String> map = new HashMap<>(); //  map ��ü ���� : HashMap �̿�
		
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
		map.put("�뷮��", "�Ź�");
		//map.put(null, "�Ź�"); (O) null ���������� �����ʴ�

		System.out.println("map�� ũ�� : " + map.size()); // Ű�� �ߺ� ����(����,�뷮��)
		
		// ������ ��� �˻� : key�� ���� ���� �����´�
		// �ߺ� : �������� �ִ� ���� �ҷ��´� -> ���� �ߺ��� ��� ������ Ű�� �ߺ��� ������� �ʴ´�
		System.out.println("������ Ű/�� : " + map.get("����")); 
		
		// ��ü ����(�˻�)
		
		// 1) EntrySet => map.Entry => ���� ������ ���
		// Set<Map.Entry<String,String>> set = map.entrySet(); // (O)
//		Set<Entry<String,String>> set = map.entrySet();
//		Iterator<Entry<String,String>>it = set.iterator();
//		while(it.hasNext()) {
//			
//			Entry<String,String> keyEntry = it.next();
//			String key = keyEntry.getKey();
//			String value = keyEntry.getValue();
//			System.out.println(key + " = " + value);
//		}
		
		// 2) keySet -> �����Ѵ�
//		Set<String> set = map.keySet();
//		Iterator<String> it = set.iterator();
//		
//		while(it.hasNext()) {
//			String key = it.next();
//			String value = map.get(key);
//			System.out.println(key + "=" + value);
//		}

		// 3) forEach => �����ϴ� k,v : ���� �Ҵ� ���ص� �ȴ� 
//		map.forEach((k,v)->System.out.println(k + "=" + v));

		// 4) entrySet.forEach => ���� �����ϴ� = �� �ڵ����� �־��ش�
		// map.entrySet().forEach(x->System.out.println(x)); (O)
		// map.entrySet().forEach(System.out::println); // (O)
		
		// 5) keySet : k -> �ٸ� �ܾ ���ĺ����� �ص� �ȴ�
		map.keySet().forEach(k->System.out.println(k+"="+map.get(k)));	
	}

}
