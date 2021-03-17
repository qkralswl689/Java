package JDBC;

import java.util.List;

public class serachTest {

	public static void main(String[] args) {

		MemberDAO dao = MemberDAOImpl.getInstance();
		
		//List<MemberVO> members = dao.getMembersBySearching("이름", "배현", false, "ASC", 1, 10);
		List<MemberVO> members = dao.getMembersBySearching("상세주소", "황제", false, "DESC", 1, 10);
		
		// 배열의 데이터 숫자만큼 반복수행 
		// for(데이터형 변수 : 배열명){
		// 반복수행 문장}
		
		for(MemberVO m : members) {
			System.out.println(m);
		}
	}

}
