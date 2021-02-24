package com.javateam.jse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaEx55 {

	public static void main(String[] args) {
		
		// Map map = new HashMap(); // (O) -> @SuppressWarnings("unused")
		Map<String,String> map = new HashMap<>(); //  map 객체 생성 : HashMap 이용
		
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
		map.put("노량진", "컵밥");
		//map.put(null, "컵밥"); (O) null 쓸수있지만 좋지않다

		System.out.println("map의 크기 : " + map.size()); // 키의 중복 배제(무교,노량진)
		
		// 낱개의 요소 검색 : key를 통해 값을 가져온다
		// 중복 : 마지막에 있는 값을 불러온다 -> 값의 중복은 허용 하지만 키의 중복은 허용하지 않는다
		System.out.println("임의의 키/값 : " + map.get("무교")); 
		
		// 전체 나열(검색)
		
		// 1) EntrySet => map.Entry => 가장 복잡한 방법
		// Set<Map.Entry<String,String>> set = map.entrySet(); // (O)
//		Set<Entry<String,String>> set = map.entrySet();
//		Iterator<Entry<String,String>>it = set.iterator();
//		while(it.hasNext()) {
//			
//			Entry<String,String> keyEntry = it.next();
//			String key = keyEntry.getKey();
//			String value = keyEntry.getValue();
//			System.out.println(key + " = " + value);
//		}
		
		// 2) keySet -> 간단한다
//		Set<String> set = map.keySet();
//		Iterator<String> it = set.iterator();
//		
//		while(it.hasNext()) {
//			String key = it.next();
//			String value = map.get(key);
//			System.out.println(key + "=" + value);
//		}

		// 3) forEach => 간단하다 k,v : 변수 할당 안해도 된다 
//		map.forEach((k,v)->System.out.println(k + "=" + v));

		// 4) entrySet.forEach => 가장 간단하다 = 도 자동으로 넣어준다
		// map.entrySet().forEach(x->System.out.println(x)); (O)
		// map.entrySet().forEach(System.out::println); // (O)
		
		// 5) keySet : k -> 다른 단어나 알파벳으로 해도 된다
		map.keySet().forEach(k->System.out.println(k+"="+map.get(k)));	
	}

}
