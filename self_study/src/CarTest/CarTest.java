package CarTest;

import Car.Car;
import Car.CarImpl;
import Car.Body;
import Car.Wheel;
import Car.Engine;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new CarImpl(new Body("���"),
					new Wheel("������ũ"),
					new Engine("4��") );
		car.compleateCar();

	}

}
