    package jse_20210308_1;

    import java.io.FileReader;
    import java.io.Reader;

    public class ReaderSelfStudy2 {

        public static void main(String[] args) throws Exception {
            
            // ("C:/Temp/Test8.txt") : 데이터 도착지를 Test8.txt로 하는 문자 기반 파일 출력 스트림 생성
            Reader reader = new FileReader("C:/Temp/Test8.txt");
            
            // 길이 100인 배열 생성
            char[] buffer = new char[100];
            
            while(true) {
                int readCharNum = reader.read(buffer); // 배열 길이만큼 읽기
                if(readCharNum == -1) { // 파일 끝에 도달했을 경우
                    break;
                }
                
                // 읽은 문자 수만큼 반복하면서 배열에 저장된 문자를 출력
                for(int i=0; i<readCharNum; i++) {
                    System.out.println(buffer[i]);
                }
            reader.close(); // 입력 스트림 닫는다
            }
        }
    }
