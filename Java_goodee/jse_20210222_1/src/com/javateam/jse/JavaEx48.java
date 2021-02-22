package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JavaEx48 {

	public static void main(String[] args) {
		
		// 배열 초기화
		String home[] = { "멩", "배현", "만두", "뚱보", "뗀", "무민", "코끼리", "달팽이", "달팽이", "밍키"};
		List<String> list = new ArrayList<>(); // (O)		
		
		list.addAll(Arrays.asList(home)); // (O)
		
		// 요소 존재 여부 확인 contains => 띄어쓰기 제거해야한다 -> trim() 사용
		//System.out.println("요소 존재 여부 :" + list.contains("배현".trim()));
		
		// 요소가 위치하고있는 인덱스 번호 출력 : indexOf => 중복된 요소가 있을경우 앞에 위치한 요소의번호 출력된다
		//System.out.println("특정 요소의 index : " + list.indexOf("만두"));
		//System.out.println("중복된 요소의 index : " + list.indexOf("달팽이"));
		
		
		// 리스트의 요소 존재 여부 확인 : isEmpty() => true or false 로 반환
		//list.clear();		
		//System.out.println("리스트 요소 존재 여부 : " + list.isEmpty());
		
		// 중복된 요소의 마지막 인덱스 반환 : lastIndexOf
		//System.out.println("(중복)특정 요소의 마지막 요소의 index :  " + list.lastIndexOf("달팽이"));
		
		// listIterator() : 리스트 요소 나열 ,정렬 X
		// list.listIterator();
		
		// 리스트 요소 역순 나열,정렬 X
//		ListIterator<String> lit = list.listIterator(list.size());
//		while(lit.hasPrevious()) {
//			System.out.print(lit.previous()+ " ");
//		}
		
		// subList : 요소 일부분 추출 -> 마지막 인덱스 요소는 제외 하고 출력된다
		// 주의) toIndex =>미포함(기본값)
		//list.subList(0, 3).forEach(x->System.out.print(x + " "));
		
		// 리스트(List) => 배열로 치환
		// 방법 1) object배열 생성 하여 치환
//		Object  otherHome[] = new Object[list.size()];
//		otherHome = list.toArray();
//		System.out.println("otherHome 첫번째 요소 : " + otherHome[0]);
//		for(Object s : otherHome) {
//			System.out.print( s + " ");
//		}
		
		// 방법 2) String배열 생성 하여 치환
		String otherHome[] = new String[list.size()];
		otherHome = list.toArray(otherHome);
		for(String s : otherHome) {
			System.out.print(s + " ");
		}
	}

}
