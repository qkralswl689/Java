package JDBC;

import java.sql.Date;

import JDBC.MemberVo;



/**
 * VO ���� �׽�Ʈ
 * 
 * @author mingki
 *
 */

public class VoTest {
		
	public static void main(String[] args) {
		
		// ��� ��ü����
		MemberVo member = new MemberVo();
		
		// 
		member.setMemberId("java");
		member.setMemberPassword("1234");
		member.setMemberNicname("������");
		member.setMemberName("����");
		member.setMemberGender('m');
		member.setMemberEmail("skfksnsk@gmail.com");
		member.setMemberPhone("010-3073-0694");
		
		// ���� ) 0000-00-00
		member.setMemberBirth(Date.valueOf("1991-01-04"));
		member.setMemberZip("12345");
		member.setMemberAddressBasic("�����");
		member.setMemberAddressDetail("������");
		
		// ���� ��¥ => ������ 
		member.setMemberJoindate(new Date(System.currentTimeMillis()));
		

		// ��ü ���� Ȯ��
		System.out.println(member);
		
	}

}
