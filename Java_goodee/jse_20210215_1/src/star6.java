
public class star6 {

	public static void main(String[] args) {

		for(int i=1; i<=5;i++) {
			for(int j=4-i;j>=0;j--) {
				System.out.print(" ");
			}
			for(int k=1; k<i*2;k++) {
				System.out.print("*");
			} System.out.println();
			
		}
		for(int i=1; i<=5;i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int q=8; q>=i*2;q--) {
				System.out.print("*");
			}System.out.println();
		}
		
		// °­»ç´Ô ´ä¾È
//		for (int i=0; i<=3; i++) {
//
//			for (int j=4-i; j>0; j--) {
//				System.out.print(' ');
//			} //
//
//			for (int j=0; j<=2*i; j++) {
//				System.out.print('*');
//			} //
//
//			System.out.println();
//		} //
//
//		for (int i = 0; i <= 4; i++) {
//
//			for (int j = 0; j < i; j++) {
//				System.out.print(' ');
//			} //
//
//			for (int j = 2 * (4 - i); j >= 0; j--) {
//				System.out.print('*');
//			} //
//
//			System.out.println();
//		} //
		
	}

}


