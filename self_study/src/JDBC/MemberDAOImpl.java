package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



// MemberDAO ����Ŭ����
public class MemberDAOImpl implements MemberDAO {
	
	// DAO ��ü ����
	private static MemberDAOImpl instance = null;
	
	// �⺻ ������
	private MemberDAOImpl() {}
	
	// ��Ŭ�� ��ü ���� �޼���
	public static final MemberDAOImpl getInstance() {
		// final : �������̵� ����
		
		if(instance == null) {
			instance = new MemberDAOImpl();
		}
		 return instance;
	}
	
	@Override
	public boolean insertMember(MemberVO member) {
		
		// ���ϰ� �ʱ�ȭ
		boolean result = false;
		
		String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		//DB ����
		Connection con = DBUtil.connect();
		
		// SQLó�� ��ü
		PreparedStatement pstmt = null;
		
		// SQL ����
		String sql = "INSERT INTO studyjdbc VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
		
		// SQL ,����(��) ó��
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, member.getMemberId());
			pstmt.setString(2, member.getMemberPassword());
			pstmt.setString(3, member.getMemberNickname());
			pstmt.setString(4, member.getMemberName());
			pstmt.setString(5, member.getMemberGender() + ""); // char -> String ��ȯ ���� �ڿ� "" ������
			pstmt.setString(6, member.getMemberEmail());
			pstmt.setString(7, member.getMemberPhone());
			pstmt.setDate(8,member.getMemberBirth());
			pstmt.setString(9, member.getMemberZip());
			pstmt.setString(10, member.getMemberAddressBasic());
			pstmt.setString(11, member.getMemberAddressDetail());
			
