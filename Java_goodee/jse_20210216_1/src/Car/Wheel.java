package Car;

//3. �μ�ǰ�� �ش�Ǵ� Body, Engine, Wheel Ŭ������ ���� �ۼ�

public class Wheel  {
	String wheelName; // ���� ��
	
	// 3-1.���ڸ� �޾Ƽ� ��� �ʵ带 �ʱ�ȭ�ϵ��� �ۼ�
	public Wheel(String wheelName) { // �����ε� ������
		this.wheelName = wheelName;
				
	}
	
	// 3-2.��� �ʵ�� ���Ҿ "~��(��) �����մϴ�"��� �޽����� ó���ǵ��� ��ġ
	public void combine() { // ���� ����
		System.out.println(wheelName + "������ �����մϴ�");
		
	}

}
