package Java_Nam;
	class Tv{
		// �θ� ��� 5��
		boolean power; // ��������  (on/off)
		int channel;  // ä��
		
		void power() {
			power =! power;
		}
		void channelUp() {
			++channel;
		}
		void chnnelDown() {
			--channel;
		}			
	}	
	
	// �ڽ� ��� 2�� + �θ��� 5��  = �� 7��
	class SmartTv extends Tv{ // SmartTv�� Ch7_1Ex ĸ��(�ڸ�)�� �����ִ� ���
		boolean caption; // ĸ�ǻ��� (on/off)
		void displayCaption(String text) { 
			if(caption) { // ĸ�� ���°� on(true)�� ���� text�� �����ش�
				System.out.println(text);
			}
		}
	}


public class Ch7_1Ex {	
		
		public static void main(String[] args) {
			SmartTv stv = new SmartTv();// ��ü ����
			
			stv.channel = 10; // ���� Ŭ�����κ��� ��ӹ��� ���
			stv.channelUp(); // ���� Ŭ�����κ��� ��ӹ��� ���
			System.out.println(stv.channel);
			stv.displayCaption("Hello");
			stv.caption = true; // ĸ��(�ڸ�) ����� �Ҵ�
			stv.displayCaption("Hello");
			
	}
		
}


