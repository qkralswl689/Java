package com.javateam.jse;
import java.util.*;
public class JavaEx34 {

	public static void main(String[] args) {
		
		System.out.print("계절 : ");
		Scanner sc = new Scanner(System.in);
		int season = sc.nextInt();
		
		String fruit = "";
			
		switch(season) {
//		case 0: fruit = "딸기"; break;
//		case 1: fruit = "수박"; break;
//		case 2: fruit = "사과"; break;
//		case 3: fruit = "귤"; break;

		case Season2.SPRING : fruit = "딸기"; break;
		case Season2.SUMMER: fruit = "수박"; break;
		case Season2.FALL: fruit = "사과"; break;
		case Season2.WINTER: fruit = "귤"; break;
		}
		
		System.out.println("계절별 과일 :" + fruit);
		
		sc.close();
	}

}
