package jse_20210308_1;

import java.io.FileWriter;
import java.io.Writer;

public class WriteStudySelf4 {

	public static void main(String[] args) throws Exception {
		
		// ���ڿ� ����ϱ�
		
		// ("C:/Temp/Test10.txt") : ������ �������� Test10.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ�� ����
		Writer writer = new FileWriter("C:/Temp/Test10.txt");
		
		// ���ڿ� ����
		String str = "ABC";
		
		writer.write(str); // ���ڿ� ��ü�� ���
		
		writer.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ���ڿ��� ���
		writer.close(); // ��� ��Ʈ���� �ݴ´�		
	}
}