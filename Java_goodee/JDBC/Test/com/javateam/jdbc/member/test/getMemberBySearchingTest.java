package com.javateam.jdbc.member.test;

import java.util.ArrayList;
import java.util.List;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;
import com.javateam.jdbc.member.domain.MemberVo;
/**
 * getMembersBySearching 메서드 단위 테스트 케이스(Unit TestCase)<br>
 * : 검색어를 통한 페이징 지원 회원정보 조회 테스트<br><br>
 * 
 * @author mingki
 *
 */
public class getMemberBySearchingTest {

	public static void main(String[] args) {
		
		// DAO 객체 생성
		MemberDao dao = MemberDaoImpl.getInstance();
		
		// 각종 검색어(검색 필드)를 적용하여 검색합니다.
		
			// List<MemberVo> members = dao.getMembersBySearching("이름", "길동", false, "ASC", 1, 10);
			// List<MemberVo> members = dao.getMembersBySearching("이름2", "길동", false, "ASC", 1, 10);
			// List<MemberVo> members = dao.getMembersBySearching("이름", "길동", false, "DESC", 1, 10);
			// List<MemberVo> members = dao.getMembersBySearching("기본주소", "종로2", false, "DESC", 1, 10);
			// List<MemberVo> members = dao.getMembersBySearching("기본주소", "종로", false, "DESC", 1, 10);
			// List<MemberVo> members = dao.getMembersBySearching("생일", "1990-01-02", false, "DESC", 1, 10); 
			// List<MemberVo> members = dao.getMembersBySearching("생일", "1990-01-02", true, "DESC", 1, 10);
			// List<MemberVo> members = dao.getMembersBySearching("생일", "1990-01-02", true, "DESC", 1, 10);
			// List<MemberVo> members = dao.getMembersBySearching("가입일", "1990-01-02", true, "DESC", 1, 10);
			 List<MemberVo> members = dao.getMembersBySearching("가입일", "2021-03-15", false, "DESC", 1, 10);
			//List<MemberVo> members = dao.getMembersBySearching("가입일", "2021-03-11", true, "DESC", 1, 10);

			for (MemberVo m : members) {
				System.out.println(m);
			}
			
		// 내가 작성한 코드
		//System.out.println(dao.getMembersBySearching("member_name", "순", true, "ASC", 1, 10));
	}
}
