package WashingMachine;

public interface WashingMachine { // 세탁기 프로그램
	
	// 인터페이스 메소드 선언
	
	public void startButtonPressed(); // 시작 버튼 눌렀을때
	public void pauseButtonPressed(); // 일시정지 버튼 눌렀을때
	public void stopButtonPressed(); // 멈춤 버튼 눌렀을때
	public int changeSpeed(int speed); // 속도 바꿀때
	
}
