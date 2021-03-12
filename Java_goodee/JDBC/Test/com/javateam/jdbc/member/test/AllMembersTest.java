package com.javateam.jdbc.member.test;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;
import com.javateam.jdbc.member.domain.MemberVo;
/**
 * GetAllMembers 메서드 단위 테스트 케이스(Unit TestCase)<br><br>
 * : 전체 회원정보 조회<br><br>
 * 
 * 
 * @author 82104
 *
 */
public class AllMembersTest {

	public static void main(String[] args) {
		
		// DAO 객체 생성
		MemberDao dao = MemberDaoImpl.getInstance();
		
		// 인원수 확인
		System.out.println("인원수 확인 : " + (dao.getAllMembers().size()==5 ? true: false));
		
		// 전체 현황 확인
		for (MemberVo m : dao.getAllMembers()) {
			System.out.println(m);
		}

	}

}
