package Kim;

import java.util.Scanner;

public class kim_09_17_answer {

	public static void main(String[] args) {
		/*1. 구구단을 2단으로 출력하기
		[결과]		
		2단     3단    4단     5단 		
		2*2=4 3*2=6 4*2=8 5*2=10 		
		2*3=6 3*3=9 4*3=12 5*3=15 		
		2*4=8 3*4=12 4*4=16 5*4=20 		
		2*5=10 3*5=15 4*5=20 5*5=25 		
		2*6=12 3*6=18 4*6=24 5*6=30 		
		2*7=14 3*7=21 4*7=28 5*7=35 		
		2*8=16 3*8=24 4*8=32 5*8=40 		
		2*9=18 3*9=27 4*9=36 5*9=45		
		6단      7단      8단      9단 		
		6*2=12 7*2=14 8*2=16 9*2=18 		
		6*3=18 7*3=21 8*3=24 9*3=27 		
		6*4=24 7*4=28 8*4=32 9*4=36
		6*5=30 7*5=35 8*5=40 9*5=45 		
		6*6=36 7*6=42 8*6=48 9*6=54 		
		6*7=42 7*7=49 8*7=56 9*7=63 		
		6*8=48 7*8=56 8*8=64 9*8=72 		
		6*9=54 7*9=63 8*9=72 9*9=81
		 */		
//		for(int i =2; i<=5;i++) { // 단 출력 -> i는 2부터 5까지 1씩 증가하면서 반복
//			System.out.print(i + "단\t");				
//			}System.out.println();
//			
//			for(int i = 2; i<=9;i++) { // 행	출력 -> i는2부터 9까지 1씩 증가하면서 반복			
//				for(int j=2; j<=5;j++) { // 단 출력 -> j는 2부터 5까지 1씩증가하면서 반복
//					System.out.printf("%d*%d=%d \t",j,i,i*j);
//					
//				}
//				System.out.println();
//			}
//			
//			for(int i= 6; i<=9;i++) {
//				System.out.print(i + "단\t");
//			}System.out.println();
//			
//			for(int i = 2; i<=9; i++) {
//				for(int j=6;j<=9;j++) {
//					System.out.printf("%d*%d=%d \t", j,i,i*j);
//				}System.out.println();
//			}		
		/*2. 방정식 2x+4y=10의 모든 해를 구하는 프로그램을 작성하시오.		
		단 x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10임 	
		** 방정식의 해 : 방정식이 참이 되게 하는 미지수의 값.
		[결과]		
		x=1,y=2		
		x=3,y=1		
		x=5,y=0*/	

//		 for(int i = 0; i<=10; i++) { // x : i는 0부터 10까지 1씩 증가하면서 반복한다
//			 for(int j=0; j<=10; j++) { // y : j는 0부터 10까지 1씩 증가하면서 반복한다
//				 int result = 0; // 결과 담을 변수result 선언 후 초기화
//				 int conclusion = 10; // 2x+4y=10 의 10 을 담을 변수 선언 후 10으로 초기화 
//				 result = 2*i + 4*j; // 2*i + 4*j 의 값을 result에 할당한다
//				 if(result == conclusion) { // 만약에 result 값이 10 이라면
//					 System.out.printf("x=%d,y=%d \n",i,j); // 출력한다
//				 }
//			 }
//		 }
			
		/*
		  3. (1) + (1+2) + (1+2+3)+... (1+2+3+...10)=220 출력하기
		*/
//		int sum =0;
//		for(int i=1;i<=10;i++) {
//			System.out.print("(");
//			for(int j=1;j<=i;j++) {
//				if(j == 1) {
//					System.out.print(j);
//				}else {
//					System.out.print(" + "+j);
//				}
//					sum+=j;
//			}
//			if(i==10) {
//				System.out.println(")" + sum);
//			}else {
//				System.out.print(") +");
//			}
//		}


		
		/* 4. 화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기	
		[결과]		
		삼각형의 높이를 입력하세요		
		3		
		  *		
		 **		
		*** 	*/	
		
		Scanner sc = new Scanner(System.in);
		
//		int n = sc.nextInt();
//		for(int i=1; i<=n; i++) {
//			// 줄수(i) + 공백(j) = num이니까 공백(j) = num - 줄수(i)
//			for(int j=n-1;j>=i;j--) {  // 공백 찍을 개수(j)를 num - 1에서 시작해서 줄수보다 작아지는 순간 스탑
//				System.out.print(" ");
//			}for(int j=1;j<=i;j++) {
//					System.out.print("*");
//				}
				//System.out.println();						
			//}
		/* 5.화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기 		
		삼각형의 높이를 입력하세요		
		3	
		  * 		
		 *** 		
		*****  */
	
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i++) {
//			// 줄수(i) + 공백(j) = num이니까 공백(j) = num - 줄수(i)
//			for(int j=n-1;j>=i;j--) {// 공백 찍을 개수(j)를 num - 1에서 시작해서 줄수보다 작아지는 순간 스탑
//			System.out.print(" ");
//			}
//			for(int j=1;j<=(2*i)-1;j++) { // * 개수 : 2 * 줄수(i) - 1
//				System.out.print("*");
//			}System.out.println();
//		}

		
		/*6. 화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기 		
		배열 크기를 홀수로 입력하세요		
		5		
		*****		
		 ***		
		  *		
		 ***		
		*****  ​*/
		
		int n=sc.nextInt();
		for(int i=1;i<=(n/2);i++) {// 1번째 줄 ~ (2 / num)줄 까지
			for(int j=1;j<i;j++) {
				System.out.print(" ");
			}for(int j=n;j>=2*i-1;j--) {
				System.out.print(j);
			}System.out.println();
		}
		for(int i=(n/2)+1;i>=1;i--) {  // (2 / num) + 1 줄부터 num 줄까지
			for(int j=1;j<=i-1;j++) {
				System.out.print(" ");
			}for(int j=1;j<=n-(2*(i-1));j++) {
				System.out.print("*");
			}System.out.println();
		}
	}
}
