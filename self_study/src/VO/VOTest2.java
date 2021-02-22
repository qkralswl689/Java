package VO;

import VO.MemberVO;

public class VOTest2 {

	public static void main(String[] args) {
		
		MemberVO member1 = new MemberVO("java","1234","자바","가산");
		MemberVO member2 = new MemberVO("java","1234","자바","가산");
		
		// 두 객제들 간의 (모든) 멤버 필드들의 값 비교
		// ex) 두 객체의 기존값과 신규값의 비교 
		// 회원 정보 수정시 : 수정 정보 == 기존 정보 => DB 수정 여부 결정(수정 불필요)
		// => 효과 ) DB 사용량(돈) 절약된다
		
		// equals 비교
		System.out.println(member1.equals(member2));
		
		// hashCode 비교
		System.out.println(member1.hashCode());
		System.out.println(member2.hashCode());
	}

}
