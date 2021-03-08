    package jse_20210308_1;

    import java.io.FileReader;
    import java.io.Reader;

    public class ReaderSelfStudy2 {

        public static void main(String[] args) throws Exception {
            
            // ("C:/Temp/Test8.txt") : ������ �������� Test8.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ�� ����
            Reader reader = new FileReader("C:/Temp/Test8.txt");
            
            // ���� 100�� �迭 ����
            char[] buffer = new char[100];
            
            while(true) {
                int readCharNum = reader.read(buffer); // �迭 ���̸�ŭ �б�
                if(readCharNum == -1) { // ���� ���� �������� ���
                    break;
                }
                
                // ���� ���� ����ŭ �ݺ��ϸ鼭 �迭�� ����� ���ڸ� ���
                for(int i=0; i<readCharNum; i++) {
                    System.out.println(buffer[i]);
                }
            reader.close(); // �Է� ��Ʈ�� �ݴ´�
            }
        }
    }