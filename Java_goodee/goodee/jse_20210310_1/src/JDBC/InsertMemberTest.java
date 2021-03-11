package JDBC;

import java.sql.Date;

import JDBC.MemberDao;
import JDBC.MemberDaoImpl;
import JDBC.MemberVo;

/**
 * InsertMember 메서드 단위 테스트(Unit Test Case) <br>
 * : 회원정보 생성 테스트<br><br>
 * 
 * @author mingki
 *
 */
public class InsertMemberTest {

	public static void main(String[] args) {
		
		// DAO 객체 생성
		MemberDao dao = MemberDaoImpl.getInstance();
		
		// 생성할 회원정보 생성 (MemberVO)
		MemberVo member = new MemberVo();
		
		member.setMemberId("java");		
		member.setMemberPassword("1234");
		member.setMemberNicname("뚱보");
		member.setMemberName("배현");
		member.setMemberGender('m');
		member.setMemberEmail("skfksnsk@gmail.com");
		member.setMemberPhone("010-3078-0694");
		member.setMemberBirth(Date.valueOf("1991-01-04"));
		member.setMemberZip("123456");
		member.setMemberAddressBasic("서울시");
		member.setMemberAddressDetail("황제빌라");
		
		// InserMember 테스트(true/false)
		String result = dao.insertMember(member) == true ? "저장 성공" : "저장 실패";
		System.out.println("insertMember 테스트 결과 : " + result);
	}

}
