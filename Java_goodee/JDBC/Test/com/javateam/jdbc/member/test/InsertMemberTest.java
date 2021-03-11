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
		
		member.setMemberId("mingming");		
		member.setMemberPassword("1234");
		member.setMemberNicname("����");
		member.setMemberName("��00");
		member.setMemberGender('f');
		member.setMemberEmail("skfksnsk@skfk.com");
		member.setMemberPhone("010-1234-5678");
		member.setMemberBirth(Date.valueOf("1993-01-29"));
		member.setMemberZip("12345");
		member.setMemberAddressBasic("��õ��");
		member.setMemberAddressDetail("����ȨŸ��");
		
		// InserMember �׽�Ʈ(true/false)
		String result = dao.insertMember(member) == true ? 
		         "���� ����" : "���� ����";
		System.out.println("insertMember �׽�Ʈ ��� : " + result);
	}

}
