package ClassEx2;

public class aconMain {

	public static void main(String[] args) {
		
		acon Acon = new acon();
		Acon.company = "LG";
		Acon.color = "Green";
		Acon.price = 1000000;
		Acon.temp = 20;
		
		System.out.println(Acon.company);
		System.out.println(Acon.color);
		System.out.println(Acon.price);
		System.out.println(Acon.temp);
		
		Acon.powerOn();
		Acon.powerOff();
		System.out.println("현재온도" + Acon.temp);
		
		Acon.tempDown();
		System.out.println("현재온도" + Acon.temp);
		
		Acon.tempUp();
		Acon.tempUp();
		System.out.println("현재온도" + Acon.temp);
		
		Acon.showInfo();

			

	}

}
