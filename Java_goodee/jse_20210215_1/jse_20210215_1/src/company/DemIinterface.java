package company;

// 추상 클래스 : 중간 관리자(과장)
// 인터페이스 : 상위 관리자(이사) -> 지시/명령만 하는 (형식)객체
public interface DemIinterface {
// abstract public interface DemIinterface { // (O)
// public abstract interface DemIinterface { // (O)

	
	// 필드
	// String name; //(X)
	// 인터페이스는 상수(constant)"만" 멤버 필드로 허용한다
	 String name = "java"; // (O) 정적 상수 
	// static String name = "java"; // (O)
	// final String name = "java"; // (O)
	// static final String name = "java"; // (O)
	// final static String name = "java"; // (O)
	 
	 
	 // 생성자
	 // 인터페이스는 생성자를 가질 수 없다 : 일하는 것(구현)과 무관
//	 public DemoInterface() {
//		 
//	 }
	
	
	// 인스턴스 멤버 메서드(X)
//	void demoMethod() {
//		
//	}
	
	// 추상 메서드 : 지시/명령/설계도/메뉴 -> 인터페이스 -> ~보고 (인지)-> 구현(대내)
	// 지시/명령/설계도 -> 인터페이스 -> ~보고 (인지)-> 홍보/전시 (대외)
	void order(); // (O)
	// abstract void order(); // (O)
	// public void order(); // (O)
	// protected void order(); // (X)
	// private void order(); // (x)

	
	void order2();

	// 정적 블럭 (X)
//	static {
//	}
	
	// 인스턴스 블럭 (X)
//	{	
//	}
	public static void main(String[] args) {
		System.out.println("인터페이스 실행");
	}
	
	// default(기정)  키워드
	// 1) switch ~ case : 기정값
	// 2) default(package) 접근 제한자 (무표기)
	// 3) interface의 default 메서드
	// 오버라이딩을 할 수 있으나 강제성(의무성)이 없다 => 다형성(융통성)
	// 일반 클래스의 인스턴스 멤버 메서드 처럼 메서드의 구현부(몸통)을 가질 수 있다
	// 구현 클래스에서 오버라이딩한 메서드가 있으면 호출 시 구현 클래스의 메서드를 호출하고
	// 구현 메서드가 없으면 인터페이스 자신의 디폴트 메서드를 호출한다
	// ex) 이(구현 클래스)가 없으면 잇몸(인터페이스)으로 한다
	 default void defaultMethod() {
		 System.out.println("인터페이스 default 메서드");
	 }
	
	// static Method (O)
	static void staticMethod() {
		System.out.println("정적 멤버 메서드");
	}
	
	 main Mtehod (o)
	public static void main(String[] args) {
	System.out.println("인터페이스 실행");
	
//	// DemoInterface obj = new DemoInterface(); // (X)
	
	DemIinterface.staticMethod();
	DemIinterface obj = new DemoInterfaceImpl(); // (O)

	DemoInterface.staticMethod();

	obj.defaultMethod();
	obj.order();
} 
}

	
