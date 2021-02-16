package CarTest;

import Car.Car;
import Car.CarImpl;
import Car.Body;
import Car.Wheel;
import Car.Engine;

public class CarTest {

	public static void main(String[] args) {
		
		Car car = new CarImpl(new Body("기아"),
					new Wheel("스파이크"),
					new Engine("4륜") );
		car.compleateCar();

	}

}
