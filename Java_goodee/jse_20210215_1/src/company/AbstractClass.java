package company;

// �߻� Ŭ������ "�׻�" �߻� �޼��尡 �־�� �Ѵ�(X)
// �߻� Ŭ������ �߻� �޼��带 ���� �� �ִ�(O)
// ex) ȸ�� ���� : ����(�߰� ����)
//public abstract class AbstractClass { // ���ټ� ����
abstract public class AbstractClass { // �߻� ����
	
	String name;
	
	// �߻� Ŭ������ �����ڴ� ���� ȣ��� �� ������ 
	// �ν��Ͻ� ������ ���������� ȣ�� �ȴ�(ex) �޹ٶ���,support(�İ�,�Ŀ�))
	public AbstractClass() { // �⺻ ������
		System.out.println("�߻� Ŭ������ ������");
	}
	
	// abstract static void demoMethod(); // (X) 
	// static, final -> �������̵� �ȵ� ->  "�߻�"�� �������̵� �ؾߵȴ�
	
	// �߻� : ����,���
	// ex) �θ�� : �����ض�(�߻�) -> �ڳ� : �����ϴ�(��ü)
	// ex) ���� : ~ �ϼ���(�߻�) -> ���� : ~ �ϰڽ��ϴ�(��ü)
	// �߻� �޼��� : �޼��� ������(����,body)�� ����
	abstract void abstractMethod(); // body{}�� ����
	//void abstractMethod();(X)
	// ����) �׷��� �������̽�(interface)������ �߻�(abstract) Ű���带 ������ �� �ִ�
	
	void parentMethod() {
		System.out.println("�߻� Ŭ������ �ν��Ͻ� �޼���");
	}
	public static void main(String[] args) {
		
		// �߻� Ŭ������ �����ڴ� ���� ȣ�� �� �� ����
		// ex) ������� �Ʒ� ������� ���� ���� ȥ�� ���ϸ� ���� ���ӿ� �������� �ʴ�(�߻� Ŭ������ �ƴϴ�)
		// ex) �����(�߻� Ŭ����)�� �Ʒ� ��������� ������ ���ؼ� ���� �����ؾ� �Ѵ�
		// �߻� Ŭ������ ��ӹ޴�(������, ����,��ü) Ŭ������ �����ڿ� ���ؼ� ��(�ν��Ͻ�,��ü)�� ����(���� ����)�� �� �ִ�
		// AbstractClass obj = new AbstractCalss(); 
		
		// AbstractClass obj = new ConcreteClass(); // 1)
		// ������(poly-morhp-ism)
		ConcreteClass obj = new ConcreteClass(); // 2)
		 obj.abstractMethod();
		 obj.parentMethod();
		 obj.childMethod(); // 2)�� ��쿡�� ȣ�� ���� : ������
		 
		 // �߻� ����� : ����! �߻� �̻��� ȣ�� �ӵ� ����
		 // ex) �ȵ���̵�(�����) ���α׷���

	}
	

}
