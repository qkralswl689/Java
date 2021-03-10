    package jse_20210308_1;

    import java.io.FileReader;
    import java.io.Reader;

    public class ReaderSelfStudy3 {

        public static void main(String[] args) throws Exception {
            
            // ("C:/Temp/Test9.txt") : 데이터 도착지를 Test9.txt로 하는 문자 기반 파일 출력 스트림 생성
            Reader reader = new FileReader("C:/Temp/Test9.txt");
            
            // 길이 5인 배열 생성
            char[] buffer = new char[5];
            
            // 입력스트림으로부터 3개의 문자를 읽고 buffer[2],buffer[3],buffer[4]에 각각 저장한다
            int readCharNum = reader.read(buffer, 2,3);
            if(readCharNum != -1) { // 읽은 문자가 있다면
            	// 배열 전체를 읽고 출력
            	for(int i =0; i<buffer.length; i++) {
            		System.out.println(buffer[i]);
            	}
            }
            reader.close(); // 입력 스트림을 닫음
        }
    }
