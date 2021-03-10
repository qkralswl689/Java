package Home;

public class Parent {
	
	// 부모 클래스 : super/parent/base(기본/기반) class
	// 자녀 클래스 : sub/child/derived(파생) class
	
	// private String name = "배현";
	protected String name = "배현";
	public int money = 100000000;
	public String address = "서울시 강서구";
	public String character = "바보같움";
	
// private void parentMethod(String name) { 
// 오버라이딩  할수 없다(private)
// final void parentMethod(String name) { 
// 오버라이딩 할수 없다(final) => 캡슐화 => 보안
// static void parentMethod(String name) {
// 오버라이딩 할수 없다(static) 

	public void parentMethod(String name) {
		System.out.println("부모 클래스의 메서드");
	}

		

}
