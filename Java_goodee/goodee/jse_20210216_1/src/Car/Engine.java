package Car;

// 3. 부속품에 해당되는 Body, Engine, Wheel 클래스를 각각 작성
public class Engine  {
	
	String engineName; // 엔진명
	
	// 3-1.인자를  받아서 멤버 필드를 초기화하도록 작성
	public Engine(String engineName) { //오버로딩 생성자
		this.engineName = engineName;
		
	}
	
	// 3-2.멤버 필드와 더불어서 "~을(를) 결합합니다"라는 메시지가 처리되도록 조치
	public void combine() { // 엔진 조립
		System.out.println(engineName +"을 결합합니다");
		
	}

}
