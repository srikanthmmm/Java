package ne.slokam;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class java {
	public static void main1(String[] args) {
		int [] arr = {1,2,3,3,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
			}
		}
	}
	public static void main2(String[] args) {
		int [] arr = {1,2,3,3,1};
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum= sum+arr[i];
		}
		System.out.println(sum);
	}
	
	public static void main3(String[] args) {
		int [] arr = {1,2,3,3,1};
		int min = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>min) {
				min= arr[i];
			}
		}
		System.out.println(min);
}
	public static void main4(String[] args) {
		int num =1000;
		for(int i=2;i<=num;i++) {
			int count =0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count ++;
				}
			}if(count==0) {
				System.out.println(i);
			}
		}
	}
	public static void main5(String[] args) {
		String name ="Mallela Srikanth";
	char [] arr=	name.toCharArray();
	String reverse="";
	for(int i=arr.length-1;i>=0;i--) {
		reverse= reverse+arr[i];
	}
	System.out.println(reverse);
	
	}
		public static void main6(String[] args) {
			String remDup="Privacccey";
			Set<Character> set = new LinkedHashSet<Character>();
		
			for(int i=0;i<remDup.length();i++) {
				set.add(remDup.charAt(i));
			}for(Character c:set) {
				System.out.println(c);
			}
		}
		public static void main7(String[] args) {
			String name ="mallela Srikanth";
			
			char[] arr= name.toCharArray();
			int count =0;
			for(int i=0;i<arr.length;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						System.out.println(arr[i]);
						count++;
						break;
					}
				}
			}
		}
		public static void main8(String[] args) {
			int sumofCubes=0,a,temp;
			int number=123;
			temp=number;
			while(number>0) {
				a=number%10;
				number=number/10;
				sumofCubes=sumofCubes+(a*a*a);
			}if(temp==sumofCubes) 
				System.out.println("is arm"+temp);
				else
					System.out.println("is not"+temp);
			
		}
		public static void main9(String[] args) {
			List<Integer> l=Arrays.asList(1,2,3,4,5,1,2);
			List<Integer> li= l.stream().filter(a->Collections.frequency(l, a)>1).collect(Collectors.toList());
			System.out.println(li);
			
			Optional<Integer> sum= l.stream().reduce((a,b)->a+b);
			System.out.println(sum);
			
			List<String> list = Arrays.asList("A","A","C","B","A");
			Map<String, Long> list1 =	list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(list1);
		}
		public static void main(String[] args) {
			String str ="SUCCWESS";
			Map<Character, Integer> map = new HashMap<Character, Integer>();
			for(int i=0;i<str.length();i++) {
				if(map.containsKey(str.charAt(i))) {
					map.put(str.charAt(i), map.get(str.charAt(i))+1);
				}else {
					map.put(str.charAt(i), 1);
				}
			}
			map.forEach((key,value)->System.out.println(key+":count: "+value));
		}
}
