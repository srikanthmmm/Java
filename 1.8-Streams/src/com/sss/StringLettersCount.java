package com.sss;

import java.util.HashMap;
import java.util.Map;

public class StringLettersCount {

	public static void main(String[] args) {
	
		String arr="Privaccey";
		Map<Character, Integer>map= new HashMap<>();
		
		for(int i=0;i<arr.length();i++) {
			if(map.containsKey(arr.charAt(i))) {
				map.put(arr.charAt(i),map.get(arr.charAt(i))+1);
			}else {
				map.put(arr.charAt(i), 1);
			}
		}
		map.forEach((key,value)->System.out.println("Most Reapeted letter: "+key+"    :number of times: "+value));

	}

}
