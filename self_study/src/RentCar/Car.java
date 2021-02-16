package RentCar;

import RentCar.Base;

public class Car extends Base {
	
	private String carNumber;
	private String carName;
	private String carColor;
	private int carSize;
	private String carMaker;
	
	// 차의 정보조회 메소드
	public String checkCarInfo() {
		System.out.println("렌트카 조회시간 : " + showTime());
		System.out.println("렌트카를 조회합니다");
		return " 조회한 렌트카 정보";
	}
	
	// 새 차의 정보등록 메소드
	public void regCarInfo() {
		System.out.println("렌트카 등록시간 : " + showTime());
		System.out.println("렌트카를 등록합니다");
	}
	
	// 차의 정보수정 메소드
	public void modCarInfo() {
		System.out.println("렌트카 정보 수정시간 : " + showTime());
		System.out.println("렌트카 정보를 수정합니다");
	}
	
	// 차의 정보삭제 메소드
	public void delCarInfo() {
		System.out.println("렌트카 정보 삭제 시간 : " + showTime());
		System.out.println("렌트카 정보를 삭제합니다");
	}

}
