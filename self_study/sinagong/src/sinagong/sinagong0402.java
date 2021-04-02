package sinagong;

public class sinagong0402 {
	
	public static int[] arr(int[] a) {
		int i,j,sw,temp,n=5;
		if(a[0] == 0 || a[0] <1) {
			return a;
		}
		for(i =0; i<n-1;i++) {
			//System.out.print(i + ",");
			sw =i;
			System.out.print("sw : " + sw);
			for(j=i;j<n;j++) {
				System.out.print("j : " + j+",");
				if(a[j] >a[sw]) {
					
					sw =j;
					System.out.print("a[j] : " + a[j]);
				}
				temp = a[i];
				a[i] = a[sw];
				a[sw] =temp;
			}System.out.println();
		}return a;
		
	}
	public static void main(String[] args) {
		int i;
		int n[] = {4,3,5,2,10};
		System.out.println(arr(n));
//		for(i=0;i<5;i++) {
//			System.out.println(n[i]);
//		}
	}

}
