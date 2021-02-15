package WashingMachine;

public class LGWashingMachine implements WashingMachine,dryCouse{

	// 인터페이스에서 선언된 메소드에 실행 구현
	@Override
	public void startButtonPressed() {
		System.out.println("세탁기가 빨래를 시작하였습니다");
	}

	@Override
	public void pauseButtonPressed() {
		System.out.println("세탁기가 빨래를 일시 중지하였습니다");
	}

	@Override
	public void stopButtonPressed() {
		System.out.println("세탁기가 빨래를 중지하였습니다");
	}

	@Override
	public int changeSpeed(int speed) {
		int rtnSpeed = 0; // 스피드 초기화
		
		switch(speed) {
		case 1 : 
			rtnSpeed = 20; // 스피드 20 일때 
			break; // 정지
		case 2 : 
			rtnSpeed = 50; // 스피드 50일 떄 
			break; // 정지
		case 3 : 
			rtnSpeed = 100; // 스피드 100 일때
			break; // 정지
		}
		return rtnSpeed; // rtnSpeed 초기값 (0) 리턴
	} 
	@Override
	public void dry() {
		System.out.println("세탁기 완료되어 건조하기 시작하였습니다");
	}

}
