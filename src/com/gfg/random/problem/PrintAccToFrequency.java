package com.gfg.random.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/*
 * Print Array According to frequency in Descending order
 */
public class PrintAccToFrequency {

	public static void main(String... args) {
		int[] arr = {6,3,1,4,6,6,5,6};
		Map<Integer, Integer> map = getFrequency(arr);
		sortAndTraverse(map);
	}
	
	private static void sortAndTraverse(Map<Integer, Integer> map){
		Set<Entry<Integer, Integer>> set = map.entrySet();
        List<Entry<Integer, Integer>> list = new ArrayList<Entry<Integer, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<Integer, Integer>>()
        {
            public int compare( Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        
        //Traverse
        for(Map.Entry<Integer, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
	}

	private static Map<Integer, Integer> getFrequency(int[] arr) {
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for(int key:arr){
			if(map.containsKey(key)){
				int count = map.get(key);
				map.put(key, ++count); 
			}else{
				map.put(key, 1);
			}
		}
		return map;
	}

}
