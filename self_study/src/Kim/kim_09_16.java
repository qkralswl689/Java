package Kim;

import java.util.*;


public class kim_09_16 {

	public static void main(String[] args) {
		/*1. 화면에서 한개의 문자를 입력받아
	     대문자인 경우는 소문자로,소문자인 경우는 대문자로 ,
	     숫자인 경우는 20을 더한 값을   출력하기, 그외의 문자는 기타 문자 를 출력하세요*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1.문자를 입력해 주세요 : ");
		char ch = sc.next().charAt(0); // charAt(0) : 입력받은 문자열 문자로 형변환
		
		if(Character.isUpperCase(ch)) { // Character.isUpperCase(ch) : 만약에 ch가 대문자 라면
			System.out.println(Character.toLowerCase(ch)); // Character.toLowerCase(ch) :ch소문자로 변환해 출력
		}else if(Character.isLowerCase(ch)) { // Character.isLowerCase(ch) : 만약에 ch가 소문자 라면
			System.out.println(Character.toUpperCase(ch)); // Character.toUpperCase(ch) : ch대 문자로 변환해 출력
		}else if(ch>='0' && ch<='9') { // ch>='0' && ch<='9' : 만약에 ch 가 숫자 라면 
			// 숫자 + 20 (0의 아스키코드는 48이므로 48을 빼고 20을 더해줌), 최종적으로 -28
			System.out.println(ch-28); // ch-28 : 숫자로 변환후 20을 더해서 출력
			
		}else { // 그외의 문자라면 
			System.out.println("기타문자");
		}
		
		/*2. 시스템과 가위(1), 바위(2), 보(3)를 하기
    	시스템은 1,2,3 중의 한개의 숫자를 저장하고, 
    	한개의 숫자를 입력받아 가위바위보 게임하기*/
		
		System.out.print("2.숫자를 입력해 주세요(1:가위,2:바위,3:보) : ");
		int system = (int)(Math.random()*3)+1 ; // Math.random()*3)+1 : 3가지 랜덤숫자 입력받기 => 숫자가 0부터 시작 하기 때문에 +1을 해준다
		int num = sc.nextInt();
		System.out.println("시스템 숫자 : " + system);
		System.out.println("사용자 숫자 : " + num);
		
		if(system == 1) {
			if(num ==1 ) {
				System.out.println("비겼습니다");
			} else if( num ==2) {
				System.out.println("사용자가 이겼습니다");
			} else if (num ==3) {
				System.out.println("시스템이 이겼습니다");
			}
		}
		if(system == 2) {
			if(num ==2 ) {
				System.out.println("비겼습니다");
			} else if( num ==3) {
				System.out.println("사용자가 이겼습니다");
			} else if (num ==1) {
				System.out.println("시스템이 이겼습니다");
			}
		}
		if(system == 3) {
			if(num ==3 ) {
				System.out.println("비겼습니다");
			} else if( num ==1) {
				System.out.println("사용자가 이겼습니다");
			} else if (num ==2) {
				System.out.println("시스템이 이겼습니다");
			}
		}
		
		/* 3. 시스템과 주사위 던지기 시스템이 주사위를 던저 나온 값을 저장하고,
		        사용자의 주사위를 던저 나온값을 시스템의 값과 비교하여, 시스템의 주사위 값이 크면 시스템 승리
    		사용자의 주사위 값이 크면 사용자 승리  시스템과 사용자의 주사위값이 같으면 동점입니다. 출력하기.
	     */
		System.out.println("3.주사위를 던집니다");
		int system2 = (int)(Math.random()*6)+1; // (Math.random()*6)+1 : 1~6까지의 랜덤숫자 입력받기
		int user = (int)(Math.random()*6)+1; // 1~6까지의 랜덤숫자 입력받기
		
		System.out.println("시스템 주사위 값 : " + system2);
		System.out.println("사용자 주사위 값 : " + user);
		if(system2>user) {
			System.out.println("시스템 승리");
		}else if(system2 == user) {
			System.out.println("동점");
		}else if(system2 < user) {
			System.out.println("사용자 승리");
		}
		
		/*4. 점수를 입력받아 
    	  95점 이상인 경우 A+ ,90 ~ 94 : A0 
          89 ~ 85점 이상인 경우 B+ ,80 ~ 84 : B0 
          79 ~ 75점 이상인 경우 C+, 70 ~ 74 : C0
    	  69 ~ 65점 이상인 경우 D+, 60 ~ 64 : D0
    	   그외는 F 로 출력하기.
                   중첩 반복문을 이용하여 구현하기*/
		System.out.print("4.점수를 입력해 주세요 : ");
		int score = sc.nextInt();
		if(score >=95 ) {
			System.out.println("A+");
		}else if(score >=90) {
			System.out.println("A0");
		}else if(score >=85) {
			System.out.println("B+");
		}else if(score >=80) {
			System.out.println("B0");
		}else if(score >=75) {
			System.out.println("C+");
		}else if(score >=70) {
			System.out.println("B0");
		}else if(score >=65) {
			System.out.println("D+");
		}else if(score >=60) {
			System.out.println("D0");
		}else {
			System.out.println("F");
		}		

	}

}
