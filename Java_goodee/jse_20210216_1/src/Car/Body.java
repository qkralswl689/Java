package Car;

//3. �μ�ǰ�� �ش�Ǵ� Body, Engine, Wheel Ŭ������ ���� �ۼ�

public class Body  {
	String bodyName; // ��ü ��
	
	// 3-1.���ڸ� �޾Ƽ� ��� �ʵ带 �ʱ�ȭ�ϵ��� �ۼ�
	public Body(String bodyName) { // �����ε� ������
		this.bodyName = bodyName;
		
	}
	
	// 3-2.��� �ʵ�� ���Ҿ "~��(��) �����մϴ�"��� �޽����� ó���ǵ��� ��ġ
	public void combine() { // ��ü ����
		System.out.println(bodyName + "��ü�� �����մϴ�");
		
	}

}
