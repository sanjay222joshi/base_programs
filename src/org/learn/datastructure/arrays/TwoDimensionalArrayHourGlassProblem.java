package org.learn.datastructure.arrays;

import java.util.Scanner;

public class TwoDimensionalArrayHourGlassProblem {

	public static void main(String[] args) {
		System.out.println("Please enter value in 6X6 format ranging from -9 to 9");
		Scanner scan = new Scanner(System.in);
		
		int ab[][] = new int[6][6];
		
		for(int i=0;i<6;i++){
			String[] input = scan.nextLine().split(" ");
			for(int j=0;j<6;j++){
				ab[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < 4; i++) {
		    for (int j = 0; j < 4; j++) {
		        int sum = ab[i    ][j] + ab[i    ][j + 1] + ab[i    ][j + 2]
		                                + ab[i + 1][j + 1]
		                + ab[i + 2][j] + ab[i + 2][j + 1] + ab[i + 2][j + 2];
		        if (maxSum < sum) {
		            maxSum = sum;
		        }
		    }
		}
		System.out.println(maxSum);
		
	}

}
