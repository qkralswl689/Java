package ThisJavaThread;

public class ThreadA extends Thread{
	
	public ThreadA() {
		// 스레드 이름 설정
		setName("ThreadA");
	}
	
	public void run() {
		for(int i=0; i<2; i++) {
			// getName() : 스레드 이름 얻기
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
