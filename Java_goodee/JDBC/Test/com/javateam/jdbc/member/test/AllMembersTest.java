package com.javateam.jdbc.member.test;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;
import com.javateam.jdbc.member.domain.MemberVo;
/**
 * GetAllMembers �޼��� ���� �׽�Ʈ ���̽�(Unit TestCase)<br><br>
 * : ��ü ȸ������ ��ȸ<br><br>
 * 
 * 
 * @author 82104
 *
 */
public class AllMembersTest {

	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao = MemberDaoImpl.getInstance();
		
		// �ο��� Ȯ��
		System.out.println("�ο��� Ȯ�� : " + (dao.getAllMembers().size()==5 ? true: false));
		
		// ��ü ��Ȳ Ȯ��
		for (MemberVo m : dao.getAllMembers()) {
			System.out.println(m);
		}

	}

}
