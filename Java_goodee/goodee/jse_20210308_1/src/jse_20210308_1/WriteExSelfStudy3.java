package jse_20210308_1;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExSelfStudy3 {

	public static void main(String[] args) throws Exception{
		
		// �迭 �Ϻ� ����ϱ�
		
		// ("C:/Temp/Test3.db") : ������ �������� test3.db�� �ϴ� ����Ʈ ��� ���� ��� ��Ʈ�� ����
		OutputStream os = new FileOutputStream("C:/Temp/Test3.db");
		
		// �迭����
		byte[] array = {10,20,30,40,50};
		
		// �迭�� 1�� �ε������� 3���� ��� => 3�� ��¿� ���� X
		os.write(array,1,3);
 		
		os.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ����Ʈ�� ���
		os.close(); // ��� ��Ʈ���� �ݴ´�
	}
}