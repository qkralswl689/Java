package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

public class JavaEx51 {

	public static void main(String[] args) {
		
		// 배열 초기화
		String home[] = { "멩", "배현", "만두", "뚱보", "뗀", "무민", "코끼리", "달팽이", "달팽이", "밍키"};
		
		Queue<String> qu = new LinkedList<>();
		qu.addAll(Arrays.asList(home));
		
		// Queue : FIFO(First In First Out)
		// 리스트의 한 쪽 끝에서는 자료가 삽입되고 다른 한 쪽에서는 자료가 삭제되는 구조
		//qu.forEach(x->System.out.print(x+ " "));
		
		System.out.println("--------------------");
		
		// Stack : LIFO(Last In First Out)
		// 자료의 삽입과 삭제가 한쪽 끝에서만 일어나는 구조
		Stack<String> st = new Stack<>();
		// st.addAll(Arrays.asList(home));
		
		// 요소를 0번 인덱스 자리에  추가
		st.push("안농");
		st.push("반가워");
		
		 System.out.println("크기 : " + st.size());
		 while (!st.isEmpty()) {
			 System.out.print(st.pop() + " ");
		 }			
	}
}
