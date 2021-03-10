package com.javateam.jse;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class JavaEx57 {

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
		
		// 일부분 추출
		// .subMap(시작 기준key값, 마지막 기준key값)이용 
		// 장충(마지막 기준 키값) 포함 안돼서 출력된다
		// map.subMap("마포", "장충").forEach((k,v)->System.out.println(k + "= " + v));

		// 장충(마지막 기준 키값) 포함해서 출력하려면 true 사용 
		// map.subMap("마포",true, "장충",true).forEach((k,v)->System.out.println(k + "= " + v));
		
		// .headMap(기준key값) : 기준 키값 앞에 있는값 가져온다
		// map.headMap("마포").forEach((k,v)->System.out.println(k + "= " + v));
		// 기준 키값 포함해서 앞에 있는값 가져온다
		//map.headMap("마포",true).forEach((k,v)->System.out.println(k + "= " + v));

		// 기준 키값 뒤에 있는값 가져온다
		map.tailMap("마포").forEach((k,v)->System.out.println(k + "= " + v));		
		
	}

}
