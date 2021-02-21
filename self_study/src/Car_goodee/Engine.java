package Car_goodee;

public class Engine {
	
	String engineName;
	
	Engine (String engineName){
		this.engineName = engineName;
		
	}

	public void combine() {
		System.out.println(engineName + "엔진을 결합합니다");
	}
}
