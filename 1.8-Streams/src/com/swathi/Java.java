package com.swathi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Java {

	
			public static void main1(String[] args) {
				int [] arr= {1,2,3,4,1,2,3,4,5,6,7,8,9};
				
				for(int i=0;i<arr.length;i++) {
					for(int j=i+1;j<arr.length;j++) {
						if(arr[i]==arr[j]) {
							System.out.println("duplicate Numbers: "+arr[i]);
						}
					}
				}
			}
			public static void main2(String[] args) {
				int [] arr= {1,2,3,4,1,2,3,4,5,6,7,8,9};
				
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
			public static void main3(String[] args) {
				int [] arr= {1,2,3,4,1,2,3,4,5,6,7,8,9};
				
				for(int i=0;i<arr.length;i++) {
					int count=0;
					for(int j=1;j<arr.length;j++) {
						if(arr[i]%j==0) {
							count++;
						}
					}if(count==2) {
						System.out.println("Is pRIME: "+arr[i]);
					}else {
						System.out.println("Is Not prime: "+arr[i]);
					}
				}
				
			}
			public static void main4(String[] args) {
				String arr="Privaccccey";
				
				Map<Character, Integer> map = new HashMap<>();
				for(int i=0;i<arr.length();i++) {
					if(map.containsKey(arr.charAt(i))) {
					map.put(arr.charAt(i), map.get(arr.charAt(i))+1);
				}else {
					map.put(arr.charAt(i),1);
				}
					}
				map.forEach((key,value)->System.out.println(key+":Count:"+value));
			}
			public static void main5(String[] args) {
				String arr="Privaccccey";
				
				Set<Character> set = new LinkedHashSet<>();
				for(int i=0;i<arr.length();i++) {
					set.add(arr.charAt(i));
				}for(Character c:set) {
					System.out.println("Removing duplicate characters: "+c);
				}
			}
			public static void main6(String[] args) {
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
			public static void main7(String[] args) {
				String arr="Privaccccey";
				char[] chars= arr.toCharArray();
				int count=0;
				for(int i=0;i<arr.length();i++) {
					for(int j=i+1;j<arr.length();j++) {
						if(chars[i]==chars[j]) {
							System.out.println("Reapeted letters; "+chars[i]);
							count++;
							break;
						}
					}
				}
			}
			public static void main8(String[] args) {
				int [] arr=new int[] {1,2,3,4,1,2,3,4,5,6,7,8,9};
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
					System.out.println(arr[i]+": count: "+count);
					i+=(count-1);
				}
			}
			public static void main9(String[] args) {
				int sumOFcubes=0,temp,a;
				int num=153;
				temp=num;
				while(num>0) {
					a=num%10;
					num=num/10;
					sumOFcubes=sumOFcubes+(a*a*a);
				}if(temp==sumOFcubes)
					System.out.println("is arm: "+temp);
				else 
					System.out.println("is not arm: "+temp);
				
			}	
			
			public static void main10(String[] args) {
				int [] arr = {1,12,2,3,4,5,56,6,66,454,12,1,2,13,14,15,9};
				
				
				for(int i=0;i<arr.length;i++) {
					int count=0;
					for(int j=1;j<arr.length;j++) {
						if(arr[i]%arr[j]==0) {
							count++;
						}
					}if(count==2) {
						System.out.println("Is Prime: "+arr[i]);
					}else {
						System.out.println("Is Not Prime: "+arr[i]);
					}
				}
			}
			public static void main(String[] args) {
				int []arr= {1,2,3,4,6};
				
				int sum1=0;
				for(int i=0;i<arr.length;i++) {
					sum1=sum1+arr[i];
				}
				System.out.println("Sum "+sum1);
				
				int sum2=0;
				for(int i=1;i<=6;i++) {
					sum2=sum2+i;
				}
				System.out.println("suM2: "+sum2);
				System.out.println("Missing Number: "+(sum2-sum1));
			}
}
