package JdbcTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class JDBCTest {
 
    // oracle spec
	// jdbc:oracle:thin:@localhost:1521:xe : hr -> 오른쪽마우스 -> 오라클 Properties => 드라이버 Properties
    // 아래 4가지 : jdbc연결시 필요한것 
	final String oracleDriver = "oracle.jdbc.OracleDriver"; // 드라이버
    final String oracleURL = "jdbc:oracle:thin:@localhost:1521:xe"; // URL
    final String oracleID = "hr"; // 계정 아이디
    final String oraclePW = "hr"; // 패쓰워드
 
    // DB 연결(connection)
    // getConnection() : 연결
    public Connection getConnection() {
 
        Connection con = null;
 
        try {
        	// forName 있나 없나 확인 => JDBC 드라이버 등록
            Class.forName(oracleDriver);
            // DB 연결
            con = DriverManager.getConnection(oracleURL, oracleID, oraclePW);
            // 예외처리 필수            
        } catch (ClassNotFoundException e) {
        	System.out.println("jdbc 드라이버가 존재하지 않습니다");
        	// System.err.println("jdbc 드라이버가 존재하지 않습니다"); (O)
            e.printStackTrace();
        } catch (SQLException e) {
        	System.out.println("Oracle DB 연결에 실패 하였습니다");
        	// System.err.println("Oracle DB 연결에 실패 하였습니다"); (O)
            e.printStackTrace();
        }
        
        // return 필수! => null 넣으면 안됨!
        return con;
    }

    	// 연결 예외처리 throws로 처리한 경우
//        public Connection getConnection() throws ClassNotFoundException,SQLException{
// 
//        Connection con = null;
//        Class clazz = Class.forName(oracleDriver);
//        if(clazz == null) {
//        	throw new ClassNotFoundException ("Oracle DB 연결에 실패 하였습니다");
//        }
//        
//            Class.forName(oracleDriver);
//            con = DriverManager.getConnection(oracleURL, oracleID, oraclePW);
//            if(con == null) {
//            	throw new SQLException("Oracle DB 연결에 실패 하였습니다");
//            }
//        
//        // return 필수! => null 넣으면 안됨!
//        return con;
//    }
 
    // 
    public void getTable() {
 
    	
        // Connection con = null; // 1) 대신    	
    	Connection con = this.getConnection(); // 바로 처리해도 된다 => 위에서 예외처리 했기 때문에, this생략가능 => DB 연결 객체
    	
    	// SQL 처리 객체
    	Statement pstmt = null; // SQL 처리 2)  import -> java.sql.Statement;
        //PreparedStatement pstmt = null; // SQL 선처리 3) 
    	
    	// SQL 처리 결과셋 객체
        ResultSet rs = null;
        
        // SQL 구문 , 대 소문자 구분 X => 가독성을 위해 대문자,소문자 사용한것
        String sql = "SELECT * FROM employees"; // SQL
 
        try {
            // con = getConnection(); //1)
            pstmt = con.prepareStatement(sql); // 2)
            rs = pstmt.executeQuery(sql); // 2)
            
            //pstmt = con.prepareStatement(sql); // 3)
            // rs = pstmt.executeQuery(); // 3)
 
            // 여러 개의 결과셋 레코드( 튜플, 행) 검색
            //while (rs.next()) { // 전체 행 검색            
        	if (rs.next()) { // 1개의 행만 검색한다
        		
            	// 테이블 필드는 대소문자 구별 X
               // System.out.println(rs.getString("employee_id"));
            	// System.out.println(rs.getString("EMPLOYEE_ID")); 
            	System.out.println(rs.getString(1)); // 테이블의 첫번째 칼럼(필드)
            	// 유의 ) JDBC 테이블 index => 1부터 시작한다!
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

