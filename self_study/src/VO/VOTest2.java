package VO;

import VO.MemberVO;

public class VOTest2 {

	public static void main(String[] args) {
		
		MemberVO member1 = new MemberVO("java","1234","�ڹ�","����");
		MemberVO member2 = new MemberVO("java","1234","�ڹ�","����");
		
		// �� ������ ���� (���) ��� �ʵ���� �� ��
		// ex) �� ��ü�� �������� �ű԰��� �� 
		// ȸ�� ���� ������ : ���� ���� == ���� ���� => DB ���� ���� ����(���� ���ʿ�)
		// => ȿ�� ) DB ��뷮(��) ����ȴ�
		
		// equals ��
		System.out.println(member1.equals(member2));
		
		// hashCode ��
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
	}

}
