package JDBC;

import java.sql.Date;

import JDBC.MemberVo;



/**
 * VO 단위 테스트
 * 
 * @author mingki
 *
 */

public class VoTest {
		
	public static void main(String[] args) {
		
		// 멤버 객체생성
		MemberVo member = new MemberVo();
		
		// 
		member.setMemberId("java");
		member.setMemberPassword("1234");
		member.setMemberNicname("달팽이");
		member.setMemberName("배현");
		member.setMemberGender('m');
		member.setMemberEmail("skfksnsk@gmail.com");
		member.setMemberPhone("010-3073-0694");
		
		// 생일 ) 0000-00-00
		member.setMemberBirth(Date.valueOf("1991-01-04"));
		member.setMemberZip("12345");
		member.setMemberAddressBasic("서울시");
		member.setMemberAddressDetail("강서구");
		
		// 금일 날짜 => 가입일 
		member.setMemberJoindate(new Date(System.currentTimeMillis()));
		

		// 전체 내용 확인
		System.out.println(member);
		
	}

}
