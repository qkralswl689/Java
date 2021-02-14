package Cal;

public class Calculator {
	
	// 메소드 생성
	// void가 붙은 메소드는 자신이 가진 코드를 실행하고 끝난다
	public void plus(int number1,int number2) {
		System.out.println(number1 + number2);
	}
	
	public void minus(int number1, int number2) {
		System.out.println(number1 - number2);
	}
	
	// return차입이 있는 메소드는 자신을 호출한 부분에서 자신이 가진 코트를 실행하고 
	// 숫자를 리턴하면 숫자를 보여주고 끝난다
	public int multiple(int number1, int number2) {
		int result = number1 * number2;
		return result;
	}
	
	public String divi(int number1, int number2) {
		System.out.println(number1/number2);
		return "나누기";
	}
	
	public void remaider(int number1, int number2) {
		System.out.println(number1%number2);
	}

}
