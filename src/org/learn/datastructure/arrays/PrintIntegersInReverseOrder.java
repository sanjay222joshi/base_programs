package org.learn.datastructure.arrays;

import java.util.Scanner;

/**
 * 
 * @author sanjay.joshi
 * 
 * An array is a type of data structure that stores elements of the same type in a 
 * contiguous block of memory. In an array, , of size , 
 * each memory location has some unique index,  (where ), 
 * that can be referenced as  (you may also see it written as ).
 * Given an array, , of  integers, print each element in reverse order as a 
 * single line of space-separated integers.
 */
public class PrintIntegersInReverseOrder {
	public static void main(String[] args){		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		
		String length = scan.nextLine();
		String b[] = scan.nextLine().split(" ");
		
		int[] a = new int[Integer.parseInt(length)];
	
		for(int i = 0; i<Integer.parseInt(length);i++){
			a[i] = Integer.parseInt(b[i]);
		}
		
		for(int i = a.length-1; i>=0;i--){
			System.out.print(a[i]+ " ");
		}
	}
}
