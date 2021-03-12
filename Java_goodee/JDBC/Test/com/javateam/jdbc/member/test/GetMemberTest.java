package com.javateam.jdbc.member.test;

import java.sql.Date;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;
import com.javateam.jdbc.member.domain.MemberVo;

/**
 * getMember 메서드 단위 테크스 케이스<br>
 * : 개별 회원 정보 조회<br><br>
 * 
 * @author migki
 *
 */
public class GetMemberTest {

	public static void main(String[] args) {
		
		// DAO 객체 생성
		MemberDao dao= MemberDaoImpl.getInstance();
		
		// DB에 입력된 값들과 VO 값을 비교
		// 비교대상 VO 준비
		MemberVo member = new MemberVo();
		
		member.setMemberId("java5555");
		member.setMemberPassword("1234");
		member.setMemberNicname("구디샘");
		member.setMemberName("홍길동");
		member.setMemberGender('m');
		member.setMemberEmail("abcd@abcd.com");
		member.setMemberPhone("010-1234-5678");
		member.setMemberBirth(Date.valueOf("2016-02-05"));
		member.setMemberZip("12345");
		member.setMemberAddressBasic("서울 금천 가산");
		member.setMemberAddressDetail("구디아카데미");
		// 날짜 입력
		member.setMemberJoindate(Date.valueOf("2021-03-12"));
		
		System.out.println(member);
		System.out.println(dao.getMember("java5555"));
		
		System.out.println(member.hashCode());
		System.out.println(dao.getMember("java5555").hashCode());
		
		String result = member.equals(dao.getMember("java5555"))?
						"회원정보 조회 성공" : "회원정보 조회 실패";
		
		System.out.println(result);
		
	}

}
