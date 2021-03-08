package jse_20210308_1;

import java.io.FileWriter;
import java.io.Writer;

public class WriteStudySelf2 {

	public static void main(String[] args) throws Exception {
		
		// 배열 전체를 출력하기
		
		// ("C:/Temp/Test8.txt") : 데이터 도착지를 Test8.txt로 하는 문자 기반 파일 출력 스트림 생성
		Writer writer = new FileWriter("C:/Temp/Test8.txt");
		
		// 문자형 배열 생성
		char[] array = {'A','B','C'};
		
		writer.write(array); // 배열의 모든 문자를 출력
		
		writer.flush(); // 출력 버퍼에 잔류하는 모든 문자를 출력
		writer.close(); // 출력 스트림을 닫음
	}
}
