package JdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JDBCTest {
 
    // oracle spec
	// jdbc:oracle:thin:@localhost:1521:xe : hr -> �����ʸ��콺 -> ����Ŭ Properties => ����̹� Properties
    // �Ʒ� 4���� : jdbc����� �ʿ��Ѱ� 
	final String oracleDriver = "oracle.jdbc.OracleDriver"; // ����̹�
    final String oracleURL = "jdbc:oracle:thin:@localhost:1521:xe"; // URL
    final String oracleID = "hr"; // ���� ���̵�
    final String oraclePW = "hr"; // �о�����
 
    // DB ����(connection)
    // getConnection() : ����
    public Connection getConnection() {
 
        Connection con = null;
 
        try {
        	// forName �ֳ� ���� Ȯ�� => JDBC ����̹� ���
            Class.forName(oracleDriver);
            // DB ����
            con = DriverManager.getConnection(oracleURL, oracleID, oraclePW);
            // ����ó�� �ʼ�            
        } catch (ClassNotFoundException e) {
        	System.out.println("jdbc ����̹��� �������� �ʽ��ϴ�");
        	// System.err.println("jdbc ����̹��� �������� �ʽ��ϴ�"); (O)
            e.printStackTrace();
        } catch (SQLException e) {
        	System.out.println("Oracle DB ���ῡ ���� �Ͽ����ϴ�");
        	// System.err.println("Oracle DB ���ῡ ���� �Ͽ����ϴ�"); (O)
            e.printStackTrace();
        }
        
        // return �ʼ�! => null ������ �ȵ�!
        return con;
    }

    	// ���� ����ó�� throws�� ó���� ���
//        public Connection getConnection() throws ClassNotFoundException,SQLException{
// 
//        Connection con = null;
//        Class clazz = Class.forName(oracleDriver);
//        if(clazz == null) {
//        	throw new ClassNotFoundException ("Oracle DB ���ῡ ���� �Ͽ����ϴ�");
//        }
//        
//            Class.forName(oracleDriver);
//            con = DriverManager.getConnection(oracleURL, oracleID, oraclePW);
//            if(con == null) {
//            	throw new SQLException("Oracle DB ���ῡ ���� �Ͽ����ϴ�");
//            }
//        
//        // return �ʼ�! => null ������ �ȵ�!
//        return con;
//    }
 
    // 
    public void getTable() {
 
    	
        // Connection con = null; // 1) ���    	
    	Connection con = this.getConnection(); // �ٷ� ó���ص� �ȴ� => ������ ����ó�� �߱� ������, this�������� => DB ���� ��ü
    	
    	// SQL ó�� ��ü
    	Statement pstmt = null; // SQL ó�� 2)  import -> java.sql.Statement;
        //PreparedStatement pstmt = null; // SQL ��ó�� 3) 
    	
    	// SQL ó�� ����� ��ü
        ResultSet rs = null;
        
        // SQL ���� , �� �ҹ��� ���� X => �������� ���� �빮��,�ҹ��� ����Ѱ�
        String sql = "SELECT * FROM employees"; // SQL
 
        try {
            // con = getConnection(); //1)
            pstmt = con.prepareStatement(sql); // 2)
            rs = pstmt.executeQuery(sql); // 2)
            
            //pstmt = con.prepareStatement(sql); // 3)
            // rs = pstmt.executeQuery(); // 3)
 
            // ���� ���� ����� ���ڵ�( Ʃ��, ��) �˻�
            //while (rs.next()) { // ��ü �� �˻�            
        	if (rs.next()) { // 1���� �ุ �˻��Ѵ�
        		
            	// ���̺� �ʵ�� ��ҹ��� ���� X
               // System.out.println(rs.getString("employee_id"));
            	// System.out.println(rs.getString("EMPLOYEE_ID")); 
            	System.out.println(rs.getString(1)); // ���̺��� ù��° Į��(�ʵ�)
            	// ���� ) JDBC ���̺� index => 1���� �����Ѵ�!
            }
 
            rs.close();
            pstmt.close();
            con.close();
 
        } catch (SQLException e) {
            e.printStackTrace();
        }
 
    }
 
    public static void main(String[] args) {
 
        new JDBCTest().getTable();
    }
 
}
