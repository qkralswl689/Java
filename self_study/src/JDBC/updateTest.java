package JDBC;

public class updateTest {

	public static void main(String[] args) {
		
		MemberDAO dao = MemberDAOImpl.getInstance();
		
		MemberVO member = new MemberVO();
		
		member.setMemberPassword("11112222");
		member.setMemberAddressBasic("����Ư����");
		member.setMemberAddressDetail("Ȳ������׺���");
		member.setMemberId("hyun");
		
		String result = dao.updateMemeber(member) == true ? 
						"���� ����" : "���� ����";
		System.out.println("���� ���� ����  : " + result);

	}

}
