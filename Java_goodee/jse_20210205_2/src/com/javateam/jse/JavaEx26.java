package com.javateam.jse;

public class JavaEx26 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			
			// 일시적으로(조건) 그 순가만 분기(skip)
			if(i%2 ==0) {
				continue; // 짝수일 때는 스킵하고 홀수만 출력
			}
			System.out.println(i);
		}

	}

}
