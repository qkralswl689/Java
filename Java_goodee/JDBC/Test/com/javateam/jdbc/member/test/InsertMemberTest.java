package com.javateam.jdbc.member.test;

import java.sql.Date;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;
import com.javateam.jdbc.member.domain.MemberVo;

/**
 * InsertMember 메서드 단위 테스트(Unit Test Case) <br>
 * : 회원정보 생성 테스트<br><br>
 * 
 * @author mingki
 *
 */
public class InsertMemberTest {

	public static void main(String[] args) {
		
		// DAO 객체 생성
		MemberDao dao = MemberDaoImpl.getInstance();
		
		// 생성할 회원정보 생성 (MemberVO)
		MemberVo member = new MemberVo();
		
		member.setMemberId("mingming");		
		member.setMemberPassword("1234");
		member.setMemberNicname("만두");
		member.setMemberName("박00");
		member.setMemberGender('f');
		member.setMemberEmail("skfksnsk@skfk.com");
		member.setMemberPhone("010-1234-5678");
		member.setMemberBirth(Date.valueOf("1993-01-29"));
		member.setMemberZip("12345");
		member.setMemberAddressBasic("부천시");
		member.setMemberAddressDetail("현대홈타운");
		
		// InserMember 테스트(true/false)
		String result = dao.insertMember(member) == true ? 
		         "저장 성공" : "저장 실패";
		System.out.println("insertMember 테스트 결과 : " + result);
	}

}
