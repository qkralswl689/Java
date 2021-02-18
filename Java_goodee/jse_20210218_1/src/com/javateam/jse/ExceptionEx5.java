package com.javateam.jse;

public class ExceptionEx5 {

	public static void main(String[] args) throws NullPointerException,ArithmeticException{
		// throws : 메서드 단위로 예외처리 		
		int result = 0;
		int num1 = 2;
		int num2 = 0;
		
		 Object obj = null; //객체 제대로 생성안됨 => 값이 null
				
			if( obj == null) {
				throw new NullPointerException("인스턴스가 생성되지 않았습니다");
			}
			System.out.println("name : " + obj.getClass().getName()); // 객체가 제대로 생성되지 않은 상태에서 멤버 호출
			
			if(num2 ==0) {
				throw new ArithmeticException("0나누셨습니다. 나누는수를 1로 설정하였습니다.");
			}
			
				
			// 대응 구문 작성
			result = num1 / num2; // 다시 계산
			
					
	}

}
