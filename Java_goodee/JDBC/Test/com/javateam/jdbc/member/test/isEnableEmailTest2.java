package com.javateam.jdbc.member.test;


import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

/**
 * isEnableEmail(id, email) 단위 테스트 케이스<br>
 * : 이메일 중복 점검 테스트<br><br>
 * 
 * @author migki
 *
 */
public class isEnableEmailTest2 {

	public static void main(String[] args) {
		
		// DAO 객체 생성
		MemberDao dao = MemberDaoImpl.getInstance();
		
		System.out.println("회원 ID 존재, 본인의 Email 존재 : " + dao.isEnableEmail("hyun", "skfksnsk1@gmail.com"));
		System.out.println("회원 ID 존재, Email 존재X : " + dao.isEnableEmail("hyun", "skfksn@gmail.com"));
		System.out.println("회원 ID 존재, 다른회원 mail 존재: " + dao.isEnableEmail("hyun", "goodee_2@abcd.com"));
	}
}
