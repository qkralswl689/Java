package JDBC;

import java.util.List;

public class serachTest {

	public static void main(String[] args) {

		MemberDAO dao = MemberDAOImpl.getInstance();
		
		//List<MemberVO> members = dao.getMembersBySearching("�̸�", "����", false, "ASC", 1, 10);
		List<MemberVO> members = dao.getMembersBySearching("���ּ�", "Ȳ��", false, "DESC", 1, 10);
		
		// �迭�� ������ ���ڸ�ŭ �ݺ����� 
		// for(�������� ���� : �迭��){
		// �ݺ����� ����}
		
		for(MemberVO m : members) {
			System.out.println(m);
		}
	}

}
