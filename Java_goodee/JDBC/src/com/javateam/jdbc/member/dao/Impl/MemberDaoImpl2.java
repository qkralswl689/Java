/**
 * 
 */
package com.javateam.jdbc.member.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.javateam.jdbc.member.dao.MemberDao;
import com.javateam.jdbc.member.domain.MemberVo;
import com.javateam.jdbc.member.util.DbUtil;

/**
 * MemberDao�� ���� Ŭ����(concrete class)<br><br>
 * 
 *
 * ���) MemberDao dao = MemberdaoImpl.getInstance();<br>
 * : ��Ŭ��(singleton:������) ���� ���� &rarr; ����<br><br>
 *  
 * @author mingki
 *
 */
public class MemberDaoImpl2 implements MemberDao {
	
	/** DAO ��ü : ��Ŭ��(singleton) ���� ���� ����*/
	private static MemberDaoImpl2 instance = null;
	private MemberDaoImpl2() {}
	
	/**
	 * �̱��� ��ü(DAO singleton object) ���� �޼��� 
	 * 
	 * @return DAO ��ü
	 */
	public static final MemberDaoImpl2 getInstance() {
		// final : �������̵� ����
		
		if(instance == null) {
			instance = new MemberDaoImpl2();
		}
		 return instance;
	}

	@Override
	public boolean insertMember(MemberVo member) {
		
		// ����(��ȯ��) ó��
		boolean result = false; // ����� �ʱ�ȭ
		
		// ���� �޼����(reflection ���)
		String methodName 
		= new Exception().getStackTrace()[0].getMethodName();
		
		// DB ����
		Connection con = DbUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null; // 1)
		// Statement pstmt = null; // 2)
		// ����) Statement pstmt = null; // ? (���ϵ� ī��) ����� �� ����
		// ����) CallableStatment : PL/SQL ����
		
		// SQL ����
		String sql = "INSERT INTO member VALUES "  
				   + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";		
		
		// SQL, ���� (��)ó��
		try {
			pstmt = con.prepareStatement(sql); // 1) SQL(prepare) ��ó��
			// pstmt = con.createStatment(); // 2) SQL ��ó��
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPassword());
			pstmt.setString(3, member.getMemberNicname());
			pstmt.setString(4, member.getMemberName());
			pstmt.setString(5, member.getMemberGender() + ""); // char -> String ��ȯ ���� �ڿ� "" ������
			pstmt.setString(6, member.getMemberEmail());
			pstmt.setString(7, member.getMemberPhone());
			pstmt.setDate(8,member.getMemberBirth());
			pstmt.setString(9, member.getMemberZip());
			pstmt.setString(10, member.getMemberAddressBasic());
			pstmt.setString(11, member.getMemberAddressDetail());
			
			// SQL ����, ���ϰ� ó��, ����ó��
			if (pstmt.executeUpdate() == 1) { // 1 : DML ���� ������ ��(tuple, record)�� ��
				
				System.out.println("ȸ������ ���忡 �����Ͽ����ϴ�.");
				result = true;
				
			} else {
				
				System.out.println("ȸ������ ���忡 �����Ͽ����ϴ�.");
				// result = false;
			}
		} catch (SQLException e) {
			System.err.println(methodName + " : " + " ȸ������ ����� ���ܰ� �߻��Ͽ����ϴ�.");
			System.err.println(methodName + " : " + e.getMessage());
			// System.err.println(methodName + " : " + "ȸ������ ����� ���ܰ� �߻��Ͽ����ϴ�.");
			e.printStackTrace();
		} finally {
			// �ڿ� �ݳ�
			DbUtil.close(con, pstmt, null);
		} //
		
		// ����(��ȯ)
		return result;
	}

	@Override
	public List<MemberVo> getAllMembers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVo getMember(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateMember(MemberVo member) {
		// ���� ó��
		boolean result = false;
		
		// ���� �޼����
		String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB����
		Connection con = DbUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null;
		
		// SQL ����
		
		// 1) 
//		String sql = "UPDATE member SET "
//					+ "member_password=?,member_nickname = ?,member_birth=?,"
//					+ "member_address_basic=?,member_address_detail=? "
//					+ "WHERE MEMBER_ID= ? ";
		
		// 2)
		StringBuilder sql = new StringBuilder();
		sql.append("UPDATE member SET ");
		sql.append("member_Password = ?,");
		sql.append("member_nickname = ?,");
		sql.append("member_birth=?,");
		sql.append("member_address_basic=?,");
		sql.append("member_address_detail=? ");
		sql.append("WHERE MEMBER_ID=?");
		
		// SQL, ����(��) ó��
		
		try {
			// 1) pstmt = con.prepareStatement(sql);
			
			// 2) sql.toString : StringBulder�� ��ȯ�ؼ� ���
			pstmt = con.prepareStatement(sql.toString());
			
			pstmt.setString(1, member.getMemberPassword());
			pstmt.setString(2, member.getMemberNicname());
			pstmt.setDate(3, member.getMemberBirth());
			pstmt.setString(4, member.getMemberAddressBasic());
			pstmt.setString(5, member.getMemberAddressDetail());
			pstmt.setString(6, member.getMemberId());
			// SQL ����, ���ϰ� ó��, ����ó��
			if(pstmt.executeUpdate()==1) {
		//	pstmt.executeUpdate() > 2 ) { // ������ ���� ������ ���ǹ�����
				System.out.println("ȸ������ ������ �����Ͽ����ϴ�.");
				result = true;
			}else {
				System.out.println("ȸ������ ������ �����Ͽ����ϴ�.");
			}
				
		} catch (SQLException e) {
			System.err.println(methodName + ": " +"ȸ������ ����� ���ܰ� �߻��Ͽ����ϴ�.");
			System.err.println(methodName + " : " + e.getMessage());
			e.printStackTrace();
		}finally {
			// �ڿ� �ݳ�
			DbUtil.close(con, pstmt, null);
		}
		return result;
	}

	@Override
	public boolean deleteMember(String memberId) {
		
				// ����(��ȯ��) ó��
		 
				// ���� �޼����  
				
				// DB ����
				
				// SQL ó�� ��ü
				
				// SQL ����
				
				// SQL, ���� (��)ó��
				
				// SQL ����, ����ó��
				
				// �ڿ� �ݳ�
				
				// ����(��ȯ)
		return false;
	}

}