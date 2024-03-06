package com.sss;

public class MisssingNumber {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,7,8,9};
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum of All: "+sum);
		
		int sum1=0;
		for(int i=1;i<=9;i++) {
			sum1=sum1+i;
		}
		System.out.println("Total value with missing number also: "+sum1);
		System.out.println("Missing Number: "+(sum1-sum));
	}

}
