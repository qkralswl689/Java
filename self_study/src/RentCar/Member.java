package RentCar;

import RentCar.Base;
public class Member extends Base { // �θ�Ŭ���� (base) ��� �޴´�
	
	// �������
	private String id;
	private String pw;
	private String name;
	private String address;
	private String phoneNum;
	
	// ���ο� ȸ����� �޼ҵ�
	public void regMember() {
		System.out.println("ȸ�� ��Ͻð� : " + showTime());
		System.out.println("ȸ�� �����մϴ�");
	}
	
	// ���� ȸ�� ������ȸ �޼ҵ�
	public String viewMember() {
		System.out.println("ȸ�� ��ȸ�ð� : " + showTime());
		return "��ȸ�� ȸ�� ����";
	}
	
	// ���� ȸ������ ���� �޼ҵ�
	public void modMember() {
		System.out.println("ȸ�� �����ð� : " + showTime());
		System.out.println("ȸ�� ������ �����մϴ�.");
	}
	
	// ���� ȸ�� �������� �޼ҵ�
	public void delMember() {
		System.out.println("ȸ�� ���� �ð� : " + showTime());
		System.out.println("ȸ�� ������ ���� �մϴ�");
	}



}
