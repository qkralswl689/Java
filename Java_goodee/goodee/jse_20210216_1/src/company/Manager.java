package company;

//과장(중간관리자)
public abstract class Manager
	implements Director,SubDirector { // 다중 구현(multiple implementation(realization))
	
	String name ;
	// 기본생성자  => 아무것도 안해도 호출된다
	public Manager() {
		System.out.println("과장님의 지도/후원");
	}
	public Manager(String str) {
		System.out.println(str + " 과장의 지도/후원");
	}
	// 추상 클래스는 생성자를 호출할 수 없다
	abstract public void orderFromManager() ; // 추상 클래스 사용
	
	// 일반 메소드
	public void workByManager() {
		System.out.println("과장이 개인일");
	}
	
	@Override
	public void orderFromDirector() {
		System.out.println("과장이 orderFromManager를 구현하다");
	}
	@Override
	public void orderFromDirector2() {
		System.out.println("과장이 orderFromDirector2를 구현하다");
	}
	

}
