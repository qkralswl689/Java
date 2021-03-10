package com.javateam.jse;

public class CalcClass2 implements CalcInterface {

	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public int multiply(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public float divide(int num1, int num2) {
		return (float)num1 / num2;
	}

	@Override
	public int remainder(int num1, int num2) {
		return num1 % num2;
	}

	
	

}
