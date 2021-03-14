package JDBC;

public class deleteTest {

	public static void main(String[] args) {

		// DAO 객체 생성
		MemberDAO dao = MemberDAOImpl.getInstance();
		
		// UpdateMember 테스트(true/false)
		
		String result = dao.deleteMember("hyun")== true?
						"삭제 성공":"삭제 실패";

		System.out.println("삭제 성공 여부 : " + result);
		
	}

}
