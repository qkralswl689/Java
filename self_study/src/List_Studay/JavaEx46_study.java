package List_Studay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaEx46_study {

	public static void main(String[] args) {
		
		// �迭 �ʱ�ȭ
		String home[] = { "��", "����", "����", "�׺�", "��", "����", "�ڳ���", "������", "������", "��Ű"};
		List<String> list = new ArrayList<>();
		
		// 1) �迭 => ����Ʈ�� ġȯ
		//list = Arrays.asList(home);
		//list.forEach(x->System.out.print(x + " "));
		//System.out.println();
		
		// 2) �迭�� ����Ʈ�� ġȯ���� �� ��� �߰�
		
		list.addAll(Arrays.asList(home));
		list.add("��");
		list.set(1, "190");
		
		list.forEach(x->System.out.print(x + " "));

	}

}
