package jse_20210308_1;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadStreamSelfStudy2 {

	public static void main(String[] args) throws Exception{
		
		// �迭 ���̸�ŭ �б�
		
		// ("C:/Temp/Test2.db") : ������ ������� test2.db�� �ϴ� ����Ʈ ��� ���� �Է� ��Ʈ���� �����Ѵ�
		// C:/Temp/Test2.db => OutputStrem ���� �ۼ��� ��
		InputStream is = new FileInputStream("C:/Temp/Test2.db");
		
		// ���� 100�� �迭 �����Ѵ�
		byte[] buffer = new byte[100];
		
		while(true) {
			int readByteNum = is.read(buffer); // �迭 ���̸�ŭ �б�
			
			// ���� ���� ����������� �극��ũ
			if(readByteNum == -1) {
				break;
			}
			
			// ���� ����Ʈ ����ŭ �ݺ��ϸ鼭 �迭�� ����� ����Ʈ�� ���
			for(int i=0;i<readByteNum; i++) {
				System.out.println(buffer[i]);
			}
			
			is.close(); // �Է� ��Ʈ���� ����
		}
	}
}