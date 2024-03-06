package com.sss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stringlength {

	public static void main(String[] args) {
		List<String> list= Arrays.asList("aaa","aaaaaa","aaaaaaa");
		
		List<String> lessThanFive=list.stream().filter(a->a.length()<5).collect(Collectors.toList());
		
		System.out.println("LessThan Five: "+lessThanFive);

	}

}
