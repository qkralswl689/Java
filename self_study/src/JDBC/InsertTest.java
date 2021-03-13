package JDBC;

import java.sql.Date;
import JDBC.MemberDAOImpl;

public class InsertTest {

	public static void main(String[] args) {
		
		MemberDAO dao = new MemberDAOImpl.getInstance();
		
		MemberVO member = new MemberVO();
		
		member.setMemberId("hyun");
		member.setMemberPassword("1234");
		member.setMemberNickname("혀니");
		member.setMemberName("배현");
		member.setMemberGender('m');
		member.setMemberEmail("abcd@abcd.com");
		member.setMemberPhone("010-1234-5678");
		member.setMemberBirth(Date.valueOf("1991-01-00"));
		member.setMemberZip("12345");
		member.setMemberAddressBasic("서울");
		member.setMemberAddressDetail("황제빌라");

	}

}
