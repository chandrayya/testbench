package com.chandrayya.testbench;

/**
 * 
 * @author chandrayya
 *
 *
 */
public class HelloWorld {	
	
	/**
	 * 
	 * @param args This is an array of command line arguments.
	 */
	public static void main(String[] args) {
				
		int a = 10;
		int b = 20;
		
		//doCalculateAverage(a,b);		
		doGenerateFibbonacciNumbers(b);
	}

	private static void doGenerateFibbonacciNumbers(int a) {
		// 0,1,1,2,3,5....
		// 0,1,1,2,3,4,5,6,7,8,9,
		int firstNumber = 0;
		int secondNumber = 1;
		int nextNumber;
		for (int i = 0; i < a; i++) {		
			if (i == 0) {
				firstNumber = i;
				System.out.print(i + ",");
				continue;
			}		
			if (i == 1) {
				secondNumber = i;
				System.out.print(i + ",");
				continue;
			}		
			
			nextNumber = firstNumber + secondNumber;
			
			System.out.print(nextNumber + ",");
			
			firstNumber = secondNumber;
			secondNumber = nextNumber;
		}

	}

	private static void doCalculateAverage(int a, int b) {
		
		double average = (a + b) / 2;		
		System.out.println("Average of a and b " + average);
		
	}	
	
}
