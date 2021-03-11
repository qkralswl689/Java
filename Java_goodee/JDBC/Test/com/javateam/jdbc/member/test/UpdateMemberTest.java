package com.javateam.jdbc.member.test;

import java.sql.Date;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;
import com.javateam.jdbc.member.domain.MemberVo;

/**
 * UpdateMember 메서드 단위 테스트(Unit Test Case) <br>
 * : 회원정보 수정 테스트<br><br>
 * 
 * @author mingki
 *
 */
public class UpdateMemberTest {

	public static void main(String[] args) {
		
		// DAO 객체 생성
		MemberDao dao = MemberDaoImpl.getInstance();
		
		// 수정할 외원정보 생성(MemberVO)
		MemberVo member = new MemberVo();
		
		member.setMemberPassword("11115");
		member.setMemberNicname("메니");
		member.setMemberBirth(Date.valueOf("1991-07-04"));
		member.setMemberAddressBasic("서울특별시");
		member.setMemberAddressDetail("타워펠리스");
		
		// UpdateMember 테스트(true/false)
		String result = dao.updateMember(member) == true ?
						"수정 성공" : "수정 실패";
		System.out.println("UpdateMember 테스트 결과 : " + result);
				
	}

}
