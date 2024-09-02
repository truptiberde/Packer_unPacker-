package Assignment2;

import java.util.Scanner;

public class PowerCalculation {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the base (A):");
		double A=scanner.nextDouble();
		System.out.println("Enter the exponent (b):");
		double b=scanner.nextDouble();
		double result=calculatePower(A,b);
		
		System.out.println("The value of "+A+"raised to the power of "+b+"is: "+result);
	}

	public static double calculatePower(double A, double b) {
		return Math.pow(A, b);
	}
}
