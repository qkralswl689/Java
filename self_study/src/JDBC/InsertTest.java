package JDBC;

import java.sql.Date;

public class InsertTest {

	public static void main(String[] args) {

		MemberDAO dao = MemberDAOImpl.getInstance();
		
		MemberVO member = new MemberVO();

		member.setMemberId("ming");
		member.setMemberPassword("1234");
		member.setMemberNickname("멩");
		member.setMemberName("박미니");
		member.setMemberGender('f');
		member.setMemberEmail("abcd@abcd.com");
		member.setMemberPhone("010-1234-5678");
		member.setMemberBirth(Date.valueOf("1993-01-29"));
		member.setMemberZip("12345");
		member.setMemberAddressBasic("부천");
		member.setMemberAddressDetail("현대홈타운");
		
		String result = dao.insertMember(member) ==true ?
				"저장 성공" : "저장 실패";
		System.out.println("Insert 테스트 결과 : " + result);
	}

}
