package jse_20210308_1;

import java.io.FileWriter;
import java.io.Writer;

public class WriteStudySelf {

	public static void main(String[] args) throws Exception {
		
		// �� ���ھ� ����ϱ�
		
		// ("C:/Temp/Test7.txt") : ������ �������� Test7.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ�� ����
		Writer writer = new FileWriter("C:/Temp/Test7.txt");
		
		// ������ ���� ����
		char a = 'A';
		char b = 'B';
		char c = 'C';
		
		// �� ���ھ� ���
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ���� ���
		writer.close(); // ��� ��Ʈ���� �ݴ´�

	}

}
