package com.javateam.jse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class JavaEx56 {

	public static void main(String[] args) {
		
		// Map<String,String> map = new HashMap<>(); // map 객체 생성 : HashMap 이용
		// Map<String,String> map = new TreeMap<>(); // map 객체 생성 : TreeMap이용
		
		// SortedMap 기본 : 키(key)중심으로 오름차순 정렬 된다
		// SortedMap<String,String> map = new TreeMap<>();
		// ** SortedMap 위에 NavigableMap 이 있다
		// NavigableMap 기본 : 키(key)중심으로 오름차순 정렬 된다
		NavigableMap<String,String> map = new TreeMap<>();
		//TreeMap<String,String> map = new TreeMap<>(); // (O)
	
		// 요소 추가
		map.put("신당","떡볶이");
		map.put("무교", "낙지볶음");
		map.put("신림", "순대");
		map.put("마장","육고기");
		map.put("응암", "감자탕");
		map.put("마포", "갈비");
		map.put("장충", "족발");
		map.put("의정부", "부대찌개");
		map.put("노량진", "회");
		map.put("무교", "설렁탕");
		
		// 전체 나열(검색)
		//map.entrySet().forEach(System.out::println);

		// 내림차순(descending) 정렬(sorting/ordering) -> NavigableMap
		
		// map.descendingKeySet() : map 은 오름차순이 유지된 상태에서 set만 내림차순으로 바꿔주는것
		// map.descendingKeySet().forEach(k->System.out.println(k + " = " + map.get(k)));
		
		// map.descendingMap() : map자체를 내림차순 되는 맵으로 바꿔준다
		map.descendingMap().forEach((k,v)->System.out.println(k + "=" + v));
	}

}
