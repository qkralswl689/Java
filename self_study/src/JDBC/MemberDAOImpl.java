package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
