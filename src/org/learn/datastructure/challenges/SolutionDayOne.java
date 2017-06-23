package org.learn.datastructure.challenges;

import java.util.*;

public class SolutionDayOne {

	static int twinArrays(int[] ar1, int[] ar2, int indexArr1, int indexArr2, int min1, int min2) {
		int temp1 = Integer.MAX_VALUE;
		int temp2 = Integer.MAX_VALUE;
		int minValue_1 = Integer.MAX_VALUE;
		int minValue_2 = Integer.MAX_VALUE;
		
		for (int i = 0; i < ar1.length; i++) {
			int ts = ar1[i] + min2;
			if (i != indexArr2 && ar1[i] < temp1) {
				temp1 = ar1[i];
				
				minValue_1 = (ts < minValue_1) ? minValue_1 = ts : minValue_1;
			}
		}
		for (int i = 0; i < ar2.length; i++) {
			int ts = ar2[i] + min1;
			if (i != indexArr1 && ar2[i] < temp2) {
				temp2 = ar2[i];
			
				minValue_2 = (ts < minValue_2) ? minValue_2 = ts : minValue_2;
			}
		}		
		return (minValue_1 < minValue_2) ? minValue_1: minValue_2;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		int indexArr1 = 0;
		int indexArr2 = 0;
		int result;
		int[] ar1 = new int[n];
		for (int i = 0; i < n; i++) {
			ar1[i] = in.nextInt();
			if (ar1[i] <= min1) {
				min1 = ar1[i];
				indexArr1 = i;
			}
		}
		int[] ar2 = new int[n];
		for (int j = 0; j < n; j++) {
			ar2[j] = in.nextInt();
			if (ar2[j] <= min2) {
				min2 = ar2[j];
				indexArr2 = j;
			}
		}
		if (indexArr1 != indexArr2) {
			result = min1 + min2;
		} else if (n == 1) {
			result = -1;
		} else {
			result = twinArrays(ar1, ar2,indexArr1,indexArr2,min1,min2);
		}
		System.out.println(result);
	}
}