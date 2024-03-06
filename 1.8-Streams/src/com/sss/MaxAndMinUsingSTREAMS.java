package com.sss;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxAndMinUsingSTREAMS {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		
		Integer maximumNumber =list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum Number: "+maximumNumber);
		
		Integer minimumNumber =list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Minimum Number: "+minimumNumber);
		
		
		Integer secondNumber =list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("Second Highest Number: "+secondNumber);
	}

}
