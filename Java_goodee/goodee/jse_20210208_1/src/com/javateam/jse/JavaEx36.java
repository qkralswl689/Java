package com.javateam.jse;
import java.util.*;
public class JavaEx36 {

	public static void main(String[] args) {
		
		System.out.print("���� : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		Season4 season = Season4.valueOf(input);		
		String fruit = "";
			
		switch(season.name()) {

		case "��" : fruit = "����"; break;
		case "����" : fruit = "����"; break;
		case "����" : fruit = "���"; break;
		case "�ܿ�" : fruit = "��"; break;
		}
		
		System.out.println("������ ���� :" + fruit);
		
		sc.close();
	}

}
