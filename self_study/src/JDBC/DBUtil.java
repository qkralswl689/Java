package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DB 연결
public class DBUtil {
	
	// DB 연결 정보
	
	// JDBC 드라이버
	static final String DRIVER = "oracle.jdbc.driver.OracleDriver";

	// JDBC URL
	static final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	
	// JDBC ID
	static final String ID = "mingki";
	
	// JDBC PW
	static final String PW = "1234";
	

	// JDBC 연결
	public static Connection connect() {
		
		// DB연결 객체
		Connection con = null;
		
		try {
			// JDBC Driver 등록
			Class.forName(DRIVER); //드라이버에 동적할당 
			
			try {
				con = DriverManager.getConnection(URL,ID,PW);
				
			} catch (SQLException e) {
				
				System.out.println("DB 연결 실패");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			
			System.out.println("JDBC 로딩 실패");
			e.printStackTrace();
		}
		return con;
	}
		
	// 자원반납 : 반환값 String 일 때
	
	public static String cloese(Connection con, Statement stmt,ResultSet rs) {
		
		String result = "";
		try {
			if(rs!=null) {
				rs.close();
				result += "SQL 결과셋 반납 완료";
			}
			if(con!=null) {
				con.close();
				result += "SQL 연결객체 반납 완료";
			}
			if(stmt!=null) {
				stmt.close();
				result += "SQL 처리객체 반납 완료";
			}
		}catch(SQLException e) {
			System.out.println("DB 자원반납 실패");
		}
		
		
		return result;
	}
	
}
