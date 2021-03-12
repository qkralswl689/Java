package JDBC;

import java.util.List;

// DAO : 데이터를 접근하는데 쓰이는 객체
public interface MemberDAO {
	
	// 개별 회원 정보 생성
	public boolean insertMember(MemberVO member);
	
	//  전체 회원정보 조회
	public List<MemberVO>getAllMembers();
 
	// 개별 회원정보 조회
	public MemberVO getMember(String memberId);
	
	// 개별 회원정보 수정
	public boolean updateMemeber(MemberVO member);
	
	// 개별 회원정보 삭제
    public boolean deleteMember(String memberId);
}
