package jse_20210308_1;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExSelfStudy {

	public static void main(String[] args) throws Exception{
		
		// 1 byte씩 출력하기
		
		// ("C:/Temp/Test1.db") : 데이터 도착지를 test1.db로 하는 바이트 기반 파일 출력 스트림 생성
		OutputStream os = new FileOutputStream("C:/Temp/Test1.db");
		
		// 변수 생성
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		// 1byte씩 출력
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush(); // 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close(); // 출력 스트림 닫음
	}
}
