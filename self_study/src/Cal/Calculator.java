package Cal;

public class Calculator {
	
	// �޼ҵ� ����
	// void�� ���� �޼ҵ�� �ڽ��� ���� �ڵ带 �����ϰ� ������
	public void plus(int number1,int number2) {
		System.out.println(number1 + number2);
	}
	
	public void minus(int number1, int number2) {
		System.out.println(number1 - number2);
	}
	
	// return������ �ִ� �޼ҵ�� �ڽ��� ȣ���� �κп��� �ڽ��� ���� ��Ʈ�� �����ϰ� 
	// ���ڸ� �����ϸ� ���ڸ� �����ְ� ������
	public int multiple(int number1, int number2) {
		int result = number1 * number2;
		return result;
	}
	
	public String divi(int number1, int number2) {
		System.out.println(number1/number2);
		return "������";
	}
	
	public void remaider(int number1, int number2) {
		System.out.println(number1%number2);
	}

}
