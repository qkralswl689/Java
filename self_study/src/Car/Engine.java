package Car;

public class Engine {
	String engineName;
	
	
	public Engine(String engineName) {
		this.engineName = engineName;
	}
	
	public void combine() {
		
		System.out.println(engineName + "을 결합합니다");
	}

}
