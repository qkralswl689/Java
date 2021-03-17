package Kim;

import java.util.Scanner;

public class kim_09_17 {

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
		System.out.println("1번문제 답 : ");
		
		for(int i=2; i<6;i++) { // i는 2부터 6까지 1씩 증가하면서
			System.out.print(i + "단        "); // 단을 출력한다
			// System.out.print(i + "단\t"); => 간단하게 공백 넣을수 있다
		}System.out.println();
		
		for(int i=2;i<=9;i++) { // i는 2부터 9까지 1씩증가하면서 반복하고 => 곱해주는 수 
			for(int j=2;j<=5;j++) { // j는 2부터 5까지 1씩증가하면서
				System.out.printf("%d*%d=%d ",j,i,j*i); // 해당 식을 출력한다 => 2~5단 출력
			}System.out.println();
		}
		for(int i=6; i<=9;i++) { // i는 6부터 9까지 1씩증가하면서 반복하면서
			System.out.print(i + "단       "); // 단을 출력한다
		}System.out.println();
		for(int i=2;i<=9;i++) { // i는 2부터 9까지 1씩증가하면서 반복하고
			for(int j=6;j<=9;j++) { // j는 6부터 9까지 1씩증가하면서  => 6~9단 출력
				System.out.printf("%d*%d=%d ",j,i,j*i); // 해당 식을 출력한다
			}System.out.println();
		}
		
		/*2. 방정식 2x+4y=10의 모든 해를 구하는 프로그램을 작성하시오.		
		단 x와 y는 정수이고 각각의 범위는 0<=x<=10, 0<=y<=10임 	
		** 방정식의 해 : 방정식이 참이 되게 하는 미지수의 값.
		[결과]		
		x=1,y=2		
		x=3,y=1		
		x=5,y=0*/	
		System.out.print("2번문제 : ");
		for(int x=0; x<=10;x++) { // x는 0부터 10까지 1씩증가하면서 반복하고
			for(int y=0; y<=10;y++) { // y는 0부터 10까지 1씩증가하면서 반복하고
				if(2*x + 4*y == 10) { // 2*x + 4*y 의 값이 10이라면
					System.out.printf("x = %d, y = %d %n",x,y); // 해당식을 출력한다
				}
			}
		}

			
		/*
		  3. (1) + (1+2) + (1+2+3)+... (1+2+3+...10)=220 출력하기
		*/
		System.out.print("3번문제 : ");
		
		int sum =0; // sum변수 선언후 0으로 값 초기화
		for(int i=1;i<=10;i++) { // i는 1부터 10까지 1씩증가하면서 반복하면서
			System.out.print("("); // (를 출력한다
			for(int j=1;j<=i;j++) { // j는 1부터 i의 값까지 1씩증가하면서 반복하고
				if(j == 1) { // j의 값이 1이라면
					System.out.print(j); // j의 값을 출력하고
				}else { // 아니면
					System.out.print("+"+j); // + j의값을 출력한다
				}
					sum+=j; // 변수 sum에 j의 값을 더해준다
			}
			if(i==10) { // i의 값의 10이라면
				
				System.out.println(")" + sum); // ) 변수 sum값을 출력하고
			}else { // 아니라면
				
				System.out.print(")+"); // )+를 출력한다
			}
		}

		/* 4. 화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기	
		[결과]		
		삼각형의 높이를 입력하세요		
		3		
		  *		
		 **		
		*** 	*/	
		System.out.print("4번문제 : ");
		
		Scanner sc = new Scanner(System.in); // 입력받을 Scanner객체 생성
		 
		int n = sc.nextInt(); // 변수 n에 입력받은 값을 저장한다
		for(int i=0; i<=n;i++) { // i는 0부터 입력받은값n까지 1씩증가하면서 반복하고
			for(int j=n;j>i;j--) { // j는 입력받은값n부터 i값보다 클때까지 1씩감소하면서 
				System.out.print(" "); // 공백을 출력한다
			}for(int j=0;j<i;j++) { // j는 0부터 i값까지 1씩증가하면서 
				System.out.print("*"); // *를 출력한다
			}System.out.println();
		}
		/* 5.화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기 		
		삼각형의 높이를 입력하세요		
		3	
		  * 		
		 *** 		
		*****  */
		System.out.print("5번문제 : ");
		int o = sc.nextInt(); // 변수 o에 입력받은 값을 저장한다
		
		for(int i=1;i<=o;i++) { // i는 1부터 입력받은값o 까지1씩증가하면서 반복하고
			for(int j=o;j>i;j--) { // j는 입력받은값o부터 i값보다 큰값일 때 까지 1씩감소하면서 
				System.out.print(" "); // 공백을 출력한다
			}for(int j=1;j<i*2;j++) { // j는 1부터 i*2값 까지 1씩증가하면서 
				System.out.print("*"); // *을 출력한다
			}System.out.println();
		}
	

		/*6. 화면에 삼각형 높이를 입력받고, 높이에 맞는 *로 삼각형 출력하기 		
		배열 크기를 홀수로 입력하세요		
		5		
		*****		
		 ***		
		  *		
		 ***		
		*****  ​*/
		System.out.print("6번문제 : ");
		int m = sc.nextInt(); // 변수 m에 입력받은 값을 저장한다
		
		for(int i=0; i<m/2;i++) { // i는0부터 입력받은값m/2 값 까지 1씩증가하면서 반복하고
			for(int j=0;j<i;j++) { // j는 0부터 i값보다 작은값 일 때까지 1씩증가하면서
				System.out.print(" "); // 공백을 출력한다
				
			}for(int j=m;j>i*2; j--) { // j는 입력받은값m부터 i*2값보다 큰값일 때 까지 1씩감소하면서
				System.out.print("*"); // *을 출력한다
			}System.out.println();	
		
		}for (int i=0;i<=m/2;i++) { // i는0부터 입력받은값m/2 값 까지 1씩증가하면서 반복하고
			for(int j=m/2; j>i;j--) { // j는 입력받은값m/2 값부터 i값보다 큰값일 때 까지 1씩감소하면서
				System.out.print(" "); // 공백을 출력한다
			
			}for(int j=0;j<=i*2;j++) { // j는 0부터 i*2값보다 작거나 같은값 일 때까지 1씩증가하면서
				System.out.print("*"); // *을 출력한다 
			}System.out.println();
		  }
	}
}
