
public class star6 {

	public static void main(String[] args) {

		for(int i=1; i<=5;i++) {// 반복 횟수 : i는1부터 5까지 1씩 증가하면서 반복한다
			//System.out.print(i);
			for(int j=4-i;j>=0;j--) { // j는 4-i 부터 0까지 1씩 감소하면서 반복한다
				System.out.print(" ");
			}
			for(int k=1; k<i*2;k++) { // k는 1부터 i*2 까지 1씩 증가하면서 반복한다
				System.out.print("*");
			} System.out.println();
			
		}
		for(int i=1; i<=5;i++) { // i는 1부터 5까지 1씩증가하면서 반복한다 => 반복횟수
			//System.out.print(i);
			for(int j=0; j<i; j++) { // j는 0부터 i 까지 1씩증가하면서 반복한다
				System.out.print(" ");
			}
			for(int q=8; q>=i*2;q--) { // q는 8부터 i*2까지 1씩 감소하며서 반복한다
				System.out.print("*");
			}System.out.println();
		}
		
		// 강사님 답안
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


