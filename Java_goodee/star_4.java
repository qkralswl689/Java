package com.javateam.jse;

public class star_4 {

	public static void main(String[] args) {
		
		for(int i=0; i<5;i++) { // i는 4까지 1씩 증가하면서 반복한다
			for(int j=4-i; j>0;j--) { // j는 4-i 의 값이 0이 될 때까지 1씩 감소하면서 반복한다
				System.out.print("+");
			}
			for(int j=0; j<=i*2; j++) { // j는 0에서 i*2 까지 1씩 증가하면서 반복한다
				System.out.print("*");
			}System.out.println();
		}

	}

}
