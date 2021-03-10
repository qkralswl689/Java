package com.javateam.jse;
import java.util.*;
public class JavaEx35 {

	public static void main(String[] args) {
		
		System.out.print("계절 : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Season season = Season.valueOf(input);		
		String fruit = "";
			
		switch(season.name()) {

		case "SPRING" : fruit = "딸기"; break;
		case "SUMMER" : fruit = "수박"; break;
		case "FALL"   : fruit = "사과"; break;
		case "WINTER" : fruit = "귤"; break;
		}
		
		System.out.println("계절별 과일 :" + fruit);
		
		sc.close();
	}

}
