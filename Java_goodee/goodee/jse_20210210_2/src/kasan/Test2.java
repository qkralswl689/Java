package kasan;

// 접근 가시성(access visibility) : 접근 제한자로  조정
// 캡슐화(encapsulation) : 보안
import guro.Test1;

public class Test2 extends Test1{ // extends => 상속
	
	Test1 test1;
	
	 // String name = new Test1().name; // protected 의 경우 (X)
	  // String name = super.name; // protected 의 경우 (O)
	  //String name1 = name; // 문맥상 super.name과 동일한 의미 이다
	  String name1 = super.name; // 위(name1)와 같은 의미이다.
	  // protected : 상속 관계가 있을 경우 다른 패키지에서 접근 가능 하다
	  // 참고) this : 자기 자신의 객체 키워드
	  // this() : 자기 자신의(기본) 생성자
	  // super : 부모 클래스의 객체 키워드
	  // super() : 부모 클래스의 (기본) 생성자
}
