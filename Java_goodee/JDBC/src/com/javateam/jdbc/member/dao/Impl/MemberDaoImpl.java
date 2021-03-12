/**
 * 
 */
package com.javateam.jdbc.member.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.domain.MemberVo;
import com.javateam.jdbc.member.util.DbUtil;

/**
 * MemberDao의 구현 클래스(concrete class)<br><br>
 * 
 *
 * 용례) MemberDao dao = MemberdaoImpl.getInstance();<br>
 * : 싱클턴(singleton:독신자) 패턴 적용 &rarr; 보안<br><br>
 *  
 * @author mingki
 *
 */
public class MemberDaoImpl implements MemberDao {
	
	/** DAO 객체 : 싱클턴(singleton) 생성 패턴 적용*/
	private static MemberDaoImpl instance = null;
	private MemberDaoImpl() {}
	
	/**
	 * 싱글턴 객체(DAO singleton object) 생성 메서드 
	 * 
	 * @return DAO 객체
	 */
	public static final MemberDaoImpl getInstance() {
		// final : 오버라이드 금지
		
		if(instance == null) {
			instance = new MemberDaoImpl();
		}
		 return instance;
	}

	@Override
	public boolean insertMember(MemberVo member) {
		
		// 리턴(반환값) 처리
		boolean result = false; // 결과값 초기화
		
		// 실행 메서드명(reflection 사용)
		String methodName 
		= new Exception().getStackTrace()[0].getMethodName();
		
		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 처리 객체
		PreparedStatement pstmt = null; // 1)
		// Statement pstmt = null; // 2)
		// 참고) Statement pstmt = null; // ? (와일드 카드) 사용할 수 없다
		// 참고) CallableStatment : PL/SQL 전용
		
		// SQL 구문
		String sql = "INSERT INTO member VALUES "  
				   + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";		
		
		// SQL, 인자 (선)처리
		try {
			pstmt = con.prepareStatement(sql); // 1) SQL(prepare) 선처리
			// pstmt = con.createStatment(); // 2) SQL 후처리
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPassword());
			pstmt.setString(3, member.getMemberNicname());
			pstmt.setString(4, member.getMemberName());
			pstmt.setString(5, member.getMemberGender() + ""); // char -> String 변환 위해 뒤에 "" 붙힌다
			pstmt.setString(6, member.getMemberEmail());
			pstmt.setString(7, member.getMemberPhone());
			pstmt.setDate(8,member.getMemberBirth());
			pstmt.setString(9, member.getMemberZip());
			pstmt.setString(10, member.getMemberAddressBasic());
			pstmt.setString(11, member.getMemberAddressDetail());
			
			// SQL 실행, 리턴값 처리, 예외처리
			if (pstmt.executeUpdate() == 1) { // 1 : DML 실행 성공한 행(tuple, record)의 수
				
				System.out.println("회원정보 저장에 성공하였습니다.");
				result = true;
				
			} else {
				
				System.out.println("회원정보 저장에 실패하였습니다.");
				// result = false;
			}
		} catch (SQLException e) {
			System.err.println(methodName + " : " + " 회원정보 저장시 예외가 발생하였습니다.");
			System.err.println(methodName + " : " + e.getMessage());
			// System.err.println(methodName + " : " + "회원정보 저장시 예외가 발생하였습니다.");
			e.printStackTrace();
		} finally {
			// 자원 반납
			DbUtil.close(con, pstmt, null);
		} //
		
