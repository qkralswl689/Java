package jse_20210308_1;

import java.io.FileWriter;
import java.io.Writer;

public class WriteStudySelf {

	public static void main(String[] args) throws Exception {
		
		// 한 문자씩 출력하기
		
		// ("C:/Temp/Test7.txt") : 데이터 도착지를 Test7.txt로 하는 문자 기반 파일 출력 스트림 생성
		Writer writer = new FileWriter("C:/Temp/Test7.txt");
		
		// 문자형 변수 생성
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		// 한 문자씩 출력
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush(); // 출력 버퍼에 잔류하는 모든 문자 출력
		writer.close(); // 출력 스트림을 닫는다

	}

}
