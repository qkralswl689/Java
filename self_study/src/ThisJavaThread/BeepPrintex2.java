package ThisJavaThread;

import java.awt.Toolkit;

public class BeepPrintex2  {

	public static void main(String[] args) {
		
		// 비프음 - 메인 스레드와 작업 스레드가 동시에 실행
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		
		thread.start();
		// thread.start(); :
		/*
		public void run() {		
		// 여기부터
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500); } catch(Exception e) {}			
		}// 여기까지 스레드 실행내용  */
	
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try { Thread.sleep(500); }
			catch (Exception e) {}
		}		
	}	
}

