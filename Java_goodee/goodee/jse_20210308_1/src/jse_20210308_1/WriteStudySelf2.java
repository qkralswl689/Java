package jse_20210308_1;

import java.io.FileWriter;
import java.io.Writer;

public class WriteStudySelf2 {

	public static void main(String[] args) throws Exception {
		
		// �迭 ��ü�� ����ϱ�
		
		// ("C:/Temp/Test8.txt") : ������ �������� Test8.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ�� ����
		Writer writer = new FileWriter("C:/Temp/Test8.txt");
		
		// ������ �迭 ����
		char[] array = {'A','B','C'};
		
		writer.write(array); // �迭�� ��� ���ڸ� ���
		
		writer.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ���ڸ� ���
		writer.close(); // ��� ��Ʈ���� ����
	}
}