/**
 * 
 */
package JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import JDBC.MemberDao;
import JDBC.MemberVo;
import JDBC.DbUtil;

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
		String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB 연결
		Connection con = DbUtil.connect();
		
		// SQL 처리 객체
		PreparedStatement pstmt = null; // 1)
		// Statement pstmt = null; // 2)
		// 참고) Statement pstmt = null; // ? (와일드 카드) 사용할 수 없다
		// 참고) CallableStatment : PL/SQL 전용
		
		// SQL 구문
		String sql = "INSERT INTO member VALUES"
					+ "(?,?,?,?,?,?,?,?,?,?,?,?, sysdate)";		
		
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
			pstmt.setDate(8, member.getMemberBirth());
			pstmt.setString(9, member.getMemberZip());
			pstmt.setString(10, member.getMemberAddressBasic());
			pstmt.setString(11, member.getMemberAddressDetail());
			
			// SQL 실행, 리턴값 처리, 예외처리
			if(pstmt.executeUpdate() == 1) { // 1 : DML 실행 성공한 행(tuple, record)의 수
				
				System.out.println("회원정보 저장에 성공하였습니다.");
				result = true;
				
			}else {
				
				System.out.println("회원정보 저장에 실패하였습니다.");
				// result = false;
				
			}
		} catch (SQLException e) {
			System.out.println(methodName + " : " + " 회원정보 저장시 예외가 발생 하였습니다 ");
			System.out.println(methodName + " : " + e.getMessage());
			//System.out.println(methodName + " : " + "회원정보 저장시 예외가 발생 하였습니다.");
			e.printStackTrace();
			
		} finally {
			// 자원 반납
			DbUtil.close(con, pstmt, null);
		}
		
		// 리턴(반환)		
		return result;
	}

	@Override
	public List<MemberVo> getAllMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVo getMember(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateMember(MemberVo member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMember(String memberId) {
		// TODO Auto-generated method stub
		return false;
	}

}
