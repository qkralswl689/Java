package com.javateam.jse;
import java.util.*;
public class JavaEx34 {

	public static void main(String[] args) {
		
		System.out.print("���� : ");
		Scanner sc = new Scanner(System.in);
		int season = sc.nextInt();
		
		String fruit = "";
			
		switch(season) {
//		case 0: fruit = "����"; break;
//		case 1: fruit = "����"; break;
//		case 2: fruit = "���"; break;
//		case 3: fruit = "��"; break;

		case Season2.SPRING : fruit = "����"; break;
		case Season2.SUMMER: fruit = "����"; break;
		case Season2.FALL: fruit = "���"; break;
		case Season2.WINTER: fruit = "��"; break;
		}
		
		System.out.println("������ ���� :" + fruit);
		
		sc.close();
	}

}
