package ThisJavaThread;

import java.awt.Toolkit;

public class BeepPrintex2  {

	public static void main(String[] args) {
		
		// ������ - ���� ������� �۾� �����尡 ���ÿ� ����
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		thread.start();
		// thread.start(); :
		/*
		public void run() {		
		// �������
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500); } catch(Exception e) {}			
		}// ������� ������ ���೻��  */
	
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try { Thread.sleep(500); }
			catch (Exception e) {}
		}		
	}	
}

