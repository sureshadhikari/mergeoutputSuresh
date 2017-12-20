package main;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author Suresh Adhikari
 *
 */
public class MergeInputMainClass {

	public static void main(String[] args) {

		// taking string array input from user
		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the number of rows for 2D array :");
		int rows = sc.nextInt();

		System.out.println("Please enter the number of columns for 2D array :");
		int columns = sc.nextInt();

		int[][] inputArray = new int[rows][columns];
		System.out.println("Please enter array elements:");

		for (int i = 0; i < rows; i++) {

			for (int j = 0; j < columns; j++) {
				System.out.println("Please enter value for row [" + i + "] & " + "Column [" + j + "]");
				int value = sc.nextInt();
				inputArray[i][j] = value;

			}
		}
		sc.close();

		int[][] resultArray = new int[3][2];

		resultArray = MergeValues.mergeOutput(inputArray);

		System.out.println("=========================================");
		System.out.println("<<< Output Values >>>>");
		for (int[] arr : resultArray) {
			System.out.println(Arrays.toString(arr));
		}

	}

}
