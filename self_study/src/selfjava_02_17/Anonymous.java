package selfjava_02_17;

public class Anonymous {
	
	// 필드 선언 후 익명 자식 객체 대입
	Person filed = new Person() {
		
		// 익명 자식객체가 가지고 있는 메소드 
		void work() {
			System.out.println("출근합니다");
		}
		
		// 부모객체가 가지고 있는 메소드 재정의
		@Override
		void wake() {
			System.out.println("6시에 일어납니다");
			work();
		};
		
	};
	
	// 새로운 메소드 선언
	void method1() {
		
		// 변수 선언 후 익명 자식객체 생성하여 대입
		Person localVar = new Person() {
			
			void walk() {
				System.out.println("산책 합니다");
			}
			
			@Override
			// Person이 가지고있는 메소드 재정의
			void wake() {
				System.out.println("7시에 일어납니다");
				walk();
			}
		};
		
		localVar.wake();
	}
	
	// 새로운 메소드 선언
	// 매개변수로 Person 타입 추가
	void method2(Person person) {
		person.wake(); // method2를 호출할 때 Person객체 또는 Person 의 자식객체를 대입할 수 있다
	}
	

}
