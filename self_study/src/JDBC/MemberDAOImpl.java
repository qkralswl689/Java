package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.javateam.jdbc.member.dao.Impl.MemberDaoImpl;

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
		String sql = "INSERT INTO member VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
		
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MemberVO getMember(String memberId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateMemeber(MemberVO member) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMember(String memberId) {
		// TODO Auto-generated method stub
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
