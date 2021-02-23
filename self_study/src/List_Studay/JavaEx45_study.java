package List_Studay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaEx45_study {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>(); // (O)
	
		list.add("��");
		list.add("����");
		list.add("����");
		list.add("�׺�");
		list.add("��");
		list.add("����");
		list.add("�ڳ���");
		list.add("������"); 
		list.add("������"); 
		list.add("��Ű");
		
		// 1) ����Ʈ ��� ��ü ���� : for�� 
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// 2) ����Ʈ ��� ��ü ����  : forEach�� 
		for(String s : list) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		// 3) ����Ʈ ��� ��ü ����  : iterator,while 
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		System.out.println();
		// 4) ����Ʈ ��� ��ü ���� : forEach => �Լ���  ���α׷���(����(lambda)��� ���α׷��� ���)
		list.forEach(x->System.out.print(x + " "));
		
	}
	

}
