package JDBC;

import java.sql.Date;

public class InsertTest {

	public static void main(String[] args) {

		MemberDAO dao = MemberDAOImpl.getInstance();
		
		MemberVO member = new MemberVO();

		member.setMemberId("hyun");
		member.setMemberPassword("1234");
		member.setMemberNickname("����");
		member.setMemberName("����");
		member.setMemberGender('m');
		member.setMemberEmail("abcd@abcd.com");
		member.setMemberPhone("010-1234-5678");
		member.setMemberBirth(Date.valueOf("1991-01-04"));
		member.setMemberZip("12345");
		member.setMemberAddressBasic("����");
		member.setMemberAddressDetail("Ȳ������");
		
		String result = dao.insertMember(member) ==true ?
				"���� ����" : "���� ����";
		System.out.println("Insert �׽�Ʈ ��� : " + result);
	}

}
