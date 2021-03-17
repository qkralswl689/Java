package com.javateam.jdbc.member.util;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * ����ó�� ��ƿ��Ƽ(Utility)<br><br>
 *
 * ��뿹��) DAO CRUD �޼��� ���Ժο� �Ʒ��� ���� ��ü ����     
 *     
 *  ExceptionMetadata emd
 *     = new ExceptionMetadata(new Exception().getStackTrace()[0]);
 * <br><br> 
 * ....
 * <br><br> 
 * 
 * ����ó�� "catch" ���� ���ο� �Ʒ��� ���� ó��<br><br>
 * 
 * 1) ������ Ʈ������� �ǹ̰� �ִ� ���� DML(insert, update, delete)�� ���<br><br>
 *
 * emd.printErr(e, con, true); 
 * // Ʈ������ ��� ����(Ʈ������� ����� �� �ִٴ� ���� Ʈ������� ����Ѵٴ� �ǹ�)
 *
 * 2) ������ Ʈ����� ��Ұ� �ǹ̰� ���� DQL(select)�� ���<br><br>
 *
 * emd.printErr(e, con, false); 
 *
 * @author javateam
 */
public class ExceptionMetadata {
	
	private StackTraceElement ste; // ����ó�� ���÷���(reflection) ������ü
	private String className; // Ŭ������
	private String methodName; // �޼����
	
	/**
	 * @param ste ����ó�� ���÷���(reflection) ������ü
	 */
	public ExceptionMetadata(StackTraceElement ste) {
		this.ste = ste;
		this.className = ste.getClassName();
		this.methodName = ste.getMethodName();
	}
		
	public StackTraceElement getSte() {
		return ste;
	}
	
	public void setSte(StackTraceElement ste) {
		this.ste = ste;
	}
	
	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}
	
	
	/**
	 * ����ó�� �޽��� ���<br><br>
	 * 
	 * @param e ����ó�� ��ü
	 * @param con DB ���� ��ü
	 * @param isRollback rollback(Ʈ����� ���) ����
	 */
	public void printErr(Exception e, Connection con, boolean isRollback) {
		
		String temp[] = className.split("\\.");
		System.out.print(temp[temp.length-1]+"."+methodName + " ");
		System.out.println(e.getClass().getName().split("\\.")[2]+ " :\n");
		e.printStackTrace();
		
		// rollback
		if (isRollback == true) {
			try {
					con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			} //
		}
		
	} //

}