package jse_20210308_1;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadStreamSelfStudy3 {

	public static void main(String[] args) throws Exception{
		
		// ������ ���̸�ŭ �б�
		
		// ("C:/Temp/Test3.db") : ������ ������� test3.db�� �ϴ� ����Ʈ ��� ���� �Է� ��Ʈ���� �����Ѵ�
		// C:/Temp/Test3.db => OutputStrem ���� �ۼ��� ��
		InputStream is = new FileInputStream("C:/Temp/Test3.db");
		
		// 5������ �迭 ����
		byte[] buffer = new byte[5];
 		
		// �Է� ��Ʈ�����κ��� 3byte�� �а� buffer[2],buffer[3],buffer[4]�� ���� �����Ѵ�
		int readByteNum = is.read(buffer, 2, 3); 
		
		// ���� ����Ʈ�� �ִٸ�
		if(readByteNum != -1) {
			// �迭 ��ü�� �а� ���
			for(int i=0; i<buffer.length; i++) {
				System.out.println(buffer[i]);
			}
		}
		is.close(); // �Է� ��Ʈ���� �ݴ´�
	}
}
