package JDBC;

import java.util.List;

import JDBC.MemberVo;

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
}
