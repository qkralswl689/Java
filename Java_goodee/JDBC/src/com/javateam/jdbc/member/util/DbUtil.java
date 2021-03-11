package com.javateam.jdbc.member.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * DB ����/���� ��ƿ��Ƽ(Utility)
 * <br><br>
 * usage (��� ���)
 * <br>
 * DB ���� : DbUtil.connect();
 * DB ���� ������ : DbUtil.close(con, pstmt, rs);
 * 
 * @author mingki
 * @version 1.0
 * 
 */

public class DbUtil {
	
	/** DB ���� ���� */
	
	/** JDBC ����̹�(driver) */
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
	 * ���� : DB ����
	 * <br><br>
	 * ��� : DbUtil.connect();
	 * <br>
	 * @return DB ���� ��ü
	 */
	
	// �Լ� ����(����)
	// Connection : jdbc ����
	public static Connection connect() {
		
		/** DB ���� ��ü */
		Connection con = null;
		
		// JDBC driver ���
		try {
			Class.forName(DRIVER);	
			
			// JDBC URL, ID, PW �� �̿��� ���� ��ü ����
			try {				
				
				con = DriverManager.getConnection(URL, USER_ID, USER_PW); 
				
			} catch (SQLException e) {
				System.out.println("DB ���ῡ �����Ͽ����ϴ�.");
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			System.out.println("JDBC ����̹� �ε��� �����Ͽ����ϴ�.");
			e.printStackTrace();
		}		
		return con;
	}
	/**
	 * DB ���� ����(�ڿ� �ݳ�)
	 * <br><br>
	 *  ���) DbUtil.connect(con, pstmt, rs); // select
	 *  	 DbUtil.connect(con, pstmt, null); // insert, update, delete
	 *  <br>
	 * @param con  : DB ���� ��ü
	 * @param stmt : stmt SQL ó�� ��ü
	 * @param rs : SQL ����� ��ü
	 */
	
	// ��ȯ���� ���� �� (void)
//	public static void close(Connection con, Statement stmt, ResultSet rs) {
//		
//		try {
//			if(rs != null) {
//				rs.close();
//				System.out.println("SQL ������� �ݳ��Ͽ����ϴ�.");
//			}// if(!rs.isClosed()) rs.close(); // (O)
//			// if(rs.isClosed() == false) rs.close(); // (O)
//			if(stmt != null) {
//				stmt.close();
//				System.out.println("SQL ó�� ��ü�� �ݳ��Ͽ����ϴ�.");
//			}
//			// if(stmt.isClose() == false) stmt.close(); // (O)
//			if(con != null) {
//				con.close();
//				System.out.println("DB ���� ��ü�� �ݳ��Ͽ����ϴ�.");
//
//			}
//			// if(con.isClosed()==false) con.close(); // (O)
//		} catch (SQLException e) {
//			System.out.println("DB �ڿ� �ݳ��� �����Ͽ����ϴ�.");
//			e.printStackTrace();
//			
//		}
//		
//	}
		// ��ȯ�� boolean �� ��
	public static boolean close(Connection con, Statement stmt, ResultSet rs) {
		
		boolean result = false;
		
		try {
			if(rs != null) {
				rs.close();
				//System.out.println("SQL ������� �ݳ��Ͽ����ϴ�.");
				result = true;
			}
			if(stmt != null) {
				stmt.close();
				//System.out.println("SQL ó�� ��ü�� �ݳ��Ͽ����ϴ�.");
				result = true;
			}
			if(con != null) {
				con.close();
				//System.out.println("DB ���� ��ü�� �ݳ��Ͽ����ϴ�.");
				result = true;

			}
			// if(con.isClosed()==false) con.close(); // (O)
		} catch (SQLException e) {
			System.out.println("DB �ڿ� �ݳ��� �����Ͽ����ϴ�.");
			e.printStackTrace();
			result = false;
			
		}
		
		return result;
	}
	
		// ��ȯ �� String �� ��
//		public static String close(Connection con, Statement stmt, ResultSet rs) {
//		
//		String result = "";
//		
//		try {
//			if(rs != null) {
//				rs.close();
//				result +="SQL ������� �ݳ��Ͽ����ϴ�.\n";
//			}
//			if(stmt != null) {
//				stmt.close();
//				result +="SQL ó�� ��ü�� �ݳ��Ͽ����ϴ�.\n";
//			}
//			if(con != null) {
//				con.close();
//				result +="DB ���� ��ü�� �ݳ��Ͽ����ϴ�.\n";	
//			}
//		} catch (SQLException e) {
//			System.out.println("DB �ڿ� �ݳ��� �����Ͽ����ϴ�.");
//			e.printStackTrace();
//			
//		}
//		
//		return result;
//	}
	
	// ��ȯ �� int �� �� 
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
//				System.out.println("DB �ڿ� �ݳ��� �����Ͽ����ϴ�.");
//				e.printStackTrace();
//			}
//			return result;
//		}
	}
