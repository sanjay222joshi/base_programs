package org.learn.datastructure.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArrayList {

	public static void main(String[] args) {
		int lastAnswer = 0;
		int queryType, x, y, index;
		Scanner scan = new Scanner(System.in);
		String[] nQ = scan.nextLine().split(" ");
		int N = Integer.parseInt(nQ[0]);
		int Q = Integer.parseInt(nQ[1]);
		
		ArrayList<Integer>[] seqList = new ArrayList[N];
		
		for(int i=0;i<Q;i++){
	        queryType = scan.nextInt();
	        x = scan.nextInt();
	        y = scan.nextInt();
	        index = (x^lastAnswer)%N;

	        switch (queryType) {

	            case 1:
	                if (seqList[index] == null) {
	                    ArrayList<Integer> myList = new ArrayList<>();
	                    myList.add(y);
	                    seqList[index] = myList;
	                } else
	                	seqList[index].add(y);
	                break;
	            case 2:
	                System.out.println(lastAnswer = seqList[index].get(y % seqList[index].size()));
	                break;
	        }
	    }
	}

}
