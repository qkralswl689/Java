package ThisJavaThread;

public class ThreadNameEx {

	public static void main(String[] args) {
		
		// ���� ������ �̸� ��� �� UserThread ���� �� ����
		
		// .currentThread(); : �� �ڵ带 �����ϴ� ������ ��ü ����
		Thread mainThread = Thread.currentThread();
		System.out.println("���α׷� ���� ������ �̸� : " + mainThread.getName());
		
		// threadA ����
		ThreadA threadA = new ThreadA(); 
		System.out.println("�۾� ������ �̸� : " + threadA.getName());
		// threadA ����
		threadA.start();
		
		// threadB ����
		ThreadB threadB = new ThreadB();
		System.out.println("�۾� ������ �̸� : " + threadB.getName());
		// threadB ����
		threadB.start();
		
	}
}