package org.learn.datastructure.challenges;

import java.util.Stack;

public class FirstStack {	
	public static void main(String[] args) {
		Stack<String> ss = new Stack<String>();		
		ss.push("1");
		ss.push("2");
		
		System.out.println(ss.pop());
	}
}
