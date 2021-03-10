package com.javateam.jse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class JavaEx58 {

	public static void main(String[] args) {

		// NavigableMap 기본 : 키(key)중심으로 오름차순 정렬 된다
		NavigableMap<String,String> map = new TreeMap<>();

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
		
		// .keySet() : key들만 출력
		//map.keySet().forEach(System.out::println);
		
		// .values() : value들만 출력
		//map.values().forEach(System.out::println);
		
		// .containsKey() : key 존재 여부 확인 -> true,false로 출력
		//System.out.println(map.containsKey("노량진"));
		
		// .containsValue : value 존재 여부 확인 -> true,false로 출력
		//System.out.println(map.containsValue("순대"));
		
		// 첫/마지막 요소 키 출력
		//System.out.println(map.firstKey());
		//System.out.println(map.lastKey());
		
		// .remove() : key 삭제
		//map.remove("노량진");
		//map.forEach((k,v)->System.out.println(k + " = " + v));
		
		
		// 여러 요소 삽입
		// putAll : map에 다른 map을 넣는것
		Map<String,String> map2 = new TreeMap<>();
		map2.put("수원","통닭");
		map2.put("우리집","집밥");
		
		map.putAll(map2); // map 에 map2를 넣는다
		map.forEach((k,v)->System.out.println(k + " = " + v));

	}

}
