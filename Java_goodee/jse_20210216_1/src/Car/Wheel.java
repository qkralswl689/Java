package Car;

//3. 부속품에 해당되는 Body, Engine, Wheel 클래스를 각각 작성

public class Wheel  {
	String wheelName; // 바퀴 명
	
	// 3-1.인자를 받아서 멤버 필드를 초기화하도록 작성
	public Wheel(String wheelName) { // 오버로딩 생성자
		this.wheelName = wheelName;
				
	}
	
	// 3-2.멤버 필드와 더불어서 "~을(를) 결합합니다"라는 메시지가 처리되도록 조치
	public void combine() { // 바퀴 조립
		System.out.println(wheelName + "바퀴를 결합합니다");
		
	}

}
