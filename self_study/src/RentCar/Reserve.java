package RentCar;

import RentCar.Base;
public class Reserve extends Base {
	
	private String resCarNumber;
	private String resDate;
	private String useBeginDate;
	private String returnDate;
	
	// 차 예약기능 메소드
	public String reservaCar() {
		System.out.println("렌트카 예약시간 : " + showTime());
		System.out.println("차를 예약합니다");
		return " 예약차 정보";
	}
	
	// 차 예약정보 수정 메소드
	public void modReserveInfo() {
		System.out.println("렌트카 예약정보 수정시간 : " + showTime());
		System.out.println("예약정보를 수정합니다");
	}
	
	// 차 예약정보 취소 메소드
	public void cancelReserveInfo() {
		System.out.println("렌트카 예약정보 삭제 시간 : " + showTime());
		System.out.println("예약을 취소합니다");
	}

}
