package com.javateam.jdbc.member.test;


import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

/**
 * isMember(id,pw) ���� �׽�Ʈ ���̽�<br>
 * : ȸ�� ���� ���� ���� �׽�Ʈ<br><br>
 * 
 * @author migki
 *
 */
public class isMembeTest2 {

	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao = MemberDaoImpl.getInstance();
		
		System.out.println("ȸ�� id,pw ��ġ�� ���: " + dao.isMember("java", "1234"));
		System.out.println("ȸ�� id���� but pw ����ġ �� ��� : " + dao.isMember("java", "1111"));
		System.out.println("ȸ�� ���̵� (spring) �������� ���� ��� : " + dao.isMember("spring", "1111"));
		
		// ���� �ۼ��� �ڵ�
//		String result = dao.isMemberByMemberId("mini2") == true ?
//							"�ߺ��� ���̵� �ֽ��ϴ�" : "�ߺ� ����";
//		System.out.println(result);
	}

}
