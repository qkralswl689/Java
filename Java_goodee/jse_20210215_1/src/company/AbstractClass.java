package company;

// 추상 클래스는 "항상" 추상 메서드가 있어야 한다(X)
// 추상 클래스는 추상 메서드를 가질 수 있다(O)
// ex) 회사 직급 : 과장(중간 계층)
//public abstract class AbstractClass { // 접근성 강조
abstract public class AbstractClass { // 추상 강조
	
	String name;
	
	// 추상 클래스의 생성자는 직접 호출될 수 없으나 
	// 인스턴스 생성시 간접적으로 호출 된다(ex) 뒷바라지,support(후견,후원))
	public AbstractClass() { // 기본 생성자
		System.out.println("추상 클래스의 생성자");
	}
	
	// abstract static void demoMethod(); // (X) 
	// static, final -> 오버라이딩 안됨 ->  "추상"은 오버라이딩 해야된다
	
	// 추상 : 지시,명령
	// ex) 부모님 : 공부해라(추상) -> 자녀 : 공부하다(구체)
	// ex) 선임 : ~ 하세요(추상) -> 후임 : ~ 하겠습니다(구체)
	// 추상 메서드 : 메서드 구현부(몸통,body)가 없다
	abstract void abstractMethod(); // body{}가 없다
	//void abstractMethod();(X)
	// 참고) 그러나 인터페이스(interface)에서는 추상(abstract) 키워드를 생략할 수 있다
	
	void parentMethod() {
		System.out.println("추상 클래스의 인스턴스 메서드");
	}
	public static void main(String[] args) {
		
		// 추상 클래스의 생성자는 직접 호출 할 수 없다
		// ex) 과장님이 아래 직원들과 소통 없이 혼자 일하면 과장 직임에 적합하지 않다(추상 클래스가 아니다)
		// ex) 과장님(추상 클래스)은 아래 직원들과의 소통을 통해서 일을 구현해야 한다
		// 추상 클래스는 상속받는(계약관계, 구현,구체) 클래스의 생성자에 의해서 일(인스턴스,객체)을 생성(업무 이행)할 수 있다
		// AbstractClass obj = new AbstractCalss(); 
		
		// AbstractClass obj = new ConcreteClass(); // 1)
		// 다형성(poly-morhp-ism)
		ConcreteClass obj = new ConcreteClass(); // 2)
		 obj.abstractMethod();
		 obj.parentMethod();
		 obj.childMethod(); // 2)의 경우에만 호출 가능 : 다형성
		 
		 // 추상 무용론 : 성능! 추상 미사용시 호출 속도 개선
		 // ex) 안드로이드(모바일) 프로그래밍

	}
	

}
