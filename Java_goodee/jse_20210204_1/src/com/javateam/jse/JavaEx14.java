package com.javateam.jse;

import java.util.Scanner;

public class JavaEx14 {

	public static void main(String[] args) {
		
		// 입력부
		System.out.print("돈 입력 : "); // 값을 입력받는다 
		Scanner sc = new Scanner(System.in);
		int money = sc.nextInt(); // money라는 변수에 정수를 입력받는다
		
		//System.out.println("입력된 금액 : " + money);
		//System.out.printf("입력된 금액 : %d원%n",money); // formatter 이용
		
		String result = "";
		
		// 조건부
		
		//1)
//		if(money >= 1000) {
//			result = "삼각감밥";			
//		}else {
//			result = "다이어트";
//		}
		
		// 2)
//		if(money >= 1000 && money < 2000 ) {
//			result = "삼각김밥  + 컵라면(소)";		
//		}else if (money >= 2000 && money < 3000 ) {
//			result = "줄김밥 + 겁라면(소)";
//		}else if(money >= 3000 && money < 4000) {
//			result = "줄김밥 + 컵라면(대)";
//		}else if (money >=  4000){
//			result = "착한 가게 백반";
//		}else {
//			result = "다이어트";
//		}
//		
		// 3) 이중 if 문
//		if ( money >= 1000 ) { 
//			
//			if(money >= 1000 && money < 2000 ) { 
//				result = "삼각김밥  + 컵라면(소)";		
//			}else if (money >= 2000 && money < 3000 ) {
//				result = "줄김밥 + 겁라면(소)";
//			}else if(money >= 3000 && money < 4000) {
//				result = "줄김밥 + 컵라면(대)";
//			}else if (money >=  4000){
//				result = "착한 가게 백반";
//			} else {
//				result = "다이어트";
//			}
//			
		// 4)
//		switch (money/1000) { // case의 값을 한자리로 만들기 위해 나누
//			case 1 : result = "삼각김밥  + 컵라면(소)";
//			break;
//			case 2 : result = "줄김밥 + 겁라면(소)";
//			break;
//			case 3 : result = "줄김밥 + 컵라면(대)";
//			break;
//			case 4 : case 5 : case 6 : // 한꺼번에 조건을 걸 수 있다
//				result = "착한 가게 백반"; 
//				break;
//			default : result = "다이어트"; break;
//			
//		}
		
		// 5) 삼항연산자
		result = (money >= 1000 && money < 2000) ? "삼각김밥  + 컵라면(소)":
				 (money >= 2000 && money < 3000) ? "줄김밥 + 겁라면(소)":
				 (money >= 3000 && money < 4000) ? "줄김밥 + 컵라면(대)" :
				 (money >=  4000)? "착한 가게 백반" :
				 "다이어트";
				
		// 출력부
		System.out.println("result : " + result);
		
		// 자원 반납
		sc.close(); // 찾아보기

	}

  }

