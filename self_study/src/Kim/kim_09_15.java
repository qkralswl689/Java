package Kim;

import java.util.*;
public class kim_09_15 {
	
	public static void main(String[] args) {
		
		/*1. 다음 프로그램의 결과값을 예측해 보시오.
				class OpEx01 {			
				public static void main (String []args) {			
				System.out.println (6 ^ 3); 			
			}			
		}*/
		System.out.println("1번 답 : " + (6^3)); // 5 => ^ : 두 수의 각 자리수가 다른 경우 1로 변환한다. => 이진수 계산
												 // 6 : 0000 0110
												 // 3 : 0000 0011
												 //	= : 0000 0101 => 10진수로 변환하면 5 
	
		/*2. 다음 프로그램의 결과값을 예측해 보시오.
				class OpEx02 {			
				public static void main (String []args) {			
				System.out.println (3/2); 			
				System.out.println (3<2); 			
				System.out.println (3*4); 			
				System.out.println (3<<2);			
				System.out.println (3*2^2); 
			}			
		} */
		System.out.println ("2번의 1번 : " + 3/2); 	// 1		
		System.out.println ("2번의 2번 : " + (3<2)); 	// false		
		System.out.println ("2번의 3번 : " + 3*4); 	// 12		
		System.out.println ("2번의 4번 : " + (3<<2));	// 12 => << : 이진수의 각자리를 왼쪽으로 N칸 밀고 제일 첫째자리는 0으로 채워주는 연산	
		System.out.println ("2번의 5번 : " + (3*2^2)); // 4 
		
		/*3. 아래 프로그램의 실행 결과를 기술하시오. 
			class OpEx03{				
			public static void main(String args[]) {				
				int a=10,b=20;				
				int c;		
				// ++ OR -- 가 앞에붙으면 증감연산자 가 먼저실행 뒤에붙으면 계산 후 증감연산		
				c=++a + ++b;				
				System.out.println("1.a="+a+"\tb="+b+"\tc="+c);	// 11,21,32
							
				c=a++ + b++;				
				System.out.println("2.a="+a+"\tb="+b+"\tc="+c);	// 10,20,30
						
				c=a++ + ++b;				
				System.out.println("3.a="+a+"\tb="+b+"\tc="+c);	// 10,21,31	
						
				c=++a + b++;				
				System.out.println("4.a="+a+"\tb="+b+"\tc="+c); // 11,20,31
				
				c = --a + --b;				
				System.out.println("5.a="+a+"\tb="+b+"\tc="+c);	// 9,19,28
							
				c = a-- + b--;				
				System.out.println("6.a="+a+"\tb="+b+"\tc="+c);	// 10,20,28
							
				c = a-- + --b;				
				System.out.println("7.a="+a+"\tb="+b+"\tc="+c);	// 10,19,29
							
				c = --a + b--;
				System.out.println("8.a="+a+"\tb="+b+"\tc="+c); // 9,20,29
				
			}
			
		}*/
		int a=10,b=20;				
		int c;		
		//  ++ OR -- 가 앞에붙으면 증감연산자 가 먼저실행 뒤에붙으면 계산 후 증감연산		
		c=++a + ++b;				
		System.out.println("3번의1.a="+a+"\tb="+b+"\tc="+c);	// 11,21,32
					
		c=a++ + b++;				
		System.out.println("3번의2.a="+a+"\tb="+b+"\tc="+c);	// 12,22,32
				
		c=a++ + ++b;				
		System.out.println("3번의3.a="+a+"\tb="+b+"\tc="+c);	// 13,23,35	
				
		c=++a + b++;				
		System.out.println("3번의4.a="+a+"\tb="+b+"\tc="+c); // 14,24,37
		
		c = --a + --b;				
		System.out.println("3번의5.a="+a+"\tb="+b+"\tc="+c);	// 13,23,36
					
		c = a-- + b--;				
		System.out.println("3번의6.a="+a+"\tb="+b+"\tc="+c);	// 12,22,36
					
		c = a-- + --b;				
		System.out.println("3번의7.a="+a+"\tb="+b+"\tc="+c);	// 11,21,33
					
		c = --a + b--;
		System.out.println("3번의8.a="+a+"\tb="+b+"\tc="+c); // 10,20,31
		
		/*4. 밑변과 높이를 입력받아 삼각형의 넓이를 구하시오  OpEx04.java
			[결과]			
			밑변의 길이 : 7			
			높이의 길이 : 5			
			넓이 : 17.5*/
		Scanner sc = new Scanner(System.in);
		// 삼각형의 넓이 : 밑변 * 높이 /2
		System.out.print("밑변을 입력해 주세요 : ");
		float bottom = sc.nextFloat();
		System.out.print("높이를 입력해 주세요 : ");
		float height = sc.nextFloat();
		
		System.out.println("4번 삼각형의 넓이 : "+bottom*height/2);
		
		/*5. 반지름을 입력받아 원의 둘레와 면적을 구하시오 OpEx5.java
			   원주율 = 3.141592  입니다.			
			[결과]		
			반지름 : 5			
			 넓이 : 78.5398			
			 둘레 : 31.41592 */
		// 원의 넓이 : 반지름 * 반지름 * 원주율(3.141592)
		// 원의 둘레 : 반지름 * 2 * 원주율(3.141592)
		System.out.print("반지름을 입력해 주세요 : ");
		float harf = sc.nextFloat();
		System.out.printf("원의 넓이 : %f",harf*harf*3.141592);
		System.out.printf("원의둘레 : %f",harf*2*3.141592);		
	}

}
