package WashingMachine;

public class LGWashingMachine implements WashingMachine,dryCouse{

	// �������̽����� ����� �޼ҵ忡 ���� ����
	@Override
	public void startButtonPressed() {
		System.out.println("��Ź�Ⱑ ������ �����Ͽ����ϴ�");
	}

	@Override
	public void pauseButtonPressed() {
		System.out.println("��Ź�Ⱑ ������ �Ͻ� �����Ͽ����ϴ�");
	}

	@Override
	public void stopButtonPressed() {
		System.out.println("��Ź�Ⱑ ������ �����Ͽ����ϴ�");
	}

	@Override
	public int changeSpeed(int speed) {
		int rtnSpeed = 0; // ���ǵ� �ʱ�ȭ
		
		switch(speed) {
		case 1 : 
			rtnSpeed = 20; // ���ǵ� 20 �϶� 
			break; // ����
		case 2 : 
			rtnSpeed = 50; // ���ǵ� 50�� �� 
			break; // ����
		case 3 : 
			rtnSpeed = 100; // ���ǵ� 100 �϶�
			break; // ����
		}
		return rtnSpeed; // rtnSpeed �ʱⰪ (0) ����
	} 
	@Override
	public void dry() {
		System.out.println("��Ź�� �Ϸ�Ǿ� �����ϱ� �����Ͽ����ϴ�");
	}

}
