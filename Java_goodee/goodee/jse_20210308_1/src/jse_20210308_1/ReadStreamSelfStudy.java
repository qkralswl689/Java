package jse_20210308_1;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadStreamSelfStudy {

	public static void main(String[] args) throws Exception{
		
		// 1byte�� �б�
		
		// ("C:/Temp/Test1.db") : ������ ������� test1.db�� �ϴ� ����Ʈ ��� ���� �Է� ��Ʈ���� �����Ѵ�
		// C:/Temp/Test1.db => OutputStrem ���� �ۼ��� ��
		InputStream is = new FileInputStream("C:/Temp/Test1.db");
		
		while(true) {
			// data�� is.read() �ϰ�� �ݺ�
			int data = is.read(); // 1byte�� �б�
			
			// data�� -1�� ��� �극��ũ
			if(data == -1) {
				break; // ���� ���� �������� ���
			}			
			System.out.println(data);
		}
		is.close(); // �Է½�Ʈ���� �ݴ´�		
	}
}