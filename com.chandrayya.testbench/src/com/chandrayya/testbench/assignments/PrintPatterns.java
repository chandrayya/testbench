package com.chandrayya.testbench.assignments;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *  Prints patterns on console
 */
public class PrintPatterns {
	
	public static void main(String[] args) {

		// Enter data using BufferReader
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of rows:");
		int rows = 0,cols = 0;
		try {
			rows = Integer.valueOf(reader.readLine());
			System.out.println("Enter number of cols:");
			cols = Integer.valueOf(reader.readLine());
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				double midEle = Math.ceil(rows / 2);
				if (midEle == j) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
