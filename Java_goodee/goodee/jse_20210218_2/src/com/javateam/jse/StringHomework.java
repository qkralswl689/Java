package com.javateam.jse;

public class StringHomework {

	public static void main(String[] args) {
		
		String str = "Just do IT! Java Developer!";
		
		String[] arr = str.split(" "); // 문자열을 " " 공백을 기준으로 각각 분리하여 배열 arr에 할당
		for(int i=0; i<arr.length;i++) { // i는0부터 배열의 길이만큼 1씩 증가하면서 반복한다
			System.out.println(arr[i]); // 배열을 출력한다
		}
		
		// 강사님 답안
		
		// 방법-1)
//		String arr[] = str.split("\\s");
//		
//		for (String s : arr) {
//			System.out.println(s);
//		}
		
//		StringTokenizer st = new StringTokenizer(str);
		
		// iterator(반복자) 패턴: 다음 요소 검색 방식
//		while (st.hasMoreTokens()) {
//			System.out.println(st.nextToken());
//		}
		
		// 방법-2)
		// System.out.println(str.replace(" ", "\n"));
//		System.out.println(str.replaceAll(" ", "\n"));
//		
//		}
//
//		}
		
	}

}
