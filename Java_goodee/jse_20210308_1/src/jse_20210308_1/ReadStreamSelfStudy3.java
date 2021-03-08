package jse_20210308_1;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadStreamSelfStudy3 {

	public static void main(String[] args) throws Exception{
		
		// 지정한 길이만큼 읽기
		
		// ("C:/Temp/Test3.db") : 데이터 출발지를 test3.db로 하는 바이트 기반 파일 입력 스트림을 생성한다
		// C:/Temp/Test3.db => OutputStrem 에서 작성된 것
		InputStream is = new FileInputStream("C:/Temp/Test3.db");
		
		// 5길이의 배열 생성
		byte[] buffer = new byte[5];
 		
		// 입력 스트림으로부터 3byte를 읽고 buffer[2],buffer[3],buffer[4]에 각각 저장한다
		int readByteNum = is.read(buffer, 2, 3); 
		
		// 읽은 바이트가 있다면
		if(readByteNum != -1) {
			// 배열 전체를 읽고 출력
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close(); // 입력 스트림을 닫는다
	}
}
