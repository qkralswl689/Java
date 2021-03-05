package ThisJavaThread;

public class ThreadNameEx {

	public static void main(String[] args) {
		
		// 메인 스레드 이름 출력 및 UserThread 생성 및 시작
		
		// .currentThread(); : 이 코드를 실행하는 스레드 객체 생성
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름 : " + mainThread.getName());
		
		// threadA 생성
		ThreadA threadA = new ThreadA(); 
		System.out.println("작업 스레드 이름 : " + threadA.getName());
		// threadA 시작
		threadA.start();
		
		// threadB 생성
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름 : " + threadB.getName());
		// threadB 시작
		threadB.start();
		
	}
}
