import java.util.*;
public class arrayEx1 {
	
	public static int topIndex(int[] scores) {
		
		int topIdx = 0;
		for(int i=0; i<scores.length; i++) { 
			if(scores[topIdx] <scores[i]) // topIdx���� �� ū���� ��Ÿ ���ٸ�
				topIdx = i; // ���Ӱ� ���� ū���� ��ġ�� �����Ѵ� 
			
		}
		
		return topIdx;
	}

	public static void main(String[] args) {
		
//		// �迭
//		int [] values = new int [10];
//		
//		for(int i=1; i<values.length; i++) {
//			values[i] = (int)Math.pow(2,i); // 2��i�� 
//		}
//		System.out.println(Arrays.toString(values));

		String[] names = {"ming","ki","hyun","bea"};
		
		int[] scores = {45,2,10,94};
		
		int i = topIndex(scores); //�޼ҵ带 ȣ���� ���ϰ��� ���� i�� �����Ѵ�
		System.out.printf("1�� : %s(%d)\n",names[i],scores[i]);
		
	}

}
