package study0520;

import java.util.Scanner;

public class Int {

	public static void main(String[] args) {
	    /* 1. 입력값 대입 */
	    Scanner scanner = new Scanner(System.in);
	    int money = scanner.nextInt();
	    int time = scanner.nextInt();
	    /* 2. 월급 계산 */
	    int cost = money * time;
	    /* 3. 출력 */
	    System.out.println(cost);
	  }
}
