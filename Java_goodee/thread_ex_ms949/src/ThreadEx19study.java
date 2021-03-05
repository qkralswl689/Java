 class ThreadEx19study {
	static long startTime = 0;

	public static void main(String args[]) {
		ThreadEx19study_1 th1 = new ThreadEx19study_1();
		ThreadEx19study_2 th2 = new ThreadEx19study_2();
		ThreadEx19study_3 th3 = new ThreadEx19study_3();

		th1.start();
		th2.start();
		th3.start();
		startTime = System.currentTimeMillis();

		try {
			th1.join();	// main�����尡 th1�� �۾��� ���� ������ ��ٸ���.
			th2.join();	// main�����尡 th2�� �۾��� ���� ������ ��ٸ���.
			th3.join();
		} catch(InterruptedException e) {}

		System.out.print("�ҿ�ð�:" + (System.currentTimeMillis() - ThreadEx19study.startTime));
	} // main
}

class ThreadEx19study_1 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i < 30; i++) {
			System.out.print(new String("-"));
		}
	} // run()
}

class ThreadEx19study_2 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i < 30; i++) {
			System.out.print(new String("|"));
		}
	} // run()
}
class ThreadEx19study_3 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i < 30; i++) {
			System.out.print(new String("*"));
		}
	} // run()
}
