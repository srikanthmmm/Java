package com.srik;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Srikanth {

	public static void main1(String[] args) {
			String arr="Privacccey";
			
			Map<Character, Integer> map= new HashMap<Character, Integer>();
		   for(int i=0;i<arr.length();i++) {
			   if(map.containsKey(arr.charAt(i))) {
				   map.put(arr.charAt(i), map.get(arr.charAt(i))+1);
			   }else {
				   map.put(arr.charAt(i), 1);
			   }
		   }
		 map.forEach((key,value)->System.out.println(key+":Count: "+value));
	}
	public static void main2(String[] args) {
		String arr ="Privacccey";
		
		for(int i=0;i<arr.length();i++) {
			boolean flag=true;
			for(int j=i+1;j<arr.length();j++) {
				if(i!=j && arr.charAt(i)==arr.charAt(j)) {
					flag=false;
					break;
				}
			}if(flag){
				System.out.println("Non reapeted character: "+arr.charAt(i));
				break;
			}
		} 
	}
	public static void main3(String[] args) {
		String arr ="Privacccey";
		
		System.out.println("Length : "+arr.length());
		char [] chars= arr.toCharArray();
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
	public static void main4(String[] args) {
		String arr ="Privacccey";
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<arr.length();i++) {
			set.add(arr.charAt(i));
		}for(Character c:set) {
			System.out.println("After removing duplicate letters: "+c);
		}
	}
	public static void main5(String[] args) {
		String arr ="Privacccey";
		
		char[] chars= arr.toCharArray();
		String reverse="";
		for(int i=chars.length-1;i>=0;i--) {
			reverse=reverse+chars[i];
		}
		System.out.println("Name reverse: "+reverse);
	}
	public static void main6(String[] args) {
		int [] arr= {1,2,3,4,5,7};
		
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			sum1=sum1+arr[i];
		}
		System.out.println("Sum of all: "+sum1);
		
		int sum2=0;
		for(int i=1;i<=7;i++) {
			sum2=sum2+i;
		}
		System.out.println("total numbers count with missing number also: "+sum2);
		System.out.println("missing number: "+(sum2-sum1));
	}
	public static void main7(String[] args) {
		int [] arr= {1,2,3,4,1,2,3};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Numbers: "+arr[i]);
				}
			}
		}
	}
	public static void main8(String[] args) {
		int [] arr= {1,5,6,6,7,8,913,13,17};
		
		int temp;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}for(int a:arr) {
			System.out.println("Sorting numbers: "+a);
		}
	}
	public static void main9(String[] args) {
		int [] arr= {1,2,3,1,2,3,4,1,2,3};
		
		for(int i=1;i<=9;i++) {
			int count=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]%j==0) {
					count++;
				}
			}if(count==2) {
				System.out.println("Is prime: "+arr[i]);
			}else {
				System.out.println("Is Not Prime: "+arr[i]);
			}
		}
	}
	public static void main10(String[] args) {
		int prime =9;
		int count=0;
		
		for(int i=1;i<=prime;i++) {
			if(prime%i==0) {
				count++;
			}
		}if(count==2) {
			System.out.println("Is prime");
		}else {
			System.out.println("Is not prime");
		}
	}
	public static void main11(String[] args) {
		int num =100;
		for(int i=0;i<=num;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}
			if(count==0) {
				System.out.println("Is prime"+i);
			}
		}			
	}
	public static void main12(String[] args) {
		int [] arr= {1,2,3,1,2,3,4,1,2,3};
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum Number: "+max);
	}
	public static void main13(String[] args) {
		int [] arr= {1,2,3,1,2,3,4,1,2,3};
		
		int min =1234;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		System.out.println("Minimum Number: "+min);
	}
	public static void main14(String[] args) {
		int sumofCubes=0,a,temp;
		int num=153;
		temp=num;
		while(num>0) {
			a=num%10;
			num=num/10;
			sumofCubes=sumofCubes+(a*a*a);
		}if(temp==sumofCubes) {
			System.out.println("Is Arm : "+temp);
		}else {
			System.out.println("Is not arm: "+temp);
		}
	}
	public static void main15(String[] args) {
		int [] arr=new int []  {1,2,3,4,5,6,12,3,4};
		countOccurence(arr);
		
	}
	static void countOccurence(int [] arr) {
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
			}System.out.println(arr[i]+": count: "+count);
			i+=(count-1);
		}
	}
	public static void main16(String[] args) {
		int [] arr={1,2,3,1,2,3,1,2,3,4,5,6,7};
		int first=arr[0],second=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}if(arr[i]<first) {
				second=arr[i];
			}
		}
		System.out.println("Second largest Number: "+second);
		
	}
	public static void main17(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,1,2,3,9,8,7);
		List<String> lists = Arrays.asList("aaaaa","aaaaaaaaa","aaaaaaaaaaaaaaa");
		
		List<String> count = Arrays.asList("A","B","C","A","B","C","A","M");
		
		List<Integer> DuplicateNumber =list.stream().filter(a-> Collections.frequency(list, a)>1).collect(Collectors.toList());
		System.out.println("Duplicate number: "+DuplicateNumber);
		
		List<Integer> EvenNumber =	list.stream().filter(a-> a%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers: "+EvenNumber);
		
		List<Integer> PrimeNumber =	list.stream().filter(a-> a%2==1).collect(Collectors.toList());
		System.out.println("Prime Numbers: "+PrimeNumber);
		
		Integer MaxNumber =list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Maximum Number: "+MaxNumber);
		
		Integer MinNumber =list.stream().min(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Minimum Number: "+MinNumber);
		
		Optional<Integer> SumOfAllNumber =list.stream().reduce((a,b)->a+b);
		System.out.println("Total Count: "+SumOfAllNumber);
		
		Integer SecondLargestNumber =list.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst().get();
		System.out.println("Second largest Number: "+SecondLargestNumber);
		
		List<String> GreterThanFive = lists.stream().filter(a-> a.length()>5).collect(Collectors.toList());
		System.out.println("Greter Tan Five: "+GreterThanFive);
		
		Map<String, Long> CountLetters =count.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Letters Count: "+CountLetters);
		
	}
	public static void main18(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Srikanth", 1000);
		map.put("Shruthi", 2000);
		map.put("Chandana", 3000);
		map.put("Nimmi", 4000);
		map.put("Narmadha", 4000);
		map.put("Chandu", 4000);
		
		Entry<String, Integer> SecondLowestSalary =map.entrySet().stream()
																					.sorted(Map.Entry.comparingByValue())
																					.collect(Collectors.toList())
																					.get(1);
		System.out.println("Second Largest Salary: "+SecondLowestSalary);
		
		Entry<String, Integer> SecondHighestSalary =map.entrySet().stream()
																					.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
																					.collect(Collectors.toList())
																					.get(1);
		System.out.println("Second Highest Salary: "+SecondHighestSalary);
		
		Entry<Integer, List<String>> NthHighestSalary =map.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue
																						,Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
																						.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
																						.collect(Collectors.toList())
																						.get(0);
		System.out.println("Salary Wise Names: "+NthHighestSalary);
		
	}
	public static void main19(String[] args) {
		List<Emp> list = new ArrayList<Emp>();
		list.add(new Emp(1, "Srikanth","bCom", 1000));
		list.add(new Emp(2, "Shruthi", "BSC",2000));
		list.add(new Emp(3, "Chandana", "Btech",3000));
		list.add(new Emp(4, "Nimmi", "MBBS",4000));
		list.add(new Emp(5, "Mahi", "MBBS",4000));
		list.add(new Emp(6, "Siri", "MBBS",4000));
		list.add(new Emp(7, "Bhagi", "MBBS",4000));
		
		list.stream().filter((a-> {
			if(a.getSalary()>1000)
				return true;
			else
				return false;
		})).forEach((a)->{
			System.out.println("Salary wise: "+a);
		});
		
		Map<String, Set<Emp>> Qual =	list.stream().collect(Collectors.groupingBy(Emp::getQul, Collectors.toSet()));
		System.out.println("Qualification Wise: "+Qual);
	}
	public static void main(String[] args) {
		String msg = "Success";
		
		IntStream streams= msg.chars();
		Stream<Object> list= streams.mapToObj(a-> (char) a);
		
		Map<Object, Long> count=list.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println("Count: "+count);
	
	}
}
