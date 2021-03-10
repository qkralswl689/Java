package com.javateam.jse;

public class JavaStringTest_answer {

	public static void main(String[] args) {

		String str = "좋은 프로그래머 대부분은 돈이나 대중에게 "
				   + "받을 찬사를 기대하고 프로그래밍을 하지 않고 "
				   + "프로그래밍이 재미 있어서 한다.";
		
		// 문자열 str 을 문자형으로 변환해 배열 arr에 넣어준다
		char[] arr = str.toCharArray();
		
		
		int k =0;
		
		for(int i=0; i<6;i++) { // 반복횟수
			for(int j=9-2*i; j>=0; j--) { // j는 9-2*i 부터 0까지 1씩 감소한다
				System.out.print("  "); // 두번 띄어쓰기
			}
			for(int j=0; j<=4*i;j++) { // j는0부터 4*i까지 1씩 증가하면서 반복한다
				System.out.print(arr[k]); // 배열 arr의 k(0)인덱스 부터 출력
				if(k<arr.length-1) { // 만약에 k(인덱스)가  배열의 길이에서 -1 값 보다 작다면
					k++; // 인덱스(k)는 1씩 늘어난다
				}else { // 아니라면
					break; // 멈춘다
				}
			}System.out.println();
			
			// 배열로 치환 안하고 출력하는 방법
			
//			for(int j=0; j<=4*i;j++) { // j는0부터 4*i까지 1씩 증가하면서 반복한다
//				System.out.print(str.charAt(k)); // str을 문자형으로 변환하여 k(0)인덱스 부터 출력
//				if(k<str.length()-1) { // 만약에 k(인덱스)가 문자열 str의 길이이에서 -1 값보다 작다면
//					k++; // 인덱스(k)는 1씩 늘어난다
//				}else { // 아니면
//					break; // 멈춘다
//				}
//			}System.out.println();
			
		}
 		
		
		
	}

}


