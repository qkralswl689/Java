package com.javateam.jdbc.member.test;


import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

/**
 * isMember(id,pw) 단위 테스트 케이스<br>
 * : 회원 인증 여부 점검 테스트<br><br>
 * 
 * @author migki
 *
 */
public class isMembeTest2 {

	public static void main(String[] args) {
		
		// DAO 객체 생성
		MemberDao dao = MemberDaoImpl.getInstance();
		
		System.out.println("회원 id,pw 일치할 경우: " + dao.isMember("java", "1234"));
		System.out.println("회원 id존재 but pw 불일치 할 경우 : " + dao.isMember("java", "1111"));
		System.out.println("회원 아이디 (spring) 존재하지 않을 경우 : " + dao.isMember("spring", "1111"));
		
		// 내가 작성한 코드
//		String result = dao.isMemberByMemberId("mini2") == true ?
//							"중복된 아이디가 있습니다" : "중복 없음";
//		System.out.println(result);
	}

}
