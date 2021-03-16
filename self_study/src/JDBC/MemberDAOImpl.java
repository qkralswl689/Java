package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


// MemberDAO 구현클래스
public class MemberDAOImpl implements MemberDAO {
	
	// DAO 객체 생성
	private static MemberDAOImpl instance = null;
	
	// 기본 생성자
	private MemberDAOImpl() {}
	
	// 싱클톤 객체 생성 메서드
	public static final MemberDAOImpl getInstance() {
		// final : 오버라이드 금지
		
		if(instance == null) {
			instance = new MemberDAOImpl();
		}
		 return instance;
	}
	
	@Override
	public boolean insertMember(MemberVO member) {
		
		// 리턴값 초기화
		boolean result = false;
		
		String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		//DB 연결
		Connection con = DBUtil.connect();
		
		// SQL처리 객체
		PreparedStatement pstmt = null;
		
		// SQL 구문
		String sql = "INSERT INTO studyjdbc VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
		
		// SQL ,인자(선) 처리
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPassword());
			pstmt.setString(3, member.getMemberNickname());
			pstmt.setString(4, member.getMemberName());
			pstmt.setString(5, member.getMemberGender() + ""); // char -> String 변환 위해 뒤에 "" 붙힌다
			pstmt.setString(6, member.getMemberEmail());
			pstmt.setString(7, member.getMemberPhone());
			pstmt.setDate(8,member.getMemberBirth());
			pstmt.setString(9, member.getMemberZip());
			pstmt.setString(10, member.getMemberAddressBasic());
			pstmt.setString(11, member.getMemberAddressDetail());
			
			if(pstmt.executeUpdate() == 1) {
				System.out.println("저장 성공");
				result = true;
			}else {
				System.out.println("저장 실패");
			}
		} catch(SQLException e) {
			System.out.println(methodName + "회원 정보 예외발생");
			System.out.println(methodName + e.getMessage());
			
		}finally {
			DBUtil.cloese(con, pstmt, null);
		}
		return result;
	}

	@Override
	public List<MemberVO> getAllMembers() {
		// 리턴(반환값) 처리
		 List<MemberVO> members = new ArrayList<>();
		 
		// 개별 회원정보 객체 선언
		 MemberVO member = new MemberVO();
		 
		// 실행 메서드명  
		String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB 연결
		Connection con = DBUtil.connect();
		
		// SQL 처리 객체
		PreparedStatement pstmt = null;
		
		// SQL 결과셋 객체(DQL:select)
		ResultSet rs = null;
		
		// SQL 구문
		String sql = "SELECT * FRom STUDYJDBC";
		
		// SQL 처리
		try {
			pstmt = con.prepareStatement(sql);
			
			// SQL 결과셋 객체 생성
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				// 개별 회원정보 생성
				member = new MemberVO();
				member.setMemberId(rs.getString("member_Id"));
 				member.setMemberPassword(rs.getString("member_Password"));
 				member.setMemberNickname(rs.getString("member_Nickname"));
 				member.setMemberName(rs.getString("member_Name"));
 				member.setMemberGender(rs.getString("member_Gender").charAt(0)); // char로 변환
 				member.setMemberEmail(rs.getString("member_Email"));
 				member.setMemberPhone(rs.getString("member_Phone"));
 				member.setMemberBirth(rs.getDate("member_Birth"));
 				member.setMemberZip(rs.getString("member_Zip"));
 				member.setMemberAddressBasic(rs.getString("member_Address_Basic"));
 				member.setMemberAddressDetail(rs.getString("member_Address_Detail"));
 				member.setMemberJoindate(rs.getDate("member_JoinDate"));
 			
 				// VO -> List 로 이관(add) : 개별 회원정보 추가
 				
 				members.add(member);
 				
			}
			// SQL 실행, 예외처리
		} catch (SQLException e) {
			System.out.println(methodName + " : " + e.getMessage());
		
			// 자원 반납
		}finally {
			DBUtil.cloese(con, pstmt, rs);
		}	
		
		// 리턴(반환)
		return members;
	}

	@Override
	public MemberVO getMember(String memberId) {
		// 리턴(반환값) 처리
		
		 
				// 실행 메서드명  
				
				// DB 연결
				
				// SQL 처리 객체
				
				// SQL 구문
				
				// SQL, 인자 (선)처리
				
				// SQL 실행, 예외처리
				
				// 자원 반납
				
				// 리턴(반환)
		return null;
	}

	@Override
	public boolean updateMemeber(MemberVO member) {
		
		// 리턴(반환값) 처리
		boolean result = false;

		// 실행 메서드명(reflection 사용)
		// new Exception() : 예외 발생시키기
		// getStackTrace(): stattraceElement라는 객체들의 배열로 printStackTrace()의 결과 반환
		String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB 연결
		Connection con = DBUtil.connect();
		
		// SQL 처리 객체
		PreparedStatement pstmt = null;
		
		// SQL 구문

		StringBuilder sq = new StringBuilder();
		
		sq.append("UPDATE STUDYJDBC SET ");
		sq.append("member_password= ?,");
		sq.append("member_address_basic= ? ,");
		sq.append("member_address_detail= ?" );
		sq.append("WHERE member_id= ?");
		
		// SQL, 인자 (선)처리
		try {
			pstmt = con.prepareStatement(sq.toString());
			
			pstmt.setString(1, member.getMemberPassword());
			pstmt.setString(2, member.getMemberAddressBasic());
			pstmt.setString(3, member.getMemberAddressDetail());
			pstmt.setString(4, member.getMemberId());
			
			if(pstmt.executeUpdate() == 1) {
				System.out.println("수정 성공");
				result = true;
			}else {
				System.out.println("수정 실패 ");
			}
		// SQL 실행, 리턴값 처리, 예외처리
		} catch (SQLException e) {
			System.out.println("Update 성공 여부 : " + result);
		// 자원 반납
		}finally {
			DBUtil.cloese(con, pstmt, null);	
		}
		// 리턴(반환)
		return result;
		
	}

	@Override
	public boolean deleteMember(String memberId) {
		// 리턴(반환값) 처리
		 boolean result = false;
		 
		// 실행 메서드명  
		 String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB 연결
		Connection con = DBUtil.connect();
		
		// SQL 처리 객체
		PreparedStatement pstmt = null;
		
		// SQL 구문
		String sql = "Delete STUDYJDBC WHERE member_id = ?";
		
		// SQL, 인자 (선)처리
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, memberId);
			if(pstmt.executeUpdate()==1) {
				System.out.println("삭제 성공");
				result = true;
			}else {
				System.out.println("삭제 실패");
			}
							
			// SQL 실행, 예외처리
		} catch (SQLException e) {
			System.out.println("삭제 처리시 예외발생");
			System.out.println(methodName + " : " + e.getMessage());
			e.printStackTrace();
			// 자원 반납
		} finally {
			DBUtil.cloese(con, pstmt, null);	
		
		}// 리턴(반환)		
		return result;
	}

	@Override
	public boolean isMember(String memberId) {
		return false;
	}

	@Override
	public String isMember(String memberId, String memberPassword) {
		return null;
	}

	@Override
	public List<MemberVO> getMembersByPaging(int page, int limit) {
		return null;
	}

	@Override
	public boolean isEnableEmail(String memberEmail) {
		return false;
	}

	

}
