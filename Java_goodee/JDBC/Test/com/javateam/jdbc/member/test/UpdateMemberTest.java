package com.javateam.jdbc.member.test;

import java.sql.Date;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;
import com.javateam.jdbc.member.domain.MemberVo;

/**
 * UpdateMember �޼��� ���� �׽�Ʈ(Unit Test Case) <br>
 * : ȸ������ ���� �׽�Ʈ<br><br>
 * 
 * @author mingki
 *
 */
public class UpdateMemberTest {

	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao = MemberDaoImpl.getInstance();
		
		// ������ �ܿ����� ����(MemberVO)
		MemberVo member = new MemberVo();
		
		member.setMemberPassword("11115");
		member.setMemberNicname("�޴�");
		member.setMemberBirth(Date.valueOf("1991-07-04"));
		member.setMemberAddressBasic("����Ư����");
		member.setMemberAddressDetail("Ÿ���縮��");
		
		// UpdateMember �׽�Ʈ(true/false)
		String result = dao.updateMember(member) == true ?
						"���� ����" : "���� ����";
		System.out.println("UpdateMember �׽�Ʈ ��� : " + result);
				
	}

}
