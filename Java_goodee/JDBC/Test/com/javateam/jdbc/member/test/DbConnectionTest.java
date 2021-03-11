package com.javateam.jdbc.member.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.javateam.jdbc.member.util.DbUtil;
/**
 * DbUtil 단위 테스트(Unit Test) : 테스트 케이스(Test Case)
 * 
 * 테스트 조건)
 * 
 * 1) DB 연결 테스트
 * 
 * 2) DB 연결 자원 반납(해제) 테스트
 * 
 * @author mingki
 *
 */
public class DbConnectionTest {

	public static void main(String[] args) throws SQLException {
		
		// 테스트 결과 => 단언(단정) : assertion
		//String msg = DbUtil.connect() != null ? "DB 연결 성공" : "DB 연결 실패" ; // void
		//System.out.println("연결 성공 여부 : " + msg);
		
		// statement 테스트
		Connection con = DbUtil.connect();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM member");
		
		//DbUtil.close(DbUtil.connect(), stmt, null); 
		
		boolean result = DbUtil.close(DbUtil.connect(), stmt, null); // boolean
		System.out.println("반납 성공 여부 : " + result);
		
//		String result = DbUtil.close(DbUtil.connect(), stmt, rs); // String
//		System.out.println("반납 성공 여부(메세지) :\n " + result);
		
//		int result = DbUtil.close(DbUtil.connect(), stmt, rs); // int
//		String msg = 
//		result == 1 ? "SQL 처리 객체를 반납하였습니다. " :			
//		result == 3 ? "DB 연결 객체까지 반납하였습니다." :					
//		result == 6 ? "DB 자원까지 실패하였습니다." : "";
//		System.out.println("반납 성공 여부(메세지) : " + msg);
	}

}
