package com.javateam.jdbc.member.test;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

public class isEnablePhoneTest2 {

	public static void main(String[] args) {

		MemberDao dao = MemberDaoImpl.getInstance();
		

		System.out.println("���̵� O,���� ��ȭ��ȣ O : " + dao.isEnablePhone("hyun", "010-3078-0694"));
		System.out.println("���̵� O,��ȭ��ȣ X : " + dao.isEnablePhone("hyun", "010-3078-0644"));
		System.out.println("���̵� O,Ÿ�� ��ȭ��ȣ O : " + dao.isEnablePhone("hyun", "010-1234-1001"));
	}

}
