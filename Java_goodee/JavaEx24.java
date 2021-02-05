package com.javateam.jse;

import java.util.*;

public class JavaEx24 {

	public static void main(String[] args) {
		
		// while 문 2개만을 이용하여 구구단을 구현하시오
		int i = 1;
		int j = 1;
		while(i<=9) {
			
			while(j<=9) {				
				System.out.printf("%d X %d = %d%n", i,j,i*j);
				j++;
			
			}	
			j = 1; // j를 초기화 해줘야 한다 
			// * 2단만 출력 오류 => 주의사항 ) 카운터 편수 수동 초기화 !
			System.out.println("----------");
			i++;
		}

	}
}
