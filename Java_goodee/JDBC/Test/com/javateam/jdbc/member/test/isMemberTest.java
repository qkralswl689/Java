package com.javateam.jdbc.member.test;


import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

/**
 * isMember 단위 테크스 케이스<br>
 * : 회원 여부 점검<br><br>
 * 
 * @author migki
 *
 */
public class isMemberTest {

	public static void main(String[] args) {
		
		// DAO 객체 생성
		MemberDao dao= MemberDaoImpl.getInstance();
		
		// 존재하는 아이디와 존재하지 않는 아이디 두가지 경우를 테스트
		// 1) 존재하는 아이디로 점검
		System.out.println("회원 아이디 존재 여부(java): " + dao.isMemberByMemberId("java"));
		
		// 2) 존재하지 않는 아이디로 점검
		System.out.println("회원 아이디 존재 여부(spring) : " + dao.isMemberByMemberId("spring"));
		
		// 내가 작성한 코드
//		String result = dao.isMemberByMemberId("mini2") == true ?
//							"중복된 아이디가 있습니다" : "중복 없음";
//		System.out.println(result);
	}

}
