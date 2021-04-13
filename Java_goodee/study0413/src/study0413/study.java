package study0413;

public class study {
	public static void main(String[] args) {
		
		int k = func(5);
		System.out.println(k);
	}

	public static int func(int num) {
		
		if(num == 1) {
			return 1;
		}
		
		return num * func(num-1);
		
	}
}
