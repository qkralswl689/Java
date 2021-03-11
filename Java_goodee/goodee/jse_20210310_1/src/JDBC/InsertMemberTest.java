package JDBC;

import java.sql.Date;

import JDBC.MemberDao;
import JDBC.MemberDaoImpl;
import JDBC.MemberVo;

/**
 * InsertMember �޼��� ���� �׽�Ʈ(Unit Test Case) <br>
 * : ȸ������ ���� �׽�Ʈ<br><br>
 * 
 * @author mingki
 *
 */
public class InsertMemberTest {

	public static void main(String[] args) {
		
		// DAO ��ü ����
		MemberDao dao = MemberDaoImpl.getInstance();
		
		// ������ ȸ������ ���� (MemberVO)
		MemberVo member = new MemberVo();
		
		member.setMemberId("java");		
		member.setMemberPassword("1234");
		member.setMemberNicname("�׺�");
		member.setMemberName("����");
		member.setMemberGender('m');
		member.setMemberEmail("skfksnsk@gmail.com");
		member.setMemberPhone("010-3078-0694");
		member.setMemberBirth(Date.valueOf("1991-01-04"));
		member.setMemberZip("123456");
		member.setMemberAddressBasic("�����");
		member.setMemberAddressDetail("Ȳ������");
		
		// InserMember �׽�Ʈ(true/false)
		String result = dao.insertMember(member) == true ? "���� ����" : "���� ����";
		System.out.println("insertMember �׽�Ʈ ��� : " + result);
	}

}
