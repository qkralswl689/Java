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
import com.javateam.jdbc.member.util.ExceptionMetadata;

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
		// Ʈ����� / ����ó�� ��ü ����
		ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
//		String methodName 
//		= new Exception().getStackTrace()[0].getMethodName();
		
		
		 
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
			// Ʈ����� ó���� ���� ���� Ŀ��(commit)��� ����
			con.setAutoCommit(false);
			
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
			// Ʈ�����(transaction) ���� ����(commit)
			con.commit();
			
		} catch (SQLException e) {
//			System.err.println(methodName + " : " + " ȸ������ ����� ���ܰ� �߻��Ͽ����ϴ�.");
//			System.err.println(methodName + " : " + e.getMessage());
//			// System.err.println(methodName + " : " + "ȸ������ ����� ���ܰ� �߻��Ͽ����ϴ�.");
//			e.printStackTrace();
			emd.printErr(e, con, true);
			
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
		// Ʈ����� / ����ó�� ��ü ����
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
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
			//System.out.println(methodName + " : " + e.getMessage());
			emd.printErr(e, con, false);
			
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
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		 ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
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
			// System.out.println(methodName + " : " + e.getMessage());
			emd.printErr(e, con, false);
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
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
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
			// Ʈ����� ó���� ���� ���� Ŀ��(commit)��� ����
			con.setAutoCommit(false);
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
			con.commit();
		} catch (SQLException e) {
//			System.err.println(methodName + ": " +"ȸ������ ����� ���ܰ� �߻��Ͽ����ϴ�.");
//			System.err.println(methodName + " : " + e.getMessage());
//			e.printStackTrace();
			emd.printErr(e, con, true);
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
		// getStackTrace()[0] : �迭�� 0��° ���
		//String MethodName = new Exception().getStackTrace()[0].getMethodName();
		ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
		// DB ����
		Connection con = DbUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null;
		
		// SQL ����
		String sql = "DELETE member WHERE member_id=?";
		
		// SQL, ���� (��)ó��
		try {
			// Ʈ����� ó���� ���� ���� Ŀ��(commit)��� ����
			con.setAutoCommit(false);
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, memberId);
			if(pstmt.executeUpdate()==1) {
				System.out.println("ȸ������ ������ �Ϸ� �Ǿ����ϴ�");
				result = true;
			}else {
				System.out.println("ȸ������ ������ �����Ͽ����ϴ�");
				// result = false;
			}
			con.commit();
		
			// SQL ����, ����ó��
		}catch(SQLException e) {
//			System.out.println(MethodName + " : " + "ȸ������ ������ ���� �߻�");
//			System.out.println(MethodName + " : " + e.getMessage());
			emd.printErr(e, con, true);
		} finally {
			// �ڿ� �ݳ�
			DbUtil.close(con, pstmt, null);
		}		
		// ����(��ȯ)
		return result;
	}

	@Override
	public boolean isMember(String memberId) {
		
		// ����(��ȯ��) ó��
		boolean result = false;
		
		// ���� �޼����
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
		// DB ����
		Connection con = DbUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null;
		
		// ����� ��ü
		ResultSet rs = null;
		// SQL ����
		// String sql = "SELECT * FROM member WHERE member_id =?"; // 1)
		// String sql = "SELECT count(1) FROM member WHERE member_id =?"; // (O)
		// ���� : https://hue9010.github.io/db/select_count/
		String sql = "SELECT count(*) FROM member WHERE member_id =?";

		// SQL, ����(��)ó��
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, memberId);
			// SQL ����, ����ó��
			rs = pstmt.executeQuery();

			if(rs.next()) {
				// rs.getString("member_Id"); // 1)
				
				// 1 : ����, 0 : ����
				result = rs.getInt(1) == 1? true :false;
				// result = true; // 1)
			}				
			
		} catch (SQLException e) {
			//System.out.println(methodName + " : " + e.getMessage());
		emd.printErr(e, con, false);
			// �ڿ��ݳ�
		}finally {
			DbUtil.close(con, pstmt, rs);
		}
			
		// ����(��ȯ)
		
		return result;
	}

	@Override
	public String isMember(String memberId, String memberPassword) {
		// ����(��ȯ��) ó��
		 String result = "";
		 
		// ���� �޼����  
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		 ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
		// DB ����
		Connection con = DbUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null;
		
		// ����� ��ü
		ResultSet rs = null;
		
		// SQL ����
		String sql = "SELECT count(*) FROM member WHERE member_id = ? AND member_password= ?";
		
		// SQL, ���� (��)ó��
		
		try {
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, memberId);
			pstmt.setString(2, memberPassword);
			
			if(this.isMember(memberId)==true) {
				
				rs = pstmt.executeQuery();
				if(rs.next()) {
					result = rs.getInt(1) == 1 ? "��ġ�ϴ� ȸ������ ����" : "ȸ�� �н����尡 ����ġ";
				}
				
				// SQL ����, ����ó��
				// hint ) isMember(String memberId)Ȱ��
				// ���� ���� Ȱ��
				// 1) ȸ�� ���� ����
				// 1-1) ȸ�� ���� ��ġ => �н����� ���翩�� ����
				// 2) �н����� ��ġ ���� ����
				// 2-1) �н����� ��ġ�� ��� �޽�¡
				// 2-2) �н����� ����ġ�� ��� �޽�¡
				// 1-2) ȸ�� ���� ����ġ => �޽�¡ó�� 	
				
				// isMember ��Ȱ��
					
					// 2)
					
			}else {
				result = "��ġ�ϴ� ȸ�� ����";
			}
				// ���� �ۼ��� �ڵ� => �߸���
//			if(rs.next()) {
//				if(rs.getInt(1)==1) {
//					if(rs.getInt(2)==1) {
//						result += "��ġ�ϴ� ȸ�� ������ �����մϴ�";
//					}else if(rs.getInt(2)==0) {
//						result += "ȸ�� �н����尡 ��ġ���� �ʽ��ϴ�";
//					}
//				}else if(rs.getInt(1)==0) {
//					result += "ȸ�� ���̵� �������� �ʽ��ϴ�";
//				}
//			}
			
		} catch (SQLException e) {
			
			//System.out.println(methodName + " : " + e.getMessage());
			emd.printErr(e, con, false);
			
			// �ڿ� �ݳ�
		}finally {
			DbUtil.close(con, pstmt, rs);
		}	
		
	
		// ����(��ȯ)		
		return result;
	}

	@Override
	public List<MemberVo> getMembersByPaging(int page, int limit) {

		// ����(��ȯ��) ó��
		List<MemberVo> members = new ArrayList<>();
		
		// ���� ȸ������ ��ü ����
		MemberVo member = null;
		
		// ���� �޼����  
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
		// DB ����
		Connection con = DbUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null;
		
		// ����� ��ü
		ResultSet rs = null;
		
		// SQL ����
		// 1)
//		String sql = "SELECT * " + 
//		 "FROM (SELECT ROWNUM, " + 
//		 "             m.*, " + 
//		 "             FLOOR((ROWNUM - 1) / ? + 1) page " + 
//		 "      FROM (" + 
//		 "             SELECT * FROM member " + 
//		 "             ORDER BY member_id ASC " + 
//		 "           ) m " + 
//		 "      ) " + 
//		 "WHERE page = ?";
//		
		// 2) 
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * ") 
		  .append("FROM (SELECT ROWNUM,") 
		  .append("             m.*,") 
		  .append("             FLOOR((ROWNUM - 1) / ? + 1) page ") 
		  .append("      FROM ( ") 
		  .append("             SELECT * FROM member ") 
		  .append("             ORDER BY member_id ASC ") 
		  .append("           ) m ") 
		  .append("      ) ") 
		  .append("WHERE page = ?");
		
		// SQL, ���� (��)ó��
		try {
			// pstmt = con.prepareStatement(sql); // 1)
			pstmt = con.prepareStatement(sb.toString()); // 2)
			// ���� �ۼ��Ѱ�
//			pstmt.setInt(1,page);
//			pstmt.setInt(2,limit);
			
			pstmt.setInt(1, limit); // �� �������� ��� �ο� �� 
			pstmt.setInt(2, page); // ���� ������
			
			// SQL ����� ��ü ����
			rs = pstmt.executeQuery();
		
			while(rs.next()) {
			
				member = new MemberVo(); 
				
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
			
		} catch (SQLException e) {
			//System.out.println(methodName + " : " + e.getMessage());
			emd.printErr(e, con, false);
			// �ڿ� �ݳ�
		}finally {
			DbUtil.close(con, pstmt, rs);
		}		
		// ����(��ȯ)
		return members;
	}

	@Override
	public boolean isEnableEmail(String memberEmail) {

		// ����(��ȯ��) ó��
		 boolean result = false;
		 
		// ���� �޼����  
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		 ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
		// DB ����
		Connection con = DbUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null;
		
		// ����� ��ü (DOL : select)
		ResultSet rs = null;
		
		// SQL ����
		// ���� �ۼ��Ѱ�
//		String sql = "SELECT count(*) FROM member " + 
//				"WHERE member_email = ? ";
		
		// 1) 
//		String sql = "SELECT DECODE(count(*), 0, 'true', 1, 'false') as email_flag "
//				+ "FROM member " 
//				+ "WHERE member_email = ? ";
		
		// 2) 
		String sql = "SELECT count(*) FROM member " + 
		"WHERE member_email = ? ";
		
		// SQL, ���� (��)ó��
		try {
			pstmt = con.prepareStatement(sql);
			 pstmt.setString(1, memberEmail);
			// SQL ����� ��ü ����
			 rs = pstmt.executeQuery();
			// SQL ����, ����ó��
			 
			 // 1)
//			 if(rs.next()) {
//				 // boolean���� ����ȯ
//				 // result = Boolean.valueOf(rs.getString(1)); //(O)
//				 // result = new Boolean(rs.getString(1)); // (O)
//				 result = new Boolean(rs.getString("email_flag"));
//			 }
			 // 2)
			 if(rs.next()) {
				 result = rs.getInt(1) == 1 ? false : true;
			 }
			 
			 // ���� �ۼ��� �ڵ�
//			 while(rs.next()) {				 
//				 result = rs.getBoolean(1)== false ? false:true;				 
//			 }
			
		} catch (SQLException e) {
			
			//System.out.println(methodName + " : " + e.getMessage());
			emd.printErr(e, con, false);
			// �ڿ� �ݳ�
		}finally {
			DbUtil.close(con, pstmt, rs);
			
		}
		// ����(��ȯ)
		return result;
	}

	@Override
	public boolean isEnableEmail(String memberId, String memberEmail) {
		// ����(��ȯ��) ó��
		boolean result = false;
		 
		// ���� �޼����  
		//String methodName = new Exception().getStackTrace()[0].getMethodName();
		ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
		// DB ����
		Connection con = DbUtil.connect();

		// SQL ó�� ��ü
		PreparedStatement pstmt = null;

		// ����� ��ü (DOL : select)
		ResultSet rs = null;

		// SQL ����
		// ���� �ۼ��Ѱ�
		String sql = "SELECT count(*) FROM member " + 
				"WHERE member_id != ? AND member_email = ? ";

//		String sql = "SELECT DECODE(count(*), 0, 'true', 1, 'false') as email_flag "
//		+ "FROM member " 
//		+ "WHERE memberid != ? AND member_email = ? ";
//		
		// SQL, ���� (��)ó��
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,memberId);
			pstmt.setString(2, memberEmail);

			// SQL ����� ��ü ����
			rs = pstmt.executeQuery();
			
			// SQL ����, ����ó��	
			if(rs.next()) {
				result = rs.getInt(1) == 0 ? true : false;
			
				result = false;
			}
			
		} catch (SQLException e) {
			//System.out.println(methodName + " : " + e.getMessage());
			emd.printErr(e, con, false);
			// �ڿ� �ݳ�
		}finally {
			DbUtil.close(con, pstmt, rs);
			
		}

		// ����(��ȯ)
		return result;
	}

	@Override
	public boolean isEnablePhone(String memberPhone) {
		// ����(��ȯ��) ó��
		 boolean result = false;
		// ���� �޼����  
		 ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);
		 
		// DB ����
		 Connection con = DbUtil.connect();
		 
		// SQL ó�� ��ü
		 PreparedStatement pstmt = null;
		 
		// ����� ��ü (DOL : select)
		 ResultSet rs = null;

		// SQL ����
		 String sql = "SELECT count(*) FROM member "
		 		+ "WHERE member_phone = ? ";

		// SQL, ���� (��)ó��
		 try {
			// SQL ����� ��ü ���� 			 
			pstmt=con.prepareStatement(sql);
			
			pstmt.setString(1, memberPhone);
			
			rs = pstmt.executeQuery();
			// SQL ����, ����ó��
			
			if(rs.next()) {
				result = rs.getInt(1) == 1 ? false:true ;
			}

		} catch (SQLException e) {
			emd.printErr(e, con, false);
			
		// �ڿ� �ݳ�
		} finally {
			DbUtil.close(con, pstmt, rs);
			
		}
		// ����(��ȯ)
		return result;
	}

	@Override
	public boolean isEnablePhone(String memberId, String memberPhone) {
		// ����(��ȯ��) ó��
		 boolean result = false;
		 
		// ���� �޼����  
		  ExceptionMetadata emd = new ExceptionMetadata(new Exception().getStackTrace()[0]);

		// DB ����
		  Connection con = DbUtil.connect();

		// SQL ó�� ��ü
		  PreparedStatement pstmt = null;

		// ����� ��ü (DOL : select)
		  ResultSet rs = null;

		// SQL ����
		  String sql = "SELECT count(*) FROM member " + 
		  		"WHERE member_id != ? AND member_phone = ? ";

		// SQL, ���� (��)ó��
		  
		  try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1,memberId);
			pstmt.setString(2,memberPhone);
			
			// SQL ����� ��ü ����
			rs = pstmt.executeQuery();
			
	
			if(rs.next()) {
				result = rs.getInt(1)==0 ?true : false;
			}else {
				result = false;
			}
			// SQL ����, ����ó��
		} catch (SQLException e) {
			emd.printErr(e, con, false);
			
			// �ڿ� �ݳ�
		}finally {
			DbUtil.close(con, pstmt, rs);
		}

		// ����(��ȯ)
		return result;
	}

	@Override
	public List<MemberVo> getMembersBySearching(String searchKey, String searchValue, boolean isEquivalentSearch,
			String sortDirection, int page, int limit) {
		
		// ����(��ȯ��) ó��
		List<MemberVo> members = new ArrayList<>();
		 
		// ���� �޼����  
		
		// DB ����
		
		// SQL ó�� ��ü

		// ����� ��ü
		
		// SQL ����
		
		// SQL, ���� (��)ó��
		
		// SQL ����, ����ó��
		
		// �ڿ� �ݳ�
		
		// ����(��ȯ)
		return null;
	}
	
	
	// ����(��ȯ��) ó��
	 
	// ���� �޼����  
	
	// DB ����
	
	// SQL ó�� ��ü

	// ����� ��ü
	
	// SQL ����
	
	// SQL, ���� (��)ó��
	
	// SQL ����, ����ó��
	
	// �ڿ� �ݳ�
	
	// ����(��ȯ)
	

}