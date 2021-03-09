package jse_20210308_1;

import java.io.FileWriter;
import java.io.Writer;

public class WriteStudySelf4 {

	public static void main(String[] args) throws Exception {
		
		// 문자열 출력하기
		
		// ("C:/Temp/Test10.txt") : 데이터 도착지를 Test10.txt로 하는 문자 기반 파일 출력 스트림 생성
		Writer writer = new FileWriter("C:/Temp/Test10.txt");
		
		// 문자열 생성
		String str = "ABC";
		
		writer.write(str); // 문자열 전체를 출력
		
		writer.flush(); // 출력 버퍼에 잔류하는 모든 문자열을 출력
		writer.close(); // 출력 스트림을 닫는다		
	}
}
