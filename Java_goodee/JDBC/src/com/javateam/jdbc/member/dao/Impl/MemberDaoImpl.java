/**
 * 
 */
package com.javateam.jdbc.member.dao.Impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
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
public class MemberDaoImpl implements MemberDao {
	
	/** DAO ��ü : ��Ŭ��(singleton) ���� ���� ����*/
	private static MemberDaoImpl instance = null;
	private MemberDaoImpl() {}
	
	/**
	 * �̱��� ��ü(DAO singleton object) ���� �޼��� 
	 * 
	 * @return DAO ��ü
	 */
	public static final MemberDaoImpl getInstance() {
		// final : �������̵� ����
		
		if(instance == null) {
			instance = new MemberDaoImpl();
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
		
		// ����(��ȯ��) ó��
		List<MemberVo> members = new ArrayList<>(); // List ���
		
		// ���� ȸ������ ��ü ����
		MemberVo member = null;
		
		// ���� �޼����  
		String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB ����
		Connection con = DbUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null;
		
		// SQL ����� ��ü(DQL:select)
		ResultSet rs = null;
		
		// SQL ����
		String sql = "SELECT * FRom member";
		
		try {
			// SQL ó��
			pstmt = con.prepareStatement(sql);
			
			// SQL ����� ��ü ����
			rs = pstmt.executeQuery();
			
			// next() : ����¿��� ���� ���� ��ȸ�ϴ� ���(iterator)
 			while(rs.next()) { 
 				
 				// ���� ȸ������ ����
 				// ����) VO ��ü �� �������� ����  => Ư�� ���� ȸ���鸸 ������ ��µȴ� (������)
 				// => ��å : VO ��ü �ܺο��� �����Ѵ� -> ����ó���� �Ʒ��� ����(MemberVo member = null;)
 				// MemberVo member = new MemberVo(); //=> �Ѹ��� ������ ������ ���� �߻�
 				member = new MemberVo(); // (O)
 				
 				// SQL ����� -> VO��  �̰�
 				member.setMemberId(rs.getString("member_Id"));
 				member.setMemberPassword(rs.getString("member_Password"));
 				member.setMemberNicname(rs.getString("member_Nickname"));
 				member.setMemberName(rs.getString("member_Name"));
 				member.setMemberGender(rs.getString("member_Gender").charAt(0)); // char�� ��ȯ
 				member.setMemberEmail(rs.getString("member_Email"));
 				member.setMemberPhone(rs.getString("member_Phone"));
 				member.setMemberBirth(rs.getDate("member_Birth"));
 				member.setMemberZip(rs.getString("member_Zip"));
 				member.setMemberAddressBasic(rs.getString("member_Address_Basic"));
 				member.setMemberAddressDetail(rs.getString("member_Address_Detail"));
 				member.setMemberJoindate(rs.getDate("member_JoinDate"));
 				
 				// VO -> List �� �̰�(add) : ���� ȸ������ �߰�
 				members.add(member);
				
			}
			// SQL ����, ����ó��
		}catch(SQLException e) {
			System.out.println(methodName + " : " + e.getMessage());
			
		} finally {
			// �ڿ� �ݳ�
			DbUtil.close(con, pstmt, rs);		
		
	   } // ����(��ȯ)
		return members ;
	}

	@Override
	public MemberVo getMember(String memberId) {
		// ����(��ȯ��) ó��
		 MemberVo member = new MemberVo();
		 
		// ���� �޼����  
		 String methodName = new Exception().getStackTrace()[0].getMethodName();
		 
		// DB ����
		Connection con = DbUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null;
		
		// SQL ����� ��ü(DQL : select)
		ResultSet rs = null;
		
		// SQL ����
		String sql = "SELECT * FROM member WHERE member_id= ? ";
		
		// SQL, ���� (��)ó��, SQL ����, ����ó��
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, memberId);
			
			rs = pstmt.executeQuery();
			
			// ���� �����⶧���� while�� �Ƚᵵ��
			if(rs.next()) {
				member.setMemberId(rs.getString("member_Id"));
 				member.setMemberPassword(rs.getString("member_Password"));
 				member.setMemberNicname(rs.getString("member_Nickname"));
 				member.setMemberName(rs.getString("member_Name"));
 				member.setMemberGender(rs.getString("member_Gender").charAt(0)); // char�� ��ȯ
 				member.setMemberEmail(rs.getString("member_Email"));
 				member.setMemberPhone(rs.getString("member_Phone"));
 				member.setMemberBirth(rs.getDate("member_Birth"));
 				member.setMemberZip(rs.getString("member_Zip"));
 				member.setMemberAddressBasic(rs.getString("member_Address_Basic"));
 				member.setMemberAddressDetail(rs.getString("member_Address_Detail"));
 				member.setMemberJoindate(rs.getDate("member_JoinDate"));
 				
 				
			}
			
		}catch(SQLException e) {
			System.out.println(methodName + " : " + e.getMessage());
			
		}finally {
			// �ڿ� �ݳ�
			DbUtil.close(con, pstmt, rs);
		}
				
		// ����(��ȯ)
		return member;
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
		boolean result = false;
		
		// ���� �޼����  
		String MethodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB ����
		Connection con = DbUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null;
		
		// SQL ����
		String sql = "DELETE member WHERE member_id=?";
		
		// SQL, ���� (��)ó��
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, memberId);
			if(pstmt.executeUpdate()==1) {
				System.out.println("ȸ������ ������ �Ϸ� �Ǿ����ϴ�");
				result = true;
			}else {
				System.out.println("ȸ������ ������ �����Ͽ����ϴ�");
			}
		
			// SQL ����, ����ó��
		}catch(SQLException e) {
			System.out.println(MethodName + " : " + "ȸ������ ������ ���� �߻�");
			System.out.println(MethodName + " : " + e.getMessage());
			
		} finally {
			// �ڿ� �ݳ�
			DbUtil.close(con, pstmt, null);
		}		
		// ����(��ȯ)
		return result;
	}

}