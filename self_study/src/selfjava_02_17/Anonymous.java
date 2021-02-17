package selfjava_02_17;

public class Anonymous {
	
	// �ʵ� ���� �� �͸� �ڽ� ��ü ����
	Person filed = new Person() {
		
		// �͸� �ڽİ�ü�� ������ �ִ� �޼ҵ� 
		void work() {
			System.out.println("����մϴ�");
		}
		
		// �θ�ü�� ������ �ִ� �޼ҵ� ������
		@Override
		void wake() {
			System.out.println("6�ÿ� �Ͼ�ϴ�");
			work();
		};
		
	};
	
	// ���ο� �޼ҵ� ����
	void method1() {
		
		// ���� ���� �� �͸� �ڽİ�ü �����Ͽ� ����
		Person localVar = new Person() {
			
			void walk() {
				System.out.println("��å �մϴ�");
			}
			
			@Override
			// Person�� �������ִ� �޼ҵ� ������
			void wake() {
				System.out.println("7�ÿ� �Ͼ�ϴ�");
				walk();
			}
		};
		
		localVar.wake();
	}
	
	// ���ο� �޼ҵ� ����
	// �Ű������� Person Ÿ�� �߰�
	void method2(Person person) {
		person.wake(); // method2�� ȣ���� �� Person��ü �Ǵ� Person �� �ڽİ�ü�� ������ �� �ִ�
	}
	

}
