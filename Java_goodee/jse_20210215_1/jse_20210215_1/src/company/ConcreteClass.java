package company;

public class ConcreteClass extends AbstractClass {
	
	public ConcreteClass() {
		System.out.println("���� Ŭ������ ������");
	}

	@Override
	void abstractMethod() {
			System.out.println(" ���ô�� �����ϴ�");
	}
	
	void childMethod() {
		System.out.println("���� Ŭ������ �ν��Ͻ� �޼���");
	}
	
	
}
