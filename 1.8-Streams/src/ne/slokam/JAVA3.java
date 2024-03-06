package ne.slokam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class JAVA3 {

	public static void main1(String[] args) {
		String arr="Privacccey";
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
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
		String arr="Privacccey";
		
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
	public static void main3(String[] args) {
		String arr="Privacccey";
		
		System.out.println(arr.length());
		char[] ar= arr.toCharArray();
		int count=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					System.out.println("Reapeted characters: "+ar[i]);
					count++;
					break;
				}
			}
		}
	}
	public static void main4(String[] args) {
		String arr="Privacccey";
		Set<Character> set = new LinkedHashSet<Character>();
		for(int i=0;i<arr.length();i++) {
			set.add(arr.charAt(i));
		}for(Character c:set) {
			System.out.println("After  removing duplicate characters: "+c);
		}
	}
	public static void main5(String[] args) {
		String arr="Privacccey";
		
		char[]ar= arr.toCharArray();
		String reverse="";
		for(int i=ar.length-1;i>=0;i--) {
			reverse=reverse+ar[i];
		}
		System.out.println("String reverse: "+reverse);
	}
	public static void main6(String[] args) {
		int [] arr = {1,2,3,4,5,6,1,2,3,35,5656,4554};
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
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,1,2,3,35,5656,9,4554};
		
		for(int i=1;i<arr.length;i++) {
			int count=0;
			for(int j=1;j<arr.length;j++) {
				if(arr[i]%j==0) {
					count++;
				}
			}if(count==2) {
				System.out.println("Is prime: "+arr[i]);
			}else {
				System.out.println("Is not prime: "+arr[i]);
			}
		}
	}
	public static void main8(String[] args) {
		int [] arr = new int []{1,2,3,4,5,6,1,2,3,35,5656,4554};
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
		}
			System.out.println(arr[i]+" :Count:"+count);
			i+=(count-1);
	}
}
	public static void main9(String[] args) {
		int [] arr= {1,2,3,1,2,3,1,2,3,4,5,6,7};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					System.out.println("Duplicate Nubers: "+arr[i]);
				}
			}
		}
	}
	public static void main10(String[] args) {
		int [] arr= {1,2,3,1,2,3,1,2,3,4,5,6,7};
		int first=arr[0],second=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>first) {
				second=first;
				first=arr[i];
			}if(arr[i]<first) {
				second=arr[i];
			}
		}
		System.out.println("Second largest nNumber: "+second);
	}
	public static void main11(String[] args) {
		int num=100;
		
		for(int i=0;i<=num;i++) {
			int count=0;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					count++;
				}
			}if(count==0) {
				System.out.println("Prime numbers: "+i);
			}
		}
	}
	public static void main12(String[] args) {
		int [] arr= {1,2,3,1,2,3,1,2,3,4,5,6,7};
		
		int max=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println("Maximum number: "+max);
	}
	public static void main13(String[] args) {
		int sumOfCubes=0,temp,a;
		int num =1234;
		temp=num;
		while(num>0) {
			a=num%10;
			num=num/10;
			sumOfCubes=sumOfCubes+(a*a*a);
		}if(temp==sumOfCubes) {
			System.out.println("Arm :"+temp);
		}else {
			System.out.println("Is Not Arm: "+temp);
		}
	}
	public static void main14(String[] args) {
		int prime=7;
		int count=0;
		for(int i=1;i<=prime;i++) {
			if(prime%i==0) {
				count++;
			}
		}if(count==2) {
			System.out.println("Is Prime");
		}else {
			System.out.println("Is Not Prime");
		}
	}
	}
