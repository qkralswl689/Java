package jse_20210308_1;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExSelfStudy {

	public static void main(String[] args) throws Exception{
		
		// 1 byte�� ����ϱ�
		
		// ("C:/Temp/Test1.db") : ������ �������� test1.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ�� ����
		OutputStream os = new FileOutputStream("C:/Temp/Test1.db");
		
		// ���� ����
		byte a = 10;
		byte b = 20;
		byte c = 30;
		
		// 1byte�� ���
		os.write(a);
		os.write(b);
		os.write(c);
		
		os.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close(); // ��� ��Ʈ�� ����
	}
}