package JDBC;

import java.util.List;

import JDBC.MemberVo;

/**
 * DAO (Data Access Object) <br>
 * : CRUD(DML(CUD) + DQL(select)) methods��� ���� �Ѵ� <br>
 * ����) ��Ȥ DDL�� �����Ǵ� �޼���� ������ ���� �ִ� <br>
 * 
 * ���� 1) CRUD(create read update delete) <br>
 * ���� 2) CUD(create update delete) &rarr; ������(���� �ǹ���) DML <br>
 * 
 * ����) DB = ����(����) �����(Persistent Repository) <br>
 * ����(����) ��ü : Persistent(/-ce) Object &rarr; VO, DAO(VO���̴� �۵� X), (D)TO <br>
 * 
 * @author mingki
 */

public interface MemberDao {
	/**
	 * ���� ȸ�� ���� ����(����)
	 * @param member ȸ������ ��ü
	 * @return ȸ������ ���� ���� ����
	 */
	
	public boolean insertMember(MemberVo member);
	
	/**
	 * ��ü ȸ�� ������ ��ȸ(�˻�)
	 * @return ��ü ȸ������ ����Ʈ(���)
	 */
	public List<MemberVo> getAllMembers();
	
	/**
	 * ���� ȸ������ ��ȸ(�˻�)
	 * @param memberId ȸ�� ���̵�
	 * @return ���� ȸ������(VO)
	 */
	public MemberVo getMember(String memberId);

	/**
	 * ���� ȸ������ ����(����)
	 * 
	 * @param member ȸ������ ��ü(VO)
	 * @return ȸ������ ����(����)���� ����
	 */
	public boolean updateMember(MemberVo member);
	
	/**
	 * ���� ȸ������ ����
	 * @param memberId ȸ�� ���̵�
	 * @return ȸ������ ���� ���� ����
	 */
	public boolean deleteMember(String memberId);
}
