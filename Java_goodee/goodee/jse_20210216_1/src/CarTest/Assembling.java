package CarTest;

import Car.CarImpl;
import Car.Wheel;
import Car.Body;
import Car.Engine;
import Car.CarInterface;

// 5. �־��� �׽�Ʈ Ŭ������ ����� ���� �״�� �ۼ��Ͽ� �׽�Ʈ�� ����
public class Assembling {

	public static void main(String[] args) {
		
		CarInterface car = new CarImpl
				(new Body("�����ٰ�"),
				new Engine("4������ ���̺긮�� ����"),
				new Wheel("������ũ Ÿ�̾�"));
		car.completeCar();	

	}

}
