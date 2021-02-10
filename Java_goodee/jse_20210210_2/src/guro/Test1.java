package guro;

// class 에서는 default, public 만 접근 제한자 사용 가능 하다

// default(package) 접근 제한자 : 한 패키지 내에서만 접근 가능 => 보안
// 무표기
// class Test1 { //default // 같은 패키지 내에서는 사용이 가능하다 ex) Test3

 public class Test1 { // 모든 패키지에서 사용 가능( 가장 개방적)

// private class Test1 { // (X)
	
// protected class Test1 { // (X)
	 
	 // 같은 클래스 내에서만 접근 가능
	 // private String name;
	 
	 // String name; // default
	 
	 // protected : 같은 패키지 내에서 접근 가능 
	 // 다른 패키지일 경우에 상속일 경우에"만" 접근 가능
	 protected String name;
	 
	 // public : 가장 개방적, 모든 패키지에서 접근 가능
//	 public String name;
	 
}
