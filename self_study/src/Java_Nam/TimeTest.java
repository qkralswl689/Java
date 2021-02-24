package Java_Nam;

class Time{
	private int hour;  // 0~23사이의 값을 가져야 한다
	private int minute;
	private int second;
	
	public void setHour(int hour) {
		if(extracted(hour)) return;
		
		this.hour = hour;
	}
	// 조건식 선택 후 alt + shift + m : 선택한 조건문 리턴하는 메서드 생성 
	// 매개변수로 넘겨진 hour가 유효한지 확인해서 알려주는 메서드
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
		t.setHour(21); // hour의 값을 21로 변경
		System.out.println(t.getHour());
				
	}

}
