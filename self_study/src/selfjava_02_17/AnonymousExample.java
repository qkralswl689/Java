package selfjava_02_17;

public class AnonymousExample {

	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		anony.filed.wake(); // => 자식객체의 work() 메소드 직접 호출은 안됨
							// 하지만 부모객체에 있는 wake() 를 호출하면 자식객체에서 재정의 된 wake내용과
							// 자식객체에서 호출한 자식객체의 work()도 함께 호출된다
		
		anony.method1();
		
		anony.method2(new Person() { // method2에 익명자식 객체 생성해서  대입
			
			// 메소드 선언
			void study() {
				System.out.println("공부합니다");
			}
			
			// Person이 가지고 있는 메소드 재정의
			@Override
			void wake() {
				System.out.println("8시에 일어납니다");
				study();
			}
		});

	}

}
