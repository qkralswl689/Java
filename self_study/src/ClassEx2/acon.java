package ClassEx2;

public class acon {
	
	String company;
	String color;
	int price;
	int temp;
	
	public void powerOn() {
		System.out.println("������ �������ϴ�");		
	}
	public void powerOff() {
		System.out.println("������ �������ϴ�");		
	}
	
	public void tempDown() {
		this.temp--;
	}
	
	public void tempUp() {
		this.temp++;
	}
	
	public void showInfo() {
		System.out.println(company);
		System.out.println(color);
		System.out.println(price);
		System.out.println(temp);

	}

}
