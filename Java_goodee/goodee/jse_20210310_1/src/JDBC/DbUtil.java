package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {

	// JDBC 드라이버
	static final String DIVER = "oracle.jdbc.driver.OracleDriver";
	// URL
	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	// ID
	static final String ID = "java";
	// PW
	static final String PW = "java";
	
	// DB 연결 
	public static Connection connect() {
		
		// DB연결 객체 생성
		Connection con = null;
		
		// JDBC driver 등록
		try {
			Class.forName(DIVER);
			
			// JDBC URL, ID, PW 이용해 연결 객체 생성
			try {
				con = DriverManager.getConnection(URL,ID,PW);
			} catch (SQLException e) {
				System.out.println("DB 연결에 실패 하였습니다.");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC 드라이버 로딩에 실패하였습니다.");
			e.printStackTrace();
		}		
		return con;		
	}
	
	// DB 연결 해제
	// con : DB 연결 객체
	// stmt : SQL 처리 객체
	// rs : SQL 결과셋 객체
	
	// 1) void	
//	public static void close(Connection con, Statement stmt, ResultSet rs) {
//		
//		// 1) rs close => 결과 먼저 닫기위해
//		try {
//			if (rs != null) {
//				rs.close();
//				System.out.println("SQL 결과셋을 반납하였습니다."); 
//			}
//			if (stmt != null) {
//				stmt.close();
//				System.out.println("SQL 처리객체를 반납하였습니다."); 
//			}
//			if(rs != null) {
//				rs.close();			
//				System.out.println("DB 연결 객체를 반납하였습니다."); 
//			}
//		}catch(SQLException e) {
//			System.out.println("DB 자원 반납에 실패하였습니다.");
//			
//		}
//		
//	}
	
		// 2) String 
//	public static String close(Connection con, Statement stmt, ResultSet rs) {
//		
//		String result = "";
//		
//		try {
//			if(rs != null) {
//				rs.close();
//				result += "SQL 결과셋을 반납하였습니다.\n";
//			}
//			if(stmt !=null) {
//				stmt.close();
//				result += "SQL 처리객체를 반납하였습니다.\n";
//			}
//			if(con != null) {
//				con.close();
//				result +=  "DB 연결 객체를 반납하였습니다.";
//			}
//		} catch (SQLException e) { 
//			  System.err.println("DB 자원 반납에 실패하였습니다.");
//		  	  e.printStackTrace(); 
//		  } 
//		
//		return result;
//	}
	
		// int
//	public static int close(Connection con, Statement stmt, ResultSet rs) {
//		
//		int result = 0;
//		
//		try {
//			if(rs != null) {
//				rs.close();
//				result = 1;
//			}
//			
//			if(stmt !=null) {
//				stmt.close();
//				result = 2;
//			}
//			if(con != null) {
//				con.close();
//				result = 3;
//			}
//		}catch  (SQLException e) { 
//			  System.err.println("DB 자원 반납에 실패하였습니다.");
//		  	  e.printStackTrace(); 
//		  } 
//		return result;
//		
//	}
	
		// 4) boolean
	public static boolean close(Connection con, Statement stmt, ResultSet rs) {
		boolean result = false;
		try {
			if(rs!=null) {
				rs.close();
				result = true;
			}
			if(stmt!=null) {
				stmt.close();
				result = true;
			}
			if(con!=null) {
				con.close();
				result = true;
			}
		}catch (SQLException e) {
			System.err.println("DB 자원 반납에 실패하였습니다.");
			e.printStackTrace();
			result = false;
		}
		return result;
	}

}
