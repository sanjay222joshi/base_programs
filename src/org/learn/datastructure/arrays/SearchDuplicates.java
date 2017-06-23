package org.learn.datastructure.arrays;

import java.util.*;

public class SearchDuplicates {
	
	/**
	 * Compare tow list of map and check for duplicates
	 * @param list1 : list of map as first set
	 * @param list2 : list of elements as second set
	 * @return true if all elements in list1 as list2
	 */
	static boolean searchDuplicates(List<Map<String,Object>> list1, List<Map<String,Object>> list2){
		boolean output = false;
		Set<Map<String,Object>> input = new HashSet<Map<String,Object>>();
		
		input.addAll(list1);
		
		for(Map<String,Object> secondMap : list2){
			output = input.add(secondMap);		
			if(output){
				//move to next element
			}else{
				return true;
			}
		}	
		return output;	
	}
	
	
	
	
	
	public static void main(String[] args){
		List<Map<String,Object>> list1 = new ArrayList<Map<String,Object>>();
		List<Map<String,Object>> list2 = new ArrayList<Map<String,Object>>();
        
		Map<String,Object> map1 = new HashMap<String, Object>();
        	map1.put("a", 1);
        	map1.put("b", "sanjay");
        	map1.put("c", true);
        
        Map<String,Object> map2 = new HashMap<String, Object>();
        	map2.put("a", 2);
        	map2.put("b", "joshi");
        	map2.put("c", true);
        
        Map<String,Object> map3 = new HashMap<String, Object>();
        	map3.put("a", 1);
        	map3.put("b", "sanjay");
        	map3.put("c", true);
        
        
        Map<String,Object> map4 = new HashMap<String, Object>();
        	map4.put("a", 2);
        	map4.put("b", "joshi");
        	map4.put("c", true);
        
        list1.add(map1);
        list1.add(map2);
        list2.add(map3);
        list2.add(map4);
        
        System.out.println(searchDuplicates(list1,list2));

	}

}