		// 리턴(반환)
		return result;
	}

	@Override
	public List<MemberVo> getAllMembers() {
		
		// 리턴(반환값) 처리
		List<MemberVo> members = new ArrayList<>(); // List 사용
		
		// 개별 회원정보 객체 선언
		MemberVo member = null;
		
		// 실행 메서드명  
		String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 처리 객체
		PreparedStatement pstmt = null;
		
		// SQL 결과셋 객체(DQL:select)
		ResultSet rs = null;
		
		// SQL 구문
		String sql = "SELECT * FRom member";
		
		try {
			// SQL 처리
			pstmt = con.prepareStatement(sql);
			
			// SQL 결과셋 객체 생성
			rs = pstmt.executeQuery();
			
			// next() : 결과셋에서 다음 행을 조회하는 방식(iterator)
 			while(rs.next()) { 
 				
 				// 개별 회원정보 생성
 				// 주의) VO 객체 이 구문에서 선언  => 특정 개별 회원들만 여러행 출력된다 (안좋다)
 				// => 대책 : VO 객체 외부에서 선언한다 -> 리턴처리문 아래에 선언(MemberVo member = null;)
 				// MemberVo member = new MemberVo(); //=> 한명이 여러번 나오는 버그 발생
 				member = new MemberVo(); // (O)
 				
 				// SQL 결과셋 -> VO에  이관
 				member.setMemberId(rs.getString("member_Id"));
 				member.setMemberPassword(rs.getString("member_Password"));
 				member.setMemberNicname(rs.getString("member_Nickname"));
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
		}catch(SQLException e) {
			System.out.println(methodName + " : " + e.getMessage());
			
		} finally {
			// 자원 반납
			DbUtil.close(con, pstmt, rs);		
		
	   } // 리턴(반환)
		return members ;
	}

	@Override
	public MemberVo getMember(String memberId) {
		// 리턴(반환값) 처리
		 MemberVo member = new MemberVo();
		 
		// 실행 메서드명  
		 String methodName = new Exception().getStackTrace()[0].getMethodName();
		 
		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 처리 객체
		PreparedStatement pstmt = null;
		
		// SQL 결과셋 객체(DQL : select)
		ResultSet rs = null;
		
		// SQL 구문
		String sql = "SELECT * FROM member WHERE member_id= ? ";
		
		// SQL, 인자 (선)처리, SQL 실행, 예외처리
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberId);
			
			rs = pstmt.executeQuery();
			
			// 한줄 나오기때문에 while문 안써도됨
			if(rs.next()) {
				member.setMemberId(rs.getString("member_Id"));
 				member.setMemberPassword(rs.getString("member_Password"));
 				member.setMemberNicname(rs.getString("member_Nickname"));
 				member.setMemberName(rs.getString("member_Name"));
 				member.setMemberGender(rs.getString("member_Gender").charAt(0)); // char로 변환
 				member.setMemberEmail(rs.getString("member_Email"));
 				member.setMemberPhone(rs.getString("member_Phone"));
 				member.setMemberBirth(rs.getDate("member_Birth"));
 				member.setMemberZip(rs.getString("member_Zip"));
 				member.setMemberAddressBasic(rs.getString("member_Address_Basic"));
 				member.setMemberAddressDetail(rs.getString("member_Address_Detail"));
 				member.setMemberJoindate(rs.getDate("member_JoinDate"));
 				
 				
			}
			
		}catch(SQLException e) {
			System.out.println(methodName + " : " + e.getMessage());
			
		}finally {
			// 자원 반납
			DbUtil.close(con, pstmt, rs);
		}
				
		// 리턴(반환)
		return member;
	}

	@Override
	public boolean updateMember(MemberVo member) {
		// 리턴 처리
		boolean result = false;
		
		// 실행 메서드명
		String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB연결
		Connection con = DbUtil.connect();
		
		// SQL 처리 객체
		PreparedStatement pstmt = null;
		
		// SQL 구문
		
		// 1) 
//		String sql = "UPDATE member SET "
//					+ "member_password=?,member_nickname = ?,member_birth=?,"
//					+ "member_address_basic=?,member_address_detail=? "
//					+ "WHERE MEMBER_ID= ? ";
		
		// 2)
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE member SET ");
		sql.append("member_Password = ?,");
		sql.append("member_nickname = ?,");
		sql.append("member_birth=?,");
		sql.append("member_address_basic=?,");
		sql.append("member_address_detail=? ");
		sql.append("WHERE MEMBER_ID=?");
		
		// SQL, 인자(선) 처리
		
		try {
			// 1) pstmt = con.prepareStatement(sql);
			
			// 2) sql.toString : StringBulder를 변환해서 사용
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setString(1, member.getMemberPassword());
			pstmt.setString(2, member.getMemberNicname());
			pstmt.setDate(3, member.getMemberBirth());
			pstmt.setString(4, member.getMemberAddressBasic());
			pstmt.setString(5, member.getMemberAddressDetail());
			pstmt.setString(6, member.getMemberId());
			// SQL 실행, 리턴값 처리, 예외처리
			if(pstmt.executeUpdate()==1) {
		//	pstmt.executeUpdate() > 2 ) { // 여러명 정보 수정시 조건문예시
				System.out.println("회원정보 수정에 성공하였습니다.");
				result = true;
			}else {
				System.out.println("회원정보 수정에 실패하였습니다.");
			}
				
		} catch (SQLException e) {
			System.err.println(methodName + ": " +"회원정보 저장시 예외가 발생하였습니다.");
			System.err.println(methodName + " : " + e.getMessage());
			e.printStackTrace();
		}finally {
			// 자원 반납
			DbUtil.close(con, pstmt, null);
		}
		return result;
	}

	@Override
	public boolean deleteMember(String memberId) {
		
		// 리턴(반환값) 처리
		boolean result = false;
		
		// 실행 메서드명  
		String MethodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 처리 객체
		PreparedStatement pstmt = null;
		
		// SQL 구문
		String sql = "DELETE member WHERE member_id=?";
		
		// SQL, 인자 (선)처리
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, memberId);
			if(pstmt.executeUpdate()==1) {
				System.out.println("회원정보 삭제가 완료 되었습니다");
				result = true;
			}else {
				System.out.println("회원정보 삭제에 실패하였습니다");
			}
		
			// SQL 실행, 예외처리
		}catch(SQLException e) {
			System.out.println(MethodName + " : " + "회원정보 삭제시 예외 발생");
			System.out.println(MethodName + " : " + e.getMessage());
			
		} finally {
			// 자원 반납
			DbUtil.close(con, pstmt, null);
		}		
		// 리턴(반환)
		return result;
	}

}