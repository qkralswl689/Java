package JDBC;

import java.util.List;

// DAO : �����͸� �����ϴµ� ���̴� ��ü
public interface MemberDAO {
	
	// ���� ȸ�� ���� ����
	public boolean insertMember(MemberVO member);
	
	//  ��ü ȸ������ ��ȸ
	public List<MemberVO>getAllMembers();
 
	// ���� ȸ������ ��ȸ
	public MemberVO getMember(String memberId);
	
	// ���� ȸ������ ����
	public boolean updateMemeber(MemberVO member);
	
	// ���� ȸ������ ����
    public boolean deleteMember(String memberId);
}
