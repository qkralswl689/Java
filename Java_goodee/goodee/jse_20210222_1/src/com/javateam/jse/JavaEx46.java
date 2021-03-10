package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaEx46 {

	public static void main(String[] args) {
		
		// 배열 초기화
		String home[] = { "멩", "배현", "만두", "뚱보", "뗀", "무민", "코끼리", "달팽이", "달팽이", "밍키"};
		List<String> list = new ArrayList<>(); // (O)		
		// List<String> list = new LinkedList<>(); // 삽입/삭제가 많은 리스트 만들 때 
		
	
//		// 배열 => 리스트(List)로 치환
//		list = Arrays.asList(home);		
		
		// 배열을 리스트로 치환했을 때 바로 요소 추가 할 경우 예외가 발생한다
		// java.lang.UnsupportedOperationException 예외 발생
		// list.add("뿡뿡"); 
		
		// 배열을 리스트로 치환했을 때 요소 추가방법 
		// list.addAll(home); // (X) 컬렉션이 아니기 때문에 에러
		list.addAll(Arrays.asList(home)); // (O)
		list.add("뿌웅");
		list.set(2, "뿡빵"); // set : 선택한 인덱스에 요소 삽입
		
		// 주의) ArrayList는 (중간)삽입(끼어들기)/삭제시에는 성능이
		// LinkedList에 비해 떨어진다 => 삽입/삭제 빈번한 리스트(ex: 음악순위,영화순위 등) 
		// => LinkedList 권장 (삽입/삭제가 많은 리스트에 최적화(전문화))	
		
		list.forEach(e->System.out.print(e + " ")); // (O)
		
	}

}
