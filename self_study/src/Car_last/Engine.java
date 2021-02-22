package Car_last;

public class Engine {
	
	String engineName;
	
	public Engine(String engineName) {
		this.engineName = engineName;
	}

	public void combine() {
		System.out.println(engineName + "엔진을 결합 합니다");
	}
}
