package com.javateam.jdbc.member.test;


import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

/**
 * isMember ���� �׽�Ʈ ���̽�<br>
 * : ȸ�� ���� ����<br><br>
 * 
 * @author migki
 *
 */
public class isMembeTest1 {

	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao = MemberDaoImpl.getInstance();
		// �����ϴ� ���̵�� �������� �ʴ� ���̵� �ΰ��� ��츦 �׽�Ʈ
		// 1) �����ϴ� ���̵�� ����
		System.out.println("ȸ�� ���̵� ���� ����(java): " + dao.isMember("java"));
		
		// 2) �������� �ʴ� ���̵�� ����
		System.out.println("ȸ�� ���̵� ���� ����(spring) : " + dao.isMember("spring"));
		
		// ���� �ۼ��� �ڵ�
//		String result = dao.isMember("mini2") == true ?
//							"�ߺ��� ���̵� �ֽ��ϴ�" : "�ߺ� ����";
//		System.out.println(result);
	}

}
