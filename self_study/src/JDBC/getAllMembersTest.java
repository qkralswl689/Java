package JDBC;

import java.util.ArrayList;
import java.util.List;

public class getAllMembersTest {
	
	// List의 id 갯수 계산하는 클래스 생성
	public static int getCountByWord(List<String> list, String id) {
		
		int count = 0;
		
		for(int i= 0; i<list.size(); i++) { // list사이즈만큼 반복
			if(list.get(i).contentEquals(id)) {
				// i인덱스에 id가 들어있다면 count변수에 1씩 더해서 저장한다
				count++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		
		MemberDAO dao = MemberDAOImpl.getInstance();
		
		System.out.println("인원수 확인 : " + (dao.getAllMembers().size() == 2 ? true : false));
		
		List<String> ids = new ArrayList<>();
		// ids 라는 문자열 list생성
		
		for(MemberVO m : dao.getAllMembers()) {
			
			ids.add(m.getMemberId());
			// ids 리스트에 id를 저장한다
		}
		
		List<MemberVO> list = dao.getAllMembers();
		
		for(int i=0; i<list.size();i++) {
			String id = list.get(i).getMemberId();
			// id변수에 리스트의 i번쨰 인덱스에 있는 id를 저장한다
			System.out.println(id + " : " + getCountByWord(ids,id));
		
		}
		
		

	}

}
