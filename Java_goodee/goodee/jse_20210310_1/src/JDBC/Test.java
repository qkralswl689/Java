package JDBC;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Test {

	public static void main(String[] args) throws SQLException {

		// DbUtil ����
		Connection con = DbUtil.connect();
		// connection�� createStatement �޼ҵ� ��� => ���� ������ ���� statement ��ü ����
		Statement stmt = con.createStatement();
		// SQL ���̺� �ҷ�����
		ResultSet rs = stmt.executeQuery("SELECT * FROM member");
		
		// ���� ��������
//		String msg = DbUtil.connect() != null ? "DB ���� ����" : "DB ���� ����";
//		System.out.println("���� ���� ���� : " + msg);
		
		// 1) void
		
		// System.out.println("�ݳ� ���� ���� : ");
		// 2) String 
//		String result = DbUtil.close(con, stmt, rs);
//		System.out.println("�ݳ� ���� ���� : " + result);
		
		// 3) int
//		int result = DbUtil.close(con, stmt, rs);
//		String msg = 
//				result == 1 ? "SQL ������� �ݳ��Ͽ����ϴ�." :
//				result == 3 ? "SQL ó����ü������ �ݳ��Ͽ����ϴ�." :	
//				result == 6 ? "DB �ڿ����� �ݳ��Ͽ����ϴ�." : "";
//		
//		System.out.println("�ݳ� ���� ����(�޽���) : " + msg);
		
		// 4) boolean
		boolean result = DbUtil.close(con, stmt, rs);
		System.out.println("�ݳ� ���� ���� : " + result);
	}

}
