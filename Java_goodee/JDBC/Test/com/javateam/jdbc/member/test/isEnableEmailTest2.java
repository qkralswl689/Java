package com.javateam.jdbc.member.test;


import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

/**
 * isEnableEmail(id, email) ���� �׽�Ʈ ���̽�<br>
 * : �̸��� �ߺ� ���� �׽�Ʈ<br><br>
 * 
 * @author migki
 *
 */
public class isEnableEmailTest2 {

	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao = MemberDaoImpl.getInstance();
		
		System.out.println("ȸ�� ID ����, ������ Email ���� : " + dao.isEnableEmail("hyun", "skfksnsk1@gmail.com"));
		System.out.println("ȸ�� ID ����, Email ����X : " + dao.isEnableEmail("hyun", "skfksn@gmail.com"));
		System.out.println("ȸ�� ID ����, �ٸ�ȸ�� mail ����: " + dao.isEnableEmail("hyun", "goodee_2@abcd.com"));
	}
}
