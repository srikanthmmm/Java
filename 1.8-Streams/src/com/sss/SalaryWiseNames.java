package com.sss;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SalaryWiseNames {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Srikanth", 1000);
		map.put("Shruthi", 2000);
		map.put("Chandana", 3000);
		map.put("Nimmi", 4000);
		map.put("Bhagi", 1000);
		map.put("Mahi", 1000);
		
		Entry<Integer, List<String>> salaryWise =map.entrySet().stream()
									.collect(Collectors.groupingBy(Map.Entry::getValue
											, Collectors.mapping(Map.Entry::getKey,Collectors.toList())))
											.entrySet().stream()
											.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
											.collect(Collectors.toList())
											.get(0);
		
		System.out.println("Salary Wise names : "+salaryWise);

	}

}
