package com.javateam.jse;


import java.util.*;

public class JavaEx25 {
	static int inputNum() {
		
		int result = 0;
		Scanner sc = null;
		int input = 0;
		
		while(true) {
			sc = new Scanner(System.in);
			System.out.println("입력 : ");
			
			try {
				input = sc.nextInt();
				
				if(input >=2 && input <=9) {
					result = input;
					break;
					
				}else {
					System.out.println("2~9사이의 숫자를 입력하십시오.");
				}
			}catch(Exception e) {
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
		sc.close();
		return result;
		
	}
	static int inputNum(String exit) {
		int result = 0;
		Scanner sc = null;
		String input = "";
		
		while(true) { // true 이면 반복한다
			
			sc = new Scanner(System.in);
			System.out.println(" 입력 : ");
					
			try { // 예외가 발생 할 수 있는 코드
				input = sc.nextLine();
				
				if(input.equals("exit")) { //equals : 실제 값 비교
					System.out.println("입력을 종료합니다");
					result = -1; // 값을 -1로 가지고
					break; // 끝
				}
				int num = Integer.parseInt(input); // String 을 int로 변환
				
				if(num >=2 && num <= 9) { // num 이 2이상 9이하 일때 
					result = num; // 값을 num 에 저장
					return result; // 값을 리턴한다
				}else { // 아닐때
					System.out.println("2~9 사이의 숫자를 입력하시오"); // 출력
				}
			}catch(Exception e) { // 예외가 발생하면 실행되는 코드
				System.out.println("잘못했습니다 다시입력하세여");
			}
		}
		sc.close();
		return result;
		
	}

	public static void main(String[] args) {
		
		// n단 ~ m단 까지 구구단
		
		int n = inputNum("exit");
		System.out.println("n : " + n);
		
		int m = inputNum("exit");
		System.out.println("m : " + m);
		
		Scanner sc = new Scanner(System.in);

//		System.out.print("시작단 입력 : ");
//		int n = sc.nextInt();
//
//		System.out.print("끝단 입력 : ");
//		int m = sc.nextInt();
		
		if(n == -1 || m == -1) {
			for(int i = n; i<=m;i++) {
				for(int j=1; j<=9; j++) {
					System.out.printf("%d X %d = %d%n",i,j,i*j);
				}System.out.println("--------------");
			}
		}else {
			System.out.println("입력이 틀렸습니다");
		}
		int num = inputNum();
		System.out.println(num);
//	
		
		
	}
}
				




	



