package WashingMachine;

public class TestWashingMachine extends LGWashingMachine{
	
	public static void main(String[] args) {
		LGWashingMachine wash = new LGWashingMachine();
		wash.startButtonPressed();
		System.out.println("세탁기의 속도는" + wash.changeSpeed(3));
	}

}
