    package jse_20210308_1;

    import java.io.FileReader;
    import java.io.Reader;

    public class ReaderSelfStudy3 {

        public static void main(String[] args) throws Exception {
            
            // ("C:/Temp/Test9.txt") : ������ �������� Test9.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ�� ����
            Reader reader = new FileReader("C:/Temp/Test9.txt");
            
            // ���� 5�� �迭 ����
            char[] buffer = new char[5];
            
            // �Է½�Ʈ�����κ��� 3���� ���ڸ� �а� buffer[2],buffer[3],buffer[4]�� ���� �����Ѵ�
            int readCharNum = reader.read(buffer, 2,3);
            if(readCharNum != -1) { // ���� ���ڰ� �ִٸ�
            	// �迭 ��ü�� �а� ���
            	for(int i =0; i<buffer.length; i++) {
            		System.out.println(buffer[i]);
            	}
            }
            reader.close(); // �Է� ��Ʈ���� ����
        }
    }
