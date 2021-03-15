package com.javateam.jdbc.member.test;


import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

/**
 * Paging  단위 테스트 케이스<br>
 * : 페이징에 의한 회원정보들 조회(검색)<br><br>
 * 
 * @author migki
 *
 */
public class PagingTest {

	public static void main(String[] args) {
		
		// DAO 객체 생성
		MemberDao dao= MemberDaoImpl.getInstance();
		
		
		System.out.println(dao.getMembersByPaging(10,1 ));
		
	}

}
