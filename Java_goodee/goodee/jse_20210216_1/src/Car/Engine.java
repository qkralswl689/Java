package Car;

// 3. �μ�ǰ�� �ش�Ǵ� Body, Engine, Wheel Ŭ������ ���� �ۼ�
public class Engine  {
	
	String engineName; // ������
	
	// 3-1.���ڸ�  �޾Ƽ� ��� �ʵ带 �ʱ�ȭ�ϵ��� �ۼ�
	public Engine(String engineName) { //�����ε� ������
		this.engineName = engineName;
		
	}
	
	// 3-2.��� �ʵ�� ���Ҿ "~��(��) �����մϴ�"��� �޽����� ó���ǵ��� ��ġ
	public void combine() { // ���� ����
		System.out.println(engineName +"�� �����մϴ�");
		
	}

}
