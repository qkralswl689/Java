package company;

public class ConcreteClass extends AbstractClass {
	
	public ConcreteClass() {
		System.out.println("구현 클래스의 생성자");
	}

	@Override
	void abstractMethod() {
			System.out.println(" 지시대로 구현하다");
	}
	
	void childMethod() {
		System.out.println("구현 클래스의 인스턴스 메서드");
	}
	
	
}
