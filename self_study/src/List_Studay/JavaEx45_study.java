package List_Studay;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaEx45_study {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>(); // (O)
	
		list.add("멩");
		list.add("배현");
		list.add("만두");
		list.add("뚱보");
		list.add("뗀");
		list.add("무민");
		list.add("코끼리");
		list.add("달팽이"); 
		list.add("달팽이"); 
		list.add("밍키");
		
		// 1) 리스트 요소 전체 나열 : for문 
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		// 2) 리스트 요소 전체 나열  : forEach문 
		for(String s : list) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		// 3) 리스트 요소 전체 나열  : iterator,while 
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}

		System.out.println();
		// 4) 리스트 요소 전체 나열 : forEach => 함수형  프로그래밍(람다(lambda)대수 프로그래밍 방식)
		list.forEach(x->System.out.print(x + " "));
		
	}
	

}
