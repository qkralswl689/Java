package company;

// abstract �������� ����(��� -> ����)
abstract public class Clerk extends Manager {
	
	// �⺻ ������ => �ƹ��͵� ���ص� ȣ��ȴ�
	public Clerk() {
		super("ȫ�浿");
		System.out.println("����� ��");
	}

	@Override
	public void orderFromManager() {
		
		System.out.println("����� orderFromManager�� �����ϴ�");
	}

//	@Override
//	public void orderFromDirector() {
//		super.orderFromDirector();
//		// this.orderFromDirector(); // �������� ���ȣ��
//		// StackOverflowError !
//		System.out.println("����� orderFromManager�� �����ϴ�");
//	}

	@Override
	public void orderFromSubDirector() {
		System.out.println("����� orderFromSubDirector�� �����ϴ�");
	}

	@Override
	// �Ϲ� �޼��� ���� �������̵� �ص� �ǰ� ���ص� �ȴ�
	public void workByManager() {
		// super.workByManager();
		System.out.println("����� �������� ����� ���� �ϴ�");
	}



	
	
	
	

}
