package ThisJavaThread;

public class ThreadB extends Thread{
	
	public ThreadB() {
		// 스레드 이름 설정
		setName("ThreadB");
	}
	
	public void run() {
		for(int i=0; i<2; i++) {
			// getName() : 스레드 이름 얻기
			System.out.println(getName() + "가 출력한 내용");
		}
	}
}
