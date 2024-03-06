package com.sss;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDuplicateNumbers {

	public static void main(String[] args) {
		List<Integer> dup= Arrays.asList(1,2,3,4,5,6,7,1,2,3);
		
		List<Integer> duplicate=dup.stream()
								.filter(a-> Collections.frequency(dup, a)>1)
								.collect(Collectors.toList());
		System.out.println("Duplicate Numbers: "+duplicate);

	}

}
