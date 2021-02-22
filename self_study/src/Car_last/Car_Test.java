package Car_last;

import Car_last.Body;
import Car_last.Engine;
import Car_last.Wheel;
import Car_last.Car;
import Car_last.CarImpl;

public class Car_Test {
	
	public static void main(String[] args) {
		
		Car car = new CarImpl(new Body("하이텐강"),new Engine("4륜 하이브리드 엔진"), new Wheel("스파이크 타이어"));
		car.compleateCar();
		
	}

}
