package com.javateam.jdbc.member.test;

import java.util.ArrayList;
import java.util.List;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;
import com.javateam.jdbc.member.domain.MemberVo;
/**
 * getMembersBySearching �޼��� ���� �׽�Ʈ ���̽�(Unit TestCase)<br>
 * : �˻�� ���� ����¡ ���� ȸ������ ��ȸ �׽�Ʈ<br><br>
 * 
 * @author mingki
 *
 */
public class getMemberBySearchingTest {

	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao = MemberDaoImpl.getInstance();
		
		// ���� �˻���(�˻� �ʵ�)�� �����Ͽ� �˻��մϴ�.
		
			// List<MemberVo> members = dao.getMembersBySearching("�̸�", "�浿", false, "ASC", 1, 10);
			// List<MemberVo> members = dao.getMembersBySearching("�̸�2", "�浿", false, "ASC", 1, 10);
			// List<MemberVo> members = dao.getMembersBySearching("�̸�", "�浿", false, "DESC", 1, 10);
			// List<MemberVo> members = dao.getMembersBySearching("�⺻�ּ�", "����2", false, "DESC", 1, 10);
			// List<MemberVo> members = dao.getMembersBySearching("�⺻�ּ�", "����", false, "DESC", 1, 10);
			// List<MemberVo> members = dao.getMembersBySearching("����", "1990-01-02", false, "DESC", 1, 10); 
			// List<MemberVo> members = dao.getMembersBySearching("����", "1990-01-02", true, "DESC", 1, 10);
			// List<MemberVo> members = dao.getMembersBySearching("����", "1990-01-02", true, "DESC", 1, 10);
			// List<MemberVo> members = dao.getMembersBySearching("������", "1990-01-02", true, "DESC", 1, 10);
			 List<MemberVo> members = dao.getMembersBySearching("������", "2021-03-15", false, "DESC", 1, 10);
			//List<MemberVo> members = dao.getMembersBySearching("������", "2021-03-11", true, "DESC", 1, 10);

			for (MemberVo m : members) {
				System.out.println(m);
			}
			
		// ���� �ۼ��� �ڵ�
		//System.out.println(dao.getMembersBySearching("member_name", "��", true, "ASC", 1, 10));
	}
}
