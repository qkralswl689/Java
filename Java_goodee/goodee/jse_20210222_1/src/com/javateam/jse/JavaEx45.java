package com.javateam.jse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaEx45 {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>(); // (O)
	
		list.add("멩");
		list.add("배현");
		list.add("만두");
		list.add("뚱보");
		list.add("뗀");
		list.add("무민");
		list.add("코끼리");
		list.add("달팽이"); 
		list.add("달팽이"); 
		list.add("밍키");
		
		// 리스트 요소 전체 나열 1) 
		// for 문 이용
//		for(int i=0; i<list.size(); i++) {
//			System.out.print(list.get(i) + ", ");
//		}
		
		// 리스트 요소 전체 나열 2) 
		// iterator(반복자) 패턴 방식 : 다음 요소 검색 방식
		// for-each문 사용
//		for(String s : list) {
//			System.out.print(s + ", ");
//		}
		
		// 리스트 요소 전체 나열 3) 
		// iterator(반복자) 패턴 방식 : 다음 요소 검색 방식  (오리지널)
//		Iterator<String> it = list.iterator();
		
		// while문 이용
//		while(it.hasNext()) {
//			System.out.print(it.next() + ", ");
//		}
		
		// for문 이용 => ; 꼭 붙혀야 한다 
//		for(;it.hasNext();) {
//			System.out.print(it.next() + ", ");
//		}
		
		// 리스트 요소 전체 나열 4) 
		// forEach => 함수형  프로그래밍(람다(lambda)대수 프로그래밍 방식)
//		list.forEach(x->System.out.print(x + ", ")); // (O)
		
		list.forEach(System.out::print); // (O) 위보다 간결하게 but 띄어쓰기 못한다 => 기본인자만 사용가능
		list.forEach(System.out::println); // (O)
		// list.forEach(System.out::println("A")); // (X) (추가되는)인자 쓰면 안된다
		


	}

}
