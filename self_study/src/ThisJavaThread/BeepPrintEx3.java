package ThisJavaThread;

public class BeepPrintEx3 {

	public static void main(String[] args) {
		
		// ���ν������ �۾� �����尡 ���ÿ� ����
		Thread thread = new BeepThread();
		thread.start();
		
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {Thread.sleep(500); }
			catch(Exception e) {}
		}
	}
}
