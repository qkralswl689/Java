package List_Studay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaEx44_stydy {

	public static void main(String[] args) {
		

		// 1) ����Ʈ ��ü ����
		List<String> list = new ArrayList<>();
		
		// 2) ��� �߰�
		list.add("�̶�");
		list.add("��");
		list.add("����");
		list.add("����");
		list.add("�׺�");
		list.add("��");
		list.add("����");
		list.add("�ڳ���");
		list.add("������"); // �ߺ�
		list.add("������"); // �ߺ�
		list.add("��Ű");
		
		// * ��� ��� 
		System.out.print("��� ��� "+ Arrays.asList(list));

		System.out.println();
		// 3) ����Ʈ ���� Ȯ��
		System.out.println(list.size());
		
		// 4) ����Ʈ�� ù��° ��� ���
		System.out.println(list.get(3));
		
		// 5) ����Ʈ�� ������ ��� ���
		System.out.println(list.get(list.size()-1));

		// 6) ��� ����
		list.remove(0);
		System.out.println("��� ���� �� ����Ʈ�� ũ�� (����) : " + list.size());
		
		// 7) �߸�� ��� ����
		list.remove("������");
		System.out.print("������ ��� 1�� ���� �� ����Ʈ : "+Arrays.asList(list));
		
		System.out.println();
		// 8) List ��� ��ü ����
		list.clear();
		System.out.println("��� ��ü ���� �� ����Ʈ�� ũ��(����) : " +list.size());
	
	}

}
