package company;

public abstract class DemoInterfaceImpl implements DemIinterface {

	@Override
	public void order() {
		System.out.println("구현 클래스의 order 구현");
	}

	@Override
	public void order2() {
		
	}

	@Override
	public void defaultMethod() {
		DemIinterface.super.defaultMethod(); // 상위 인터페이스의 디폴트 메서드
		System.out.println("구현 클래스의 defaultMethod");
	}

	
	

}
