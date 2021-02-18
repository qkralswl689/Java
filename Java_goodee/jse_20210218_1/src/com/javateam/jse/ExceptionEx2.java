package com.javateam.jse;

public class ExceptionEx2 {

	public static void main(String[] args) {
		
		  // java.lang.ArithmeticException: / by zero : 예외처리 메세지 => 0으로 나누어서 생겼다
		  // JRE(JVM) 자체적인 예외처리 운영
		
		int result = 0;
		int num1 = 2;
		int num2 = 0;
		
		Object obj = null; //객체 제대로 생성안됨 => 값이 null
	
		// try - catch 으로 예외처리 
		try {
			
			// NullPointerException 발생
			// 이중 작성
			try {System.out.println("name : " + obj.getClass().getName()); // 객체가 제대로 생성되지 않은 상태에서 멤버 호출
			
			}catch(NullPointerException e) { // NullPointerException 처리 => 명확하게 설정

					System.out.println("에러 : " + e);
					
					//대응 구문
					obj = new Object();
					System.out.println("name : " + obj.getClass().getName());
			}
			
			result = num1 / num2; // 예외 발생 영역
			
			
		} catch(ArithmeticException e) { // 조치 , e => 주로 많이쓴다.(Exception)
			// "e" 라는 예외처리 객체가 자동생성 된다
			
			////// 에러 메시징(messaging) /////
			// e.printStackTrace(); // 가장 자세한 에러로그(error log) 출력된다
			
			// System.out.println("e : " + e);
			// e : java.lang.ArithmeticException: / by zero 출력된다
			
			// System.out.println("e : " + e.toString());
			
			// System.out.println("e.getMessage() : " + e.getMessage());
			//e.getMessage() : / by zero 출력 => 에러 메세지만 출력
			
			 // System.err.println("e : " + e.toString());
			// 적색(red)으로 로그(log) 출력 
			 
			// 사용자 에러 메세징
			 System.out.println("0나누셨습니다. 나누는수를 1로 설정하였습니다.");
			
			// 대응 구문 작성
			num2 = 1; // 문제가 되는 num2의 값을 1로 주어서
			result = num1 / num2; // 다시 계산
			
			// 출력
			// e : java.lang.ArithmeticException: / by zero
			// 0나누셨습니다. 나누는수를 1로 설정하였습니다.
			// result : 2 
		
			// catch 2중 처리 : ArithmeticException 가 처리못한걸 처리해준다
			//} catch(Exception e) { // NullPointerException 처리 
					
			// 예외처리 마무리
			} finally {
				// 예외 발생과 무관하게 실행된다 : ex) 마무리 처리 부분, 자원반납(resource closing)
				System.out.println("예외처리 마무리");						
		}
				System.out.println("result : " + result);
	}

}
