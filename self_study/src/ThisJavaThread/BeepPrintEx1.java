package ThisJavaThread;

import java.awt.Toolkit;

public class BeepPrintEx1 {
	

	public static void main(String[] args) {
		// ���� �����常 �̿��� ��� 		
		
		// Toolkit ��ü ����
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			
			// ������ �߻�
			toolkit.beep(); 
			
			// Thread.sleep(500) : 0.5�ʰ� �Ͻ�����
			try { Thread.sleep(500);} catch(Exception e) {}
						
		}
		for(int i=0; i<5; i++) {
			System.out.println("��");
			
			// Thread.sleep(500) : 0.5�ʰ� �Ͻ�����
			try {Thread.sleep(500); } catch(Exception e) {}
			
		}
	}
}
