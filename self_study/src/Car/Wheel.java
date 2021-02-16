package Car;

public class Wheel {
	
	String wheelName;
	
	public Wheel(String wheelName) {
		this.wheelName = wheelName;		
	}
	
	public void combine() {
		
		System.out.println(wheelName + "을 결합합니다");
	}

	
}
