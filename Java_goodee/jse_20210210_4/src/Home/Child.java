package Home;

public class Child extends Parent {
	
	String name = "배만두";
	
	// public static void printName() { // 정적 영역 => this,super 사용할 수 없다
	public void printName() {
		System.out.println(super.name);
		System.out.println(this.name);
	}
	
	// 애너테이션(annotation)
	// : 설정 정보(meta-data) 
	// 메서드 오버라이딩 감시/감독 => 메시징
	@Override // 표기 안해도 된다 => 오버라이딩 이라는 표시해주는것
	// public void parentMethod(String name1) { // 인자 명은 상관없다 자료형이 중요하다
	// public void parentMethod2(String name1) {  // (X) 이름이 다르면 안된다
	// public void parentMethod(Object name1) {  // (X) 자료형이 다르면 안된다
	// public int parentMethod(String name1) { // (X)return 값이 다르면 안된다
	// protected void parentMethod(String name1) { // 접근가시성 (public -> protected )로 줄어들면 안된다
	 public void parentMethod(String name1) { // 
	
		System.out.println("자녀 클래스의 메서드");
		
		// return 0; // (X) 리턴타입이 다르면 안된다
	}
	

}
