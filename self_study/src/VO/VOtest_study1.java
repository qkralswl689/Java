package VO;

import VO.MemberVO2;

public class VOtest_study1 {
	public static void main(String[] args) {
		
		// °´Ã¼ »ý¼º
		MemberVO2 member = new MemberVO2();
		
		member.setId("¹èÇö");
		member.setPw("1234");
		member.setName("»×»×");
		member.setAddress("¾çÃµ±¸");
		
		System.out.println("id : " + member.getId());
		
		System.out.println(member);
	}
	

}
