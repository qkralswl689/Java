package ThisJavaThread;

import java.awt.Toolkit;

// extends Thread  작성하기
public class BeepThread extends Thread {
	
	// 비프음을 들려주는 스레드
	
	 @Override
	 public void run() {
		 Toolkit toolkit = Toolkit.getDefaultToolkit();
		 for(int i=0; i<5; i++) {
			 toolkit.beep();
			 try {Thread.sleep(500); } catch(Exception e) {}
		 }
	 }
}
