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
    /**
	 * ȸ�� ���� ����<br><br>
	 * ex) ȸ�����Խ� ȸ�� ���� ���˽� Ȱ��<br><br>
	 * 
	 * @param memberId ȸ�� ���̵�
	 * @return ȸ��(����) ���� 
	 */
	public boolean isMember(String memberId);
	
	/**
	 * ȸ�� ����(����) ���� <br><br>
	 * : ȸ�� ����(����) ���� �׽�Ʈ<br><br>
	 * ex) ȸ�� �α���(����:authentidation)<br><br>
	 * 
	 * - �޽��� ���� : <br>
	 * 1) ȸ�� ���̵� �������� ���� ��� : ȸ�� ���̵� �������� �ʽ��ϴ�. <br><br>
	 * 2) ȸ�� ���̵� ���������� ȸ�� �н����尡 ���� ���� ��� : ȸ�� �н����尡 ��ġ���� �ʽ��ϴ�<br><br>
	 * 3) ȸ�� ���̵�/ȸ�� �н����尡 ���� ��ġ�� ��� : ��ġ�ϴ� ȸ�� ������ �����մϴ�<br><br>
	 * 
	 * @param memberId ȸ�� ���̵�
	 * @param memberPassword ȸ�� �н�����
	 * @return �����޽���
	 */
	public String isMember(String memberId, String memberPassword);
	
	/**
	 * ����¡�� ���� ȸ�������� ��ȸ(�˻�)<br><br>
	 * 
	 * @param page ��ȸ�� ������ ��ȣ
	 * @param limit ������ �� ����� ��
	 * return ȸ������ ����Ʈ (���)
	 */
	public List<MemberVO> getMembersByPaging(int page, int limit);
	
	/**
	 * �̸��� �ߺ� ����<br><br>
	 * : ��� ������ �̸��� ���� ����<br><br>
	 * : ex) ȸ�����Խ� �̸��� �ߺ� ���� <br>
	 * : �̸��� �뵵 &rarr; ���̵�/��й�ȣ �нǽ� �˻� Ȱ��<br><br>
	 * @param memberEmail �̸���
	 * @return ���� �̸��� ����
	 */
	public boolean isEnableEmail(String memberEmail);
	
	public List<MemberVO> getMembersBySearching(String searchKey, String searchValue, boolean isEquivalentSearch,
			String sortDirection, int page, int limit);
}


