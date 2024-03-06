package com.sss;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SecondLowestSalaryUsingStream {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Srikanth", 1000);
		map.put("Shruthi", 2000);
		map.put("Chandana", 3000);
		map.put("Nimmi", 4000);
		
		Entry<String, Integer> secondLowestSalary =map.entrySet().stream()
													.sorted(Map.Entry.comparingByValue())
													.collect(Collectors.toList())
													.get(1);
		System.out.println("Second Lowest Salary: "+secondLowestSalary);

	}

}
