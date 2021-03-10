package company;

 // �߻� Ŭ���� : �߰� ������(����)
	// �������̽� : �ӿ�(����, �̻�) -> ����/��ɸ� �ϴ� (����)��ü 
	// protected interface DemoInterface { // (X)
	// private interface DemoInterface { // (X)
	public interface DemoInterface { //
	// abstract public interface DemoInterface { // (O)
	// public abstract interface DemoInterface { // (O)
		
		// String name; // (X)
		// �������̽��� ���(constant)"��" ��� �ʵ�� ��� !
		String name = "java"; // (O) ���� ��� 
		// private String name = "java"; // (X)
		// protected String name = "java"; // (X)
		// static String name = "java"; // (O)
		// final String name = "java"; // (O)
		// static final String name = "java"; // (O)
		// final static String name = "java"; // (O)
		// public final static String name = "java"; // (O)
		
		// �������̽��� ������ ����(X) : ���ϴ� ��(����)�� ����
//		public DemoInterface() {
//			
//		}

		// �ν��Ͻ� ��� �޼��� (X)
//		void demoMethod() {
//			
//		}
		
		// �߻� �޼��� : ����/���/���赵/�޴� -> �������̽� -> ~ ����(����) -> ���� (�볻)
		// ����/���/���赵 -> �������̽� -> ~ ����(����) -> ȫ��/���� (���)
		void order(); // (O)
		// private void order(); // (X)
		// public void order(); // (O)
		// protected void order(); // (X)
		// abstract void order(); // (O)
		
		void order2();
		
		// ���� �� (X)
		// static {
		// }
		
		// �ν��Ͻ� �� (X)
		// {
		// }
		
		// default(����) Ű���� 
		// 1) switch ~ case : ������
		// 2) default(package) ���� ������(��ǥ��)
		// 3) interface�� default(����Ʈ) �޼���
		// �������̵��� �� �� ������ ������(�ǹ���)�� ���� ! ������(���뼺)
		// �ϴ� Ŭ������ �ν��Ͻ� ��� �޼��� ó�� �޼����� ������(����)�� ���� �� �ִ�.
		// ���� Ŭ�������� �������̵��� �޼��尡 ������ ȣ��� ���� Ŭ������ �޼��带 ȣ���ϰ�
		// ���� �޼��尡 ������ �������̽� �ڽ��� ����Ʈ �޼��带 ȣ���Ѵ�.
		// ex) ��(���� Ŭ����)�� ������ �ո�(�������̽�)���� �Ѵ�. 
		default void defaultMethod() {
			System.out.println("�������̽� default �޼���");
		}
		
		static void staticMethod() {
			System.out.println("���� ��� �޼���");
		}
		
		public static void main(String[] args) {
			System.out.println("�������̽� ����");
//			
//			// DemoInterface obj = new DemoInterface(); // (X)
			DemoInterface.staticMethod();
			
			DemoInterface obj = new DemoInterfaceImpl2(); // (O)
			obj.defaultMethod();
			obj.order();
	
		
	}
}


