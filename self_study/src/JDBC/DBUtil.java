package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DB ����
public class DBUtil {
	
	// DB ���� ����
	
	// JDBC ����̹�
	static final String DRIVER = "oracle.jdbc.driver.OracleDriver";

	// JDBC URL
	static final String URL ="jdbc:oracle:thin:@localhost:1521:xe";
	
	// JDBC ID
	static final String ID = "mingki";
	
	// JDBC PW
	static final String PW = "1234";
	

	// JDBC ����
	public static Connection connect() {
		
		// DB���� ��ü
		Connection con = null;
		
		try {
			// JDBC Driver ���
			Class.forName(DRIVER); //����̹��� �����Ҵ� 
			
			try {
				con = DriverManager.getConnection(URL,ID,PW);
				
			} catch (SQLException e) {
				
				System.out.println("DB ���� ����");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			
			System.out.println("JDBC �ε� ����");
			e.printStackTrace();
		}
		return con;
	}
		
	// �ڿ��ݳ� : ��ȯ�� String �� ��
	
	public static String cloese(Connection con, Statement stmt,ResultSet rs) {
		
		String result = "";
		try {
			if(rs!=null) {
				rs.close();
				result += "SQL ����� �ݳ� �Ϸ�";
			}
			if(con!=null) {
				con.close();
				result += "SQL ���ᰴü �ݳ� �Ϸ�";
			}
			if(stmt!=null) {
				stmt.close();
				result += "SQL ó����ü �ݳ� �Ϸ�";
			}
		}catch(SQLException e) {
			System.out.println("DB �ڿ��ݳ� ����");
		}
		
		
		return result;
	}
	
}
