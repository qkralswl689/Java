package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class JavaEx47 {

	public static void main(String[] args) {
		
		// 배열 초기화
		String home[] = { "멩", "배현", "만두", "뚱보", "뗀", "무민", "코끼리", "달팽이", "달팽이", "밍키"};
		List<String> list = new ArrayList<>(); // (O)		
		
		list.addAll(Arrays.asList(home)); // (O)
		list.add("뿌웅");
		list.set(2, "뿡빵"); // set : 선택한 인덱스에 요소 삽입
		
		// 정렬(sorting,ordering) 
		
		// list.sort(Comparator.naturalOrder()); // since java 1.8
		// 자연 정렬(오름차순(ascending)정렬) : 코드순(ex.UTF-8)으로 정렬
		
		// list.sort(Comparator.reverseOrder()); // since java 1.8
		// 내림차순(desending) 정렬 : 코드 역순 정렬
		
		// 옛날 방식 : Collections 사용 => 호환성이 좋다
		// Collections.sort(list); // 오름차순 정렬
		
		// 익명클래스 compareTo 사용		
//		Collections.sort(list, new Comparator<String>() { 
//
//			@Override
//			public int compare(String o1, String o2) {
//				// return o1.compareTo(o2); // 오름차순
//				return o2.compareTo(o1); // 내림차순
//			}			
//		});
				
		// list.forEach(e->System.out.print(e + " ")); // (O)
		
		// 리스트 -> 스트림으로 치환 : 더이상 리스트가 아니다
		//list.stream().sorted().forEach(e->System.out.print(e + " ")); // 오름차순
		// list.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e + " "));
		// 내림차순
		
		
		// compareTo : 원래는 익명 클래스 but 한줄로 작성
		//list.sort((x1,x2)->x1.compareTo(x2)); // 오름차순
		list.sort((x1,x2)->x2.compareTo(x1)); // 내림차순
		list.forEach(x->System.out.print(x + " ")); 
		
	
		
	}

}
