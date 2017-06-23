package org.learn.datastructure.challenges;

import java.util.*;

public class Hashing {
	static String removeDuplicates(String input){
		Set<String> ss = new HashSet<String>();
		String removed = "";
		
		for(int i=0; i<input.length(); i++){
			if(ss.add(String.valueOf(input.charAt(i)))){
				removed = removed + input.charAt(i);
			}
		}
		return removed;
	}
	
	public static void main(String[] args) {
		System.out.println(removeDuplicates("geekforgeek"));
	}

}
