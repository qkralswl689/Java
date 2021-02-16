package Car;

public class Body {
	
	String bodyName;
	

	public Body(String bodyName) {
		this.bodyName = bodyName;	
	}
	
	public void combine() {
		
		System.out.println(bodyName + "을 결합합니다");
	}

}
