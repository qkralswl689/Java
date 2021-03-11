/**
 * 
 */
package JDBC;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import JDBC.MemberDao;
import JDBC.MemberVo;
import JDBC.DbUtil;

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
		String methodName = new Exception().getStackTrace()[0].getMethodName();
		
		// DB ����
		Connection con = DbUtil.connect();
		
		// SQL ó�� ��ü
		PreparedStatement pstmt = null; // 1)
		// Statement pstmt = null; // 2)
		// ����) Statement pstmt = null; // ? (���ϵ� ī��) ����� �� ����
		// ����) CallableStatment : PL/SQL ����
		
		// SQL ����
		String sql = "INSERT INTO member VALUES"
					+ "(?,?,?,?,?,?,?,?,?,?,?,?, sysdate)";		
		
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
			pstmt.setDate(8, member.getMemberBirth());
			pstmt.setString(9, member.getMemberZip());
			pstmt.setString(10, member.getMemberAddressBasic());
			pstmt.setString(11, member.getMemberAddressDetail());
			
			// SQL ����, ���ϰ� ó��, ����ó��
			if(pstmt.executeUpdate() == 1) { // 1 : DML ���� ������ ��(tuple, record)�� ��
				
				System.out.println("ȸ������ ���忡 �����Ͽ����ϴ�.");
				result = true;
				
			}else {
				
				System.out.println("ȸ������ ���忡 �����Ͽ����ϴ�.");
				// result = false;
				
			}
		} catch (SQLException e) {
			System.out.println(methodName + " : " + " ȸ������ ����� ���ܰ� �߻� �Ͽ����ϴ� ");
			System.out.println(methodName + " : " + e.getMessage());
			//System.out.println(methodName + " : " + "ȸ������ ����� ���ܰ� �߻� �Ͽ����ϴ�.");
			e.printStackTrace();
			
		} finally {
			// �ڿ� �ݳ�
			DbUtil.close(con, pstmt, null);
		}
		
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
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteMember(String memberId) {
		// TODO Auto-generated method stub
		return false;
	}

}
