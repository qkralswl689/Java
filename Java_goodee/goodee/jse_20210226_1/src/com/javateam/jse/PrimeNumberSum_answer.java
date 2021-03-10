package com.javateam.jse;


import com.javateam.jse.CheckPrime;
import com.javateam.jse.CheckPrimeImpl;

public class PrimeNumberSum_answer {

	public static void main(String[] args) {
		
		
		CheckPrime p = new CheckPrimeImpl();
		
		int sum = 0;
	
		
		for(int i=0; i<=100; i++) {
			
			if(p.isPrimeNum(i) == true) {
				sum += i;
				System.out.print(i + " ");
			}
			
		}
		System.out.println("\n1~100까지의 소수의 합계 :" + sum);
	}

}
