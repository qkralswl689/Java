package guro;

public class Test3 {
	
	Test1 test1;
	
	// name : private => 같은 클래스 내에서만 접근 가능하므로 외부에서는 사용이 불가능 
	
	// name : (default/package)
	// => 같은 클래스 내에서만 접근 가능 하여 사용 가능
	
	// protected : 같은 패키지 내에서 접근 가능 
	// 다른 패키지일 경우에 상속일 경우에"만" 접근 가능
	
	// public : 가장 개방적, 모든 패키지에서 접근 가능
	
	String name = new Test1().name;

}
