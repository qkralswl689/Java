package com.javateam.jse;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaEx52 {

	public static void main(String[] args) {

		// @SuppressWarnings("rawtypes") // 경고 메세지를 무시하도록 조치
		
		//Set set = new HashSet();		
		//Set<String> set = new HashSet<String>(); // (O)
		Set<String> set = new HashSet<>(); // (O)

		// 요소 추가
		set.add("미니");
		set.add("배현");
		set.add("밍키");
		set.add("신호");
		set.add("꾸십");
		set.add("뚱보");
		set.add("멩");
		set.add("달팽");
		set.add("코끼리");
		set.add("꾸십");
		set.add("멩");
		
		// 중복을 허용하지 않는다
		// System.out.println("set의 크기 : " + set.size());
		
		
		// 전체 나열 : 연번(index)가 부재 => 다음 검색 방식(반복자 패턴)
		
		// 1) for문 이용
		System.out.print("set 전체 요소  : ");
		for(String s : set) {
			System.out.print( s+" ");
		}
		
		// 2) Iterator , while 이용
//		Iterator<String> it = set.iterator();
//		while(it.hasNext()) {
//			System.out.print(it.next() + " ");
//		}
		
		System.out.println();
		// 요소 삭제
		set.remove("멩");
		System.out.print("'멩' 요소 삭제 후 set : ");
		set.forEach(x->System.out.print( x + " "));
		
		System.out.println();
		// 요소 존재 여부 확인
		System.out.println("요소 존재 여부 : " + set.contains("코끼리"));		
		
		// 요소 전체 삭제
		set.clear();
		
		System.out.println("요소 전체 삭제 후 set의 크기 : " + set.size());
		
		
		 //set -> 배열 지환(변환)
		
		//1) Object 이용
		//Object setArr[] = set.toArray();		
		//System.out.println(setArr[0]);
		
		//2) string 이용
//		String setArr2[] = new String[set.size()];
//		setArr2 = set.toArray(setArr2);
//		
//		System.out.println(setArr2[0]);
	}

}
