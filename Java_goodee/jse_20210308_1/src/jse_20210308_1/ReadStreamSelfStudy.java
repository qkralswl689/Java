package jse_20210308_1;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadStreamSelfStudy {

	public static void main(String[] args) throws Exception{
		
		// 1byte씩 읽기
		
		// ("C:/Temp/Test1.db") : 데이터 출발지를 test1.db로 하는 바이트 기반 파일 입력 스트림을 생성한다
		// C:/Temp/Test1.db => OutputStrem 에서 작성된 것
		InputStream is = new FileInputStream("C:/Temp/Test1.db");
		
		while(true) {
			// data가 is.read() 일경우 반복
			int data = is.read(); // 1byte씩 읽기
			
			// data가 -1일 경우 브레이크
			if(data == -1) {
				break; // 파일 끝에 도달했을 경우
			}			
			System.out.println(data);
		}
		is.close(); // 입력스트림을 닫는다		
	}
}
