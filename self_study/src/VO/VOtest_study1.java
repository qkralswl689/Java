package VO;

import VO.MemberVO2;

public class VOtest_study1 {
	public static void main(String[] args) {
		
		// ��ü ����
		MemberVO2 member = new MemberVO2();
		
		member.setId("����");
		member.setPw("1234");
		member.setName("�׻�");
		member.setAddress("��õ��");
		
		System.out.println("id : " + member.getId());
		
		System.out.println(member);
	}
	

}
