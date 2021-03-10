package com.javateam.jse;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class JavaEx54 {

	public static void main(String[] args) {

		
		// Set<String> set = new HashSet<>(); // (O)
		
		// TreeSet : 기본적으로 오름차순 정렬 지원
		// Set<String> set = new TreeSet<>(); 
		// TreeSet<String> set = new TreeSet<>();
		
		// SortedSet : 기본적으로 오름차순 정렬 지원
		// SortedSet<String> set = new TreeSet<>(); 
		
		// NavigableSet : 기본적으로 오름차순 정렬 지원
		NavigableSet<String> set = new TreeSet<>(); 

		// 요소 추가
		String sosa[] = {"미니","배현","밍키","신호","꾸십","뚱보","멩","달팽","코끼리","꾸십","멩"};
		
			
		// 배열 요소 한꺼번에 추가 : 배열 => 리스트(List) => 셋(set) : 이중 치환
		set.addAll(Arrays.asList(sosa));
		
		// 내림차순(descending) 정렬(sotrint/ordering)
		
		// 1) .descendingSet() : 셋(Set) 자체를 내림차순화 한다
		// set = set.descendingSet();
		//set.forEach(x->System.out.print(x + " "));
		
		// 2) Iterator : 내림차순이 지원되는 반복자 패턴 활용 
//		Iterator<String> it = set.descendingIterator();
//		while(it.hasNext()) {
//			System.out.print(it.next() + " ");
//		}
		
		// stream 치환 => 정렬  
		// 오름차순
		//set.stream().sorted(Comparator.naturalOrder()).forEach(x->System.out.print(x + " ")); 
		// 내림차순
		//set.stream().sorted(Comparator.reverseOrder()).forEach(x->System.out.print(x + " "));
		
			
		// 일부분 추출
		// subSet : 선택한 요소의 앞에있는 요소 출력 -> true 추가시 선택한 요소도 함께 출력된다
		// set.subSet("꾸십",true,"멩",true).forEach(x->System.out.print(x + " "));
		//set.subSet("바보",true,"안뇽",true).forEach(x->System.out.print(x + " "));

		//set.headSet("배현",true).forEach(x->System.out.print(x + " "));
		
		//set.tailSet("배현",false).forEach(x->System.out.print(x + " "));
		
		// 첫번째/마지막 요소 추출
		System.out.println("첫 요소 : " + set.first());
		System.out.println("마지막 요소 : " + set.last());
	}

}
