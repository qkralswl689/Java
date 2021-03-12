package com.javateam.jdbc.member.test;

import java.sql.Date;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;
import com.javateam.jdbc.member.domain.MemberVo;

/**
 * getMember �޼��� ���� ��ũ�� ���̽�<br>
 * : ���� ȸ�� ���� ��ȸ<br><br>
 * 
 * @author migki
 *
 */
public class GetMemberTest {

	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao= MemberDaoImpl.getInstance();
		
		// DB�� �Էµ� ����� VO ���� ��
		// �񱳴�� VO �غ�
		MemberVo member = new MemberVo();
		
		member.setMemberId("java5555");
		member.setMemberPassword("1234");
		member.setMemberNicname("�����");
		member.setMemberName("ȫ�浿");
		member.setMemberGender('m');
		member.setMemberEmail("abcd@abcd.com");
		member.setMemberPhone("010-1234-5678");
		member.setMemberBirth(Date.valueOf("2016-02-05"));
		member.setMemberZip("12345");
		member.setMemberAddressBasic("���� ��õ ����");
		member.setMemberAddressDetail("�����ī����");
		// ��¥ �Է�
		member.setMemberJoindate(Date.valueOf("2021-03-12"));
		
		System.out.println(member);
		System.out.println(dao.getMember("java5555"));
		
		System.out.println(member.hashCode());
		System.out.println(dao.getMember("java5555").hashCode());
		
		String result = member.equals(dao.getMember("java5555"))?
						"ȸ������ ��ȸ ����" : "ȸ������ ��ȸ ����";
		
		System.out.println(result);
		
	}

}
