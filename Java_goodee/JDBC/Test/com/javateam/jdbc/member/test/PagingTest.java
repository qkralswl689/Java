package com.javateam.jdbc.member.test;


import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

/**
 * Paging  ���� �׽�Ʈ ���̽�<br>
 * : ����¡�� ���� ȸ�������� ��ȸ(�˻�)<br><br>
 * 
 * @author migki
 *
 */
public class PagingTest {

	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao= MemberDaoImpl.getInstance();
		
		
		System.out.println(dao.getMembersByPaging(10,1 ));
		
	}

}
