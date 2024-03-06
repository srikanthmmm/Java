package ne.slokam;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

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
public static void main(String[] args) {
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
	int prime=100;
	
	for(int i=0;i<=prime;i++) {
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
}
