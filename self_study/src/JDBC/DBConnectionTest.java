package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// DB ���� �׽�Ʈ
public class DBConnectionTest {

	public static void main(String[] args) throws SQLException {
		
		Connection con = DBUtil.connect();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM STUDYJDBC ");
		
		String result = DBUtil.cloese(DBUtil.connect(), stmt, rs);
		System.out.println("�ݳ� ���� ���� : " + result);
	}

}
