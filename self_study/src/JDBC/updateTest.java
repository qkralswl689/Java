package JDBC;

public class updateTest {

	public static void main(String[] args) {
		
		MemberDAO dao = MemberDAOImpl.getInstance();
		
		MemberVO member = new MemberVO();
		
		member.setMemberPassword("11112222");
		member.setMemberAddressBasic("서울특별시");
		member.setMemberAddressDetail("황제빌라뚱보네");
		member.setMemberId("hyun");
		
		String result = dao.updateMemeber(member) == true ? 
						"수정 성공" : "수정 실패";
		System.out.println("수정 성공 여부  : " + result);

	}

}
