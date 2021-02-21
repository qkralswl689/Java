package Car_goodee;

public class Body {
	
	String bodyName;
	
	Body(String bodyName) {
		this.bodyName = bodyName;
	}

	public void combine() {
		System.out.println(bodyName + "차체를 결합합니다");
	}
	

}
