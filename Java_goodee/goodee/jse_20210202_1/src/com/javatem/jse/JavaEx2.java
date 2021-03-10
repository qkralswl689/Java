package com.javatem.jse;

public class JavaEx2 {
	
	// String str; // 멤버 필드(변수) member field(variable)
	// 별도 초기화 하지 않아도 기본 초기값 할당
    // 클래스(참조 자료형) => 초기값 null 자동할당

	public static void main(String[] args) {
		
		// var str = "java'"; => since Java11 ex) javascript
		String str; // 지역변수(local variablㅇe) str
		// 변수의 선언(declaration)
		
		// 참고) python : num = 1; => 자료형 무표기
		// String : 자료형((data) type) => 참조형 자료형(reference data type)
		// 지역변수는 멤버 필드와 달리 초기값을 별도로 할당(대입:assign) 해야한다
		// 단, 배열 변수는 지역변수라도 초기값 자동 할당
		
		// 참고) 기본 자료형(Java) : 소문자 
		// 정수형 : byte, short, int, long 
		// 실수형 : float, double
		// 불린형(불대수) : boolean
		// 문자형 : char
		
		str = "java"; // 변수의 초기화(initialization) : 처음 값이 할당(대입)
		str = "python"; // 변수 값의 할당(대입: assign)
		
		String str2 = "html"; // 선언과 동시에 대입 => 변수의 초기화
		// 참고) javascript => var : 같은 변ㅅㅜ를 재선언/할당
		// 참고) javasxript => const : 상수화 => 같은변수 재선언/재할당(대입) 불가
		// 참고) javasxript => let : 같은 변수를 재선언 불가

		
		System.out.println("str : "+ str);
		//System.out.println("멤버필드 str : " + new JavaEx2().str);
		
		// 변수  : 다양하게 변화를 줄 수 있는 것("vary" + "~able")
		// ex) 건물  = 변수 ex) 대륭 3차...
		// ex) 건물의 종류 = 자료형  ex) 주상복합, 단독, 공동주택,...
		
		/** 메시지 */
		String s1;
		/** 결과값 */
		String s2;
		/** 문자열 s3 */
		String s3;
		
		String st1, st2, st3; /** 문자열 st1, 문자열 st2,문자열 st3 */
		
		// 문제 없으나 권장하지 않는다 $나_를 변수명 맨앞에 붙히는것 
		// ex) $ => 내부 클래스의 바이트 코드에 포함
		// ex) _ => 상수(constant)에 적용이 바람직
		// int $num1 = 1;
		// int _num1 = 1;
		//System.out.println("$num1 : " + $num1);
		//System.out.println("_num1 : " + _num1);
		
		// 예약어는 변수명으로 사용할 수 없다
		// String calss; // (X) // 키워드(예약어) 직접사용 (X)
		// String class1; // (O) // 키워드(예약어) 합성(포함)가능 (O)
		// class clazz; // (O)

		
		

	} 

} 
