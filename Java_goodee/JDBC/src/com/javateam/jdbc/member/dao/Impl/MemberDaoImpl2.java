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
import com.javateam.jdbc.member.util.ExceptionMetadata;

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
public class MemberDaoImpl2 implements MemberDao {
	
	/** DAO 객체 : 싱클턴(singleton) 생성 패턴 적용*/
	private static MemberDaoImpl2 instance = null;
	private MemberDaoImpl2() {}
	
	/**
	 * 싱글턴 객체(DAO singleton object) 생성 메서드 
	 * 
	 * @return DAO 객체
	 */
	public static final MemberDaoImpl2 getInstance() {
		// final : 오버라이드 금지
		
		if(instance == null) {
			instance = new MemberDaoImpl2();
		}
		 return instance;
	}

	@Override
	public boolean insertMember(MemberVo member) {
		
		// 리턴(반환값) 처리
		boolean result = false; // 결과값 초기화
		
		// 실행 메서드명(reflection 사용)
		// 트랜잭션 / 예외처리 객체 생성
		ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
//		String methodName 
//		= new Exception().getStackTrace()[0].getMethodName();
		
		
		 
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
			// 트랜잭션 처리에 따른 수둥 커밋(commit)모드 설정
			con.setAutoCommit(false);
			
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
			// 트랜잭션(transaction) 승인 명령(commit)
			con.commit();
			
		} catch (SQLException e) {
//			System.err.println(methodName + " : " + " 회원정보 저장시 예외가 발생하였습니다.");
//			System.err.println(methodName + " : " + e.getMessage());
//			// System.err.println(methodName + " : " + "회원정보 저장시 예외가 발생하였습니다.");
//			e.printStackTrace();
			emd.printErr(e, con, true);
			
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
		// 트랜잭션 / 예외처리 객체 생성
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
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
			//System.out.println(methodName + " : " + e.getMessage());
			emd.printErr(e, con, false);
			
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
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		 ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
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
			// System.out.println(methodName + " : " + e.getMessage());
			emd.printErr(e, con, false);
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
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
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
			// 트랜잭션 처리에 따른 수둥 커밋(commit)모드 설정
			con.setAutoCommit(false);
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
			con.commit();
		} catch (SQLException e) {
//			System.err.println(methodName + ": " +"회원정보 저장시 예외가 발생하였습니다.");
//			System.err.println(methodName + " : " + e.getMessage());
//			e.printStackTrace();
			emd.printErr(e, con, true);
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
		// getStackTrace()[0] : 배열의 0번째 요소
		//String MethodName = new Exception().getStackTrace()[0].getMethodName();
		ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 처리 객체
		PreparedStatement pstmt = null;
		
		// SQL 구문
		String sql = "DELETE member WHERE member_id=?";
		
		// SQL, 인자 (선)처리
		try {
			// 트랜잭션 처리에 따른 수둥 커밋(commit)모드 설정
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, memberId);
			if(pstmt.executeUpdate()==1) {
				System.out.println("회원정보 삭제가 완료 되었습니다");
				result = true;
			}else {
				System.out.println("회원정보 삭제에 실패하였습니다");
				// result = false;
			}
			con.commit();
		
			// SQL 실행, 예외처리
		}catch(SQLException e) {
//			System.out.println(MethodName + " : " + "회원정보 삭제시 예외 발생");
//			System.out.println(MethodName + " : " + e.getMessage());
			emd.printErr(e, con, true);
		} finally {
			// 자원 반납
			DbUtil.close(con, pstmt, null);
		}		
		// 리턴(반환)
		return result;
	}

	@Override
	public boolean isMember(String memberId) {
		
		// 리턴(반환값) 처리
		boolean result = false;
		
		// 실행 메서드명
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 처리 객체
		PreparedStatement pstmt = null;
		
		// 결과셋 객체
		ResultSet rs = null;
		// SQL 구문
		// String sql = "SELECT * FROM member WHERE member_id =?"; // 1)
		// String sql = "SELECT count(1) FROM member WHERE member_id =?"; // (O)
		// 참고 : https://hue9010.github.io/db/select_count/
		String sql = "SELECT count(*) FROM member WHERE member_id =?";

		// SQL, 인자(선)처리
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, memberId);
			// SQL 실행, 예외처리
			rs = pstmt.executeQuery();

			if(rs.next()) {
				// rs.getString("member_Id"); // 1)
				
				// 1 : 존재, 0 : 없음
				result = rs.getInt(1) == 1? true :false;
				// result = true; // 1)
			}				
			
		} catch (SQLException e) {
			//System.out.println(methodName + " : " + e.getMessage());
		emd.printErr(e, con, false);
			// 자원반납
		}finally {
			DbUtil.close(con, pstmt, rs);
		}
			
		// 리턴(반환)
		
		return result;
	}

	@Override
	public String isMember(String memberId, String memberPassword) {
		// 리턴(반환값) 처리
		 String result = "";
		 
		// 실행 메서드명  
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		 ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 처리 객체
		PreparedStatement pstmt = null;
		
		// 결과셋 객체
		ResultSet rs = null;
		
		// SQL 구문
		String sql = "SELECT count(*) FROM member WHERE member_id = ? AND member_password= ?";
		
		// SQL, 인자 (선)처리
		
		try {
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, memberId);
			pstmt.setString(2, memberPassword);
			
			if(this.isMember(memberId)==true) {
				
				rs = pstmt.executeQuery();
				if(rs.next()) {
					result = rs.getInt(1) == 1 ? "일치하는 회원정보 있음" : "회원 패스워드가 불일치";
				}
				
				// SQL 실행, 예외처리
				// hint ) isMember(String memberId)활용
				// 다중 조건 활용
				// 1) 회원 여부 점검
				// 1-1) 회원 여부 일치 => 패스워드 존재여부 점검
				// 2) 패스워드 일치 여부 점검
				// 2-1) 패스워드 일치할 경우 메시징
				// 2-2) 패스워드 불일치할 경우 메시징
				// 1-2) 회원 여부 불일치 => 메시징처리 	
				
				// isMember 재활용
					
					// 2)
					
			}else {
				result = "일치하는 회원 없음";
			}
				// 내가 작성한 코드 => 잘못됨
//			if(rs.next()) {
//				if(rs.getInt(1)==1) {
//					if(rs.getInt(2)==1) {
//						result += "일치하는 회원 정보가 존재합니다";
//					}else if(rs.getInt(2)==0) {
//						result += "회원 패스워드가 일치하지 않습니다";
//					}
//				}else if(rs.getInt(1)==0) {
//					result += "회원 아이디가 존재하지 않습니다";
//				}
//			}
			
		} catch (SQLException e) {
			
			//System.out.println(methodName + " : " + e.getMessage());
			emd.printErr(e, con, false);
			
			// 자원 반납
		}finally {
			DbUtil.close(con, pstmt, rs);
		}	
		
	
		// 리턴(반환)		
		return result;
	}

	@Override
	public List<MemberVo> getMembersByPaging(int page, int limit) {

		// 리턴(반환값) 처리
		List<MemberVo> members = new ArrayList<>();
		
		// 개별 회원정보 객체 선언
		MemberVo member = null;
		
		// 실행 메서드명  
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 처리 객체
		PreparedStatement pstmt = null;
		
		// 결과셋 객체
		ResultSet rs = null;
		
		// SQL 구문
		// 1)
//		String sql = "SELECT * " + 
//		 "FROM (SELECT ROWNUM, " + 
//		 "             m.*, " + 
//		 "             FLOOR((ROWNUM - 1) / ? + 1) page " + 
//		 "      FROM (" + 
//		 "             SELECT * FROM member " + 
//		 "             ORDER BY member_id ASC " + 
//		 "           ) m " + 
//		 "      ) " + 
//		 "WHERE page = ?";
//		
		// 2) 
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * ") 
		  .append("FROM (SELECT ROWNUM,") 
		  .append("             m.*,") 
		  .append("             FLOOR((ROWNUM - 1) / ? + 1) page ") 
		  .append("      FROM ( ") 
		  .append("             SELECT * FROM member ") 
		  .append("             ORDER BY member_id ASC ") 
		  .append("           ) m ") 
		  .append("      ) ") 
		  .append("WHERE page = ?");
		
		// SQL, 인자 (선)처리
		try {
			// pstmt = con.prepareStatement(sql); // 1)
			pstmt = con.prepareStatement(sb.toString()); // 2)
			// 내가 작성한것
//			pstmt.setInt(1,page);
//			pstmt.setInt(2,limit);
			
			pstmt.setInt(1, limit); // 한 페이지당 출력 인원 수 
			pstmt.setInt(2, page); // 현재 페이지
			
			// SQL 결과셋 객체 생성
			rs = pstmt.executeQuery();
		
			while(rs.next()) {
			
				member = new MemberVo(); 
				
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
			
		} catch (SQLException e) {
			//System.out.println(methodName + " : " + e.getMessage());
			emd.printErr(e, con, false);
			// 자원 반납
		}finally {
			DbUtil.close(con, pstmt, rs);
		}		
		// 리턴(반환)
		return members;
	}

	@Override
	public boolean isEnableEmail(String memberEmail) {

		// 리턴(반환값) 처리
		 boolean result = false;
		 
		// 실행 메서드명  
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		 ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 처리 객체
		PreparedStatement pstmt = null;
		
		// 결과셋 객체 (DOL : select)
		ResultSet rs = null;
		
		// SQL 구문
		// 내가 작성한거
//		String sql = "SELECT count(*) FROM member " + 
//				"WHERE member_email = ? ";
		
		// 1) 
//		String sql = "SELECT DECODE(count(*), 0, 'true', 1, 'false') as email_flag "
//				+ "FROM member " 
//				+ "WHERE member_email = ? ";
		
		// 2) 
		String sql = "SELECT count(*) FROM member " + 
		"WHERE member_email = ? ";
		
		// SQL, 인자 (선)처리
		try {
			pstmt = con.prepareStatement(sql);
			 pstmt.setString(1, memberEmail);
			// SQL 결과셋 객체 생성
			 rs = pstmt.executeQuery();
			// SQL 실행, 예외처리
			 
			 // 1)
//			 if(rs.next()) {
//				 // boolean으로 형변환
//				 // result = Boolean.valueOf(rs.getString(1)); //(O)
//				 // result = new Boolean(rs.getString(1)); // (O)
//				 result = new Boolean(rs.getString("email_flag"));
//			 }
			 // 2)
			 if(rs.next()) {
				 result = rs.getInt(1) == 1 ? false : true;
			 }
			 
			 // 내가 작성한 코드
//			 while(rs.next()) {				 
//				 result = rs.getBoolean(1)== false ? false:true;				 
//			 }
			
		} catch (SQLException e) {
			
			//System.out.println(methodName + " : " + e.getMessage());
			emd.printErr(e, con, false);
			// 자원 반납
		}finally {
			DbUtil.close(con, pstmt, rs);
			
		}
		// 리턴(반환)
		return result;
	}

	@Override
	public boolean isEnableEmail(String memberId, String memberEmail) {
		// 리턴(반환값) 처리
		boolean result = false;
		 
		// 실행 메서드명  
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
		// DB 연결
		Connection con = DbUtil.connect();

		// SQL 처리 객체
		PreparedStatement pstmt = null;

		// 결과셋 객체 (DOL : select)
		ResultSet rs = null;

		// SQL 구문
		// 내가 작성한거
		String sql = "SELECT count(*) FROM member " + 
				"WHERE member_id != ? AND member_email = ? ";

//		String sql = "SELECT DECODE(count(*), 0, 'true', 1, 'false') as email_flag "
//		+ "FROM member " 
//		+ "WHERE memberid != ? AND member_email = ? ";
//		
		// SQL, 인자 (선)처리
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,memberId);
			pstmt.setString(2, memberEmail);

			// SQL 결과셋 객체 생성
			rs = pstmt.executeQuery();
			
			// SQL 실행, 예외처리	
			if(rs.next()) {
				result = rs.getInt(1) == 0 ? true : false;
			
				result = false;
			}
			
		} catch (SQLException e) {
			//System.out.println(methodName + " : " + e.getMessage());
			emd.printErr(e, con, false);
			// 자원 반납
		}finally {
			DbUtil.close(con, pstmt, rs);
			
		}

		// 리턴(반환)
		return result;
	}

	@Override
	public boolean isEnablePhone(String memberPhone) {
		// 리턴(반환값) 처리
		 boolean result = false;
		// 실행 메서드명  
		 ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
		 
		// DB 연결
		 Connection con = DbUtil.connect();
		 
		// SQL 처리 객체
		 PreparedStatement pstmt = null;
		 
		// 결과셋 객체 (DOL : select)
		 ResultSet rs = null;

		// SQL 구문
		 String sql = "SELECT count(*) FROM member "
		 		+ "WHERE member_phone = ? ";

		// SQL, 인자 (선)처리
		 try {
			// SQL 결과셋 객체 생성 			 
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, memberPhone);
			
			rs = pstmt.executeQuery();
			// SQL 실행, 예외처리
			
			if(rs.next()) {
				result = rs.getInt(1) == 1 ? false:true ;
			}

		} catch (SQLException e) {
			emd.printErr(e, con, false);
			
		// 자원 반납
		} finally {
			DbUtil.close(con, pstmt, rs);
			
		}
		// 리턴(반환)
		return result;
	}

	@Override
	public boolean isEnablePhone(String memberId, String memberPhone) {
		// 리턴(반환값) 처리
		 boolean result = false;
		 
		// 실행 메서드명  
		  ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);

		// DB 연결
		  Connection con = DbUtil.connect();

		// SQL 처리 객체
		  PreparedStatement pstmt = null;

		// 결과셋 객체 (DOL : select)
		  ResultSet rs = null;

		// SQL 구문
		  String sql = "SELECT count(*) FROM member " + 
		  		"WHERE member_id != ? AND member_phone = ? ";

		// SQL, 인자 (선)처리
		  
		  try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,memberId);
			pstmt.setString(2,memberPhone);
			
			// SQL 결과셋 객체 생성
			rs = pstmt.executeQuery();
			
	
			if(rs.next()) {
				result = rs.getInt(1)==0 ?true : false;
			}else {
				result = false;
			}
			// SQL 실행, 예외처리
		} catch (SQLException e) {
			emd.printErr(e, con, false);
			
			// 자원 반납
		}finally {
			DbUtil.close(con, pstmt, rs);
		}

		// 리턴(반환)
		return result;
	}

	@Override
	public List<MemberVo> getMembersBySearching(String searchKey, String searchValue, boolean isEquivalentSearch,
			String sortDirection, int page, int limit) {
		
		// 리턴(반환값) 처리
		List<MemberVo> members = new ArrayList<>();
		 
		// 실행 메서드명  
		
		// DB 연결
		
		// SQL 처리 객체

		// 결과셋 객체
		
		// SQL 구문
		
		// SQL, 인자 (선)처리
		
		// SQL 실행, 예외처리
		
		// 자원 반납
		
		// 리턴(반환)
		return null;
	}
	
	
	// 리턴(반환값) 처리
	 
	// 실행 메서드명  
	
	// DB 연결
	
	// SQL 처리 객체

	// 결과셋 객체
	
	// SQL 구문
	
	// SQL, 인자 (선)처리
	
	// SQL 실행, 예외처리
	
	// 자원 반납
	
	// 리턴(반환)
	

}