package test;

import home.Parent;
import home.child;
public class test {
	public static void main(String[] args) {
		
		// ���� Ÿ���� ���/���� ���谡 ���� ���� "��" �ڵ���ȯ �ȴ�
		// Parent parent = new Parent();
		// Parent parent = new child();
		// Parent parent = (Parent)new child(); //(O)
		
		Parent parent = new child();
		// �θ� Ÿ������ ��ȯ�ÿ��� �θ� Ÿ���� ���"��" ��� �Ҽ� �ֵ��� ���ѵȴ�
		
		// System.out.println(parent.address); // (���Ұ���)
		 System.out.println(parent.name); // ��밡��
		 
		// ���� Ÿ���� () (����ȯ ������) �� ����� 
		// ����ȯ(casting) �� ���/���� ����ÿ� "��" �����ϴ�
		// child child = (child)new Parent(); // ����!
		 
		// Parent parent2 = new Parent(); // (X)
		// child child2 = (child)parent2; // (X)
		// java.lang.ClassCastException ���� �߻�   
		 
		 
		 child child = (child)parent; //  ����ȯ(o)

		 
//		 System.out.println(child.address);
//		 System.out.println(child.name);
		
	}

}
