package com.javateam.jdbc.member.test;

import java.sql.Date;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;
import com.javateam.jdbc.member.domain.MemberVo;

/**
 * DeleteMember �޼��� ���� �׽�Ʈ(Unit Test Case) <br>
 * : ȸ������ ���� �׽�Ʈ<br><br>
 * 
 * @author mingki
 *
 */
public class DeleteMemberTest {

	private static String memberId;

	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao = MemberDaoImpl.getInstance();
		

		// UpdateMember �׽�Ʈ(true/false)
		String result = dao.deleteMember("java1234") == true ? 
						"���� ����" : "���� ����";
		System.out.println("DeleteMember �׽�Ʈ ��� " + result);
	}

}
