package RentCar;

import RentCar.Base;
public class Member extends Base { // 부모클래스 (base) 상속 받는다
	
	// 멤버변수
	private String id;
	private String pw;
	private String name;
	private String address;
	private String phoneNum;
	
	// 새로운 회원등록 메소드
	public void regMember() {
		System.out.println("회원 등록시간 : " + showTime());
		System.out.println("회원 가입합니다");
	}
	
	// 기존 회원 정보조회 메소드
	public String viewMember() {
		System.out.println("회원 조회시간 : " + showTime());
		return "조회된 회원 정보";
	}
	
	// 기존 회원정보 수정 메소드
	public void modMember() {
		System.out.println("회원 수정시간 : " + showTime());
		System.out.println("회원 정보를 수정합니다.");
	}
	
	// 기존 회원 정보삭제 메소드
	public void delMember() {
		System.out.println("회원 삭제 시간 : " + showTime());
		System.out.println("회원 정보를 삭제 합니다");
	}



}
