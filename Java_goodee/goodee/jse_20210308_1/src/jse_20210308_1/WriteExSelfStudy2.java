package jse_20210308_1;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExSelfStudy2 {

	public static void main(String[] args) throws Exception{
		
		// �迭 ��ü ����ϱ�
		
		// ("C:/Temp/Test2.db") : ������ �������� test2.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ�� ����
		OutputStream os = new FileOutputStream("C:/Temp/Test2.db");
		
		// �迭����
		byte[] array = {10,20,30};
		
		// �迭�� ��� ����Ʈ�� ���
		os.write(array);
 		
		os.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close(); // ��� ��Ʈ���� �ݴ´�
	}
}