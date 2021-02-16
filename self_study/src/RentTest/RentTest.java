package RentTest;

import RentCar.Member;
import RentCar.Car;
import RentCar.Reserve;

public class RentTest {

	public static void main(String[] args) {
		String carInfo;
		String resData;
		
		// 회원가입
		Member member = new Member();
		member.regMember();
		
		// 렌트카 조회
		Car car = new Car();
		carInfo=car.checkCarInfo(); // carInfo에 조회한 렌트카 정보를 저장한다
		car.displayData(carInfo); // 부모 클래스의 메소드 사용하여 조회한 차량 정보를 보여준다
		
		// 예약하기
		Reserve reserve = new Reserve();
		resData = reserve.reservaCar();
		reserve.displayData(resData);
	}

}
