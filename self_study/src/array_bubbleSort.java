import java.util.*;

public class array_bubbleSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int [] arr = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt(); // 배열안에 정수 입력값 넣어주기
		}
		// 버블정렬
		int temp; // 변수 자리 바꿔주는(스위칭)변수 선언
		for(int i=0; i<arr.length; i++) { // 1~6회차 반복 => i : 회차
			for(int j =1; j<arr.length-i; j++) { // 인접 숫자 비교 => j : 회차안의 인접한 숫자 비교
				// j -0 하면 인덱스 범위를 벗어나므로 j 시작값 1로 조정한다
				if(arr[j-1]>arr[j] ) { // j-1 이 j보다 크면 두 값을 바꿔준다
					temp = arr[j-1]; // temp 에 작은수를 담는다
					arr[j-1] = arr[j]; // 앞의 변수에 작은수를 담아주고
					arr[j] = temp; // temp에 큰수를 다시 담아준다
					System.out.println(temp);
				}
			}
		}
		
		
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		
	}

}
