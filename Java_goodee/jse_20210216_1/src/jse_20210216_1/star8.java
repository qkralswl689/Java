package jse_20210216_1;

public class star8 {

	public static void main(String[] args) {
		
		for(int i=0; i<5;i++) { // �ݺ�Ƚ�� => i�� 0���� 5���� 1�� �����ϸ鼭 �ݺ�
			for(int j=1;j<=i*2;j++) { // j�� 1���� i*2���� 1�� �����ϸ鼭 �ݺ�
				System.out.print(" ");
			}//System.out.println();
			for(int j=16; j>=i*4; j--) { // j�� 16���� i*4���� 1�� �����ϸ鼭 �ݺ�
				System.out.print("*");
			}System.out.println();
			
			// ����� ���
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


