package CarTest;

import Car.CarImpl;
import Car.Wheel;
import Car.Body;
import Car.Engine;
import Car.CarInterface;

// 5. 주어진 테스트 클래스를 보기와 같이 그대로 작성하여 테스트를 실행
public class Assembling {

	public static void main(String[] args) {
		
		CarInterface car = new CarImpl
				(new Body("하이텐강"),
				new Engine("4률구동 하이브리드 엔진"),
				new Wheel("스파이크 타이어"));
		car.completeCar();	

	}

}
