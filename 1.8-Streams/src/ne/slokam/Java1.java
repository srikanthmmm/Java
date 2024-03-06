package ne.slokam;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java1 {
			 public static void main1(String[] args) {
				String arr="SUCCESSS";
				
				Map<Character, Integer> map = new HashMap<Character, Integer>();
				for(int i=0;i<arr.length();i++) {
					if(map.containsKey(arr.charAt(i))) {
						map.put(arr.charAt(i), map.get(arr.charAt(i))+1);
					}else {
						map.put(arr.charAt(i), 1);
					}
				}map.forEach((key,value)->System.out.println(key+":count: "+value));
			}
			 public static void main2(String[] args) {
				 String arr="Privacccey";
				 Set<Character> set = new LinkedHashSet<Character>();
				 for(int i=0;i<arr.length();i++) {
					 set.add(arr.charAt(i));
				 }for(Character c:set) {
					 System.out.println("After REmoving: "+c);
				 }
			}
			 public static void main3(String[] args) {
				 String arr="Privacccey";
				 
				 for(int i=0;i<arr.length();i++) {
					 boolean flag=true;
					 for(int j=i+1;j<arr.length();j++) {
						 if(i!=j && arr.charAt(i)==arr.charAt(j)) {
							 flag=false;
							 break;
						 }
					 }
					 System.out.println("Non reapeting character: "+arr.charAt(i));
					 break;
				 }
			}
			 public static void main4(String[] args) {
				 String arr="Privacccey";
				 
				char[] chars=arr.toCharArray();
				int count =0;
				for(int i=0;i<chars.length;i++) {
					for(int j=i+1;j<chars.length;j++) {
						if(chars[i]==chars[j]) {
							System.out.println("Reapeted letters: "+chars[i]);
							count++;
							break;
						}
					}
				}
			}
			 public static void main5(String[] args) {
				int [] arr= {1,2,3,4,5,12,2,3,123,1234,1234,12,344,4333};
				
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
					System.out.println("sorting order: "+a);
				}
			}
			 public static void main6(String[] args) {
				int [] arr=new int[]{1,2,3,4,5,6,12,3,4,5,6};
				countOccurence(arr);
			}
			 static void countOccurence(int [] arr) {
				 Arrays.sort(arr);
				 for(int i=0;i<arr.length;i++) {
					 int count =1;
					 if(i!=arr.length-1) {
						 for(int j=i+1;j<arr.length;j++) {
							 if(arr[i]==arr[j]) 
								 count++;
							 else
								 break;
						 }
					 }System.out.println(arr[i]+" Numbers Count:" +count);
					 i+=(count-1);
				 }
			 }
			 public static void main7(String[] args) {
					int [] arr= {1,2,3,4,5,12,2,3,123,1234,1234,12,344,4333};

					for(int i=0;i<arr.length;i++) {
						int count=0;
						for(int j=1;j<arr.length;j++) {
							if(arr[i]%j==0) {
								count++;
							}
						}if(count==2) {
							System.out.println("is prime: "+arr[i]);
						}else {
							System.out.println("Is not prime: "+arr[i]);
						}
					}
			}
			 public static void main8(String[] args) {
				int prime=7;
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
			 public static void main9(String[] args) {
				int sumOfCubes = 0,temp,a;
				int num=153;
				temp=num;
				if(num>0) {
					a=num%10;
					num=num/10;
					sumOfCubes=sumOfCubes+(a*a*a);
				}if(temp==sumOfCubes) 
					System.out.println("is arm: "+temp);
				else
					System.out.println("is not arm: "+temp);
				
			}
			 public static void main10(String[] args) {
				String arr="Privacy";
				char[]chars= arr.toCharArray();
				String reverse="";
				for(int i=chars.length-1;i>=0;i--) {
					reverse=reverse+chars[i];
				}
				System.out.println("String reverse: "+reverse);
			}
			 public static void main11(String[] args) {
				int num=1000;
				for(int i=2;i<=num;i++) {
					int count =0;
					for(int j=2;j<i;j++) {
						if(i%j==0) {
							count++;
						}
					}if(count==0) {
						System.out.println("Is prime Number: "+i);
					}
				}
			}
			 public static void main12(String[] args) {
				int [] arr= {1,2,3,4,5,6,7,8};
				int first=arr[0],second=arr[0];
				for(int i=0;i<arr.length;i++) {
					if(arr[i]>first) {
						second=first;
						first=arr[i];
					}if(arr[i]<first) {
						second=arr[i];
					}
				}
				System.out.println("Second largest number: "+second);
			}
			 public static void main13(String[] args) {
				 int [] arr= {1,1,1,2,3,4,5,6,7,8};
				 for(int i=0;i<arr.length;i++) {
					 for(int j=i+1;j<arr.length;j++) {
						 if(arr[i]==arr[j]) {
							 System.out.println("Duplicate Number: "+arr[i]);
						 }
					 }
				 }
			}
			 public static void main14(String[] args) {
				 int [] arr= {1,1,1,2,3,4,5,6,7,8};
				 int min=123;
				 for(int i=0;i<arr.length;i++) {
					 if(arr[i]<min) {
						 min=arr[i];
					 }
				 }
				 System.out.println("minimum no: "+min);
			}
			 public static void main15(String[] args) {
				 int [] arr= {1,1,1,2,3,4,5,6,7,8};
				 int max=0;
				 for(int i=0;i<arr.length;i++) {
					 if(arr[i]>max) {
						 max=arr[i];
					 }
				 }
				 System.out.println("minimum no: "+max);
			}
			 public static void main16(String[] args) {
				List<String> list = Arrays.asList("A","A","A","B","C");
				List<String> list1 = Arrays.asList("Aaaa","Aaa","Aaaa","Baaaaa","aaaaaaaaaaC");
				
				Map<String, List<String>> lists =list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.toList()));
				System.out.println(lists);
				
				List<String> list2 =list1.stream().filter(a->a.length()>5).collect(Collectors.toList());
				System.out.println(list2);
			 }
}
