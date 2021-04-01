
public class sinagong {

	public static void main(String[] args) {

		int numArray[] = { 0,0,0,0,3 };


		int i, j;
			for(j = 4; j >= 0; --j) {
				System.out.print("j : " + numArray[j]);
				for (i = 4; i > j; --i) {
					System.out.print(" i : " +numArray[i]);
					numArray[j] +=numArray[i];
					System.out.println("j гу " +numArray[j]);

				}System.out.println();
			}
//			for(j=0;j<5;++j) {
//				System.out.printf("%d ",numArray[j]);
//			}
	}

}
