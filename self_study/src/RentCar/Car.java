package RentCar;

import RentCar.Base;

public class Car extends Base {
	
	private String carNumber;
	private String carName;
	private String carColor;
	private int carSize;
	private String carMaker;
	
	// ���� ������ȸ �޼ҵ�
	public String checkCarInfo() {
		System.out.println("��Ʈī ��ȸ�ð� : " + showTime());
		System.out.println("��Ʈī�� ��ȸ�մϴ�");
		return " ��ȸ�� ��Ʈī ����";
	}
	
	// �� ���� ������� �޼ҵ�
	public void regCarInfo() {
		System.out.println("��Ʈī ��Ͻð� : " + showTime());
		System.out.println("��Ʈī�� ����մϴ�");
	}
	
	// ���� �������� �޼ҵ�
	public void modCarInfo() {
		System.out.println("��Ʈī ���� �����ð� : " + showTime());
		System.out.println("��Ʈī ������ �����մϴ�");
	}
	
	// ���� �������� �޼ҵ�
	public void delCarInfo() {
		System.out.println("��Ʈī ���� ���� �ð� : " + showTime());
		System.out.println("��Ʈī ������ �����մϴ�");
	}

}
