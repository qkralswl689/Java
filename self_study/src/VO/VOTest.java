package VO;

import VO.MemberVO;

public class VOTest {
	
	public static void main(String[] args) {
		
//		MemberVO member = new MemberVO(); // ��ü���� 
		
		// VO �Է�
//		member.setId("java");
//		member.setPw("1234");
//		member.setName("�ڹ�");
//		member.setAddress("����");
		
		MemberVO member = new MemberVO("java","1234","�ڹ�","����"); // ���� ���� (��� �� ���Ѵ�)
		
		// VO ���
		// System.out.println("id : " +member.getId());
		
		// VO �ϰ� ���
		// toString �������̵� �� ����
		// 1) ��ü ȣ�� -> ��ü.toString ������ �ǹ� : �ڵ尡 ����������
		// 2) Object.toString �������̵� -> 
		//	- �뵵 : ��ü ������ Ȯ�� < ��ü "����(��� �ʵ��)"�� Ȯ�� ����
		// 3) toString : �޼����� �̸��� �ǹ� 
		// 	- ���ڿ�(��ü�� ��� �ʵ���� ������)�� ����(���)�ϴ� 
		System.out.println(member);
		// System.out.println(member.toString()); // ���� ������ �ǹ�

	}

}
