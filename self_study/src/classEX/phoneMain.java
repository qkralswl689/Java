package classEX;

public class phoneMain {
	
	public static void main(String[] args) {
		
		phone ph = new phone(); // ph 객체 생성 => ph에는  phone 클래스에서 만든 기능들이 담겨있다
		
		ph.printOne();
		
		System.out.println("ph.color : " + ph.color);
		ph.color = "하얀색";
		System.out.println("ph.color : "+ ph.color);
	}

}
