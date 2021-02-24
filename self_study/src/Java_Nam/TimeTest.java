package Java_Nam;

class Time{
	private int hour;  // 0~23������ ���� ������ �Ѵ�
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(extracted(hour)) return;
		
		this.hour = hour;
	}
	// ���ǽ� ���� �� alt + shift + m : ������ ���ǹ� �����ϴ� �޼��� ���� 
	// �Ű������� �Ѱ��� hour�� ��ȿ���� Ȯ���ؼ� �˷��ִ� �޼���
	private boolean extracted(int hour) {
		return hour < 0 || hour > 23;
	}
	
	public int getHour() {
		return hour;
	}
}
public class TimeTest {

	public static void main(String[] args) {

		Time t = new Time();
		// t.hour = 25;
		t.setHour(21); // hour�� ���� 21�� ����
		System.out.println(t.getHour());
				
	}

}
