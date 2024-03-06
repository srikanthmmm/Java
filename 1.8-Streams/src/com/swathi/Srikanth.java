package com.swathi;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Srikanth {
	
	public static void main1(String[] args) {
		String arr="Privaccccey";
		
		for(int i=0;i<arr.length();i++) {
			boolean flag=true;
			for(int j=i+1;j<arr.length();j++) {
				if(i!=j && arr.charAt(i)==arr.charAt(j)) {
					flag=false;
					break;
				}
			}if(flag) {
				System.out.println("Non reapeting character: "+arr.charAt(i));
				break;
			}
		}
	}
	public static void main2(String[] args) {
		String arr="Privaccccey";
		
		char[] chars= arr.toCharArray();
		int count=0;
		for(int i=0;i<arr.length();i++) {
			for(int j=i+1;j<arr.length();j++) {
				if(chars[i]==chars[j]) {
					System.out.println("Reapeted letters: "+chars[i]);
					count++;
					break;
				}
			}
		}
	}
	public static void main3(String[] args) {
		String arr="Privaccccey";
		
		Map<Character, Integer> map = new HashMap<>();
		for(int i=0;i<arr.length();i++) {
			if(map.containsKey(arr.charAt(i))) {
				map.put(arr.charAt(i), map.get(arr.charAt(i))+1);
			}else {
				map.put(arr.charAt(i), 1);
			}
		}
		map.forEach((key,value)->System.out.println(key+":count: "+value));
	}
	public static void main4(String[] args) {
		String arr="Privaccccey";
		
		char[] chars= arr.toCharArray();
		String reverse="";
		for(int i=chars.length-1;i>=0;i--) {
			reverse=reverse+chars[i];
		}
		System.out.println("Name Reverse:"+reverse);
	}
	public static void main5(String[] args) {
		int [] arr= {1,2,3,3,4,5,999,6,7,8,9};
		
		int temp=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			
		}for(int a:arr) {
			System.out.println("Sorting order: "+a);
		}
	}
	public static void main6(String[] args) {
		int [] arr= {1,2,3,4,5,999,6,7,8,9};
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]%j==0) {
					count++;
				}
			}if(count==2) {
				System.out.println("Is Prime: "+arr[i]);
			}else {
				System.out.println("is Not Prime: "+arr[i]);
			}
		}
	}
	public static void main7(String[] args) {
		int [] arr= {1,1,2,3,4,5,999,6,7,8,9};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Numbers: "+arr[j]);
				}
			}
		}
	}
	public static void main8(String[] args) {
		int [] arr= {1,2,3,4,5,6,8,9};
		
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		System.out.println("Sum1: "+sum1);
		
		int sum2=0;
		for(int i=1;i<=9;i++) {
			sum2=sum2+i;
		}
		System.out.println("Sum2: "+sum2);
		System.out.println("Missing Number: : "+(sum2-sum1));
	}
	public static void main9(String[] args) {
		int [] arr= new int []{1,2,3,4,5,6,5,6,8,9};
		countOccuence(arr);
	}
	static void countOccuence(int [] arr) {
		Arrays.sort(arr);
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			if(i!=arr.length-1) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j])
						count++;
					else
						break;
				}
			}
			System.out.println(arr[i]+":Count: "+count);
			i+=(count-1);
		}
	}
	public static void main10(String[] args) {
		int prime=7;
		int count=0;
		
		for(int i=1;i<=prime;i++) {
			if(prime%i==0) {
				count++;
			}
			
		}if(count==2) {
			System.out.println("is prime");
		}else {
			System.out.println("Is not prime");
		}
	}
	public static void main11(String[] args) {
		List<Integer> list= Arrays.asList(1,2,3,4,5,1,2,3);
		
		List<String> less= Arrays.asList("aaaa","aaaaaaaaa","ssssssssssssss");
		
		List<Integer> dup=list.stream().filter(a->Collections.frequency(list, a)>1).collect(Collectors.toList());
		System.out.println("Duplicate Numbers: "+dup);
		
		
		List<String> lessthan=less.stream().filter(a->a.length()>5).collect(Collectors.toList());
		System.out.println("Greater than 5 : "+lessthan);

	
	}
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("Srikanth", 1000);
		map.put("Shruthi", 2000);
		map.put("Nimmi", 3000);
		map.put("Chandana", 4000);
		map.put("Swathi", 5000);
		map.put("Narmadha", 1000);
		map.put("Bondam", 1000);
		
		Entry<String, Integer> secondLowestSalary =map.entrySet().stream()
												.sorted(Map.Entry.comparingByValue())
												.collect(Collectors.toList())
												.get(1);
		System.out.println("Second lowest salary: "+secondLowestSalary);
		
		Entry<String, Integer> secondHighestSalary =map.entrySet().stream()
													.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
													.collect(Collectors.toList())
													.get(1);
		System.out.println("Second Highest Salary: "+secondHighestSalary);
	
		Entry<Integer, List<String>> SalaryWise =map.entrySet().stream()
												.collect(Collectors.groupingBy(Map.Entry::getValue
												,Collectors.mapping(Map.Entry::getKey,Collectors.toList())))
												.entrySet().stream()
												.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
												.collect(Collectors.toList())
												.get(1);
		
		System.out.println("Salary wise: "+SalaryWise);
	}
}
