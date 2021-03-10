package jse_20210216_1;

public class star8 {

	public static void main(String[] args) {
		
		for(int i=0; i<5;i++) { // 반복횟수 => i는 0부터 5까지 1씩 증가하면서 반복
			for(int j=1;j<=i*2;j++) { // j는 1부터 i*2까지 1씩 증가하면서 반복
				System.out.print(" ");
			}//System.out.println();
			for(int j=16; j>=i*4; j--) { // j는 16부터 i*4까지 1씩 감소하면서 반복
				System.out.print("*");
			}System.out.println();
			
			// 강사님 답안
//			for (int i=4; i>=0; i--) {
//				 
//	            // for (int j=(5-i)*2-2; j>0; j--)
//	            // for (int j=8-2*i; j>0; j--)
//	            for (int j=8-2*i; j>=1; j--)
//	                System.out.print(' ');
//	 
//	            // for (int j=0; j<((i+1)*4)-3; j++)
//	            // for (int j=0; j<4*i+1; j++)
//	            for (int j=0; j<=4*i; j++)
//	                System.out.print('*');
//	 
//	            System.out.println();
//	        } //
			
			
		}
	}
}


