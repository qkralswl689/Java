package classEX;

public class phoneMain {
	
	public static void main(String[] args) {
		
		phone ph = new phone(); // ph ��ü ���� => ph����  phone Ŭ�������� ���� ��ɵ��� ����ִ�
		
		ph.printOne();
		
		System.out.println("ph.color : " + ph.color);
		ph.color = "�Ͼ��";
		System.out.println("ph.color : "+ ph.color);
	}

}
