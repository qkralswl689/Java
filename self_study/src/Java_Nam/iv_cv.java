package Java_Nam;

public class iv_cv {

	public static void main(String[] args) {
		System.out.println("Card.width = " + Card.width); // 클래스 변수 : 객체 생성 없이 사용가능하다
		System.out.println("Card.height = " + Card.height);
		
		Card c1 = new Card(); // 객체 생성
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();// 객체 생성
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number);
		System.out.println("c2은 " + c2.kind + ", " + c2.number);
		System.out.println("c1의 width와 height 를 각각 50,80으로 변경합니다" );
		
		Card.width = 50; // 클래스 변수를 변경
		Card.height = 80;

		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" +c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number +"이며, 크기는 (" +c2.width + ", " + c2.height + ")");
		

	}

}
	 class Card{
		 String kind;
		 
		 int number;
		 static int width = 100;
		 static int height = 250;
	 }

