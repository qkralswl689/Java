package Phone;

public class iphone implements phoneInterface,listenMusic{

	@Override
	public void callSend() {
		System.out.println("��ȭ�� �� �� �ֽ��ϴ�");
	}

	@Override
	public void canPhoto() {
		System.out.println("������ ���� �� �ֽ��ϴ�");
	}

	@Override
	public void watchYoutube() {
		System.out.println("Youtube ��û�� �����մϴ�");
	}

	@Override
	public void listenMusic() {
		System.out.println("������ ���� �� �ֽ��ϴ�");
	}

}
