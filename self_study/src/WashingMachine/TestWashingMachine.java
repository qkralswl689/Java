package WashingMachine;

public class TestWashingMachine extends LGWashingMachine{
	
	public static void main(String[] args) {
		LGWashingMachine wash = new LGWashingMachine();
		wash.startButtonPressed();
		System.out.println("��Ź���� �ӵ���" + wash.changeSpeed(3));
	}

}
