package Car_goodee;

import Car_goodee.Body;
import Car_goodee.Engine;
import Car_goodee.Wheel;
import Car_goodee.CarImpl;
import Car_goodee.Car;

public class Assembling  {

	public static void main(String[] args) {
		
		Car car = new CarImpl(new Body("모하비 "),
				new Engine("하이브리드 "), new Wheel("스파이크 타이어 "));
				car.complateCar();

	}

}
