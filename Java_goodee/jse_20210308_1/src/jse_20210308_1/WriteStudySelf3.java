package jse_20210308_1;

import java.io.FileWriter;
import java.io.Writer;

public class WriteStudySelf3 {

	public static void main(String[] args) throws Exception {
		
		// �迭 �Ϻθ� ����ϱ�
		
		// ("C:/Temp/Test9.txt") : ������ �������� Test9.txt�� �ϴ� ���� ��� ���� ��� ��Ʈ�� ����
		Writer writer = new FileWriter("C:/Temp/Test9.txt");
		
		// ������ �迭 ����
		char[] array = {'A','B','C','D','E'};
		
		writer.write(array,1,3); // �迭�� 1�� �ε������� 3���� ���
		
		writer.flush(); // ��� ���ۿ� �ܷ��ϴ� ��� ���ڸ� ���
		writer.close(); // ��� ��Ʈ���� ����
	}
}