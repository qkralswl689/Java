import java.util.*;
public class arrayEx1 {
	
	public static int topIndex(int[] scores) {
		
		int topIdx = 0;
		for(int i=0; i<scores.length; i++) { 
			if(scores[topIdx] <scores[i]) // topIdx보다 더 큰놈이 나타 났다면
				topIdx = i; // 새롭게 가장 큰놈의 위치를 설정한다 
			
		}
		
		return topIdx;
	}

	public static void main(String[] args) {
		
//		// 배열
//		int [] values = new int [10];
//		
//		for(int i=1; i<values.length; i++) {
//			values[i] = (int)Math.pow(2,i); // 2의i승 
//		}
//		System.out.println(Arrays.toString(values));

		String[] names = {"ming","ki","hyun","bea"};
		
		int[] scores = {45,2,10,94};
		
		int i = topIndex(scores); //메소드를 호출해 리턴값을 변수 i에 저장한다
		System.out.printf("1등 : %s(%d)\n",names[i],scores[i]);
		
	}

}
