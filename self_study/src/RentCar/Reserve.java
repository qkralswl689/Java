package RentCar;

import RentCar.Base;
public class Reserve extends Base {
	
	private String resCarNumber;
	private String resDate;
	private String useBeginDate;
	private String returnDate;
	
	// �� ������ �޼ҵ�
	public String reservaCar() {
		System.out.println("��Ʈī ����ð� : " + showTime());
		System.out.println("���� �����մϴ�");
		return " ������ ����";
	}
	
	// �� �������� ���� �޼ҵ�
	public void modReserveInfo() {
		System.out.println("��Ʈī �������� �����ð� : " + showTime());
		System.out.println("���������� �����մϴ�");
	}
	
	// �� �������� ��� �޼ҵ�
	public void cancelReserveInfo() {
		System.out.println("��Ʈī �������� ���� �ð� : " + showTime());
		System.out.println("������ ����մϴ�");
	}

}
