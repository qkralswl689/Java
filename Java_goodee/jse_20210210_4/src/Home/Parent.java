package Home;

public class Parent {
	
	// �θ� Ŭ���� : super/parent/base(�⺻/���) class
	// �ڳ� Ŭ���� : sub/child/derived(�Ļ�) class
	
	// private String name = "����";
	protected String name = "����";
	public int money = 100000000;
	public String address = "����� ������";
	public String character = "�ٺ�����";
	
// private void parentMethod(String name) { 
// �������̵�  �Ҽ� ����(private)
// final void parentMethod(String name) { 
// �������̵� �Ҽ� ����(final) => ĸ��ȭ => ����
// static void parentMethod(String name) {
// �������̵� �Ҽ� ����(static) 

	public void parentMethod(String name) {
		System.out.println("�θ� Ŭ������ �޼���");
	}

		

}
