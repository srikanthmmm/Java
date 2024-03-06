package com.sss;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class ReapetedWordInStream {
		public static void main(String[] args) {
			List<String> list= Arrays.asList("java","java","devops","java","python","Tester");
			
			Map<Object, Long> map=list.stream().collect(Collectors.groupingBy(str->str,Collectors.counting()));
			
			Entry<Object, Long> result=map.entrySet().stream().max(Map.Entry.comparingByValue()).get();
			
			System.out.println("Reapeted Letter: "+result.getKey()+" :Number of times:  "+result.getValue());
		}
}
