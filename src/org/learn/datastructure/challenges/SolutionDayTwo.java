package org.learn.datastructure.challenges;

import java.util.*;

public class SolutionDayTwo {
	
	static int patternCount(String s) {
		int counter = 0;
	
		s = s.replaceAll("1", "1_1");
		String[] aa = s.split("_");
		boolean con = false;
		
		for(int i=0; i< aa.length; i++){
			char[] c = aa[i].toCharArray();
			
			if(c.length>2 && c[0] =='1' && c[c.length-1] =='1'){
				for(int j=1; j<(c.length-1); j++){
					if(c[j] == '0'){
						con = true;
					}else{
						con=false;
						break;
					}
				}
			}
			if(con){
				counter++;
			}
			con = false;
		}
		
		return counter;
	}

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = patternCount(s);
            System.out.println(result);
        }
    }

}
