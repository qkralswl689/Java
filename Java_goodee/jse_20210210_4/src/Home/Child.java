package Home;

public class Child extends Parent {
	
	String name = "�踸��";
	
	// public static void printName() { // ���� ���� => this,super ����� �� ����
	public void printName() {
		System.out.println(super.name);
		System.out.println(this.name);
	}
	
	// �ֳ����̼�(annotation)
	// : ���� ����(meta-data) 
	// �޼��� �������̵� ����/���� => �޽�¡
	@Override // ǥ�� ���ص� �ȴ� => �������̵� �̶�� ǥ�����ִ°�
	// public void parentMethod(String name1) { // ���� ���� ������� �ڷ����� �߿��ϴ�
	// public void parentMethod2(String name1) {  // (X) �̸��� �ٸ��� �ȵȴ�
	// public void parentMethod(Object name1) {  // (X) �ڷ����� �ٸ��� �ȵȴ�
	// public int parentMethod(String name1) { // (X)return ���� �ٸ��� �ȵȴ�
	// protected void parentMethod(String name1) { // ���ٰ��ü� (public -> protected )�� �پ��� �ȵȴ�
	 public void parentMethod(String name1) { // 
	
		System.out.println("�ڳ� Ŭ������ �޼���");
		
		// return 0; // (X) ����Ÿ���� �ٸ��� �ȵȴ�
	}
	

}
