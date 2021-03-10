package com.javateam.jse;
import java.util.*;
public class JavaEx36 {

	public static void main(String[] args) {
		
		System.out.print("계절 : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Season4 season = Season4.valueOf(input);		
		String fruit = "";
			
		switch(season.name()) {

		case "봄" : fruit = "딸기"; break;
		case "여름" : fruit = "수박"; break;
		case "가을" : fruit = "사과"; break;
		case "겨울" : fruit = "귤"; break;
		}
		
		System.out.println("계절별 과일 :" + fruit);
		
		sc.close();
	}

}
