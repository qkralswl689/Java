package com.javateam.jdbc.member.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * DB 연결/해제 유틸리티(Utility)
 * <br><br>
 * usage (사용 용례)
 * <br>
 * DB 연결 : DbUtil.connect();
 * DB 연결 해제시 : DbUtil.close(con, pstmt, rs);
 * 
 * @author mingki
 * @version 1.0
 * 
 */

public class DbUtil {
	
	/** DB 연결 정보 */
	
	/** JDBC 드라이버(driver) */
	static final String DRIVER = "oracle.jdbc.OracleDriver";
	// static final String driver = "oracle.jdbc.driver.OracleDriver"; (O)
	
	/** JDBC URL */	
	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	
	/** DB account(ID) */
	static final String USER_ID = "java";
	
	/** DB account(PW) */
	static final String USER_PW = "java";
	
	/** 
	
	/**
	 * 역할 : DB 연결
	 * <br><br>
	 * 용례 : DbUtil.connect();
	 * <br>
	 * @return DB 연결 객체
	 */
	
	// 함수 생성(인자)
	// Connection : jdbc 연결
	public static Connection connect() {
		
		/** DB 연결 객체 */
		Connection con = null;
		
		// JDBC driver 등록
		try {
			Class.forName(DRIVER);	
			
			// JDBC URL, ID, PW 를 이용해 연결 객체 생성
			try {				
				
				con = DriverManager.getConnection(URL, USER_ID, USER_PW); 
				
			} catch (SQLException e) {
				System.out.println("DB 연결에 실패하였습니다.");
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩에 실패하였습니다.");
			e.printStackTrace();
		}		
		return con;
	}
	/**
	 * DB 연결 해제(자원 반납)
	 * <br><br>
	 *  용례) DbUtil.connect(con, pstmt, rs); // select
	 *  	 DbUtil.connect(con, pstmt, null); // insert, update, delete
	 *  <br>
	 * @param con  : DB 연결 객체
	 * @param stmt : stmt SQL 처리 객체
	 * @param rs : SQL 결과셋 객체
	 */
	
	// 반환값이 없을 때 (void)
//	public static void close(Connection con, Statement stmt, ResultSet rs) {
//		
//		try {
//			if(rs != null) {
//				rs.close();
//				System.out.println("SQL 결과셋을 반납하였습니다.");
//			}// if(!rs.isClosed()) rs.close(); // (O)
//			// if(rs.isClosed() == false) rs.close(); // (O)
//			if(stmt != null) {
//				stmt.close();
//				System.out.println("SQL 처리 객체를 반납하였습니다.");
//			}
//			// if(stmt.isClose() == false) stmt.close(); // (O)
//			if(con != null) {
//				con.close();
//				System.out.println("DB 연결 객체를 반납하였습니다.");
//
//			}
//			// if(con.isClosed()==false) con.close(); // (O)
//		} catch (SQLException e) {
//			System.out.println("DB 자원 반납에 실패하였습니다.");
//			e.printStackTrace();
//			
//		}
//		
//	}
		// 반환값 boolean 일 때
	public static boolean close(Connection con, Statement stmt, ResultSet rs) {
		
		boolean result = false;
		
		try {
			if(rs != null) {
				rs.close();
				//System.out.println("SQL 결과셋을 반납하였습니다.");
				result = true;
			}
			if(stmt != null) {
				stmt.close();
				//System.out.println("SQL 처리 객체를 반납하였습니다.");
				result = true;
			}
			if(con != null) {
				con.close();
				//System.out.println("DB 연결 객체를 반납하였습니다.");
				result = true;

			}
			// if(con.isClosed()==false) con.close(); // (O)
		} catch (SQLException e) {
			System.out.println("DB 자원 반납에 실패하였습니다.");
			e.printStackTrace();
			result = false;
			
		}
		
		return result;
	}
	
		// 반환 값 String 일 때
//		public static String close(Connection con, Statement stmt, ResultSet rs) {
//		
//		String result = "";
//		
//		try {
//			if(rs != null) {
//				rs.close();
//				result +="SQL 결과셋을 반납하였습니다.\n";
//			}
//			if(stmt != null) {
//				stmt.close();
//				result +="SQL 처리 객체를 반납하였습니다.\n";
//			}
//			if(con != null) {
//				con.close();
//				result +="DB 연결 객체를 반납하였습니다.\n";	
//			}
//		} catch (SQLException e) {
//			System.out.println("DB 자원 반납에 실패하였습니다.");
//			e.printStackTrace();
//			
//		}
//		
//		return result;
//	}
	
	// 반환 값 int 일 때 
//	public static int close(Connection con, Statement stmt, ResultSet rs) {
//			
//			int result = 0;
//			
//			try {
//				if(rs != null) {
//					rs.close();
//					result = 1;
//				}
//				if(stmt != null) {
//					stmt.close();
//					result = 2;
//				}
//				if(con != null) {
//					con.close();
//					result = 3;	
//				}
//			} catch (SQLException e) {
//				System.out.println("DB 자원 반납에 실패하였습니다.");
//				e.printStackTrace();
//			}
//			return result;
//		}
	}
