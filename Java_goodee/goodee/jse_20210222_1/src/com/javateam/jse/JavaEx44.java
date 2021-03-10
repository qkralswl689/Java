package com.javateam.jse;

import java.util.ArrayList;
import java.util.List;

public class JavaEx44 {

	public static void main(String[] args) {
		
		//List list = new ArrayList(); // 리스트 객체 생성(선언) , 리스트 : 인터페이스 
		
		// 제네릭스(Generics) : 타입(참조 자료형) 인자
		// <E> : Element(요소) => String
		// ex) String arr[] = new String[10];
		// List<String> list = new ArrayList<String>(); // (O)
		List<String> list = new ArrayList<>(); // (O)
		//List<? extends String> list = new ArrayList<>(); // 경우에 맞게 적용(O)
		//List<?> list = new ArrayList<>(); // 경우에 맞게 적용(O)
		// List<> list = new ArrayList<>(); // (X)
		// List<> list = new ArrayList<String>(); // (X)


		// 요소(element) 추가
		// list.add(1); // (X) 요소 => String 이므로 
		// list.add(1.0); // (X) 요소 => String 이므로 
		// list.add(1+""); // (O) 요소 => String 변환(casting)
		// 요소의 중복을 허용한다
		// 가변 배열
		list.add("멩");
		list.add("배현");
		list.add("만두");
		list.add("뚱보");
		list.add("뗀");
		list.add("무민");
		list.add("코끼리");
		list.add("달팽이"); // 중복
		list.add("달팽이"); // 중복
		list.add("밍키");
		
		System.out.print("리스트 전체 요소 : ");
		for(String s : list) {
		System.out.print(s + ", ");
		}System.out.println();
		System.out.println("리스트의 크기 (길이) : " + list.size()); 		
		System.out.println("리스트의 첫번째 요소 : "+ list.get(0));	
		System.out.println("리스트의 두번째 요소 : "+ list.get(1));		
		System.out.println("리스트의 마지막 요소 : "+list.get(list.size()-1));
		
		// 요소의 삭제	
		list.remove(1); // 인덱스로 삭제
		
		System.out.println("요소 삭제 후 리스트의 크기 (길이) : " + list.size());
		System.out.println("요소 삭제 후 리스트의 두번째 요소 : "+ list.get(1));
		
		list.remove("달팽이"); // 중복된 요소 삭제시 1개만 삭제됨	
		System.out.println("요소 '달팽이'삭제 후 리스트의 크기 (길이) : " + list.size());

		// List의 요소 전체 삭제 => 리스트 객체 삭제가 아니라 "요소" 삭제 => add로 다시 요소 넣을수 있다
		list.clear();
		System.out.println("요소 전체 삭제 후 리스트의 크기(길이) : " + list.size());
		
		list.add("달퐁이");
		System.out.println("요소 '달퐁이' 추가 후 리스트의 크기(길이) : " + list.size());
		
	}

}
