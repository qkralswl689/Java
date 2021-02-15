package CalcStudy2;

import CalcStudy.CalcClass;

public class CalcTest extends CalcClass {
	
	public static void main(String[] args) {
		
		CalcClass calc = new CalcClass();
		
		System.out.println(calc.add(1,2));
		System.out.println(calc.subtract(3, 2));
		System.out.println(calc.multiply(4, 5));
		System.out.println(calc.divide(7, 3));
		System.out.println(calc.remainder(10, 6));
		
	}
	
	
	

}
