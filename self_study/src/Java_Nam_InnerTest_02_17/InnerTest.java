package Java_Nam_InnerTest_02_17;


class AAA { // AAA�� BBB�� �ܺ� Ŭ�����̴�
	int i = 100;
	BBB b = new BBB(); // BBB ����Ϸ��� 
	
	class BBB { // BBB �� AAA�� ���� Ŭ�����̴�
		void method() {
//			AAA a = new AAA(); // ����Ŭ������ �ƴҰ�� ��ü ����
//			System.out.println(a.i); // ����Ŭ������ �ƴҰ�� ��ü ����
			System.out.println(i); // ��ü ���� ���� �ܺ� Ŭ������ ����� ���� �����ϴ�
			
		}
	}
	
}

//class CCC {
//	// BBB b =new BBB(); // BBBŬ������ AAA �ȿ����� ��밡���ϴ�
//	
//}

public class InnerTest {

	public static void main(String[] args) {
		
		AAA.BBB b = new AAA().new BBB();
		b.method();

	}

}
