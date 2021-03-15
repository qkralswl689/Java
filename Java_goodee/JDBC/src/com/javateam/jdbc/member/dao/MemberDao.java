package com.javateam.jdbc.member.dao;

import java.util.List;

import com.javateam.jdbc.member.domain.MemberVo;

/**
 * DAO (Data Access Object) <br>
 * : CRUD(DML(CUD) + DQL(select)) methods들로 구성 한다 <br>
 * 참고) 간혹 DDL에 대응되는 메서드로 구성될 수도 있다 <br>
 * 
 * 참고 1) CRUD(create read update delete) <br>
 * 참고 2) CUD(create update delete) &rarr; 협의의(좁은 의미의) DML <br>
 * 
 * 참고) DB = 영구(영속) 저장소(Persistent Repository) <br>
 * 영속(영구) 객체 : Persistent(/-ce) Object &rarr; VO, DAO(VO없이는 작동 X), (D)TO <br>
 * 
 * @author mingki
 */

public interface MemberDao {
	/**
	 * 개별 회원 정보 삽입(생성)
	 * @param member 회원정보 객체
	 * @return 회원정보 생성 성공 여부
	 */
	
	public boolean insertMember(MemberVo member);
	
	/**
	 * 전체 회원 정보들 조회(검색)
	 * @return 전체 회원정보 리스트(목록)
	 */
	public List<MemberVo> getAllMembers();
	
	/**
	 * 개별 회원정보 조회(검색)
	 * @param memberId 회원 아이디
	 * @return 개별 회원정보(VO)
	 */
	public MemberVo getMember(String memberId);

	/**
	 * 개별 회원정보 수정(갱신)
	 * 
	 * @param member 회원정보 객체(VO)
	 * @return 회원정보 갱신(수정)성공 여부
	 */
	public boolean updateMember(MemberVo member);
	
	/**
	 * 개별 회원정보 삭제
	 * @param memberId 회원 아이디
	 * @return 회원정보 삭제 성공 여부
	 */
	public boolean deleteMember(String memberId);
	
	/**
	 * 회원 여부 점검<br><br>
	 * ex) 회원가입시 회원 여부 점검시 활용<br><br>
	 * 
	 * @param memberId 회원 아이디
	 * @return 회원(존쟤) 여부 
	 */
	public boolean isMemberByMemberId(String memberId);
	
	/**
	 * 회원 여부(인증) 점검 <br><br>
	 * : 회원 여부(인증) 점검 테스트<br><br>
	 * ex) 회원 로그인(인증:authentidation)<br><br>
	 * 
	 * - 메시지 종류 : <br>
	 * 1) 회원 아이디가 존재하지 않을 경우 : 회원 아이디가 존재하지 않습니다. <br><br>
	 * 2) 회원 아이디가 존재하지만 회원 패스워드가 맞지 않을 경우 : 회원 패스워드가 일치하지 않습니다<br><br>
	 * 3) 회원 아이디/회원 패스워드가 전부 일치할 경우 : 일치하는 회원 정보가 존재합니다<br><br>
	 * 
	 * @param memberId 회원 아이디
	 * @param memberPassword 회원 패스워드
	 * @return 인증메시지
	 */
	public String isMember(String memberId, String memberPassword);
}
