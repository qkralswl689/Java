package company;

// �߻� Ŭ���� : �߰� ������(����)
// �������̽� : ���� ������(�̻�) -> ����/��ɸ� �ϴ� (����)��ü
public interface DemIinterface {
// abstract public interface DemIinterface { // (O)
// public abstract interface DemIinterface { // (O)

	
	// �ʵ�
	// String name; //(X)
	// �������̽��� ���(constant)"��" ��� �ʵ�� ����Ѵ�
	 String name = "java"; // (O) ���� ��� 
	// static String name = "java"; // (O)
	// final String name = "java"; // (O)
	// static final String name = "java"; // (O)
	// final static String name = "java"; // (O)
	 
	 
	 // ������
	 // �������̽��� �����ڸ� ���� �� ���� : ���ϴ� ��(����)�� ����
//	 public DemoInterface() {
//		 
//	 }
	
	
	// �ν��Ͻ� ��� �޼���(X)
//	void demoMethod() {
//		
//	}
	
	// �߻� �޼��� : ����/���/���赵/�޴� -> �������̽� -> ~���� (����)-> ����(�볻)
	// ����/���/���赵 -> �������̽� -> ~���� (����)-> ȫ��/���� (���)
	void order(); // (O)
	// abstract void order(); // (O)
	// public void order(); // (O)
	// protected void order(); // (X)
	// private void order(); // (x)

	
	void order2();

	// ���� �� (X)
//	static {
//	}
	
	// �ν��Ͻ� �� (X)
//	{	
//	}
	public static void main(String[] args) {
		System.out.println("�������̽� ����");
	}
	
	// default(����)  Ű����
	// 1) switch ~ case : ������
	// 2) default(package) ���� ������ (��ǥ��)
	// 3) interface�� default �޼���
	// �������̵��� �� �� ������ ������(�ǹ���)�� ���� => ������(���뼺)
	// �Ϲ� Ŭ������ �ν��Ͻ� ��� �޼��� ó�� �޼����� ������(����)�� ���� �� �ִ�
	// ���� Ŭ�������� �������̵��� �޼��尡 ������ ȣ�� �� ���� Ŭ������ �޼��带 ȣ���ϰ�
	// ���� �޼��尡 ������ �������̽� �ڽ��� ����Ʈ �޼��带 ȣ���Ѵ�
	// ex) ��(���� Ŭ����)�� ������ �ո�(�������̽�)���� �Ѵ�
	 default void defaultMethod() {
		 System.out.println("�������̽� default �޼���");
	 }
	
	// static Method (O)
	static void staticMethod() {
		System.out.println("���� ��� �޼���");
	}
	
	 main Mtehod (o)
	public static void main(String[] args) {
	System.out.println("�������̽� ����");
	
//	// DemoInterface obj = new DemoInterface(); // (X)
	
	DemIinterface.staticMethod();
	DemIinterface obj = new DemoInterfaceImpl(); // (O)

	DemoInterface.staticMethod();

	obj.defaultMethod();
	obj.order();
} 
}

	
