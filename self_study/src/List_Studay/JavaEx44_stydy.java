package List_Studay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaEx44_stydy {

	public static void main(String[] args) {
		

		// 1) 리스트 객체 생성
		List<String> list = new ArrayList<>();
		
		// 2) 요소 추가
		list.add("미라");
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
		
		// * 요소 출력 
		System.out.print("요소 출력 "+ Arrays.asList(list));

		System.out.println();
		// 3) 리스트 길이 확인
		System.out.println(list.size());
		
		// 4) 리스트의 첫번째 요소 출력
		System.out.println(list.get(3));
		
		// 5) 리스트의 마지막 요소 출력
		System.out.println(list.get(list.size()-1));

		// 6) 요소 삭제
		list.remove(0);
		System.out.println("요소 삭제 후 리스트의 크기 (길이) : " + list.size());
		
		// 7) 중목된 요소 삭제
		list.remove("달팽이");
		System.out.print("달팽이 요소 1개 삭제 후 리스트 : "+Arrays.asList(list));
		
		System.out.println();
		// 8) List 요소 전체 삭제
		list.clear();
		System.out.println("요소 전체 삭제 후 리스트의 크기(길이) : " +list.size());
	
	}

}
