package Car;
import Car.Body;
import Car.Engine;
import Car.Wheel;

// 2. Car�������̽� ���� Ŭ������ �ۼ��ϵ� �������̵� �Ǵ� �޼������ �ۼ��Ѵ�
// �޼����� �����δ� �ϴ� ���Ƶΰ� �ٸ� Ŭ�������� �ۼ��� ���Ŀ� �ϼ��Ѵ�
// 4. �ٽ� CarImpl ���� Ŭ������ ���ƿͼ� �����ε� �����ڿ� ������ �ۼ��� �κ�ǰ Ŭ�������� Ȱ���Ͽ� �ڵ带 �ϼ�
// �ڵ��� ���� ���� Ŭ����
public class CarImpl implements CarInterface {
	
	// 4-1.�� �ڵ��� ������ ���õ� ��� �޼������ has-a ����� ������ ���� �ش�Ǵ� �μ�ǰ Ŭ�������� ��� �޼������ ȣ���ϵ��� ��ġ�մϴ�.
	// has-a ����
	Body body; // ��ü
	Engine engine; // ����
	Wheel wheel; // ����

	public CarImpl() { // ������
		
	}
	
	// �����ε� ������
	public CarImpl(Body body,
					Engine engine,
					Wheel wheel) {
		
		// �̺κп��� ���� ����ʵ忡 �������� ���� ���
		// NullPointerException �߻�!
		this.body = body;
		this.engine = engine;
		this.wheel = wheel;		
	}
	
	@Override
	public void combineEngine() { // ���� ����
		engine.combine();		
	}

	@Override
	public void combineBody() { // ��ü ����
		body.combine();

	}

	@Override
	public void combineWheel() { // ��������
		wheel.combine();
	}

	// 4-2.���� ������ �ϼ��ϴ� completeCar �޼��忡���� ������ ������ �ڽ��� ��� �޼������ �ٽ� ȣ���ϰ� "���� ������ �ϼ��Ͽ����ϴ�." ��� �޽����� ����ó���Ͽ� �ϼ��ϵ��� �մϴ�.      
	@Override
	public void completeCar() { // �ڵ��� �����ϼ�
		this.combineBody();
		this.combineEngine();
		this.combineWheel();
		System.out.println("���� ������ �ϼ� �Ͽ����ϴ�");
	}
}
	


