package com.javateam.jdbc.member.dao;

import java.util.List;

import com.javateam.jdbc.member.domain.MemberVo;

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
	public List<MemberVo> getMembersByPaging(int page, int limit);
	
	/**
	 * �̸��� �ߺ� ����<br><br>
	 * : ��� ������ �̸��� ���� ����<br><br>
	 * : ex) ȸ�����Խ� �̸��� �ߺ� ���� <br>
	 * : �̸��� �뵵 &rarr; ���̵�/��й�ȣ �нǽ� �˻� Ȱ��<br><br>
	 * @param memberEmail �̸���
	 * @return ���� �̸��� ����
	 */
	public boolean isEnableEmail(String memberEmail);

	/**
	 * �̸��� �ߺ� ����<br><br>
	 * : ��� ������ �̸��� ���� ����<br><br>
	 * : ex) ȸ�� ���� "����(����)"��  �̸��� �ߺ� ���� <br>
	 * : �̸��� �뵵 &rarr; ���̵�/��й�ȣ �нǽ� �˻� Ȱ��<br><br>
	 * @param memberId ȸ�� ���̵�
	 * @param memberEmail �̸���
	 * @return ���� �̸��� ����
	 */
	public boolean isEnableEmail(String memberId,String memberEmail);
	
	/**
	 * ����ó(��ȭ��ȣ) �ߺ�����<br><br>
	 * : ��� ������ ����ó(��ȭ��ȣ) ���� ����<br><br>
	 * : ex) ȸ�����Խ� ����ó(��ȭ��ȣ) �ߺ� ����<br>
	 * : ����ó(��ȭ��ȣ) �뵵 &rarr; ���̵�/��й�ȣ �нǽ� �˻� Ȱ��<br><br>
	 * @param memberPhone ȸ�� ����ó(��ȭ��ȣ)
	 * @return ���� ����ó(��ȭ��ȣ) ����
	 */
	public boolean isEnablePhone(String memberPhone);
	
	/**
	 * ����ó(��ȭ��ȣ) �ߺ� ����<br><br>
	 * : ��� ������ ����ó(��ȭ��ȣ) ���� ����<br><br>
	 * : ex) ȸ�����Խ� ����ó(��ȭ��ȣ) �ߺ� ����<br> 
	 * : ����ó(��ȭ��ȣ) �뵵 &rarr; ���̵�/��й�ȣ �нǽ� �˻� Ȱ��<br><br>  
	 * 
	 * @param memberId ȸ�� ���̵�
	 * @param memberPhone ȸ�� ����ó(��ȭ��ȣ)
	 * @return ���� ����ó(��ȭ��ȣ) ����
	 */
	public boolean isEnablePhone(String memberId, String memberPhone);
}
