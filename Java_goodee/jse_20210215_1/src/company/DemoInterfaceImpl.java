package company;

public abstract class DemoInterfaceImpl implements DemIinterface {

	@Override
	public void order() {
		System.out.println("���� Ŭ������ order ����");
	}

	@Override
	public void order2() {
		
	}

	@Override
	public void defaultMethod() {
		DemIinterface.super.defaultMethod(); // ���� �������̽��� ����Ʈ �޼���
		System.out.println("���� Ŭ������ defaultMethod");
	}

	
	

}
