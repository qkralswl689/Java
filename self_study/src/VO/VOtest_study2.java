package VO;

import VO.MemberVO2;

public class VOtest_study2 {
	public static void main(String[] args) {
		
	
		MemberVO2 member1 = new MemberVO2();
		
		member1.setId("����");
		member1.setPw("1234");
		member1.setName("�׻�");
		member1.setAddress("��õ��");
		
		MemberVO2 member2 = new MemberVO2();
		
		member2.setId("����1");
		member2.setPw("12341");
		member2.setName("�׻�1");
		member2.setAddress("��õ��1");
		
		System.out.println(member1.equals(member2));
		
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
	}
	

}
