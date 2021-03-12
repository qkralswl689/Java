package com.javateam.jdbc.member.test;

import java.util.ArrayList;
import java.util.List;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;
import com.javateam.jdbc.member.domain.MemberVo;
/**
 * getAllMembers �޼��� ���� �׽�Ʈ ���̽�(Unit TestCase)<br><br>
 * : ��ü ȸ������ ��ȸ<br><br>
 * 
 * @author mingki
 *
 */
public class AllMembersTest {

	public static int getCountByWord(List<String> list, String id) {
			
			int count = 0;
	
			for (int i=0; i<list.size(); i++) {
				
				if (list.get(i).contentEquals(id)) {
					count++;
				}
			}
			
			return count;
		}
	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao = MemberDaoImpl.getInstance();
		
		// �ο��� Ȯ��
		System.out.println("�ο��� Ȯ�� : " + (dao.getAllMembers().size()==8 ? true: false));
		
		// �׽�Ʈ ���̽� ���� ����
		// �ߺ��� ��� ���� ����
		// �� �࿡ ���� ȸ�� ���̵� �ߺ��� ����
		List<String> ids = new ArrayList<>();
		
		// ��ü ��Ȳ Ȯ��
		for (MemberVo m : dao.getAllMembers()) {
			// System.out.println(m);
			ids.add(m.getMemberId());
			
		}
		List<MemberVo> list = dao.getAllMembers();
		// id �ߺ����� ���
		for(int i=0; i<list.size();i++) {
			String id = list.get(i).getMemberId(); 
				System.out.println(id + ":" + getCountByWord(ids,id));
		}
	}

}
