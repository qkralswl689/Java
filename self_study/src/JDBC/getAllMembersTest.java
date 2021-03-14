package JDBC;

import java.util.ArrayList;
import java.util.List;

public class getAllMembersTest {
	
	// List�� id ���� ����ϴ� Ŭ���� ����
	public static int getCountByWord(List<String> list, String id) {
		
		int count = 0;
		
		for(int i= 0; i<list.size(); i++) { // list�����ŭ �ݺ�
			if(list.get(i).contentEquals(id)) {
				// i�ε����� id�� ����ִٸ� count������ 1�� ���ؼ� �����Ѵ�
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		
		MemberDAO dao = MemberDAOImpl.getInstance();
		
		System.out.println("�ο��� Ȯ�� : " + (dao.getAllMembers().size() == 2 ? true : false));
		
		List<String> ids = new ArrayList<>();
		// ids ��� ���ڿ� list����
		
		for(MemberVO m : dao.getAllMembers()) {
			
			ids.add(m.getMemberId());
			// ids ����Ʈ�� id�� �����Ѵ�
		}
		
		List<MemberVO> list = dao.getAllMembers();
		
		for(int i=0; i<list.size();i++) {
			String id = list.get(i).getMemberId();
			// id������ ����Ʈ�� i���� �ε����� �ִ� id�� �����Ѵ�
			System.out.println(id + " : " + getCountByWord(ids,id));
		
		}
		
		

	}

}
