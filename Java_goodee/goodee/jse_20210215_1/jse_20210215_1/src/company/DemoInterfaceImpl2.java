package company;

public class DemoInterfaceImpl2 implements DemoInterface {

	@Override
	public void order() {
		System.out.println("���� Ŭ������ order ����");
	}

	@Override
	public void order2() {
		
	}

	@Override
	public void defaultMethod() {
		DemoInterface.super.defaultMethod(); // ���� �������̽��� ����Ʈ �޼���
		System.out.println("���� Ŭ������ defaultMethod");
	}
	

}
