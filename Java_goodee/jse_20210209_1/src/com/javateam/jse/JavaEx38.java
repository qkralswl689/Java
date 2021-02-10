package com.javateam.jse;

public class JavaEx38 {
	
	static String name; // 필드
	String name2;
	
	// 생성자는 리턴을 적지 않는다
	// void JavaEx38() { // (X)
	// JavaEx38 JavaEx38() { (X)
	public JavaEx38() { // (O)
		System.out.println("생성자");
	}

	// 인스턴스 멤버 메서드(method)
	// - public : 접근 제어자(지시자,변경자,제한자) = access modifier
	// ex) 누구나 사용할 수 있다(개방적)

	// - int : 리턴값(반환값,결과값)의 자료형
	// ex) 커피(음료수),잔돈,영수증 ...

	// - getNum : 메서드(함수) 이름
	// ex) 맥oo 하oo 커피 자판기

	// - () : 인자(인수,매개변수) 부
	// String str : 인자/인수/매개변수 
	// : 실인수(실제 유입되는 자료:argument),가인수(형식 인자:parameter)
	// ex) 동전,지폐,카드 ...

	// - {...} : 메서드(함수) 구현부 (몸통 : body)
	// ex) 자판기 내부

	// - return : 메서드(함수)의 분기(종료)
	// 1) 메서드의 리턴형 "void" 일때 : return;
	// 2) 메서드의 리턴형 실제 자료형(ex) int,String,...) : return num; , return str; ...
	
		public int getNum(String str) {
			
//			int result = 0; // 리턴값 초기화
//			
//			result = str.contentEquals("참") ? 1 : 0; // 3항연산자
//			
//			return result;
			
			if(str.contentEquals("참") == true) {
				return 1;
			}else {
				return 0;
			}
			
		}
		
		public void callMethod() {
//			System.out.println(getNum("참"));
			System.out.println(this.getNum("참"));
			
			// super.toString(); // (O)
		}
		
		public static void callStaticMethod() {
//			System.out.println(getNum("참")); // (X)
			System.out.println(new JavaEx38().getNum("참"));
			JavaEx38 obj = new JavaEx38();
			System.out.println(obj.getNum("참"));
			
			name = "java"; // (O)
			// this.name = "java"; // (X) 정적(static) 멤버
			JavaEx38.name = "java"; // (O) 클래스 변수.멤버
			
			// name2 = "java"; //(X) 정적 영역에서는 인스턴스 멤버 변수(필드) 안된다
			// new JavaEx38().name2 = "java"; // (O)
			obj.name2 = "java"; // (O)
	
		}
		
		static void callStaticMethod2() {
			
			// callStaticMethod(); // (O) 정적 방법(static Way)
			JavaEx38.callStaticMethod(); //(O) 정적 방법(static Way)
			//new JavaEx38().callStaticMethod(); // (O) 비추천!
			// this.callStaticMethod(); // (X) this, super -> 정적 요소(static) 같이 사용 불가
			// super.toString(); // (X)
		}
		
		public static void main(String[] args) {
			new JavaEx38().getNum("java"); // "java" => 실인자
		}

	}

	


