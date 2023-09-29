package com.chandrayya.testbench.assignments;

public class PrintPatterns {
public static int ROW_COUNT = 5;
	public static int COL_COUNT = 5;
	
	public static void main(String[] args) {
		
		int rows = ROW_COUNT;
		int cols = COL_COUNT;
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < cols; j++) {
				double midEle = Math.ceil(rows / 2);
				if(midEle == j) {					
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
