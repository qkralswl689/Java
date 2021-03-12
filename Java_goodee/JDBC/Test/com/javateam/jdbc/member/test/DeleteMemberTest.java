package com.javateam.jdbc.member.test;

import java.sql.Date;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;
import com.javateam.jdbc.member.domain.MemberVo;

/**
 * DeleteMember 메서드 단위 테스트(Unit Test Case) <br>
 * : 회원정보 삭제 테스트<br><br>
 * 
 * @author mingki
 *
 */
public class DeleteMemberTest {

	private static String memberId;

	public static void main(String[] args) {
		
		// DAO 객체 생성
		MemberDao dao = MemberDaoImpl.getInstance();
		

		// UpdateMember 테스트(true/false)
		String result = dao.deleteMember("java1234") == true ? 
						"삭제 성공" : "삭제 실패";
		System.out.println("DeleteMember 테스트 결과 " + result);
	}

}
