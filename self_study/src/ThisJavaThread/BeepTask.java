package ThisJavaThread;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	// 비프음을 들려주는 작업 정의 – Runnable 구현 클래스
	public void run() {
		
		// 여기부터
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {Thread.sleep(500); } catch(Exception e) {}
			
		}// 여기까지 스레드 실행내용 		
	}	
}

