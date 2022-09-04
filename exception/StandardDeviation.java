package com.exception;

import java.util.Scanner;

public class StandardDeviation {

	public static void main(String[] args) {

		
		int[] array = new int[10];

		double standardDeviation = calculateStandardDeviation(array);

		System.out.format("Standard deviation : %.6f", standardDeviation);

	}

	private static double calculateStandardDeviation(int[] array) {
		Scanner sc = new Scanner(System.in);
		// finding the sum of array values
		double sum = 0.0;
		System.out.println("Enter size");
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter "+i+" element");
			array[i]=sc.nextInt();
			sum += array[i];
		}

		// getting the mean of array.
		double mean = sum / array.length;

		// calculating the standard deviation
		double standardDeviation = 0.0;
		for (int i = 0; i < array.length; i++) {
			standardDeviation += Math.pow(array[i] - mean, 2);

		}

		return Math.sqrt(standardDeviation/array.length);
	
	}

	




}
