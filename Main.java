package CalculatorPackage;

public class Main {
	public static void main(String[] args) {
		
		Calculator calculatormethods = new Calculator();
		
		System.out.println(calculatormethods.add(1, 2));
		
		System.out.println(calculatormethods.subtract(1, 2));
		
		System.out.println(calculatormethods.multiply(5, 5));
		
		System.out.println(calculatormethods.devide(25, 5));
		
		System.out.println(calculatormethods.square(5));
		
		System.out.println(calculatormethods.exponentiation(5, 6));

	}
}