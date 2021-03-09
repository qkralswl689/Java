package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Test_5 {

	public static void main(String[] args) {

		// 1)
		String fruits[] = {"»ç°ú", "µþ±â", "¹è", "º¹¼þ¾Æ", "Æ÷µµ", "±Ö" };		
		// 2)
		List<String> list = new ArrayList<>();		
		// 3)
		list = Arrays.asList(fruits);		
		// 4)
		list.addAll(Arrays.asList(fruits));		
		// 5)
		list.sort(Comparator.naturalOrder());	
		// 6)
		list.subList(0,3).forEach(x->System.out.print(x + " "));

	}

}
