package company2;

import company.DemIinterface;

public class DemoInterface implements DemIinterface {

	@Override
	public void order() {
		System.out.println("���� Ŭ������ order ����");

	}

	@Override
	public void order2() {
		// TODO Auto-generated method stub

	}
	@Override
	public void defaultMethod() {
		// TODO Auto-generated method stub
		// DemoInterface.super.defaultMethod(); // ���� �������̽��� ����Ʈ �޼���
		System.out.println("���� Ŭ������ defaultMethod");
	} //

}
