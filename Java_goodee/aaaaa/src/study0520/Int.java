package study0520;

import java.util.Scanner;

public class Int {

	public static void main(String[] args) {
	    /* 1. �Է°� ���� */
	    Scanner scanner = new Scanner(System.in);
	    int money = scanner.nextInt();
	    int time = scanner.nextInt();
	    /* 2. ���� ��� */
	    int cost = money * time;
	    /* 3. ��� */
	    System.out.println(cost);
	  }
}
