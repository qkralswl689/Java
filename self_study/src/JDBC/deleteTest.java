package JDBC;

public class deleteTest {

	public static void main(String[] args) {

		// DAO ��ü ����
		MemberDAO dao = MemberDAOImpl.getInstance();
		
		// UpdateMember �׽�Ʈ(true/false)
		
		String result = dao.deleteMember("hyun")== true?
						"���� ����":"���� ����";

		System.out.println("���� ���� ���� : " + result);
		
	}

}
