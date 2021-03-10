
public class star7 {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) { // 반복횟수
			for(int k =7; k>=i*2; k--) { // k는 7부터 i*2 까지 1씩 감소하면서 반복
				System.out.print(" ");
			}
			for(int j=0; j<=i*4;j++) { // j 는 0부터 i*4까지 1씩 증가하면서 반복한다
				System.out.print("*");
			}System.out.println();
		
		}
		// 강사님 답안
//		 for (int i=0; i<=4; i++) {
//			 
//	            // for (int j=0; j<=(5-i)*2-3; j++)
//	            for (int j=0; j<=7-2*i; j++)
//	                System.out.print(' ');
//	 
//	            for (int j=0; j<=4*i; j++)
//	                System.out.print('*');
//	 
//	            System.out.println();
//	        } //
	}

}
