package com.sss;

public class SecondLargestNumber {

	public static void main(String[] args) {
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
		System.out.println("Second Largest Number: "+second);

	}

}
