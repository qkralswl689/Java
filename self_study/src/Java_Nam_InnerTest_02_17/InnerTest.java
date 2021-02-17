package Java_Nam_InnerTest_02_17;


class AAA { // AAA는 BBB의 외부 클래스이다
	int i = 100;
	BBB b = new BBB(); // BBB 사용하려면 
	
	class BBB { // BBB 는 AAA의 내부 클래스이다
		void method() {
//			AAA a = new AAA(); // 내부클래스가 아닐경우 객체 생성
//			System.out.println(a.i); // 내부클래스가 아닐경우 객체 생성
			System.out.println(i); // 객체 생성 없이 외부 클래스의 멤버에 접근 가능하다
			
		}
	}
	
}

//class CCC {
//	// BBB b =new BBB(); // BBB클래스는 AAA 안에서만 사용가능하다
//	
//}

public class InnerTest {

	public static void main(String[] args) {
		
		AAA.BBB b = new AAA().new BBB();
		b.method();

	}

}
