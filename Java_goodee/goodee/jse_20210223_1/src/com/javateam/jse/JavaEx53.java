package com.javateam.jse;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaEx53 {

	public static void main(String[] args) {

		
		Set<String> set = new HashSet<>(); // (O)

		// 요소 추가
		String sosa[] = {"미니","배현","밍키","신호","꾸십","뚱보","멩","달팽","코끼리","꾸십","멩"};
		
		// 위의 배열에서 일부만  유닛배열 생성
		String sosaUnit[] = {"신호","꾸십","미니"};
		
		// 배열 요소 한꺼번에 추가 : 배열 => 리스트(List) => 셋(set) : 이중 치환
		set.addAll(Arrays.asList(sosa));
		
		// retainAll() : 요소 포함 확인 => set의  요소,크기 변경(요소 추가,삭제 시)
		System.out.println("요소(들) 포함 여부 확인 : "+set.retainAll(Arrays.asList(sosaUnit)));
		
		// 배열 요소 한꺼번에 삭제
		//set.removeAll(Arrays.asList(sosa));
		
		// 유닛 배열 삭제
		// set.removeAll(Arrays.asList(sosaUnit));
	
		
		System.out.println("set의 크기 : " + set.size());
		set.forEach(x->System.out.print(x + " "));
		
		
	
	}

}
