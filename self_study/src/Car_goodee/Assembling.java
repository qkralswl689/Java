package Car_goodee;

import Car_goodee.Body;
import Car_goodee.Engine;
import Car_goodee.Wheel;
import Car_goodee.CarImpl;
import Car_goodee.Car;

public class Assembling  {

	public static void main(String[] args) {
		
		Car car = new CarImpl(new Body("���Ϻ� "),
				new Engine("���̺긮�� "), new Wheel("������ũ Ÿ�̾� "));
				car.complateCar();

	}

}
