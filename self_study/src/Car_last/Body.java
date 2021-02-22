package Car_last;

public class Body {
	
	String bodyName;
	
	public Body(String bodyName) {
		this.bodyName = bodyName;
	}
	
	public void combine() {
		System.out.println(bodyName + "차체를 결합합니다");
	}

}
