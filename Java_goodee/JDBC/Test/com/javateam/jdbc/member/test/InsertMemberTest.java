package com.javateam.jdbc.member.test;

import java.sql.Date;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;
import com.javateam.jdbc.member.domain.MemberVo;

/**
 * InsertMember �޼��� ���� �׽�Ʈ(Unit Test Case) <br>
 * : ȸ������ ���� �׽�Ʈ<br><br>
 * 
 * @author mingki
 *
 */
public class InsertMemberTest {

	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao = MemberDaoImpl.getInstance();
		
		// ������ ȸ������ ���� (MemberVO)
		MemberVo member = new MemberVo();
		
		member.setMemberId("java555");
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
		
		// InserMember �׽�Ʈ(true/false)
		String result = dao.insertMember(member) == true ? 
		         "���� ����" : "���� ����";
		System.out.println("insertMember �׽�Ʈ ��� : " + result);
	}

}
