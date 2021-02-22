package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JavaEx50 {

	public static void main(String[] args) {
		
		// 배열 초기화
		String home[] = { "멩", "배현", "만두", "뚱보", "뗀", "무민", "코끼리", "달팽이", "달팽이", "밍키"};
		List<String> list = new ArrayList<>(); // (O)		
		list.addAll(Arrays.asList(home)); // (O)
		
		
		// list -> stream 치환(~화)
		// distinct() : 중복 배제
		//list.stream().distinct().forEach(x->System.out.print(x + " "));
		
		// filter() : 특정 조건 검색
		//list.stream().distinct().filter(x->x.contains("달")).forEach(x->System.out.print(x + " "));
		
		// sorted(Comparator.reverseOrder()) : 역순 정렬
		list.stream().distinct().sorted(Comparator.reverseOrder())
							.forEach(x->System.out.print(x + " "));

	}

}
