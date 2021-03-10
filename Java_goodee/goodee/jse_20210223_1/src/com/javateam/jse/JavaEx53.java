package com.javateam.jse;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaEx53 {

	public static void main(String[] args) {

		
		Set<String> set = new HashSet<>(); // (O)

		// ��� �߰�
		String sosa[] = {"�̴�","����","��Ű","��ȣ","�ٽ�","�׺�","��","����","�ڳ���","�ٽ�","��"};
		
		// ���� �迭���� �Ϻθ�  ���ֹ迭 ����
		String sosaUnit[] = {"��ȣ","�ٽ�","�̴�"};
		
		// �迭 ��� �Ѳ����� �߰� : �迭 => ����Ʈ(List) => ��(set) : ���� ġȯ
		set.addAll(Arrays.asList(sosa));
		
		// retainAll() : ��� ���� Ȯ�� => set��  ���,ũ�� ����(��� �߰�,���� ��)
		System.out.println("���(��) ���� ���� Ȯ�� : "+set.retainAll(Arrays.asList(sosaUnit)));
		
		// �迭 ��� �Ѳ����� ����
		//set.removeAll(Arrays.asList(sosa));
		
		// ���� �迭 ����
		// set.removeAll(Arrays.asList(sosaUnit));
	
		
		System.out.println("set�� ũ�� : " + set.size());
		set.forEach(x->System.out.print(x + " "));
		
		
	
	}

}
