package com.javateam.jse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class JavaEx57 {

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
		
		// �Ϻκ� ����
		// .subMap(���� ����key��, ������ ����key��)�̿� 
		// ����(������ ���� Ű��) ���� �ȵż� ��µȴ�
		// map.subMap("����", "����").forEach((k,v)->System.out.println(k + "= " + v));

		// ����(������ ���� Ű��) �����ؼ� ����Ϸ��� true ��� 
		// map.subMap("����",true, "����",true).forEach((k,v)->System.out.println(k + "= " + v));
		
		// .headMap(����key��) : ���� Ű�� �տ� �ִ°� �����´�
		// map.headMap("����").forEach((k,v)->System.out.println(k + "= " + v));
		// ���� Ű�� �����ؼ� �տ� �ִ°� �����´�
		//map.headMap("����",true).forEach((k,v)->System.out.println(k + "= " + v));

		// ���� Ű�� �ڿ� �ִ°� �����´�
		map.tailMap("����").forEach((k,v)->System.out.println(k + "= " + v));		
		
	}

}
