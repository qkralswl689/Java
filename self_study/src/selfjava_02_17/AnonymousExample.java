package selfjava_02_17;

public class AnonymousExample {

	public static void main(String[] args) {
		
		Anonymous anony = new Anonymous();
		
		anony.filed.wake(); // => �ڽİ�ü�� work() �޼ҵ� ���� ȣ���� �ȵ�
							// ������ �θ�ü�� �ִ� wake() �� ȣ���ϸ� �ڽİ�ü���� ������ �� wake�����
							// �ڽİ�ü���� ȣ���� �ڽİ�ü�� work()�� �Բ� ȣ��ȴ�
		
		anony.method1();
		
		anony.method2(new Person() { // method2�� �͸��ڽ� ��ü �����ؼ�  ����
			
			// �޼ҵ� ����
			void study() {
				System.out.println("�����մϴ�");
			}
			
			// Person�� ������ �ִ� �޼ҵ� ������
			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�");
				study();
			}
		});

	}

}
