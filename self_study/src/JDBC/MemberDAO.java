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
    /**
	 * 회원 여부 점검<br><br>
	 * ex) 회원가입시 회원 여부 점검시 활용<br><br>
	 * 
	 * @param memberId 회원 아이디
	 * @return 회원(존쟤) 여부 
	 */
	public boolean isMember(String memberId);
	
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
	
	/**
	 * 페이징에 의한 회원정보들 조회(검색)<br><br>
	 * 
	 * @param page 조회할 페이지 번호
	 * @param limit 페이지 당 출력행 수
	 * return 회원정보 리스트 (목록)
	 */
	public List<MemberVO> getMembersByPaging(int page, int limit);
	
	/**
	 * 이메일 중복 점검<br><br>
	 * : 사용 가능한 이메일 여부 점검<br><br>
	 * : ex) 회원가입시 이메일 중복 점검 <br>
	 * : 이메일 용도 &rarr; 이이디/비밀번호 분실시 검색 활용<br><br>
	 * @param memberEmail 이메일
	 * @return 가용 이메일 여부
	 */
	public boolean isEnableEmail(String memberEmail);
	
	public List<MemberVO> getMembersBySearching(String searchKey, String searchValue, boolean isEquivalentSearch,
			String sortDirection, int page, int limit);
}


