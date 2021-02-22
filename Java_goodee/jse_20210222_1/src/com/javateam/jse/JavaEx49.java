package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JavaEx49 {

	public static void main(String[] args) {
		
		// 배열 초기화
		String home[] = { "멩", "배현", "만두", "뚱보", "뗀", "무민", "코끼리", "달팽이", "달팽이", "밍키"};
		List<String> list = new ArrayList<>(); // (O)		
		list.addAll(Arrays.asList(home)); // (O)
		
		
		// shuffle() : 출력 할때 마다 배열의 요소를 무작위로 혼합한다 
		Collections.shuffle(list);		
		list.forEach(x->System.out.print(x+ " "));			
	}
}
