package JDBC;

import java.sql.Date;

public class InsertTest {

	public static void main(String[] args) {

		MemberDAO dao = MemberDAOImpl.getInstance();
		
		MemberVO member = new MemberVO();

		member.setMemberId("ming");
		member.setMemberPassword("1234");
		member.setMemberNickname("��");
		member.setMemberName("�ڹ̴�");
		member.setMemberGender('f');
		member.setMemberEmail("abcd@abcd.com");
		member.setMemberPhone("010-1234-5678");
		member.setMemberBirth(Date.valueOf("1993-01-29"));
		member.setMemberZip("12345");
		member.setMemberAddressBasic("��õ");
		member.setMemberAddressDetail("����ȨŸ��");
		
		String result = dao.insertMember(member) ==true ?
				"���� ����" : "���� ����";
		System.out.println("Insert �׽�Ʈ ��� : " + result);
	}

}
