package company;

//����(�߰�������)
public abstract class Manager
	implements Director,SubDirector { // ���� ����(multiple implementation(realization))
	
	String name ;
	// �⺻������  => �ƹ��͵� ���ص� ȣ��ȴ�
	public Manager() {
		System.out.println("������� ����/�Ŀ�");
	}
	public Manager(String str) {
		System.out.println(str + " ������ ����/�Ŀ�");
	}
	// �߻� Ŭ������ �����ڸ� ȣ���� �� ����
	abstract public void orderFromManager() ; // �߻� Ŭ���� ���
	
	// �Ϲ� �޼ҵ�
	public void workByManager() {
		System.out.println("������ ������");
	}
	
	@Override
	public void orderFromDirector() {
		System.out.println("������ orderFromManager�� �����ϴ�");
	}
	@Override
	public void orderFromDirector2() {
		System.out.println("������ orderFromDirector2�� �����ϴ�");
	}
	

}
