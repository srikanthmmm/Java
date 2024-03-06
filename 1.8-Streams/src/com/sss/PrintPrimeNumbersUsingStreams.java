package com.sss;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintPrimeNumbersUsingStreams {

	public static void main(String[] args) {
		List<Integer> prime= Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> primeNumbers=prime.stream().filter(a->a%2==1).collect(Collectors.toList());
		System.out.println("Prime Numbers: "+primeNumbers);
		
		List<Integer> evenNumbers=prime.stream().filter(a->a%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers: "+evenNumbers);

	}

}
