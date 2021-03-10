package com.javateam.jse;

public class OuterClass3 {
	
	// 생성자
	OuterClass3(){
		System.out.println("외부 클래스의 생성자");
	}
	
	// 함수(메소드) 생성
	void localMethod() {
		
		// 지역 클래스 => 메서드 내부에 생성되면 지역 클래스 이다
		class LocalClass{
			
			// 필드
			String name;
			
			// 생성자
			public LocalClass() {
				System.out.println("지역 클래스의 생성자");
			}
			
			// 메서드
			void print() {
				System.out.println("지역 클래스의 메서드");
			}
					
			
		} // LocalClass 의 끝
		
		// 메서드 내부에서 사용하기 떄문에 지역적으로 사용하는 것
		LocalClass local = new LocalClass();
		local.name = "자바";
		local.print();
		
	} // localMethod() 의 끝
	
	
	// 바로 main클래스 생성하기 
	public static void main(String[] args) {
		
		// 익명 메소드 호출(한번쓰고 끝)
		new OuterClass3().localMethod();
		
	}
	// localMethod 하나 더 생성 => bin 폴더에서 $2 로 생성되어있는것 확인
		void localMethod2() {
			
			// 지역 클래스 => 메서드 내부에 생성되면 지역 클래스 이다
			class LocalClass{
				
				// 필드
				String name;
				
				// 생성자
				public LocalClass() {
					System.out.println("지역 클래스의 생성자");
				}
				
				// 메서드
				void print() {
					System.out.println("지역 클래스의 메서드");
				}
						
				
			} // LocalClass 의 끝
			
			// 메서드 내부에서 사용하기 떄문에 지역적으로 사용하는 것
			LocalClass local = new LocalClass();
			local.name = "자바";
			local.print();
			
		} // localMethod() 의 끝
		
		
}
