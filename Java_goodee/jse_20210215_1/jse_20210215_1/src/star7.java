
public class star7 {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) { // �ݺ�Ƚ��
			for(int k =7; k>=i*2; k--) { // k�� 7���� i*2 ���� 1�� �����ϸ鼭 �ݺ�
				System.out.print(" ");
			}
			for(int j=0; j<=i*4;j++) { // j �� 0���� i*4���� 1�� �����ϸ鼭 �ݺ��Ѵ�
				System.out.print("*");
			}System.out.println();
		
		}
		// ����� ���
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