			if(pstmt.executeUpdate() == 1) {
				System.out.println("���� ����");
				result = true;
			}else {
				System.out.println("���� ����");
			}
		} catch(SQLException e) {
			System.out.println(methodName + "ȸ�� ���� ���ܹ߻�");
			System.out.println(methodName + e.getMessage());
			
		}finally {
			DBUtil.cloese(con, pstmt, null);
		}
		return result;
	}

	@Override
	public List<MemberVO> getAllMembers() {
		// ����(��ȯ��) ó��
		 List<MemberVO> members = new ArrayList<>();
		 
		// ���� ȸ������ ��ü ����
		 MemberVO member = new MemberVO();
		 
		// ���� �޼����  
		String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB ����
		Connection con = DBUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null;
		
		// SQL ����� ��ü(DQL:select)
		ResultSet rs = null;
		
		// SQL ����
		String sql = "SELECT * FRom STUDYJDBC";
		
		// SQL ó��
		try {
			pstmt = con.prepareStatement(sql);
			
			// SQL ����� ��ü ����
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				// ���� ȸ������ ����
				member = new MemberVO();
				member.setMemberId(rs.getString("member_Id"));
 				member.setMemberPassword(rs.getString("member_Password"));
 				member.setMemberNickname(rs.getString("member_Nickname"));
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
		} catch (SQLException e) {
			System.out.println(methodName + " : " + e.getMessage());
		
			// �ڿ� �ݳ�
		}finally {
			DBUtil.cloese(con, pstmt, rs);
		}	
		
		// ����(��ȯ)
		return members;
	}

	@Override
	public MemberVO getMember(String memberId) {
		// ����(��ȯ��) ó��
		
		 
				// ���� �޼����  
				
				// DB ����
				
				// SQL ó�� ��ü
				
				// SQL ����
				
				// SQL, ���� (��)ó��
				
				// SQL ����, ����ó��
				
				// �ڿ� �ݳ�
				
				// ����(��ȯ)
		return null;
	}

	@Override
	public boolean updateMemeber(MemberVO member) {
		
		// ����(��ȯ��) ó��
		boolean result = false;

		// ���� �޼����(reflection ���)
		// new Exception() : ���� �߻���Ű��
		// getStackTrace(): stattraceElement��� ��ü���� �迭�� printStackTrace()�� ��� ��ȯ
		String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB ����
		Connection con = DBUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null;
		
		// SQL ����

		StringBuilder sq = new StringBuilder();
		
		sq.append("UPDATE STUDYJDBC SET ");
		sq.append("member_password= ?,");
		sq.append("member_address_basic= ? ,");
		sq.append("member_address_detail= ?" );
		sq.append("WHERE member_id= ?");
		
		// SQL, ���� (��)ó��
		try {
			pstmt = con.prepareStatement(sq.toString());
			
			pstmt.setString(1, member.getMemberPassword());
			pstmt.setString(2, member.getMemberAddressBasic());
			pstmt.setString(3, member.getMemberAddressDetail());
			pstmt.setString(4, member.getMemberId());
			
			if(pstmt.executeUpdate() == 1) {
				System.out.println("���� ����");
				result = true;
			}else {
				System.out.println("���� ���� ");
			}
		// SQL ����, ���ϰ� ó��, ����ó��
		} catch (SQLException e) {
			System.out.println("Update ���� ���� : " + result);
		// �ڿ� �ݳ�
		}finally {
			DBUtil.cloese(con, pstmt, null);	
		}
		// ����(��ȯ)
		return result;
		
	}

	@Override
	public boolean deleteMember(String memberId) {
		// ����(��ȯ��) ó��
		 boolean result = false;
		 
		// ���� �޼����  
		 String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB ����
		Connection con = DBUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null;
		
		// SQL ����
		String sql = "Delete STUDYJDBC WHERE member_id = ?";
		
		// SQL, ���� (��)ó��
		try {
			pstmt = con.prepareStatement(sql);
			
			pstmt.setString(1, memberId);
			if(pstmt.executeUpdate()==1) {
				System.out.println("���� ����");
				result = true;
			}else {
				System.out.println("���� ����");
			}
							
			// SQL ����, ����ó��
		} catch (SQLException e) {
			System.out.println("���� ó���� ���ܹ߻�");
			System.out.println(methodName + " : " + e.getMessage());
			e.printStackTrace();
			// �ڿ� �ݳ�
		} finally {
			DBUtil.cloese(con, pstmt, null);	
		
		}// ����(��ȯ)		
		return result;
	}

	@Override
	public boolean isMember(String memberId) {
		return false;
	}

	@Override
	public String isMember(String memberId, String memberPassword) {
		return null;
	}

	@Override
	public List<MemberVO> getMembersByPaging(int page, int limit) {
		return null;
	}

	@Override
	public boolean isEnableEmail(String memberEmail) {
		return false;
	}

	// ���� �˻�� ���� �ʵ������ ��ȯ
	// ex ) �̸� => member_name
	private String getFieldBySearchWord(String searchWord) {
		String result = "";
		
		searchWord = searchWord.trim(); //�˻��� ���� ����
		result = searchWord.contentEquals("�̸�") ? "member_name" :
				 searchWord.contentEquals("����") ? "member_nickname" :
				 searchWord.contentEquals("���̵�") ? "member_id":
				 searchWord.contentEquals("����") ? "member_gender":
				 searchWord.contentEquals("�̸���") ? "member_email":
				 searchWord.contentEquals("����ó") ? "member_phone" :
				 searchWord.contentEquals("����") ? "member_birth" :
				 searchWord.contentEquals("�⺻�ּ�") ? "member_address_basic":
				 searchWord.contentEquals("���ּ�") ? "member_address_detail" :
				 searchWord.contentEquals("������") ? "member_joindate" :null;
				
		return result;
		
	}
	
	@Override
	public List<MemberVO> getMembersBySearching(String searchKey, String searchValue, boolean isEquivalentSearch,
			String sortDirection, int page, int limit) {
		
		// ����(��ȯ��) ó��
		List<MemberVO> members = new ArrayList<>();
		
		MemberVO member = null;
		 
		// ���� �޼����  
		
		String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB ����
		Connection con = DBUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null;
		
		// ����� ��ü
		ResultSet rs = null;
		
		// SQL ����
		// Where�� ����
		// ���ǿ� ���� ����/����  �˻� WHERE��(clause) ������ ����
		try {
			String searchField = this.getFieldBySearchWord(searchKey);
			if(searchField == null) {
				throw new SQLException("�˻�� �ش�Ǵ� ���̺� �ʵ尡 �����ϴ�.");
			}
			// ���� �� ���� �˻��� ��츦 �����Ͽ� ǥ���� ����
			// 1)
			String whereClause = isEquivalentSearch == true ? searchField + " = " + searchValue + " " :
															searchField + " like '%' || '" + searchValue + "' || '%' ";
			
			// 2) 
			if(searchField.equals("member_birth")|| searchField.equals("member_joindate")) {
				searchField = "TO_CHAR(" + searchField + ", 'YYYY-MM-DD') ";
			}
			
			String sql = "SELECT * " + 
					 "FROM (SELECT ROWNUM, " + 
					 "             m.*, " + 
					 "             FLOOR((ROWNUM - 1) / ? + 1) page " + 
					 "      FROM (" + 
					 "             SELECT * FROM STUDYJDBC " + 
					 " 			   WHERE " + whereClause + " " +
					 "             ORDER BY member_id " + sortDirection + " " +
					 "           ) m " + 
					 "      ) " + 
					 "WHERE page = ?";
			// SQL, ���� (��)ó��
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, limit);
			pstmt.setInt(2, page);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				member = new MemberVO();
				
				member.setMemberId(rs.getString("member_Id"));
 				member.setMemberPassword(rs.getString("member_Password"));
 				member.setMemberNickname(rs.getString("member_Nickname"));
 				member.setMemberName(rs.getString("member_Name"));
 				member.setMemberGender(rs.getString("member_Gender").charAt(0)); // char�� ��ȯ
 				member.setMemberEmail(rs.getString("member_Email"));
 				member.setMemberPhone(rs.getString("member_Phone"));
 				member.setMemberBirth(rs.getDate("member_Birth"));
 				member.setMemberZip(rs.getString("member_Zip"));
 				member.setMemberAddressBasic(rs.getString("member_Address_Basic"));
 				member.setMemberAddressDetail(rs.getString("member_Address_Detail"));
 				member.setMemberJoindate(rs.getDate("member_JoinDate"));
 				
 				members.add(member);
 				
			}
			
			// SQL ����, ����ó��
			
			
			
		}catch(SQLException e) {
			System.out.println(methodName + " : " + e.getMessage());
			// �ڿ� �ݳ�
		}finally {
			DBUtil.cloese(con, pstmt, rs);
		}
		
		
		
		// ����(��ȯ)
		return members;
	}

	

}
