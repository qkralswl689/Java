package com.javateam.jdbc.member.test;


import java.util.List;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;
import com.javateam.jdbc.member.domain.MemberVo;

/**
 * getMembersByPaging ���� �׽�Ʈ ���̽�<br>
 * : ����¡ ������ ��ü ȸ������ ��ȸ �׽�Ʈ<br><br>
 * 
 * @author migki
 *
 */
public class PagingTest {

	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao= MemberDaoImpl.getInstance();
		
		// ����¡�� ���� �׽�Ʈ ��밪
		
		// 1) Ư�� ������ �Է½� �ο��� - ���������� �ο��� 10�� ����
		// 2) ó��/������ �ο� ȸ�� ���̵� ������ ����
		// ex) 1 ������ ù ���̵� = goodee_1001, ������ ���̵� = goodee_1010
		
		List<MemberVo> members = dao.getMembersByPaging(1, 10);
		
		// 1) Ư�� ������ �Է½� �ο��� - ���������� �ο��� 10�� ����
		System.out.println("Ư�� ������ �Է½� �ο��� : " + members.size());
		
		// 2) ó��/������ �ο� ȸ�� ���̵� ������ ����
		// ex) 1 ������ ù ���̵� = goodee_1001, ������ ���̵� = goodee_1010
		System.out.println("ó�� �ο� ȸ�� ���̵� ������ ����  : " + members.get(0).getMemberId().equals("goodee_1001"));
		System.out.println("������ �ο� ȸ�� ���̵� ������ ����  : " + members.get(9).getMemberId().equals("goodee_1010"));
		
		// Ư�� ������ ��ü �ο� ���
		for(MemberVo m : members) {
			System.out.println(m);
		}
				
		// ���� �ۼ����ڵ� 
		//System.out.println(dao.getMembersByPaging(1,10 ));		
	}
}
