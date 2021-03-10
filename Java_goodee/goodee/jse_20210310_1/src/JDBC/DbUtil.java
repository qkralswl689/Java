package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbUtil {

	// JDBC ����̹�
	static final String DIVER = "oracle.jdbc.driver.OracleDriver";
	// URL
	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	// ID
	static final String ID = "java";
	// PW
	static final String PW = "java";
	
	// DB ���� 
	public static Connection connect() {
		
		// DB���� ��ü ����
		Connection con = null;
		
		// JDBC driver ���
		try {
			Class.forName(DIVER);
			
			// JDBC URL, ID, PW �̿��� ���� ��ü ����
			try {
				con = DriverManager.getConnection(URL,ID,PW);
			} catch (SQLException e) {
				System.out.println("DB ���ῡ ���� �Ͽ����ϴ�.");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε��� �����Ͽ����ϴ�.");
			e.printStackTrace();
		}		
		return con;		
	}
	
	// DB ���� ����
	// con : DB ���� ��ü
	// stmt : SQL ó�� ��ü
	// rs : SQL ����� ��ü
	
	// 1) void	
//	public static void close(Connection con, Statement stmt, ResultSet rs) {
//		
//		// 1) rs close => ��� ���� �ݱ�����
//		try {
//			if (rs != null) {
//				rs.close();
//				System.out.println("SQL ������� �ݳ��Ͽ����ϴ�."); 
//			}
//			if (stmt != null) {
//				stmt.close();
//				System.out.println("SQL ó����ü�� �ݳ��Ͽ����ϴ�."); 
//			}
//			if(rs != null) {
//				rs.close();			
//				System.out.println("DB ���� ��ü�� �ݳ��Ͽ����ϴ�."); 
//			}
//		}catch(SQLException e) {
//			System.out.println("DB �ڿ� �ݳ��� �����Ͽ����ϴ�.");
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
//				result += "SQL ������� �ݳ��Ͽ����ϴ�.\n";
//			}
//			if(stmt !=null) {
//				stmt.close();
//				result += "SQL ó����ü�� �ݳ��Ͽ����ϴ�.\n";
//			}
//			if(con != null) {
//				con.close();
//				result +=  "DB ���� ��ü�� �ݳ��Ͽ����ϴ�.";
//			}
//		} catch (SQLException e) { 
//			  System.err.println("DB �ڿ� �ݳ��� �����Ͽ����ϴ�.");
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
//			  System.err.println("DB �ڿ� �ݳ��� �����Ͽ����ϴ�.");
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
			System.err.println("DB �ڿ� �ݳ��� �����Ͽ����ϴ�.");
			e.printStackTrace();
			result = false;
		}
		return result;
	}

}
