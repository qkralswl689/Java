package test;

import home.Parent;
import home.child;
public class test {
	public static void main(String[] args) {
		
		// 참조 타입은 상속/구현 관계가 있을 때만 "만" 자동변환 된다
		// Parent parent = new Parent();
		// Parent parent = new child();
		// Parent parent = (Parent)new child(); //(O)
		
		Parent parent = new child();
		// 부모 타입으로 변환시에는 부모 타입의 멤버"만" 사용 할수 있도록 제한된다
		
		// System.out.println(parent.address); // (사용불가능)
		 System.out.println(parent.name); // 사용가능
		 
		// 참조 타입은 () (형변환 연산자) 를 사용한 
		// 형변환(casting) 은 상속/구현 관계시에 "만" 가능하다
		// child child = (child)new Parent(); // 주의!
		 
		// Parent parent2 = new Parent(); // (X)
		// child child2 = (child)parent2; // (X)
		// java.lang.ClassCastException 예외 발생   
		 
		 
		 child child = (child)parent; //  형변환(o)

		 
//		 System.out.println(child.address);
//		 System.out.println(child.name);
		
	}

}
