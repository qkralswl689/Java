package com.javateam.jdbc.member.test;


import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

/**
 * isMember ���� ��ũ�� ���̽�<br>
 * : ȸ�� ���� ����<br><br>
 * 
 * @author migki
 *
 */
public class isMemberTest {

	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao= MemberDaoImpl.getInstance();
		
		// �����ϴ� ���̵�� �������� �ʴ� ���̵� �ΰ��� ��츦 �׽�Ʈ
		// 1) �����ϴ� ���̵�� ����
		System.out.println("ȸ�� ���̵� ���� ����(java): " + dao.isMemberByMemberId("java"));
		
		// 2) �������� �ʴ� ���̵�� ����
		System.out.println("ȸ�� ���̵� ���� ����(spring) : " + dao.isMemberByMemberId("spring"));
		
		// ���� �ۼ��� �ڵ�
//		String result = dao.isMemberByMemberId("mini2") == true ?
//							"�ߺ��� ���̵� �ֽ��ϴ�" : "�ߺ� ����";
//		System.out.println(result);
	}

}
