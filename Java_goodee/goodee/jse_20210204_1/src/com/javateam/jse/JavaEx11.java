package com.javateam.jse;

public class JavaEx11 {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 1;
		// num1 = num1 + 1;
		// num1 += 1; // 위의 식과 상동(같다)
		// num1++; // 위의 식과 상동(같다)
		// ++num1; // 위의 식과 상동(같다)
		// ++num1++; (X)
		
		// 주의
		System.out.println("num1 : " + num1++); // 1 => 나중에 더한다 : 해상 식을 빠져나가면 2가 된다
		System.out.println("num1 : " + ++num2); // 2 => 먼저 더한다 : 식을 빠져나가기 전에 계산된다
		
		System.out.println("------------------ ");

		System.out.println("num1 : " + num1++); // 2 => 위의 식에서 + 했기 때문에 2가 출력된다
		System.out.println("num1 : " + ++num2); // 3

	}

}
