package jse_20210308_1;

import java.io.FileReader;
import java.io.Reader;

public class ReaderSelfStudy {

	public static void main(String[] args) throws Exception {
		
		// ("C:/Temp/Test7.txt") : ������ �������� Test7.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ�� ����
		Reader reader = new FileReader("C:/Temp/Test7.txt");
		
		while(true) {
			int data = reader.read(); // �� ���ھ� �б�
			if(data == -1) { // ���� ���� �������� ���
				break;
			}
			System.out.println((char)data);
		}
		reader.close(); // �Է� ��Ʈ�� �ݴ´�

	}

}