package com.javateam.jse;
import java.util.*;
public class JavaEx35 {

	public static void main(String[] args) {
		
		System.out.print("���� : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Season season = Season.valueOf(input);		
		String fruit = "";
			
		switch(season.name()) {

		case "SPRING" : fruit = "����"; break;
		case "SUMMER" : fruit = "����"; break;
		case "FALL"   : fruit = "���"; break;
		case "WINTER" : fruit = "��"; break;
		}
		
		System.out.println("������ ���� :" + fruit);
		
		sc.close();
	}

}
