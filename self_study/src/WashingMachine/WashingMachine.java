package WashingMachine;

public interface WashingMachine { // ��Ź�� ���α׷�
	
	// �������̽� �޼ҵ� ����
	
	public void startButtonPressed(); // ���� ��ư ��������
	public void pauseButtonPressed(); // �Ͻ����� ��ư ��������
	public void stopButtonPressed(); // ���� ��ư ��������
	public int changeSpeed(int speed); // �ӵ� �ٲܶ�
	
}
