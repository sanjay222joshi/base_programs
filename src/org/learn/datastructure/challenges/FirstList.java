package org.learn.datastructure.challenges;

import java.io.FileNotFoundException;
import java.util.*;

public class FirstList {

	public static void main(String[] args) {
		int[] intgrArray = new int[] { 1, 2, 2, 3, 4, 5, 6, 3 };

		Set<CharSequence> strOutput = printAllPalindromes("aabbbbaabasdfbbccbb");

		int[] intOutput = uniqueNumbers(intgrArray);

		List<Integer> o = duplicateNumbers(intgrArray);

		for (CharSequence s : strOutput) {
			System.out.println(s);
		}

		for (int i = 0; i < intOutput.length; i++) {
			System.out.println(intOutput[i]);
		}

		for (int i : o) {
			System.out.println(i);
		}

		System.out.println("Reverse Of Palindrome is: "
				+ reverseString("Palindrome"));

		LinkedList<String> lnkdlst = new LinkedList<String>();
		lnkdlst.add("1");
		lnkdlst.add("2");
		lnkdlst.add("3");
		lnkdlst.add("4");

		System.out.println(reverseLinkedlist(lnkdlst));

		System.out.println("Anagram RASP,SPAR: "
				+ anagramValidator(new String[] { "RASP", "SPAR" }));

		int arr1[] = { 1, 3, 4, 5 };
		int arr2[] = { 2, 4, 6, 8 };

		System.out.println(mergeTwoSortedArrays(arr1, arr2));

	}

	/**
	 * Get all palindromes in a string
	 * 
	 * @param input
	 * @return
	 */
	public static Set<CharSequence> printAllPalindromes(String input) {
		if (input.length() <= 1) {
			return Collections.emptySet();
		}
		Set<CharSequence> out = new HashSet<CharSequence>();
		int length = input.length();
		for (int i = 1; i <= length; i++) {
			for (int j = i - 1, k = i; j >= 0 && k < length; j--, k++) {
				if (input.charAt(j) == input.charAt(k)) {
					out.add(input.subSequence(j, k + 1));
				} else {
					break;
				}
			}
		}
		return out;
	}

	/**
	 * Get unique numbers from integer array
	 * 
	 * @param input
	 * @return
	 */
	static int[] uniqueNumbers(int[] input) {
		if (input.length == 1) {
			return new int[] { input[0] };
		} else if (input.length <= 0) {
			System.out.println("No Elements To Traverse");
			System.exit(0);
		}

		Set<Integer> out = new HashSet<Integer>();

		for (int i : input) {
			out.add(i);
		}

		int[] output = new int[out.size()];
		int j = 0;

		for (Integer i : out) {
			output[j++] = i;
		}

		return output;
	}

	/**
	 * Get duplicate numbers in integer array
	 * 
	 * @param input
	 * @return
	 */
	static List<Integer> duplicateNumbers(int[] input) {
		List<Integer> o = new ArrayList<Integer>();

		if (input.length == 1) {
			o.add(input[0]);
			return o;
		} else if (input.length <= 0) {
			System.out.println("No Elements To Traverse");
			System.exit(0);
		}

		Set<Integer> out = new HashSet<Integer>();

		for (int i : input) {
			boolean b = out.add(i);
			if (!b) {
				o.add(i);
			}
		}

		return o;
	}

	/**
	 * Reverse a given string
	 * 
	 * @param input
	 * @return
	 */
	static String reverseString(String input) {
		String reverse = "";
		if (input.length() == 1) {
			return input;
		} else if (input.length() == 0) {
			System.out.println("Nothing To Reverse");
			System.exit(0);
		}

		char[] c = input.toCharArray();

		for (int i = input.length() - 1; i >= 0; i--) {
			reverse = reverse + c[i];
		}
		
		
		return reverse;
	}
	
	/**
	 * Reverse a linkedlist
	 * @param lnkdlst
	 * @return
	 */
	static LinkedList<String> reverseLinkedlist(LinkedList<String> lnkdlst) {
		LinkedList<String> output = new LinkedList<String>();
		int length = lnkdlst.size();
		if (length == 1) {
			output.add(lnkdlst.get(0));
			return output;
		} else if (length == 0) {
			System.out.println("Nothing To Reverse");
			System.exit(0);
		}

		for (int i = lnkdlst.size() - 1; i >= 0; i--) {
			output.add(lnkdlst.get(i).toString());
		}
		return output;
	}
	
	/**
	 * Validate two strings are anagram of each other
	 * @param input
	 * @return
	 */
	static boolean anagramValidator(String[] input) {
		boolean validator = false;
		if (input[0].length() != input[1].length()) {
			return false;
		}

		CharSequence c = input[0];

		for (int i = 0; i < c.length(); i++) {
			if (input[1].contains(input[0].subSequence(i, i + 1))) {
				validator = true;
			} else {
				return false;
			}

			if (input[0].contains(input[1].subSequence(i, i + 1))) {
				validator = true;
			} else {
				return false;
			}
		}

		return validator;
	}
	
	/**
	 * Merge two sorted arrays without sorting
	 * @param input
	 * @return
	 */
	static Set<Integer> mergeTwoSortedArrays(int[] a, int[] b) {
		int length = a.length + b.length;
		int[] sorted = new int[length];

		for (int i = 0, j = 0, k = 0; i < sorted.length; i++) {	
				if(j<a.length){
					if (a[j] < b[k]) {
						sorted[i] = a[j];
						j++;
					}else{
						sorted[i] = b[k];
						k++;
					}
				}else{
						sorted[i] = b[k];
						k++;
				}
		}
		
		Set<Integer> merged = new HashSet<Integer>();
		
		for (int i = 0; i < sorted.length; i++){
			merged.add(sorted[i]);
		}
		
		return merged;
	}
}
