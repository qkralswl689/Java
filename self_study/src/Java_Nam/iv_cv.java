package Java_Nam;

public class iv_cv {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width); // Ŭ���� ���� : ��ü ���� ���� ��밡���ϴ�
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card(); // ��ü ����
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();// ��ü ����
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number);
		System.out.println("c2�� " + c2.kind + ", " + c2.number);
		System.out.println("c1�� width�� height �� ���� 50,80���� �����մϴ�" );
		
		Card.width = 50; // Ŭ���� ������ ����
		Card.height = 80;

		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" +c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number +"�̸�, ũ��� (" +c2.width + ", " + c2.height + ")");
		

	}

}
	 class Card{
		 String kind;
		 
		 int number;
		 static int width = 100;
		 static int height = 250;
	 }

