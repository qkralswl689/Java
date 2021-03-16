package com.javateam.jdbc.member.test;


import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

/**
 * isEnableEmail ���� �׽�Ʈ ���̽�<br>
 * : �̸��� �ߺ� ���� �׽�Ʈ<br><br>
 * 
 * @author migki
 *
 */
public class isEnableEmailTest {

	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao = MemberDaoImpl.getInstance();
		
		// �����ϴ� ���̵�� �������� �ʴ� �̸��� �ΰ��� ��츦 �׽�Ʈ
		// 1) DB ��Ȳ�� �����ϴ� �̸��� �� ����
		System.out.println("ȸ�� �̸��� ���� ����(goodee_1@abcd.com) �����Ұ��: " + dao.isEnableEmail("goodee_1@abcd.com"));
		
		// 2) DB ��Ȳ�� �������� �ʴ� �̸���  ����
		System.out.println("ȸ�� �̸��� ���� ����(1234) ��������������� : " + dao.isEnableEmail("1234"));

	}

}
