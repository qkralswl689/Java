package com.javateam.jdbc.member.test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.javateam.jdbc.member.util.DbUtil;
/**
 * DbUtil ���� �׽�Ʈ(Unit Test) : �׽�Ʈ ���̽�(Test Case)
 * 
 * �׽�Ʈ ����)
 * 
 * 1) DB ���� �׽�Ʈ
 * 
 * 2) DB ���� �ڿ� �ݳ�(����) �׽�Ʈ
 * 
 * @author mingki
 *
 */
public class DbConnectionTest {

	public static void main(String[] args) throws SQLException {
		
		// �׽�Ʈ ��� => �ܾ�(����) : assertion
		//String msg = DbUtil.connect() != null ? "DB ���� ����" : "DB ���� ����" ; // void
		//System.out.println("���� ���� ���� : " + msg);
		
		// statement �׽�Ʈ
		Connection con = DbUtil.connect();
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM member");
		
		//DbUtil.close(DbUtil.connect(), stmt, null); 
		
		boolean result = DbUtil.close(DbUtil.connect(), stmt, null); // boolean
		System.out.println("�ݳ� ���� ���� : " + result);
		
//		String result = DbUtil.close(DbUtil.connect(), stmt, rs); // String
//		System.out.println("�ݳ� ���� ����(�޼���) :\n " + result);
		
//		int result = DbUtil.close(DbUtil.connect(), stmt, rs); // int
//		String msg = 
//		result == 1 ? "SQL ó�� ��ü�� �ݳ��Ͽ����ϴ�. " :			
//		result == 3 ? "DB ���� ��ü���� �ݳ��Ͽ����ϴ�." :					
//		result == 6 ? "DB �ڿ����� �����Ͽ����ϴ�." : "";
//		System.out.println("�ݳ� ���� ����(�޼���) : " + msg);
	}

}
