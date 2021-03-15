package com.javateam.jdbc.member.test;


import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

/**
 * deleteMember 단위 테스트 케이스(Unit Test Case) <br>
 * : 회원정보 삭제 테스트<br><br>
 * 
 * @author mingki
 *
 */
public class DeleteMemberTest {

	private static String memberId;

	public static void main(String[] args) {
		
		// DAO 객체 생성(싱글톤 객체)
		MemberDao dao = MemberDaoImpl.getInstance();
		

		// UpdateMember 테스트(true/false)
		String result = dao.deleteMember("java12345") == true ? 
						"삭제 성공" : "삭제 실패";
		System.out.println("DeleteMember 테스트 결과 " + result);
	}

}
