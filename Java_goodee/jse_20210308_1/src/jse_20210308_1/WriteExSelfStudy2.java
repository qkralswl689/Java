package jse_20210308_1;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExSelfStudy2 {

	public static void main(String[] args) throws Exception{
		
		// 배열 전체 출력하기
		
		// ("C:/Temp/Test2.db") : 데이터 도착지를 test2.db로 하는 바이트 기반 파일 출력 스트림 생성
		OutputStream os = new FileOutputStream("C:/Temp/Test2.db");
		
		// 배열생성
		byte[] array = {10,20,30};
		
		// 배열의 모든 바이트를 출력
		os.write(array);
 		
		os.flush(); // 출력 버퍼에 잔류하는 모든 바이트를 출력
		os.close(); // 출력 스트림을 닫는다
	}
}
