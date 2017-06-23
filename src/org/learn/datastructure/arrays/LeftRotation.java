package org.learn.datastructure.arrays;

import java.util.Scanner;


public class LeftRotation {
	
	static void rvereseArray(int arr[], int start, int end)
    {
        int temp;
        while (start < end)
        {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
	

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] val = scan.nextLine().split(" ");
		int n = Integer.parseInt(val[0]);
		int d = Integer.parseInt(val[1]);
		int[] intg = new int[n];
		val = scan.nextLine().split(" ");
	
		
		for(int i=0; i<n; i++){
			intg[i] =  Integer.parseInt(val[i]);
		}
		
		rvereseArray(intg, 0, d-1);
        rvereseArray(intg, d, n-1);
        rvereseArray(intg, 0, n-1);

        for(int i=0; i<n; i++){
			System.out.print(intg[i] + " ");
		}
		
	}

}
