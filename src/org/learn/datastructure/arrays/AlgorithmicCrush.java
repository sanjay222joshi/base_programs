package org.learn.datastructure.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.INVOKEVIRTUAL;

public class AlgorithmicCrush {
	static List<Long> input = new ArrayList<Long>();
	static List<Long> adder = new ArrayList<Long>();
	
	public static void main(String[] args) {	
		long max = Integer.MIN_VALUE;
		Scanner scan = new Scanner(System.in);				
		int n = scan.nextInt();
		int m = scan.nextInt();
		long[] in = new long[n+1];
		long[] temp = new long[3];
		
		for(int i=0; i<m; i++){
			temp[0] = scan.nextInt();
			temp[1] = scan.nextInt();
			temp[2] = scan.nextInt();
			
			for(long j=temp[0]; j<=temp[1]; j++){
				in[(int) j] = in[(int) j] + temp[2];
				if(in[(int) j]>max){
					max = in[(int) j];
				}
			}
		}
		scan.close();
		
		System.out.println(max);		
	}

}
