package com.javateam.jdbc.member.test;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

public class isEnablePhoneTest {

	public static void main(String[] args) {

		MemberDao dao = MemberDaoImpl.getInstance();
		
		System.out.println("�ִ� ��ȣ Ȯ�� (010-3078-0694) : " + dao.isEnablePhone("010-3078-0694"));
		
		System.out.println("���� ��ȣ Ȯ�� (010-1111-1111) : " + dao.isEnablePhone("010-1111-1111"));

	}

}
