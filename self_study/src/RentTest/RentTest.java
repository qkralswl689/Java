package RentTest;

import RentCar.Member;
import RentCar.Car;
import RentCar.Reserve;

public class RentTest {

	public static void main(String[] args) {
		String carInfo;
		String resData;
		
		// ȸ������
		Member member = new Member();
		member.regMember();
		
		// ��Ʈī ��ȸ
		Car car = new Car();
		carInfo=car.checkCarInfo(); // carInfo�� ��ȸ�� ��Ʈī ������ �����Ѵ�
		car.displayData(carInfo); // �θ� Ŭ������ �޼ҵ� ����Ͽ� ��ȸ�� ���� ������ �����ش�
		
		// �����ϱ�
		Reserve reserve = new Reserve();
		resData = reserve.reservaCar();
		reserve.displayData(resData);
	}

}
