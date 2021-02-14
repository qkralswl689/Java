package Cal;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator(); // calc °´Ã¼ »ý¼º
		
		calc.plus(20,30);
		calc.minus(30, 20);
		
		int result = calc.multiple(5,3);
		System.out.println(result);
		
		System.out.println(calc.divi(10, 2));
		calc.remaider(30, 4);
	}

}
