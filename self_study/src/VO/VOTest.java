package VO;

import VO.MemberVO;

public class VOTest {
	
	public static void main(String[] args) {
		
//		MemberVO member = new MemberVO(); // 객체생성 
		
		// VO 입력
//		member.setId("java");
//		member.setPw("1234");
//		member.setName("자바");
//		member.setAddress("가산");
		
		MemberVO member = new MemberVO("java","1234","자바","가산"); // 위와 동일 (사용 잘 안한다)
		
		// VO 출력
		// System.out.println("id : " +member.getId());
		
		// VO 일괄 출력
		// toString 오버라이딩 의 목적
		// 1) 객체 호출 -> 객체.toString 동일한 의미 : 코드가 간결해진다
		// 2) Object.toString 오버라이딩 -> 
		//	- 용도 : 객체 고유값 확인 < 객체 "내용(멤버 필드들)"을 확인 변경
		// 3) toString : 메서드의 이름의 의미 
		// 	- 문자열(객체의 멤버 필드들의 내용을)로 변경(출력)하다 
		System.out.println(member);
		// System.out.println(member.toString()); // 위와 동일한 의미

	}

}
