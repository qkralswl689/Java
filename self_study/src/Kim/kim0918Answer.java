package Kim;

public class kim0918Answer {

	public static void main(String[] args) {
		/*1.  1부터 9까지의 숫자 중 중복되지 않는 숫자 3개를 선택하고, 정렬하여 출력하기.*/		
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int[] arr2= new int[3];
		int temp;
		
		for(int i=0; i<1000;i++) {
			int a = (int)(Math.random()*9);
		    int b = (int)(Math.random()*3);
		    temp = arr[a];
		    arr[a] = arr[b];
		    arr[b] = temp;	
		}
		for(int i=0; i<arr2.length;i++) {
			arr2[i] = arr[i];
		}
		for(int i=0; i<arr2.length; i++) {
			for(int j=i;j<arr2.length;j++) {
				if(arr2[i] > arr2[j]) {
					temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
		
		/*2.  int[][] score = {{90,80,70},{95,85,75},{70,80,75},{75,70,85},{70,75,80}}; 
		 score 배열보다 가로 세로가 1씩 더큰 배열 result 배열 생성하기.		
		 score 배열의 내용을 result에 저장하고,		
		 각 추가된 행과 열에는 각 행과 열의 합을 저장하고, result 배열의 내용 출력하기		
		[결과]		
		90   80  70    240		
		95   85  75    255		
		70   80  75    225		
		75   70  85    230		
		70   75  80    225		
		400 390 385 1175		
		*/		
		
		/*3. 2차원 배열을 이용하여 모래시계 출력하기		
		 [결과]		
		 길이를 홀수로 입력하세요		
		 5		
		*****		
		 ***		
		  *		
		 ***		
		*****  */
		/* 4. 2차원 배열을 이용하여 다음을 출력하기		
		[결과]		
		배열의 크기를 홀수로 입력하세요		
		5		
		17 16 15 14 13 		
	       12 11 10 		
	         9 		
	        8  7  6 		
	     5  4  3  2  1 	*/		
		/*5. Command 라인에서 숫자를 입력받아 숫자의 약수를 출력하기		
		java Test5 10		
		int num = Integer.parseInt(args[0]);		
		[결과]		
		10의 약수 : 1,2,5,10, */	
	    /*6. command line에서 숫자로 이루어진 문자를 두개 받아서 두수의 공약수를 구하시오		
		java Test6 10 20		
		[결과]		
		10과 20 의 공약수 : 1,2,5,10,
		​*/
	}
}
