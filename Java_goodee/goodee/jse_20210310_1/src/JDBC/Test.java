package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws SQLException {

		// DbUtil 연결
		Connection con = DbUtil.connect();
		// connection의 createStatement 메소드 사용 => 쿼리 실행을 위해 statement 객체 생성
		Statement stmt = con.createStatement();
		// SQL 테이블 불러오기
		ResultSet rs = stmt.executeQuery("SELECT * FROM member");
		
		// 연결 성공여부
//		String msg = DbUtil.connect() != null ? "DB 연결 성공" : "DB 연결 실패";
//		System.out.println("연결 성공 여부 : " + msg);
		
		// 1) void
		
		// System.out.println("반납 성공 여부 : ");
		// 2) String 
//		String result = DbUtil.close(con, stmt, rs);
//		System.out.println("반납 성공 여부 : " + result);
		
		// 3) int
//		int result = DbUtil.close(con, stmt, rs);
//		String msg = 
//				result == 1 ? "SQL 결과셋을 반납하였습니다." :
//				result == 3 ? "SQL 처리객체까지를 반납하였습니다." :	
//				result == 6 ? "DB 자원까지 반납하였습니다." : "";
//		
//		System.out.println("반납 성공 여부(메시지) : " + msg);
		
		// 4) boolean
		boolean result = DbUtil.close(con, stmt, rs);
		System.out.println("반납 성공 여부 : " + result);
	}

}
