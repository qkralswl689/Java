package Car_last;

import Car_last.Body;
import Car_last.Engine;
import Car_last.Wheel;
import Car_last.Car;
import Car_last.CarImpl;

public class Car_Test {
	
	public static void main(String[] args) {
		
		Car car = new CarImpl(new Body("�����ٰ�"),new Engine("4�� ���̺긮�� ����"), new Wheel("������ũ Ÿ�̾�"));
		car.compleateCar();
		
	}

}
