package org.learn.datastructure.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SparseArrayChallenge {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());	
		String[] input = new String[n];
		
		for(int i=0; i<n; i++){
			input[i] =  scan.nextLine();
		}
		
		int q =  Integer.parseInt(scan.nextLine());
		int counter[] = new int[q];
		String[] queries = new String[q];
		
		for(int i=0; i<q; i++){
			queries[i] =  scan.nextLine();
		}
		
		scan.close();
		
		Arrays.sort(input);
		
		for(int i=0; i<queries.length; i++){
			int count = 0;
			for (int j = 0; j < n; j++) {
				if (count <= 0) {
					if (queries[i].equals(input[j])) {
						count++;
					}
				}else{
					if (queries[i].equals(input[j])) {
						count++;
					}else{
						break;
					}
				}
			}
			counter[i] = count;
		}
		
		for(int i=0; i<q; i++){
			System.out.println(counter[i]);
		}
	
	}

}
