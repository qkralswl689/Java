package com.javateam.jdbc.member.test;


import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

/**
 * isEnableEmail 단위 테스트 케이스<br>
 * : 이메일 중복 점검 테스트<br><br>
 * 
 * @author migki
 *
 */
public class isEnableEmailTest {

	public static void main(String[] args) {
		
		// DAO 객체 생성
		MemberDao dao = MemberDaoImpl.getInstance();
		
		// 존재하는 아이디와 존재하지 않는 이메일 두가지 경우를 테스트
		// 1) DB 현황에 존재하는 이메일 로 점검
		System.out.println("회원 이메일 존재 여부(goodee_1@abcd.com) 존재할경우: " + dao.isEnableEmail("goodee_1@abcd.com"));
		
		// 2) DB 현황에 존재하지 않는 이메일  점검
		System.out.println("회원 이메일 존재 여부(1234) 존재하지않을경우 : " + dao.isEnableEmail("1234"));

	}

}
