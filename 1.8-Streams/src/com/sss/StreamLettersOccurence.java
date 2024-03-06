package com.sss;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamLettersOccurence {
	
	public static void main(String[] args) {
		String arr="Privaccey";
		
		IntStream stream= arr.chars();
		Stream<Character> map=  stream.mapToObj(a->(char)a);
		Map<Character, Long> count= map.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	
		System.out.println("Lettres count: "+count);
	
	}

}
