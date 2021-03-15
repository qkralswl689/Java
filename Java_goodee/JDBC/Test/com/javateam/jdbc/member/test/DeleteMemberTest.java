package com.javateam.jdbc.member.test;


import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

/**
 * deleteMember ���� �׽�Ʈ ���̽�(Unit Test Case) <br>
 * : ȸ������ ���� �׽�Ʈ<br><br>
 * 
 * @author mingki
 *
 */
public class DeleteMemberTest {

	private static String memberId;

	public static void main(String[] args) {
		
		// DAO ��ü ����(�̱��� ��ü)
		MemberDao dao = MemberDaoImpl.getInstance();
		

		// UpdateMember �׽�Ʈ(true/false)
		String result = dao.deleteMember("java12345") == true ? 
						"���� ����" : "���� ����";
		System.out.println("DeleteMember �׽�Ʈ ��� " + result);
	}

}
