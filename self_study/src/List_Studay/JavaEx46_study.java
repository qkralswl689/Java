package List_Studay;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class JavaEx46_study {

	public static void main(String[] args) {
		
		// 배열 초기화
		String home[] = { "멩", "배현", "만두", "뚱보", "뗀", "무민", "코끼리", "달팽이", "달팽이", "밍키"};
		List<String> list = new ArrayList<>();
		
		// 1) 배열 => 리스트로 치환
		//list = Arrays.asList(home);
		//list.forEach(x->System.out.print(x + " "));
		//System.out.println();
		
		// 2) 배열을 리스트로 치환했을 때 요소 추가
		
		list.addAll(Arrays.asList(home));
		list.add("뿡");
		list.set(1, "190");
		
		list.forEach(x->System.out.print(x + " "));

	}

}
