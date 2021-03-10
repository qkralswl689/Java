package com.javateam.jse.test;

import com.javateam.jse.CalcClass;
import com.javateam.jse.CalcInterface;


public class CalcTest extends CalcClass {


	public static void main(String[] args) {

		//CalcClass calc = new CalcClass(); // (O)
		CalcInterface calc = new CalcClass();
		System.out.println(calc.add(2, 15));
		System.out.println(calc.subtract(2, 15));
		System.out.println(calc.multiply(2, 15));
		System.out.println(calc.divide(15, 2));
		System.out.println(calc.remainder(15, 2));
	}
}
