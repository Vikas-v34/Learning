package com.practice;

class x{
	public static double calculate(int num1,int num2) {
		if(num2 != 0)
		return num1/num2;
		else
			throw new ArithmeticException("Cant divide by zero");
	}
}
public class IOException {
	public static void main(String[] args) {
		int num1 = 100;
		int num2 = 10;
		double result = x.calculate(num1,num2);
		System.out.println("Result: "+result);

	}

}
